package com.provia.bemt.controller

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

import com.provia.bemt.domain.ProformaProjectRevenue
import com.provia.bemt.domain.Proformaproject
import com.provia.bemt.domain.Proformaproduct


import com.provia.bemt.service.ProformaService

class ProformaProjectRevenueController extends BemtController {
	def proformaService

	def create() {
		def pp = Proformaproject.get(params.ppId)
		//need to handle cases that are not valid here, error back to index view
		render(view: 'create', model:[obj: new ProformaProjectRevenue(params), project: pp.id])
	}

  @Transactional
	def save(ProformaProjectRevenue obj) {
		super.isValid(obj) //check to see if user can act on this obj
		if(!obj.save()) {
      respond obj.errors, view:'create', model:[obj: obj, project: params.proformaproject]
			return
		} else {
			request.withFormat {
				form {
					flash.message = "Project Revenue '${obj.name}' was updated successfully!"					
			    redirect controller: 'proformaproject', action: 'show', id: obj.proformaproject.id
				}
			}
		}
	}

	def edit(ProformaProjectRevenue obj) {
		super.isValid(obj) //check to see if user can act on this obj
		render(view: 'edit', model:[obj: obj])
	}

  @Transactional
	def update(ProformaProjectRevenue obj) {
		super.isValid(obj) //check to see if user can act on this obj
		if(!obj.save()) {
      respond obj.errors, view:'edit', model:[obj: obj]
			return
		} else {
			request.withFormat {
				form {
					flash.message = "Other Revenue was updated successfully!"
			    redirect controller: 'proformaproject', action: 'show', id: obj.proformaproject.id
				}
			}
		}
	}

  @Transactional
	def delete(ProformaProjectRevenue obj) {
    super.isValid(obj) //check to see if user can act on this obj
    def id = obj.proformaproject.id
    obj.delete flush:true
    flash.message = "Project Revenue '${obj.name}' was deleted!"
    redirect controller: 'proformaproject', action: 'show', id: id
	}		
}