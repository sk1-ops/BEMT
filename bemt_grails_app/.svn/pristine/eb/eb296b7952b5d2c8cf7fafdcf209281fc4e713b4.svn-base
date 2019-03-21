package com.provia.bemt.service

import grails.transaction.Transactional

import com.provia.bemt.domain.Equipment
import com.provia.bemt.domain.Proformaequipmentforecast
import com.provia.bemt.domain.Proforma

/**
 * ProformaEquipmentService.groovy
 *
 * Service to handle the equipment components of the Pro Forma
 * 
 * Copyright 2014 BEMT, All Rights Reserved
 *
 * written by: dan.reed@wrycan.com for Provia Labs
 */

@Transactional
class ProformaEquipmentService {
	def proformaService

	public List getProformaEquipment(Proforma proforma) {
    def org = proforma.organization
    return Equipment.findAllByOrganization(org)
	}

	/* when adding a new piece of equipment to the My Biobank, add default forecasts for that equipment */
  public addForecast(Equipment equip, Proforma proforma) {    
    for ( i in 1..36 ) {
      def l = new Proformaequipmentforecast(period: i, equipment: equip, proforma: proforma, quantity: 0, added: 0).save()
    }  
  }    

	/* when removing equipment from the My Biobank, remove forecasts for that equipment
		 should happen automatically based of data relationships (check that)
	 */
  public deleteForecast(Equipment equip) {
    Proformaequipmentforecast.executeUpdate("delete Proformaequipmentforecast f where f.equipment = :equip", [equip: equip])
  }    

  public Map getForecast(Proforma proforma) {
    def list = getProformaEquipment(proforma)
    def totals = [:]
    list.each {
      def expenses = Proformaequipmentforecast.executeQuery("SELECT a.period, a.quantity, a.added FROM Proformaequipmentforecast a WHERE equipment = :p ORDER BY period", [p: it])
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
    def equip = getProformaEquipment(proforma)
    equip.each {
      //need to sum up the maintenance fees and whenever we buy something 
      def forecasts = Proformaequipmentforecast.findAllByEquipment(it)
      
      def monthlyCost = 0
      if(it.type == 'leased') {
        monthlyCost = (it.cost.toBigDecimal()/12)
      } 
      
      if(it.annualServiceContract != 0) {
        monthlyCost = monthlyCost + (it.annualServiceContract/12)
      }

      def purchasePrice = 0
      if(it.type == 'purchased') {
        purchasePrice = (it.cost.toBigDecimal())
      } 

      def addedYear1 = 0
      def addedYear2 = 0
      def addedYear3 = 0
      
      def equipmentMonthsYear1 = 0
      def equipmentMonthsYear2 = 0
      def equipmentMonthsYear3 = 0

      def startTotal = forecasts[0].quantity
      forecasts.each {
        def total = it.quantity
        def diff = it.added
        if(it.period < 13) {
          if (diff > 0) {
            addedYear1 = addedYear1 + diff
          }
          equipmentMonthsYear1 = equipmentMonthsYear1 + total
        } else if (it.period < 25) {
          if (diff > 0) {
            addedYear2 = addedYear2 + diff
          }
          equipmentMonthsYear2 = equipmentMonthsYear2 + total
        } else {
          if (diff > 0) {
            addedYear3 = addedYear3 + diff            
          }
          equipmentMonthsYear3 = equipmentMonthsYear3 + total
        }
        //println 'period ' + it.period
        //println 'start ' + startTotal
        //println 'total ' + total
        //println 'diff ' + diff
        //println '----------------------'
        startTotal = total
      }

      def expense1 = (equipmentMonthsYear1 * monthlyCost) + (addedYear1 * purchasePrice)
      def expense2 = (equipmentMonthsYear2 * monthlyCost) + (addedYear2 * purchasePrice)
      def expense3 = (equipmentMonthsYear3 * monthlyCost) + (addedYear3 * purchasePrice)
      
      def map = [1: expense1, 2: expense2, 3: expense3]
      totals.put(it.id, map)
      
      //println '----------------------'
      //print it.name
      //println 'added year 1: ' + addedYear1
      //println 'added year 2: ' + addedYear2
      //println 'added year 3: ' + addedYear3
      //println 'equipment months year 1: ' + equipmentMonthsYear1
      //println 'equipment months year 2: ' + equipmentMonthsYear2
      //println 'equipment months year 3: ' + equipmentMonthsYear3
    }
    return totals
  }	

  public updateForecast(Proforma proforma, Map params) {
		def list = getProformaEquipment(proforma)
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
        def p = "form_total_" + it.id + "_" + i
        def a = "form_added_" + it.id + "_" + i
        def qty = params."$p"
        def added = params."$a"
        /*
        qty = qty.toBigDecimal()
        if(i != 36) {
          added = added.toBigDecimal()
        } else {
          added = 0.00
        }*/
        if(i == 36) {
          added = 0
        }
        Proformaequipmentforecast.executeUpdate("update Proformaequipmentforecast f set f.quantity=:qty, f.added = :added where (f.period = :period and f.equipment = :equip)", [qty: qty.toInteger(), added: added.toInteger(), period: i, equip: it])
      }    

      //when editing months 1-24, must also update the later months so that the "start" number is accurate.

      if (year != '3') {
        def fixForecasts = 0..0
        def forecast = null
        if (year == '1') {
          fixForecasts = 13..36
          forecast = Proformaequipmentforecast.findByEquipmentAndPeriod(it, 12)
        } else {
          fixForecasts = 25..36      
          forecast = Proformaequipmentforecast.findByEquipmentAndPeriod(it, 24)
        }
        def qty = forecast.quantity
        def added = forecast.added
       
        fixForecasts.each { i ->         
          //need to use the previous added and then update the start, then get the added so we can 
          def start = qty + added
          Proformaequipmentforecast.executeUpdate("update Proformaequipmentforecast f set f.quantity=:qty where (f.period = :period and f.equipment = :equip)", [qty: start, period: i, equip: it])
          qty = start
          def last = Proformaequipmentforecast.findByEquipmentAndPeriod(it,i);
          added = last.added
        }
      }

    }


  }

}