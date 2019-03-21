package com.provia.bemt.controller

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional
import grails.converters.*

import com.provia.bemt.domain.Project
import com.provia.bemt.domain.Product
import com.provia.bemt.domain.ProjectProduct
import com.provia.bemt.domain.ProjectFeeSchedule
import com.provia.bemt.domain.ProductType

import com.provia.bemt.service.ProjectService


class ProjectFeeScheduleController extends BemtController {
	def projectService
	def proformaProjectService

	//use project service to create and 

	def show(ProjectFeeSchedule obj) {
		super.isValid(obj) //check to see if user can act on this obj
		def project = Project.findByFee(obj)
		def products = ProjectProduct.findAllByProject(project)
		def serviceType = ProductType.findByName("Service")		
		def specimenType = ProductType.findByName("Specimen/Product")
		render(view: 'show', model:[obj: obj, productList: products, specimenType: specimenType, serviceType: serviceType])
	}

	def edit(ProjectFeeSchedule obj) {
		super.isValid(obj) //check to see if user can act on this obj
		render(view: 'edit', model:[obj: obj])
	}

  @Transactional
	def update(ProjectFeeSchedule obj) {
 		
 		super.isValid(obj) //check to see if user can act on this obj
		
		if(!obj.save()) {
      respond obj.errors, view:'edit', model:[obj: obj]
			return
		} else {
			request.withFormat {
				form {
					flash.message = "Fee Schedule was updated successfully!"
		    	redirect action: 'show', id: obj.id, model: [obj:obj]    
				}
			}
		}

	}	
}