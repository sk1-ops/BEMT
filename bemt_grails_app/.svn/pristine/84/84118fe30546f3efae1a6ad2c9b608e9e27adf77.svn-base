package com.provia.bemt.controller

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

import com.provia.bemt.domain.Labor;
import com.provia.bemt.domain.LaborType;
import grails.converters.JSON

import com.provia.bemt.service.*
import com.provia.bemt.domain.SurveyLabor

class LaborController extends BemtController {
 	def proformaLaborService
 	def productService
 	def proformaService

	static scaffold = Labor

	def index() {
		render(view: 'index', model:[objList: Labor.findAllByOrganization(session.org)])
	}

	def copy() {
		def labor = SurveyLabor.get(params.id)
		render template: 'copy', model:[obj: new Labor(name:labor.type.name, annualSalary:labor.range.copyable), laborTypes:  LaborType.all],  contentType: 'text/plain'
	}


	def show(Labor obj) {
		super.isValid(obj) //check to see if user can act on this obj
		withFormat {
			/*dont need an HTML show for supply*/
			html {
				super.notSupported()
			}
			/*used for AJAX update call*/
	    json { render obj as JSON}
    }	
	}

	def edit(Labor obj) {
		super.isValid(obj) //check to see if user can act on this obj
		render(view: 'edit', model:[obj: obj, laborTypes: LaborType.all])
	}

	def create() {
		render(view: 'create', model:[obj: new Labor(params), laborTypes:  LaborType.all])
	}

  @Transactional
	def save(Labor obj) {
	  super.isValid(obj) //check to see if user can act on this obj
		if(!obj.save()) {
      respond obj.errors, view:'create', model:[obj: obj, laborTypes: LaborType.all]
			return
		} else {
			def proforma = proformaService.findProforma(session.org) 
			proformaLaborService.addForecast(obj, proforma)
			request.withFormat {
				form {
					flash.message = "Labor Category '${obj.name}' was created successfully!"
			    redirect controller: 'labor', action: 'index'
				}
				formRemote {
					'*' {respond obj, [status: CREATED]}					
				}
			}
		}
	}

  @Transactional
	def savecopy(Labor obj) {
	  super.isValid(obj) //check to see if user can act on this obj
	  if(!obj.save()) {
			render(status: 400, text: "You need to fill out all required fields")
		} else {
			def proforma = proformaService.findProforma(session.org) 
			proformaLaborService.addForecast(obj, proforma)
			render(text: "Labor Category copied successfully.")
		}
	}


  @Transactional
	def saveadd(Labor obj) {
		super.isValid(obj) //check to see if user can act on this obj
		if(!obj.save()) {
      respond obj.errors, view:'create', model:[obj: obj, laborTypes: LaborType.all]
			return
		} else {
			def proforma = proformaService.findProforma(session.org)
			proformaLaborService.addForecast(obj,proforma)
			request.withFormat {
				form {
					flash.message = "Labor Category '${obj.name}' was created successfully!"
			    redirect controller: 'labor', action: 'create'
				}
				'*' {respond obj, [status: CREATED]}
			}
		}
	}

  @Transactional
	def update(Labor obj) {
		super.isValid(obj) //check to see if user can act on this obj
		if(!obj.save()) {
      respond obj.errors, view:'edit', model:[obj: obj, laborTypes: LaborType.all]
			return
		} else {
			def proforma = proformaService.findProforma(session.org)
			productService.updateLabor(obj,session.org)
			//proformaLaborService.updateForecast(proforma,obj)
			request.withFormat {
				form {
					flash.message = "Labor Category '${obj.category}' was updated successfully!"
			    redirect controller: 'labor', action: 'index'
				}
				'*' {respond obj, [status: UDPATED]}
			}
		}
	}	

  @Transactional
	def delete(Labor obj) {
	  super.isValid(obj) //check to see if user can act on this obj
    productService.deleteLabor(obj, session.org)
    proformaLaborService.deleteForecast(obj)
    obj.delete flush:true
    flash.message = "Labor Category '${obj.name}' was deleted!"
    redirect action:"index"
	}
}