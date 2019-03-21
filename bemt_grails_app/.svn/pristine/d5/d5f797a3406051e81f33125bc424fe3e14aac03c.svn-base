package com.provia.bemt.service

import grails.transaction.Transactional

import com.provia.bemt.domain.Snapshot
import com.provia.bemt.domain.SnapshotProject
import com.provia.bemt.domain.SnapshotProduct
import com.provia.bemt.domain.Proformaproductforecast
import com.provia.bemt.domain.Proformalaborforecast
import com.provia.bemt.domain.Proformaequipmentforecast
import com.provia.bemt.domain.SnapshotProductForecast
import com.provia.bemt.domain.SnapshotLabor
import com.provia.bemt.domain.SnapshotLaborForecast
import com.provia.bemt.domain.SnapshotEquipment
import com.provia.bemt.domain.SnapshotEquipmentForecast
import com.provia.bemt.domain.SnapshotExpense
import com.provia.bemt.domain.Proforma
import com.provia.bemt.domain.ProformaExpense


/**
 * SnapshotService.groovy
 *
 * Service to handle the snapshots of the Pro Forma
 * 
 * Copyright 2014 BEMT, All Rights Reserved
 *
 * written by: dan.reed@wrycan.com for Provia Labs
 */

@Transactional
class SnapshotService {
  def proformaProjectService
  def proformaService
  def proformaLaborService
  def proformaEquipmentService

  public List getExpenses(Snapshot obj) {
    def list = SnapshotExpense.findAllBySnapshot(obj)
    return list
  }

  public List getEquipment(Snapshot obj) {
    def list = SnapshotEquipment.findAllBySnapshot(obj)
    return list
  }

  public List getLabor(Snapshot obj) {
    def list = SnapshotLabor.findAllBySnapshot(obj)
    return list
  }

  public create(Snapshot obj, Proforma proforma) {
		//logic to create all the parts of a snapshot
		createProjects(obj,proforma)
		createLabor(obj,proforma)
		createEquipment(obj,proforma)		
		createExpense(obj,proforma)		
  } 

	public List getProjects(Snapshot snapshot) {
    return SnapshotProject.findAllBySnapshot(snapshot)
	}	

  public List getProjectProducts(SnapshotProject project) {
    return SnapshotProduct.findAllByProject(project)
  } 

  private createExpense(Snapshot snapshot, Proforma proforma) {
		def exps = ProformaExpense.findAllByProforma(proforma)

		exps.each {
			def sexp = new SnapshotExpense(sequence: it.expense.sequence, year1: it.year1, year2: it.year2, year3: it.year3, snapshot: snapshot, name: it.expense.name).save()
		}
	}	

  public Map getEquipForecasts(Snapshot obj) {
  	def list = getEquipment(obj)
    def totals = [:]
    list.each {
      def expenses = SnapshotEquipmentForecast.findAllByEquipment(it)
      totals.put(it.id, expenses)
    }
    return totals
  } 

	public Map getEquipmentExpenseSummaryByYear(Snapshot obj) {
		def list = getEquipment(obj)
    def totals = [:]
    def sum1 = 0   
    def sum2 = 0             
    def sum3 = 0      
    for ( e in list ) {
      sum1 += e.year1
      sum2 += e.year2
      sum3 += e.year3
    }
    def map = [1: sum1, 2: sum2, 3: sum3]
    return map
  } 

	public Map getLaborExpenseSummaryByYear(Snapshot obj) {
		def list = getLabor(obj)
    def totals = [:]
    def sum1 = 0   
    def sum2 = 0             
    def sum3 = 0      
    for ( e in list ) {
      sum1 += e.year1
      sum2 += e.year2
      sum3 += e.year3
    }
    def map = [1: sum1, 2: sum2, 3: sum3]
    return map
  }


  public Map getLaborForecasts(Snapshot snapshot) {
  	def list = getLabor(snapshot)
    def totals = [:]
    list.each {
      def expenses = SnapshotLaborForecast.findAllByLabor(it)
      totals.put(it.id, expenses.quantity)
    }
    return totals
  } 

