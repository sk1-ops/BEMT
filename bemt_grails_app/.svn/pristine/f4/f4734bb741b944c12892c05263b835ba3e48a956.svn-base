package com.provia.bemt.controller

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

import com.provia.bemt.domain.Proforma
import com.provia.bemt.domain.Project
import com.provia.bemt.domain.Proformaproject
import com.provia.bemt.domain.Proformaproduct
import com.provia.bemt.domain.Proformaproductforecast
import com.provia.bemt.domain.CostplusCogs

import com.provia.bemt.controller.ProformaController

import com.provia.bemt.service.ProformaService

class ProformaproductController extends BemtController {
  def proformaService


  def show(Proformaproduct obj) {
    super.isValid(obj) //check to see if user can act on this obj
    def proforma = proformaService.findProforma()
    def cost = getCost(obj)
    def qtys = Proformaproductforecast.findAllByProduct(obj, [sort:"period", order:"asc"])
    render(view: 'show', model:[obj: obj, proforma: proforma, cost: cost, qtys: qtys])
  } 

  
  @Transactional
  def update(Proformaproduct obj) {
    super.isValid(obj) //check to see if user can act on this obj
    obj.save()  
    for ( i in 1..36 ) {
      def p = "qty_" + i
      def qty = params."$p".toInteger()
      Proformaproductforecast.executeUpdate("update Proformaproductforecast f set f.quantity=:qty where (f.period = :period and f.product = :product)", [qty: qty, period: i, product: obj])
    }    
    redirect controller: 'proformaproject', action: 'show', id: obj.project.id  
  }

  private BigDecimal getCost(p) {
    def cogsCost = CostplusCogs.executeQuery("SELECT COALESCE(sum(a.cost),0) FROM CostplusCogs a WHERE a.organization = :org AND a.product = :product", [org: session.org, product: p.product])
    return cogsCost[0]
  }       
}