package com.provia.bemt.controller

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

import com.provia.bemt.domain.Supply;
import com.provia.bemt.domain.SupplyType;
import grails.converters.JSON
import com.provia.bemt.service.*


class SupplyController extends BemtController {
	def productService

	def index() {
		render(view: 'index', model:[objList: Supply.findAllByOrganization(session.org)])
	}

	def show(Supply obj) {
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

	def edit(Supply obj) {		
    super.isValid(obj) //check to see if user can act on this obj
		render(view: 'edit', model:[obj: obj, supplyTypes: SupplyType.all])
	}

	def create() {
		render(view: 'create', model:[obj: new Supply(params), supplyTypes: SupplyType.all])
	}

  @Transactional
	def save(Supply obj) {
    super.isValid(obj) //check to see if user can act on this obj
		if(!obj.save()) {
      respond obj.errors, view:'create', model:[obj: obj, supplyTypes: SupplyType.all]
			return
		} else {
			request.withFormat {
				form {
					flash.message = "Supply '${obj.name}' was created successfully!"
			    redirect action: 'index'
				}
				'*' {respond obj, [status: CREATED]}
			}
		}
	}

 	@Transactional
	def saveadd(Supply obj) {
    super.isValid(obj) //check to see if user can act on this obj

		if(!obj.save()) {
      respond obj.errors, view:'create', model:[obj: obj, supplyTypes: SupplyType.all]
			return
		} else {
			request.withFormat {
				form {
					flash.message = "Supply '${obj.name}' was created successfully!"
			    redirect controller: 'supply', action: 'create'
				}
				'*' {respond obj, [status: CREATED]}
			}
		}
	}

  @Transactional
	def update(Supply obj) {
    super.isValid(obj) //check to see if user can act on this obj

		if(!obj.save()) {
      respond obj.errors, view:'edit', model:[obj: obj]
			return
		} else {
			
			//need to update any products using this as a pricing component.....
			productService.updateSupply(obj,session.org)
			request.withFormat {
				form {
					flash.message = "Supply '${obj.name}' was updated successfully!"
			    redirect action: 'index'
				}
				'*' {respond obj, [status: UDPATED]}
			}
		}
	}	

  @Transactional
	def delete(Supply obj) {
    super.isValid(obj) //check to see if user can act on this obj
    productService.deleteSupply(obj,session.org)
    obj.delete flush:true
    flash.message = "Supply '${obj.name}' was deleted!"
    redirect action:"index"
	}
}