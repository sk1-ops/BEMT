package com.provia.bemt.controller

import com.provia.bemt.domain.*
import com.provia.bemt.service.OrganizationService

class HomeController extends BemtController {
  def organizationService
  def proformaService
  def proformaEquipmentService
  def proformaLaborService
  def proformaExpenseService

	def index() {

		def orgs = organizationService.getUserOrganizations(session.user)
		organizationService.updateOrganizationListInSession(orgs)

		if(session.org == null && orgs.size() > 0) {
			session.org = orgs.first()
		}


		def labors = [:]
		def equipments = [:]
		def supplies = [:]
		def products = [:]
		def unitproducts = [:]
		def projects = [:]
		def profits = [:]
		orgs.each {
			//labor
			def count = Labor.findAllByOrganization(it)
			labors.put(it.id, count.size())

			//equipment
			count = Equipment.findAllByOrganization(it)
			equipments.put(it.id, count.size())

			//supply
			count = Supply.findAllByOrganization(it)
			supplies.put(it.id, count.size())

			//product
			count = Product.findAllByOrganization(it)
			products.put(it.id, count.size())

			count = Product.findAllByOrganizationAndUnitCost(it,0.00)
			def count1 = Product.findAllByOrganization(it)
			unitproducts.put(it.id, count1.size()-count.size())

			//project
			count = Project.findAllByOrganization(it)
			projects.put(it.id, count.size())

			def proforma = proformaService.findProforma(it)

			def profit = [:]
			def year1 = 0.00
			def year2 = 0.00
			def year3 = 0.00

			//get project revenue
			def dd = Proformaproject.findAllByProforma(proforma)
			dd.each {
				year1 += (it.rev1 - it.cost1)
				year2 += (it.rev2 - it.cost2)
				year3 += (it.rev3 - it.cost3)
			}


			def pe = ProformaExpense.findAllByProforma(proforma)
			pe.each {
				year1 -= (it.year1)
				year2 -= (it.year2)
				year3 -= (it.year3)
			}			

			//labor
			def l = proformaLaborService.getSummary(proforma)
			year1 -= l.get(1)
			year2 -= l.get(2)
			year3 -= l.get(3)

			//equipment
			def e = proformaEquipmentService.getSummary(proforma)
			year1 -= e.get(1)
			year2 -= e.get(2)
			year3 -= e.get(3)			

			profit.put(1,year1)
			profit.put(2,year2)
			profit.put(3,year3)
			profits.put(it.id, profit)
    }

		render(view: 'index', model:[objList: orgs, profits: profits, labors: labors, equipments: equipments, supplies: supplies, products: products, projects: projects, unitproducts: unitproducts])
	}

  def keepalive() { }

}
