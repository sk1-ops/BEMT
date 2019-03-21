package com.provia.bemt.controller

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional
import grails.converters.*

import com.provia.bemt.domain.Product
import com.provia.bemt.domain.ProductType
import com.provia.bemt.domain.SpecimanServiceType
import com.provia.bemt.domain.Supply
import com.provia.bemt.domain.CostplusCogs
import com.provia.bemt.domain.CostplusAllocated
import com.provia.bemt.domain.Labor
import com.provia.bemt.domain.Equipment
import com.provia.bemt.domain.CostplusOther
import com.provia.bemt.domain.SurveyProduct
import com.provia.bemt.domain.SurveyService

import com.provia.bemt.service.ProductService
import com.provia.bemt.service.ProjectService


class ProductController extends BemtController {
	def productService
	def projectService

	def show(Product obj) {
		super.isValid(obj)
		super.notSupported()
	}

	@Transactional
	def updatecostplus(Product obj) {
		super.isValid(obj) //check to see if user can act on this obj
		obj.save()
		doCostUdpate()

		flash.message = "Unit Cost Updated!"
		redirect action: 'price', controller: 'product', id: obj.id
		
	}

	def copyproduct() {
		def product = SurveyProduct.get(params.id)
		def desc = "Stabilization: "+ product.stabilization+ "; Ischemic: "+ product.ischemicTime+"; Weight/Vol.: "+product.weight+"; Preservation: "+product.preservation+"; Data Collected: "+product.dataCollected
		def productType = ProductType.findByName("Specimen/Product")
		def subTypes = SpecimanServiceType.findAllByType(productType, [sort: "name"])

		render template: 'copyproduct', model:[obj: new Product(description: desc, name:product.type.name), productType: productType, subTypes: subTypes],  contentType: 'text/plain'
	}

	def copyservice() {
		def product = SurveyService.get(params.id)
		def desc = product.type
		def productType = ProductType.findByName("Service")
		def subTypes = SpecimanServiceType.findAllByType(productType, [sort: "name"])
		render template: 'copyproduct', model:[obj: new Product(description: desc, name:product.type), productType: productType, subTypes: subTypes],  contentType: 'text/plain'
	}


  @Transactional
	def savecopy(Product obj) {
	  super.isValid(obj) //check to see if user can act on this obj
		obj.indirect = 0.00
		obj.indirectPercent = 0.00
		obj.unitCost = 0.00
		obj.cost = 0.00	  
	  if(!obj.save()) {
			render(status: 400, text: "You need to fill out all required fields")
		} else {
			render(text: "Product/Service copied successfully.")
		}
	}


	def priceother(Product obj) {
		super.isValid(obj) //check to see if user can act on this obj
		def otherCosts = CostplusOther.findAllByOrganizationAndProduct(session.org, obj)
		def otherCost = CostplusOther.executeQuery("SELECT COALESCE(sum(a.cost),0) FROM CostplusOther a WHERE a.organization = :org AND a.product = :product", [org: session.org, product: obj])
		render(view: 'priceother', model:[obj: obj, otherCosts: otherCosts, otherCost: otherCost[0]])	
	}


	def priceallocated(Product obj) {
		super.isValid(obj) //check to see if user can act on this obj	
		def allocatedCosts = CostplusAllocated.findAllByOrganizationAndProduct(session.org, obj)
		def laborCost = CostplusAllocated.executeQuery("SELECT COALESCE(sum(a.cost),0) FROM CostplusAllocated a WHERE a.organization = :org AND a.product = :product AND a.labor IS NOT NULL", [org: session.org, product: obj])
		def equipmentCost = CostplusAllocated.executeQuery("SELECT COALESCE(sum(a.cost),0) FROM CostplusAllocated a WHERE a.organization = :org AND a.product = :product AND a.equipment IS NOT NULL", [org: session.org, product: obj])
		def equipment = Equipment.findAllByOrganization(session.org)		
		def labor = Labor.findAllByOrganization(session.org)
		render(view: 'priceallocated', model:[obj: obj, equipList: equipment, laborList: labor, allocatedCosts: allocatedCosts, equipmentCost: equipmentCost[0], laborCost: laborCost[0]])
	
	}

