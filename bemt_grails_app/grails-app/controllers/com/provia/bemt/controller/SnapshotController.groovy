package com.provia.bemt.controller

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

import com.provia.bemt.domain.Snapshot
import com.provia.bemt.domain.SnapshotProject
import com.provia.bemt.domain.SnapshotLabor
import com.provia.bemt.domain.SnapshotEquipment

import com.provia.bemt.service.SnapshotService
import com.provia.bemt.service.ProformaExpenseService
import com.provia.bemt.service.ProformaService

class SnapshotController extends BemtController {
  def snapshotService
  def proformaExpenseService
  def proformaService

  def create() {    
    render(view: 'create', model:[obj: new Snapshot(params)])
  }


  def show(Snapshot obj) {
    super.isValid(obj) //check to see if user can act on this obj
    def projects = snapshotService.getProjects(obj)
    def rev = [:]
    def cost = [:]
    def equip = snapshotService.getEquipmentExpenseSummaryByYear(obj)
    def labor = snapshotService.getLaborExpenseSummaryByYear(obj)
    def expenses =  snapshotService.getExpenses(obj)
    render(view: 'show', model:[obj: obj, projects: projects, rev: rev, cost: cost, equip: equip, labor: labor, expenses: expenses])
  }   

  def showlabor(Snapshot obj) {
    super.isValid(obj) //check to see if user can act on this obj
    render(view: 'showlabor', model:[obj: obj, labor: SnapshotLabor.findAllBySnapshot(obj)])
  }   

  def showlaborforecast(Snapshot obj) {
    super.isValid(obj) //check to see if user can act on this obj
    def labor = snapshotService.getLabor(obj)
    def forecasts = snapshotService.getLaborForecasts(obj)
    render(view: 'showlaborforecast', model:[obj: obj, labor: labor, forecasts: forecasts, year: params.year])
  }   


  def showequipment(Snapshot obj) {
    super.isValid(obj) //check to see if user can act on this obj
    render(view: 'showequipment', model:[obj: obj, equip: SnapshotEquipment.findAllBySnapshot(obj)])
  } 

  def showequipforecast(Snapshot obj) {
    super.isValid(obj) //check to see if user can act on this obj
    def equip = snapshotService.getEquipment(obj)
    def forecasts = snapshotService.getEquipForecasts(obj)
    render(view: 'showequipforecast', model:[obj: obj, equipment: equip, forecasts: forecasts, year: params.year])
  }   

  @Transactional
  def save(Snapshot obj) {
    super.isValid(obj) //check to see if user can act on this obj
    //set date NOW
    obj.created = new Date()

    if(!obj.save()) {
      respond obj.errors, view:'create', model:[obj: obj]
      return
    } else {
      //call the create service
      snapshotService.create(obj, proformaService.findProforma(session.org) )
      request.withFormat {
        form {
          flash.message = "Snapshot was created successfully!"
          redirect controller: 'proforma', action: 'show'
        }
        '*' {respond obj, [status: CREATED]}
      }
    }
  }

  @Transactional
  def delete(Snapshot obj) {
    super.isValid(obj) //check to see if user can act on this obj
    obj.delete flush:true
    flash.message = "Pro Forma Snapshot '${obj.name}' was deleted!"
    redirect controller: 'proforma', action: 'index'
  } 
}