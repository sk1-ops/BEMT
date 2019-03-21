package com.provia.bemt.service

import grails.transaction.Transactional

import com.provia.bemt.domain.Labor
import com.provia.bemt.domain.Proformalaborforecast
import com.provia.bemt.domain.Organization
import com.provia.bemt.domain.Proforma

/**
 * ProformaLaborService.groovy
 *
 * Service to handle the labor components of the Pro Forma
 * 
 * Copyright 2014 BEMT, All Rights Reserved
 *
 * written by: dan.reed@wrycan.com for Provia Labs
 */

@Transactional
class ProformaLaborService {
  def proformaService

	public List getProformaLabor(Proforma proforma) {
    def org = proforma.organization
    return Labor.findAllByOrganization(org)
	}	

  public addForecast(Labor labor, Proforma proforma) {
    for ( i in 1..36 ) {
      def l = new Proformalaborforecast(period: i, labor: labor, proforma: proforma, quantity: 0).save()
    }  
  }    

  public deleteForecast(Labor labor) {
    Proformalaborforecast.executeUpdate("delete Proformalaborforecast f where f.labor = :labor", [labor: labor])
  }   

  public Map getForecast(Proforma proforma) {
  	def list = getProformaLabor(proforma)
    def totals = [:]
    list.each {
      def expenses = Proformalaborforecast.executeQuery("SELECT a.period, a.quantity FROM Proformalaborforecast a WHERE labor = :p ORDER BY period", [p: it])
      totals.put(it.id, expenses)
    }
    return totals
  }    	

	/* expenses for equipment on the proforma summary page*/
  public Map getSummary(Proforma proforma) {
    def exp = getExpenses(proforma)
    def totals = [:]
    def expense1 = 0   
    def expense2 = 0             
    def expense3 = 0  
    
    for ( e in exp ) {
      def item = e.value
      expense1 += item[1]
      expense2 += item[2]
      expense3 += item[3]
    }
    def map = [1: expense1, 2: expense2, 3: expense3]
    return map
  }    

  public Map getExpenses(Proforma proforma) {

    def totals = [:]
  	def list = getProformaLabor(proforma)
//    println "number of labor expenses..." +list.size()
    list.each {
      //monthly cost
      def monthlyCost = (it.annualSalary.toBigDecimal()/12)
      monthlyCost = monthlyCost + (monthlyCost*(it.benefitPercent/100))
      def year1 = Proformalaborforecast.executeQuery("SELECT COALESCE(sum(a.quantity),0) FROM Proformalaborforecast a WHERE labor = :p AND period < :period1 AND period > :period2", [p: it, period1: 13, period2: 0])
      def year2 = Proformalaborforecast.executeQuery("SELECT COALESCE(sum(a.quantity),0) FROM Proformalaborforecast a WHERE labor = :p AND period < :period1 AND period > :period2", [p: it, period1: 25, period2: 12])
      def year3 = Proformalaborforecast.executeQuery("SELECT COALESCE(sum(a.quantity),0) FROM Proformalaborforecast a WHERE labor = :p AND period < :period1 AND period > :period2", [p: it, period1: 37, period2: 24])

      def expense1 = year1[0] * monthlyCost      
      def expense2 = year2[0] * monthlyCost             
      def expense3 = year3[0] * monthlyCost   

      def map = [1: expense1, 2: expense2, 3: expense3]
      totals.put(it.id, map)
    }
    return totals
  }

  public updateForecast(Proforma proforma, Map params) {
  	//println "Updating Labor Forecasts"
  	def list = getProformaLabor(proforma)
    def year = params.year
    def range = 0..0
    if (year == '1') {
      range = 1..12
    } else if (year == '2') {
      range = 13..24      
    } else if (year == '3') {
      range = 25..36      
    }
    list.each {
      range.each { i -> 
        def p = "qty_" + it.id + "_" + i
        def qty = params."$p"
        qty = qty.toBigDecimal()
        Proformalaborforecast.executeUpdate("update Proformalaborforecast f set f.quantity=:qty where (f.period = :period and f.labor = :labor)", [qty: qty, period: i, labor: it])
      }    
    }  
  }  
}