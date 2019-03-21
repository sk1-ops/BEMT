package com.provia.bemt.controller

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

import com.provia.bemt.domain.ProformaExpense

import com.provia.bemt.service.ProformaService

class ProformaExpenseController extends BemtController {
	def proformaService


	def edit(ProformaExpense obj) {
		super.isValid(obj) //check to see if user can act on this obj
		render(view: 'edit', model:[obj: obj])
	}

  @Transactional
	def update(ProformaExpense obj) { 
		super.isValid(obj) //check to see if user can act on this obj
		if(!obj.save()) {
      respond obj.errors, view:'edit', model:[obj: obj]
			return
		} else {
			request.withFormat {
				form {
					flash.message = "Expense '${obj.expense.name}' was updated successfully!"
			    redirect controller: 'proforma', action: 'show'
				}
			}
		}
	}

}