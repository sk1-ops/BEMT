package com.provia.bemt.controller

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

import com.provia.bemt.domain.Equipment;
import com.provia.bemt.domain.EquipmentType;
import com.provia.bemt.domain.SurveyEquipment
import grails.converters.JSON

import com.provia.bemt.service.*


/**
 * Controller for the Equipment Domain Object
 * 
 * dan.reed@wrycan.com
 */

class EquipmentController extends BemtController {
 	
	// reference the required services 
 	def proformaEquipmentService
 	def productService
 	def proformaService

	def index() {
		render(view: 'index', model:[objListLeased: Equipment.findAllByOrganizationAndType(session.org, 'leased'),objListPurchased: Equipment.findAllByOrganizationAndType(session.org, 'purchased')])
	}

	def copy() {
		def equip = SurveyEquipment.get(params.id)
		def buylease = ""
		//print equip.buy.name.toLowerCase()
		if(equip.buy.name.toLowerCase() == 'lease') {
			buylease = "leased";
		} else {
			buylease = "purchased";
		}
		render template: 'copy', model:[obj: new Equipment(type: buylease, name:equip.type.name, annualServiceContract: equip.contract.copyable, cost:equip.price.copyable), objTypes: EquipmentType.all],  contentType: 'text/plain'
	}

	def show(Equipment obj) {
		 super.isValid(obj) //check to see if user can act on this obj		
		withFormat {
			/*dont need an HTML show for supply*/
			html {
				redirect action: 'index'
			}
			/*used for AJAX update call*/
	    json { render obj as JSON}
    }	

	}

	@Transactional
	def edit(Equipment obj) {
		super.isValid(obj) //check to see if user can act on this obj
		render(view: 'edit', model:[obj: obj, objTypes: EquipmentType.all]) 
	}

	def create() {
		render(view: 'create', model:[obj: new Equipment(params), objTypes: EquipmentType.all])
	}

  @Transactional
	def save(Equipment obj) {
		super.isValid(obj) //check to see if user can act on this obj
		if(saveEquipment(obj)) {
			request.withFormat {
				form {
					flash.message = "Equipment '${obj.name}' was created successfully!"
			    redirect action: 'index'
				}
				'*' {respond obj, [status: CREATED]}
			}			
		}
	}

  @Transactional
	def savecopy(Equipment obj) {
	  super.isValid(obj) //check to see if user can act on this obj
	  if(!saveEquipment(obj)) {
			render(status: 400, text: "You need to fill out all required fields")
		} else {
			render(text: "Equipment copied successfully.")
		}
	}


	@Transactional
	def saveadd(Equipment obj) {
		super.isValid(obj) //check to see if user can act on this obj
		if(saveEquipment(obj)) {
			request.withFormat {
				form {
					flash.message = "Equipment '${obj.name}' was created successfully!"
			   	redirect controller: 'equipment', action: 'create', params: [type: obj.type]
				}
				'*' {respond obj, [status: CREATED]}
			}
		}
	}

  @Transactional
	def update(Equipment obj) {
		super.isValid(obj) //check to see if user can act on this obj
		if(!obj.save()) {
      respond obj.errors, view:'edit',  model:[obj: obj, objTypes: EquipmentType.all]
			return
		} else {
			//productService.updateEquipment(obj,session.org)
			request.withFormat {
				form {
					flash.message = "Equipment '${obj.equip}' was updated successfully!"
			    redirect action: 'index'
				}
				'*' {respond obj, [status: UDPATED]}
			}
		}
	}	

  @Transactional
	def delete(Equipment obj) {
		super.isValid(obj) //check to see if user can act on this obj
    productService.deleteEquipment(obj, session.org)
    proformaEquipmentService.deleteForecast(obj)
    obj.delete flush:true
    flash.message = "Equipment '${obj.name}' was deleted!"
    redirect action:"index"
	}

  private boolean saveEquipment(Equipment obj) {
		if(!obj.save()) {
      respond obj.errors, view:'create', model:[obj: obj, objTypes: EquipmentType.all]
			return false
		} else {
			def proforma = proformaService.findProforma(session.org) 
			proformaEquipmentService.addForecast(obj, proforma)
			return true
		}  	
  }
}