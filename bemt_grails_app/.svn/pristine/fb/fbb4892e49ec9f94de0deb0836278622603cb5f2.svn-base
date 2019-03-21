package com.provia.bemt.controller

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional
import grails.converters.*

import com.provia.bemt.domain.Disclaimer
import com.provia.bemt.domain.ProjectFeeSchedule



class DisclaimerController extends BemtController {

	//use project service to create and 

	def create() {
		def feeSchedule = ProjectFeeSchedule.get(params.projectFeeSchedule)
		super.isValid(feeSchedule) //check to see if user can act on this obj
		render(view: 'create', model:[obj: new Disclaimer(params), fee: feeSchedule])
	}

  @Transactional
	def save(Disclaimer obj) {
		def feeSchedule = ProjectFeeSchedule.get(params.fee)
		super.isValid(feeSchedule) //check to see if user can act on this obj
		obj.fee = feeSchedule
		if(!obj.validate()) {
      respond obj.errors, view:'create', model:[obj: obj, fee: feeSchedule]
			return
		} else {
			obj.save(flush:true)
			request.withFormat {
				form {
					flash.message = "Disclaimer was created successfully!"
			    redirect controller: 'projectFeeSchedule', action: 'show', id: feeSchedule.id
				}
			}
		}
	}


  @Transactional
	def delete(Disclaimer obj) {
		def feeSchedule = obj.fee
		super.isValid(feeSchedule) //check to see if user can act on this obj
    if (obj == null) {
        super.notFound()
        return
    }    
    obj.delete flush:true
    flash.message = "Disclaimer Deleted"
    redirect controller: 'projectFeeSchedule', action:"show", id: feeSchedule.id
	}

}