	def pricecogs(Product obj) {
		super.isValid(obj) //check to see if user can act on this obj
		def supplies = Supply.findAllByOrganization(session.org)
		def cogs = CostplusCogs.findAllByProduct(obj)
		def cost = CostplusCogs.executeQuery("SELECT COALESCE(sum(a.cost),0) FROM CostplusCogs a WHERE a.organization = :org AND a.product = :product AND a.type = :type", [org: session.org, product: obj, type: 'unit'])
		render(view: 'pricecogs', model:[obj: obj, cogs: new CostplusCogs(params), supplies: supplies, supplycogs: cogs, cost: cost[0]])
	}

	@Transactional
	def savecogs(Product obj) {
		super.isValid(obj) //check to see if user can act on this obj

		//do the math there instead of in the page...
		def supply = Supply.get(params.supply.id)
		def totalCost = supply.unitPrice * params.quantity.toBigDecimal()
		def cogs = new CostplusCogs(params)
		cogs.cost = totalCost

		if(!cogs.save()) {
			def supplies = Supply.findAllByOrganization(session.org)
			def cogsList = CostplusCogs.findAllByProduct(obj)
			def cost = CostplusCogs.executeQuery("SELECT COALESCE(sum(a.cost),0) FROM CostplusCogs a WHERE a.organization = :org AND a.product = :product AND a.type = :type", [org: session.org, product: obj, type: 'unit'])
      respond cogs.errors, view:'pricecogs', model:[obj: obj, cogs: new CostplusCogs(params), supplies: supplies, supplycogs: cogsList, cost: cost[0]]
			return
		} else {
			doCostUdpate(obj)
			flash.message = "Supply added successfully!"
			redirect(controller: 'product', action: 'pricecogs', id: obj.id)
		}
	}		

	@Transactional
	def saveallocated(Product obj) {
		super.isValid(obj) //check to see if user can act on this obj
		def allocated = new CostplusAllocated(params)
		if(!allocated.save()) {
			def allocatedCosts = CostplusAllocated.findAllByOrganizationAndProduct(session.org, obj)
			def laborCost = CostplusAllocated.executeQuery("SELECT COALESCE(sum(a.cost),0) FROM CostplusAllocated a WHERE a.organization = :org AND a.product = :product AND a.labor IS NOT NULL", [org: session.org, product: obj])
			def equipmentCost = CostplusAllocated.executeQuery("SELECT COALESCE(sum(a.cost),0) FROM CostplusAllocated a WHERE a.organization = :org AND a.product = :product AND a.equipment IS NOT NULL", [org: session.org, product: obj])
			def equipment = Equipment.findAllByOrganization(session.org)		
			def labor = Labor.findAllByOrganization(session.org)
	    respond allocated.errors, view:'priceallocated', model:[obj: obj, equipList: equipment, laborList: labor, allocatedCosts: allocatedCosts, equipmentCost: equipmentCost[0], laborCost: laborCost[0]]

		} else {
			allocated.save()
			doCostUdpate(obj)
			flash.message = "Allocated Expense added successfully!"
			redirect(controller: 'product', action: 'priceallocated', id: obj.id)				
		}
	}		

	@Transactional
	def saveother(Product obj) {
		super.isValid(obj) //check to see if user can act on this obj
		def other = new CostplusOther(params)
		other.save()
		if(!other.save()) {
			def otherCosts = CostplusOther.findAllByOrganizationAndProduct(session.org, obj)
			def otherCost = CostplusOther.executeQuery("SELECT COALESCE(sum(a.cost),0) FROM CostplusOther a WHERE a.organization = :org AND a.product = :product", [org: session.org, product: obj])
			respond other.errors, view: 'priceother', model:[desc: params.other, cost: params.cost, obj: obj, otherCosts: otherCosts, otherCost: otherCost[0]]	
		} else {
			doCostUdpate(obj)
			flash.message = "Other Expense added successfully!"
			redirect(controller: 'product', action: 'priceother', id: obj.id)
		}
	}		

	def index() {
		def serviceType = ProductType.findByName('Service')
		def specimenType = ProductType.findByName('Specimen/Product')
		[serviceType: serviceType, specimenType: specimenType, services: Product.findAllByOrganizationAndType(session.org, serviceType), specimens: Product.findAllByOrganizationAndType(session.org, specimenType)]
	}

