package com.provia.bemt.service

import grails.transaction.Transactional

import com.provia.bemt.domain.Proforma
import com.provia.bemt.domain.Organization
import com.provia.bemt.domain.Project
import com.provia.bemt.domain.Proformaproject
import com.provia.bemt.domain.Proformaproductforecast
import com.provia.bemt.domain.Proformaproduct
import com.provia.bemt.domain.ProformaExpenseType
import com.provia.bemt.domain.ProformaExpense

import org.codehaus.groovy.grails.web.util.WebUtils

@Transactional
class ProformaService {

  public Proforma createNew(Organization org) {

    //set up proforma
    def proforma = new Proforma(name: org.name, organization: org)
    proforma.save(failOnError:true,flush:true) 

    //add default expeneses
    def pet = ProformaExpenseType.all
    pet.each {
      def pe = new ProformaExpense(proforma: proforma, expense: it, year1: 0, year2: 0, year3: 0).save(flush:true)
    }
    return proforma
  }

  public Proforma findProforma(Organization org) {
    //def webUtils = WebUtils.retrieveGrailsWebRequest()
    //def org = webUtils.getSession().org
    def obj = Proforma.findByOrganization(org)
    return obj
  }

  public Organization getSessionOrganization() {
    def webUtils = WebUtils.retrieveGrailsWebRequest()
    def org = webUtils.getSession().org
    return org
  }  

  public Map getProductQuantityByYear(p) {
    def year1 = Proformaproductforecast.executeQuery("SELECT COALESCE(sum(a.quantity),0) FROM Proformaproductforecast a WHERE product = :p AND period < :period1 AND period > :period2", [p: p, period1: 13, period2: 0])
    def year2 = Proformaproductforecast.executeQuery("SELECT COALESCE(sum(a.quantity),0) FROM Proformaproductforecast a WHERE product = :p AND period < :period1 AND period > :period2", [p: p, period1: 25, period2: 12])
    def year3 = Proformaproductforecast.executeQuery("SELECT COALESCE(sum(a.quantity),0) FROM Proformaproductforecast a WHERE product = :p AND period < :period1 AND period > :period2", [p: p, period1: 37, period2: 24])
    def years = [:]
    years.put(1,year1[0])
    years.put(2,year2[0])
    years.put(3,year3[0])
    return years
  }

  public Map getRevenueTotals(p) {
    def totals = [:]
    p.each {
      def products = Proformaproduct.findAllByProject(it)
      def rev1 = 0        
      def rev2 = 0        
      def rev3 = 0        
      products.each {
        def year1 = Proformaproductforecast.executeQuery("SELECT COALESCE(sum(a.quantity),0) FROM Proformaproductforecast a WHERE product = :p AND period < :period1 AND period > :period2", [p: it, period1: 13, period2: 0])
        def year2 = Proformaproductforecast.executeQuery("SELECT COALESCE(sum(a.quantity),0) FROM Proformaproductforecast a WHERE product = :p AND period < :period1 AND period > :period2", [p: it, period1: 25, period2: 12])
        def year3 = Proformaproductforecast.executeQuery("SELECT COALESCE(sum(a.quantity),0) FROM Proformaproductforecast a WHERE product = :p AND period < :period1 AND period > :period2", [p: it, period1: 37, period2: 24])
        rev1 += year1[0] * it.price1
        rev2 += year2[0] * it.price2
        rev3 += year3[0] * it.price3
      }
      def map = [1: rev1, 2: rev2, 3: rev3]
      totals.put(it.id, map)
    }
    return totals
  }

  public Map getCostTotals(p) {
    def totals = [:]
    p.each {
      def products = Proformaproduct.findAllByProject(it)
      def cost1 = 0        
      def cost2 = 0        
      def cost3 = 0        
      products.each {
        def year1 = Proformaproductforecast.executeQuery("SELECT COALESCE(sum(a.quantity),0) FROM Proformaproductforecast a WHERE product = :p AND period < :period1 AND period > :period2", [p: it, period1: 13, period2: 0])
        def year2 = Proformaproductforecast.executeQuery("SELECT COALESCE(sum(a.quantity),0) FROM Proformaproductforecast a WHERE product = :p AND period < :period1 AND period > :period2", [p: it, period1: 25, period2: 12])
        def year3 = Proformaproductforecast.executeQuery("SELECT COALESCE(sum(a.quantity),0) FROM Proformaproductforecast a WHERE product = :p AND period < :period1 AND period > :period2", [p: it, period1: 37, period2: 24])
        cost1 += year1[0] * it.cost1
        cost2 += year2[0] * it.cost2
        cost3 += year3[0] * it.cost3
      }
      def map = [1: cost1, 2: cost2, 3: cost3]
      totals.put(it.id, map)
    }
    return totals   
  }  
}
