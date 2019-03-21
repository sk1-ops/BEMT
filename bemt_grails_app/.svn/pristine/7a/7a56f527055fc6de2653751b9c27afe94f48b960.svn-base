package com.provia.bemt.controller

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

import com.provia.bemt.domain.ProformaProjectCogs
import com.provia.bemt.domain.Proformaproject

import com.provia.bemt.service.ProformaService

class ProformaProjectCogsController extends BemtController {
	def proformaService
	def proformaProjectService

	def create() {
		def pp = Proformaproject.get(params.ppId)
		//need to handle cases that are not valid here, error back to index view
		render(view: 'create', model:[obj: new ProformaProjectCogs(params), project: pp.id])
	}

  @Transactional
	def save(ProformaProjectCogs obj) {	
		super.isValid(obj) //check to see if user can act on this obj
		if(!obj.save()) {
      respond obj.errors, view:'create', model:[obj: obj, project: params.proformaproject]
			return
		} else {
			proformaProjectService.updateProjectCOGS(obj)
			request.withFormat {
				form {
					flash.message = "Project COGS '${obj.name}' was updated successfully!"					
			    redirect controller: 'proformaproject', action: 'show', id: obj.proformaproject.id
				}
			}
		}
	}

	 @Transactional
	def update(ProformaProjectCogs obj) {
		super.isValid(obj) //check to see if user can act on this obj
		if(!obj.save()) {
      respond obj.errors, view:'edit', model:[obj: obj]
			return
		} else {
			proformaProjectService.updateProjectCOGS(obj)
			request.withFormat {
				form {
					flash.message = "Other COGS was updated successfully!"
			    redirect controller: 'proformaproject', action: 'show', id: obj.proformaproject.id
				}
			}
		}
	}

	def edit(ProformaProjectCogs obj) {
		super.isValid(obj) //check to see if user can act on this obj
		render(view: 'edit', model:[obj: obj])
	}

  @Transactional
	def delete(ProformaProjectCogs obj) {
    super.isValid(obj) //check to see if user can act on this obj
    proformaProjectService.removeProjectCOGS(obj)
    def id = obj.proformaproject.id
    obj.delete flush:true
    flash.message = "Project COGS '${obj.name}' was deleted!"
    redirect controller: 'proformaproject', action: 'show', id: id
	}		
}