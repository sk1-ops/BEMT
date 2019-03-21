package com.provia.bemt.controller

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

import com.provia.bemt.domain.Proforma
import com.provia.bemt.domain.Labor
import com.provia.bemt.domain.Equipment

import com.provia.bemt.domain.Proformaproject
import com.provia.bemt.domain.Snapshot

import com.provia.bemt.service.ProformaService
import com.provia.bemt.service.ProformaLaborService
import com.provia.bemt.service.ProformaEquipmentService
import com.provia.bemt.service.ProformaExpenseService

class ProformaController extends BemtController {
  def proformaService
  def proformaLaborService
  def proformaEquipmentService
  def proformaExpenseService

  //static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

  def guide() {
    def proforma = proformaService.findProforma(session.org) 
    render(view: 'guide', model:[obj: proforma])
  }

  def index() { 
    def proforma = proformaService.findProforma(session.org)
    def snaps = Snapshot.findAllByOrganization(session.org)
    [obj: proforma, snaps: snaps]
  }

  def show() {    
    def proforma = proformaService.findProforma(session.org) 
    def projects = Proformaproject.findAllByProforma(proforma)
    def rev = proformaService.getRevenueTotals(projects)
    def cost = proformaService.getCostTotals(projects)
    def equip = proformaEquipmentService.getSummary(proforma)
    def labor = proformaLaborService.getSummary(proforma)
    def expenses = proformaExpenseService.getExpenses(proforma)
    render(view: 'show', model:[obj: proforma, projects: projects, rev: rev, cost: cost, equip: equip, labor: labor, expenses: expenses])
  }  

  def showlabor() {
    def proforma = proformaService.findProforma(session.org)
    def labor = proformaLaborService.getProformaLabor(proforma)
    def expenses = proformaLaborService.getExpenses(proforma)
    render(view: 'showlabor', model:[obj: proforma, labor: labor, expenses: expenses])
  }    

  def editlabor() {
    def proforma = proformaService.findProforma(session.org) 
    def labor = proformaLaborService.getProformaLabor(proforma)
    def forecasts = proformaLaborService.getForecast(proforma)
    render(view: 'editlabor', model:[obj: proforma, year: params.year, labor: labor, forecasts: forecasts])
  } 

  @Transactional
  def updatelabor() {
    def proforma = proformaService.findProforma(session.org)
    proformaLaborService.updateForecast(proforma, params)    
    redirect controller: 'proforma', action: 'showlabor'  
  }

  def showequipment() {
    def proforma = proformaService.findProforma(session.org) 
    def equipment = proformaEquipmentService.getProformaEquipment(proforma)
    def expenses = proformaEquipmentService.getExpenses(proforma)
    render(view: 'showequipment', model:[obj: proforma, equipment: equipment, expenses: expenses])
  } 

  def editequipment() {
    def proforma = proformaService.findProforma(session.org) 
    def equipment = proformaEquipmentService.getProformaEquipment(proforma)
    def forecasts = proformaEquipmentService.getForecast(proforma)
    render(view: 'editequipment', model:[obj: proforma, year: params.year, equipment: equipment, forecasts: forecasts])
  }   

  @Transactional
  def updateequipment() {
    def proforma = proformaService.findProforma(session.org)
    proformaEquipmentService.updateForecast(proforma, params)
    redirect controller: 'proforma', action: 'showequipment'  
  }
}