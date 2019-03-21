package com.provia.bemt.service

import grails.transaction.Transactional

import com.provia.bemt.domain.Product
import com.provia.bemt.domain.CostplusCogs
import com.provia.bemt.domain.CostplusAllocated
import com.provia.bemt.domain.CostplusOther
import com.provia.bemt.domain.Labor
import com.provia.bemt.domain.Supply
import com.provia.bemt.domain.Equipment
import com.provia.bemt.domain.Organization

import com.provia.bemt.domain.Proformaproduct
import com.provia.bemt.domain.ProjectProduct

@Transactional
class ProductService {

  def deleteSupply(Supply sup, Organization org) {
    def costs = CostplusCogs.findAllBySupply(sup)
    costs.each {
      it.delete(flush: true)
      updateUnitCost(it.product, org)
    }
  }

  def updateSupply(Supply s, Organization org) {
    def costs = CostplusCogs.findAllBySupply(s)
    def price = s.unitPrice
    costs.each {
      def cost = price.toBigDecimal() * it.quantity
      it.cost = cost
      it.save(flush: true)
      updateUnitCost(it.product, org)      
    }
  }

  def deleteLabor(Labor labor, Organization org) {
    def costs = CostplusAllocated.findAllByLabor(labor)
    costs.each {
      it.delete(flush: true)
      updateUnitCost(it.product, org)
    }
  }

  def updateLabor(Labor labor, Organization org) {

    //find all products, find any that use this labor component, update cost
    def costs = CostplusAllocated.findAllByLabor(labor)
    def salary = labor.annualSalary
    def benefit = labor.benefitPercent
    def minuteCost = (salary + ((salary * benefit)/100))/120000

    //println "updating product labor cost to " + minuteCost+ "/minute..."
    costs.each {
      def quantity = it.quantity
      def cost = minuteCost.toBigDecimal() * quantity
      it.cost = cost
      it.save(flush: true)
      updateUnitCost(it.product, org)
    }
  }

  def deleteEquipment(Equipment equip, Organization org) {
    def costs = CostplusAllocated.findAllByEquipment(equip)
    costs.each {
      it.delete(flush: true)
      updateUnitCost(it.product, org)
    }
  }

  def updateEquipment(Equipment equip, Organization org) {
    def costs = CostplusAllocated.findAllByEquipment(equip)
    def hours = equip.annualBillableHours
    def service = equip.annualServiceContract
    def price = equip.cost
    def type = equip.type
    def life = equip.usableLife
    def minuteCost = 0
    //if leased, one way, if purchased, another
    if(type == 'leased') {
      minuteCost = (price+service)/(hours*60);
    } else {
      minuteCost = (((service*life)+price)/life)/hours/60;
    }

    costs.each {
      def quantity = it.quantity
      def cost = minuteCost.toBigDecimal() * quantity
      it.cost = cost
      it.save(flush: true)
      updateUnitCost(it.product, org)
    }


    //println "updating product equipment cost..."
    //find all products, find any that use this labor component, update cost
  }

  def updateUnitCost(p, org) {
    //get the components of cost plus for product, total them.
    def cogs = CostplusCogs.executeQuery("SELECT COALESCE(sum(a.cost),0) FROM CostplusCogs a WHERE a.organization = :org AND a.product = :product", [org: org, product: p])
    def allocated = CostplusAllocated.executeQuery("SELECT COALESCE(sum(a.cost),0) FROM CostplusAllocated a WHERE a.organization = :org AND a.product = :product", [org: org, product: p])
    def other = CostplusOther.executeQuery("SELECT COALESCE(sum(a.cost),0) FROM CostplusOther a WHERE a.organization = :org AND a.product = :product", [org: org, product: p])
    def sum = cogs[0] + allocated[0] + other[0]

    //def margin = sum*(p.marginPercent/100)
    def indirect = (sum)*(p.indirectPercent/100) 
    def unitCost = sum + indirect

    p.indirect = indirect
    p.unitCost = unitCost
    p.save()

    //this could be moved at some point, overkill to call it each time since only COGS will have affect on Proforma
    this.updateProforma(p, cogs[0])
  }

  def updateProforma(p, cost) {
    //update the year one cost and price
    //println "updating with COGS "+ cost
    def proProducts = Proformaproduct.findAllByProduct(p)
    proProducts.each {
      //println 'updating proforma project product '+ it.product.name
      def costChange2 = it.costChange2
      def costChange3 = it.costChange3

      it.cost1 = cost
      def cost2 = cost + cost * (costChange2/100)
      def cost3 = cost2 + cost2 * (costChange3/100)
      it.cost2 = cost2
      it.cost3 = cost3

      it.save()
    }
  }  

  def deleteProduct(p) {

    //TODO: leaving these as explicit loops to signal that DB design should be tweaked to map these correctly so that delete of product will cascade 
    def list = Proformaproduct.findAllByProduct(p)
    list.each {
      it.delete flush:true
    }

    list = CostplusCogs.findAllByProduct(p)
    list.each {
      it.delete flush:true
    }
    list = CostplusAllocated.findAllByProduct(p)
    list.each {
      it.delete flush:true
    }
    list = CostplusOther.findAllByProduct(p)
    list.each {
      it.delete flush:true
    }

    p.delete flush:true

    return "Product '${p.name}' was deleted!"
  }
}