  private createLabor(Snapshot snapshot,Proforma proforma) {
		def labor =  proformaLaborService.getProformaLabor(proforma)
    println "Snapping Labor: "+labor.size


		labor.each {
			def monthlyCost = (it.annualSalary.toBigDecimal()/12)
      println monthlyCost

      monthlyCost = monthlyCost + (monthlyCost*(it.benefitPercent/100))
	    def year1 = Proformalaborforecast.executeQuery("SELECT COALESCE(sum(a.quantity),0) FROM Proformalaborforecast a WHERE labor = :p AND period < :period1 AND period > :period2", [p: it, period1: 13, period2: 0])
	    def year2 = Proformalaborforecast.executeQuery("SELECT COALESCE(sum(a.quantity),0) FROM Proformalaborforecast a WHERE labor = :p AND period < :period1 AND period > :period2", [p: it, period1: 25, period2: 12])
	    def year3 = Proformalaborforecast.executeQuery("SELECT COALESCE(sum(a.quantity),0) FROM Proformalaborforecast a WHERE labor = :p AND period < :period1 AND period > :period2", [p: it, period1: 37, period2: 24])
			def expense1 = year1[0] * monthlyCost      
      def expense2 = year2[0] * monthlyCost             
      def expense3 = year3[0] * monthlyCost  

			def l = new SnapshotLabor(year1: expense1, year2: expense2, year3: expense3, snapshot: snapshot, name: it.name, type: it.category.name, annualSalary: it.annualSalary, benefitPercent: it.benefitPercent).save()

			def lf = Proformalaborforecast.findAllByProforma(proforma)

			lf.each {
				def s = new SnapshotLaborForecast(labor: l, period: it.period, quantity: it.quantity).save()
			}
		}
	}	

  private createEquipment(Snapshot snapshot,Proforma proforma) {
		//println "Snapping Equipment"
  	def equip = proformaEquipmentService.getProformaEquipment(proforma)
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

   		def e = new SnapshotEquipment(annualBillableHours: it.annualBillableHours, annualServiceContract: it.annualServiceContract, cost: it.cost, equipment: it.equip.name, name: it.name, snapshot: snapshot, type: it.type, usableLife: it.usableLife, year1: expense1, year2: expense2, year3: expense3).save()

			def ef = Proformaequipmentforecast.findAllByEquipment(it)
			ef.each {
				def s = new SnapshotEquipmentForecast(equipment: e, period: it.period, added: it.added, quantity: it.quantity).save()
			}
		}
  }


  private createProjects(Snapshot snapshot, Proforma proforma) {
		//get projects
		def projectList = proformaProjectService.getProformaProjects(proforma)
		
		//println "Snapping Projects"
		projectList.each {

			def year1rev = 0
			def year2rev = 0
			def year3rev = 0
			def year1cogs = 0
			def year2cogs = 0
			def year3cogs = 0

			def sp = new SnapshotProject(name:it.project.name, snapshot: snapshot).save()

			//get products for each project
			//println "Snapping Product for Project"
			def productList = proformaProjectService.getProformaProjectProducts(it)
			productList.each {
				def prod = it
				//get year 1,2 and 3 total quanity
				def qtys = proformaService.getProductQuantityByYear(prod)
				def rev1 = qtys[1] * prod.price1
				def rev2 = qtys[2] * prod.price2
				def rev3 = qtys[3] * prod.price3

				def cogs1 = qtys[1] * prod.cost1
				def cogs2 = qtys[2] * prod.cost2
				def cogs3 = qtys[3] * prod.cost3

				def sprod = new SnapshotProduct(costChange2: prod.costChange2, costChange3: prod.costChange3, priceChange2: prod.priceChange2, priceChange3: prod.priceChange3, cost1: prod.cost1, cost2: prod.cost2, cost3: prod.cost3, price1: prod.price1, price2: prod.price2, price3: prod.price3, name:prod.product.name, project: sp, rev1: rev1, rev2: rev2, rev3: rev3, cogs1: cogs1, cogs2: cogs2, cogs3: cogs3).save()

				//save forecasts
				def fc = Proformaproductforecast.findAllByProduct(prod)
				fc.each {
					if (it.period < 13) {
						def f = new SnapshotProductForecast(product:sprod, period:it.period, quantity:it.quantity, price:prod.price1, cost:prod.cost1).save()
					}
					if (it.period < 25 && it.period > 12) {
						def f = new SnapshotProductForecast(product:sprod, period:it.period, quantity:it.quantity, price:prod.price2, cost:prod.cost2).save()
					}
					if (it.period > 24) {
						def f = new SnapshotProductForecast(product:sprod, period:it.period, quantity:it.quantity, price:prod.price3, cost:prod.cost3).save()
					}
				}

				year1rev += rev1
				year2rev += rev2
				year3rev += rev3
				year1cogs += cogs1
				year2cogs += cogs2
				year3cogs += cogs3
			}

			sp.setRev1(year1rev.toBigDecimal())
			sp.setRev2(year2rev.toBigDecimal())
			sp.setRev3(year3rev.toBigDecimal())
			sp.setCogs1(year1cogs.toBigDecimal())
			sp.setCogs2(year2cogs.toBigDecimal())
			sp.setCogs3(year3cogs.toBigDecimal())
			sp.save()
		}  	
  }
}