	def price(Product obj) {
		super.isValid(obj) //check to see if user can act on this obj
		def cogs = CostplusCogs.executeQuery("SELECT COALESCE(sum(a.cost),0) FROM CostplusCogs a WHERE a.organization = :org AND a.product = :product", [org: session.org, product: obj])
		def allocated = CostplusAllocated.executeQuery("SELECT COALESCE(sum(a.cost), 0) FROM CostplusAllocated a WHERE a.organization = :org AND a.product = :product", [org: session.org, product: obj])
		def other = CostplusOther.executeQuery("SELECT COALESCE(sum(a.cost), 0) FROM CostplusOther a WHERE a.organization = :org AND a.product = :product", [org: session.org, product: obj])
		render(view: 'price', model:[obj: obj, totalCOGS: cogs[0], totalAllocated: allocated[0], totalOther: other[0]])
	}



	def edit(Product obj) {
		super.isValid(obj) //check to see if user can act on this obj
		def productType = obj.type
		render(view: 'edit', model:[obj: obj, productType: productType, subTypes: SpecimanServiceType.findAllByType(productType, [sort: 'name'])])
	}


	def create() {
		//need to handle cases that are not valid here, error back to index view
		def productType = ProductType.get(params.productTypeId)
		def subTypes = SpecimanServiceType.findAllByType(productType, [sort: "name"])
		render(view: 'create', model:[obj: new Product(params), productType: productType, subTypes: subTypes])
	}

  @Transactional
	def save(Product obj) {
		super.isValid(obj) //check to see if user can act on this obj
		if(saveProduct(obj)) {
			request.withFormat {
				form {
					flash.message = "Product '${obj.name}' was created successfully!"
			    redirect controller: 'product', action: 'index'
				}
				'*' {respond obj, [status: CREATED]}
			}
		}
	}

	 @Transactional
	def saveadd(Product obj) {
		super.isValid(obj) //check to see if user can act on this obj
		saveProduct(obj)
		request.withFormat {
			form {
				flash.message = "Product '${obj.name}' was created successfully!"
		   	redirect controller: 'product', action: 'create', params: [productTypeId: obj.type.id]
			}
			'*' {respond obj, [status: CREATED]}
		}
	}	

  @Transactional
	def update(Product obj) {
		super.isValid(obj) //check to see if user can act on this obj
		if(!obj.save()) {
			def productType = ProductType.get(params.type.id)
			def subTypes = SpecimanServiceType.findAllByType(productType, [sort: "name"])
      respond obj.errors, view:'edit', model:[obj: obj, productType: productType, subTypes: subTypes]
			return
		} else {
			request.withFormat {
				form {
					flash.message = "Product '${obj.name}' was updated successfully!"
			    redirect controller: 'product', action: 'index'
				}
				'*' {respond obj, [status: UDPATED]}
			}
		}
	}	

	@Transactional
	def updateindirect(Product obj) {
		//println params
		super.isValid(obj) //check to see if user can act on this obj
		obj.save()
		productService.updateUnitCost(obj,session.org)
		projectService.updateRecoveryPercentage(obj)
		render obj as JSON
	}


  @Transactional
	def delete(Product obj) {
		super.isValid(obj) //check to see if user can act on this obj
    if (obj == null) {
        super.notFound()
        return
    }
    def msg = productService.deleteProduct(obj)

    flash.message = msg
    redirect action:"index"
	}

  private boolean saveProduct(Product obj) {
		obj.indirect = 0.00
		obj.indirectPercent = 0.00
		obj.unitCost = 0.00
		obj.cost = 0.00
		if(!obj.save()) {
			def productType = ProductType.get(params.type.id)
			def subTypes = SpecimanServiceType.findAllByType(productType, [sort: 'name'])
      respond obj.errors, view: 'create', model:[obj: obj, productType: productType, subTypes: subTypes]
			return false
		} 	
		return true
  }  

  private doCostUdpate(Product obj) {
  	//println "got here"
    productService.updateUnitCost(obj, session.org) 
    projectService.updateRecoveryPercentage(obj)    
  } 
}