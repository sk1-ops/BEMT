package com.provia.bemt.controller

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

import com.provia.bemt.domain.Project
import com.provia.bemt.domain.Proformaproject
import com.provia.bemt.domain.Proformaproduct

import com.provia.bemt.service.ProformaService
import com.provia.bemt.service.ProformaProjectService

class ProformaprojectController extends BemtController {
  def proformaService
  def proformaProjectService

  def show(Proformaproject obj) {
    super.isValid(obj) //check to see if user can act on this obj
    def proforma = proformaService.findProforma()
    def products = obj.products
    def revenues = obj.revenues
    def cogs = obj.cogs
    def qtys = proformaProjectService.getQuantites(products)
    render(view: 'show', model:[obj: obj, proforma: proforma, products: products, qtys: qtys, revenues: revenues, cogs: cogs])
  } 

  def create() {
    def proforma = proformaService.findProforma(session.org)
    def projectList = Project.findAllByOrganization(session.org)
    render(view: 'create', model:[obj: new Proformaproject(params), proforma: proforma, projectList: projectList])
  }

  
  @Transactional
  def save(Proformaproject obj) {
    super.isValid(obj) //check to see if user can act on this obj
    if(!obj.save()) {
      respond obj.errors, view:'create', model:[obj: obj, projectList: Project.findAllByOrganization(session.org)]
      return
    } else {
      proformaProjectService.addProducts(obj)
      request.withFormat {
        form {
          redirect action: 'show', id: obj.id, model: [obj:obj]    
        }
        '*' {respond obj, [status: CREATED]}
      }
    }
  }

  @Transactional
  def delete(Proformaproject obj) {
    super.isValid(obj) //check to see if user can act on this obj
    obj.delete flush:true
    flash.message = "Project was removed from your Proforma."
    redirect action: 'show', controller: 'proforma'
  }

}