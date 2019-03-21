package com.provia.bemt.service

import grails.transaction.Transactional

import com.provia.bemt.domain.Product
import com.provia.bemt.domain.Project
import com.provia.bemt.domain.ProjectProduct
import com.provia.bemt.domain.ProjectFeeSchedule

import com.provia.bemt.service.ProformaProjectService

@Transactional
class ProjectService {
  def proformaProjectService

  public createProjectFeeSchedule(Project proj) {
    def name = "Fee Schedule for "+proj.name
    def desc = "Please review the following specimen product and biobank services."
    def fee = new ProjectFeeSchedule(project: proj, name: name, description: desc).save(flush:true, failOnError:true);
    proj.fee = fee
  }

  public removeProductFromProject(Project proj, ProjectProduct prod) {

    //delete from proforma
    proformaProjectService.removeProductFromProject(proj, prod.product)

    //then delete from ProjectProduct    
    prod.delete(flush: true)
  }

  public addProductToProject(Project proj, Product prod) {
    def pp = new ProjectProduct(product:prod, project:proj, basePrice: 0, recoveryPercent: 0).save();
    proformaProjectService.addProductToExistingProjects(pp, proj, prod)    
  }

  public updateRecoveryPercentage(Product prod) {
    //println "updating unit cost in project products...."
    //only need to udpate the recovery percentage
    def projs = ProjectProduct.findAllByProduct(prod)
    projs.each {

      it.recoveryPercent = determineRecoveryPercentage(it.basePrice,it.product.unitCost)

    }
  }

  public Double determineRecoveryPercentage (BigDecimal basePrice, BigDecimal unitCost) {

  //setting to Double.POSITIVE_INFINITY will cause a datatype problem with the JSON return, so set null when infinity.
    def recovery = null
    if (basePrice >0 && unitCost == 0) {
      return recovery
    }
    def r = (basePrice/unitCost)*100
    return  r.toDouble()
  }
}