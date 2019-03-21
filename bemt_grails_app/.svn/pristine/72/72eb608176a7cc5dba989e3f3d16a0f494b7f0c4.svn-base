package com.provia.bemt.service

import grails.transaction.Transactional
import com.provia.bemt.domain.*

/**
 * ProformaProjectService.groovy
 *
 * Service to handle the projects components of the Pro Forma
 * 
 * Copyright 2014 BEMT, All Rights Reserved
 *
 * written by: dan.reed@wrycan.com for Provia Labs
 */

@Transactional
class ProformaProjectService {
  def proformaService

  public boolean canDeleteProject(Project p) {
    def projs = Proformaproject.findAllByProject(p)
    if(projs.size == 0) {
      return true
    }
    return false
  }


  private List findProformaProjectsByProject(Project proj) {
	 	def pprojects = Proformaproject.findAllByProject(proj)
  	//println "found " + pprojects.size + " proforma projects" 
  	return pprojects 	
  }

  public updateBasePrice(ProjectProduct pp) {
  	//println "udpate proforma projects with new base price..."

  	def basePrice = pp.basePrice

    //https://issues.wrycan.com/browse/BEMT-380
    //in this case needed to all the pproject lookup and use that in a findAllByProductAndProject lookup,
    //then loop through the proformaprojects and find the products that match.
    
    def pproject = Proformaproject.findAllByProject(pp.project)
    pproject.each {
      def pprods = Proformaproduct.findAllByProductAndProject(pp.product, it)

      //new price

      pprods.each {
        
        it.price1 = basePrice
        def price2 = basePrice + (basePrice * (it.priceChange2)/100)
        def price3 = price2 + (basePrice * (it.priceChange3)/100)
        
        it.price2 = price2
        it.price3 = price3
        it.save(flush: true)
      }
      //woot!

    }
  }

  public updateProjectRevenue(ProformaProjectRevenue rev) {
    removeProjectRevenue(rev)
    def p = rev.proformaproject
    def year1 = p.rev1 + rev.year1
    def year2 = p.rev2 + rev.year2
    def year3 = p.rev3 + rev.year3
    p.setRev1(year1)
    p.setRev2(year2)
    p.setRev3(year3)
    p.save()
  }

  public removeProjectRevenue(ProformaProjectRevenue rev) {
    def p = rev.proformaproject
    def year1 = p.rev1 - rev.year1
    def year2 = p.rev2 - rev.year2
    def year3 = p.rev3 - rev.year3
    p.setRev1(year1)
    p.setRev2(year2)
    p.setRev3(year3)
    p.save()
  }  

  public updateProjectCOGS(ProformaProjectCogs cogs) {
    removeProjectCOGS(cogs)
    def p = cogs.proformaproject
    def year1 = p.cost1 + cogs.year1
    def year2 = p.cost2 + cogs.year2
    def year3 = p.cost3 + cogs.year3
    p.setCost1(year1)
    p.setCost2(year2)
    p.setCost3(year3)
    p.save()
  }

  public removeProjectCOGS(ProformaProjectCogs cogs) {
    def p = cogs.proformaproject
    def year1 = p.cost1 - cogs.year1
    def year2 = p.cost2 - cogs.year2
    def year3 = p.cost3 - cogs.year3
    p.setCost1(year1)
    p.setCost2(year2)
    p.setCost3(year3)
    p.save()
  } 


	public List getProformaProjects(Proforma proforma) {
    return Proformaproject.findAllByProforma(proforma)
	}	

	public List getProformaProjectsByProject(Proformaproject project) {
    return Proformaproject.findAllByProject(project)
	}	

  public List getProformaProjectProducts(Proformaproject project) {
    return Proformaproduct.findAllByProject(project)
  } 

  public removeProductFromProject(Project proj, Product prod) {
  	//println "going to delete product from proformaproject"

  	def pprojects = findProformaProjectsByProject(proj)

  	//remove the project
  	pprojects.each {
	  	def ppproducts = Proformaproduct.findAllByProjectAndProduct(it,prod)
  		//println "found " + ppproducts.size + " products to delete in proforma project " +it.id
  		ppproducts.each {
	  		it.delete(flush: true)
	  	}
  	}

  	//recalc the COGS?

  }

  public addProductToExistingProjects(ProjectProduct pp, Project proj, Product prod) {
  	def pprojects = findProformaProjectsByProject(proj)
 		pprojects.each {
	  	addProduct(it,pp)
 		}
  }

  public Map getQuantites(p) {
    def q = [:]
    p.each {
      //get the qty for each period
      def year1 = Proformaproductforecast.executeQuery("SELECT COALESCE(sum(a.quantity),0) FROM Proformaproductforecast a WHERE product = :p AND period < :period1 AND period > :period2", [p: it, period1: 13, period2: 0])
      def year2 = Proformaproductforecast.executeQuery("SELECT COALESCE(sum(a.quantity),0) FROM Proformaproductforecast a WHERE product = :p AND period < :period1 AND period > :period2", [p: it, period1: 25, period2: 12])
      def year3 = Proformaproductforecast.executeQuery("SELECT COALESCE(sum(a.quantity),0) FROM Proformaproductforecast a WHERE product = :p AND period < :period1 AND period > :period2", [p: it, period1: 37, period2: 24])
      def map = [1: year1[0], 2: year2[0], 3: year3[0]]
      q.put(it.id, map)
    }
    //get the qty for each period
    return q
  }	

  public addProduct(Proformaproject proformaProject, ProjectProduct pp) {
    def cost = getCost(pp.product)
    def p = new Proformaproduct(project:proformaProject, product: pp.product, price1: pp.basePrice, price2: pp.basePrice, price3: pp.basePrice, cost1: cost, cost2: cost, cost3: cost, priceChange2: 0.00, priceChange3: 0, costChange2: 0.00, costChange3: 0.00).save()
    for ( i in 1..36 ) {
      def ppf = new Proformaproductforecast(product: p, period: i, quantity: 0).save()
    }        
  }	

  public addProducts(Proformaproject proformaProject) {
    def pp = ProjectProduct.findAllByProject(proformaProject.project)
    pp.each {
    	addProduct(proformaProject,it) 
    }    
  }

  public BigDecimal getCost(p) {
    def cogsCost = CostplusCogs.executeQuery("SELECT COALESCE(sum(a.cost),0) FROM CostplusCogs a WHERE a.organization = :org AND a.product = :product", [org: proformaService.getSessionOrganization(), product: p])
    return cogsCost[0]
  } 
}