package com.provia.bemt.controller

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

import com.provia.bemt.domain.CostplusCogs;
import com.provia.bemt.domain.Product;

import com.provia.bemt.service.ProductService
import com.provia.bemt.service.ProjectService

class CostplusCogsController extends BemtController {
  def productService
  def projectService
  
  @Transactional
	def delete(CostplusCogs obj) {
    super.isValid(obj) //check to see if user can act on this obj
    obj.delete flush:true
    doCostUdpate()
    flash.message = "Supply was deleted!"
		redirect action: 'pricecogs', controller: 'product', id: params.productId	
	}

  private doCostUdpate() {
    productService.updateUnitCost(Product.get(params.productId), session.org) 
    projectService.updateRecoveryPercentage(Product.get(params.productId))    
  }    
}