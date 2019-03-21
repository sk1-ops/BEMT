package com.provia.bemt.service

import com.provia.bemt.domain.*
import grails.transaction.Transactional
import org.codehaus.groovy.grails.web.util.WebUtils


@Transactional
class OrganizationService {
    def proformaService
    def projectService
    def proformaLaborService
    def proformaEquipmentService


    def changeOrganization(Organization org) {
  	def webUtils = WebUtils.retrieveGrailsWebRequest()
  	def session = webUtils.getSession()
        if(org != null) {
            if(org.owner.id == session.user.id) {
                session.org = org
            }
        } else {
            session.org = null
        }
    }

    def setCurrentOrganization(Organization org, List orgs) {
  	def webUtils = WebUtils.retrieveGrailsWebRequest()
  	def session = webUtils.getSession()
  	session.org = null
  	if(org != null) {
            session.org = org
  	} else if(orgs.size() > 0) {
            session.org = orgs.first() 
        }
    }

    def updateOrganizationListInSession(List orgs) {
  	def webUtils = WebUtils.retrieveGrailsWebRequest()
  	def session = webUtils.getSession()
  	session.orglist = null
  	if(orgs.size() > 0) {
            session.orglist = orgs 
        }
    }

    def getUserOrganizations(Bemtuser user) {
        return Organization.findAllByOwnerAndDeleted(user, false)
    }

    def checkOrgById(org, Bemtuser user) {
//        def org = Organization.get(org)
//        println "User.email: " + user.email + " org id: "+ org.id + " org.name: " + org.name
//        println "checkOrgById params: " + params
        if(org.owner.id == user.id) {
            println "Verified org.id = user.id"
            return true
        } else {
            println "Verification failed! org.id != user.id"
            return false
        }
    }

    def deleteOrganization(org) {
        org.deleted = true
        org.save()
    }

    def resetOrganization(org) {
		
        //do this by logically deleting the biobank and creating a new one with the same name.
    }

    def getTemplateOrganization() {
        return  Organization.findByNameAndTemplate("Template 1 Biobank", true)
    }

    def setupNewOrganization(Organization org, Bemtuser user) {

        //use the proforma service to create a new one.
        proformaService.createNew(org)
        def defaultSupplies = SupplyDefault.all 
        defaultSupplies.each {
            def s = new Supply(name: it.name, type: it.type, unitPrice: it.unitPrice, units: it.units, annualBillableHours: it.annualBillableHours, annualizedCost: it.annualizedCost, organization: org).save()
        }
    }

    def Organization copyOrganization(Organization org, String name, String desc, Bemtuser user) {
        //this will do a copy of the "org" with the name "name"
        Organization neworg = new Organization();
        neworg.name = name
        neworg.description = desc
        neworg.template = false
        neworg.deleted = false
        neworg.owner = user
        neworg.save(failOnError:true)

        // create a new proform
        def newproforma = proformaService.createNew(neworg)

        def labors = [:]
        def equips = [:]
        def supplies = [:]
        def products = [:]
        def projects = [:]

        //copy labor
        def labor = Labor.findAllByOrganization(org)
        log.info "User: " + user.email + " Org copy: " + org.name + " to new org: " + neworg.name +  " found ("+labor.size+") labor categories"
        labor.each {
            def propsMap = it.properties
            def n = new Labor(propsMap)
            n.setOrganization(neworg)
            n.save()
            labors.put(it.id,n)
        }

        //copy equip
        def equip = Equipment.findAllByOrganization(org)
        log.info "User: " + user.email + " Org copy: " + org.name + " to new org: " + neworg.name +  " found ("+equip.size+") equip categories"
        equip.each {
            def propsMap = it.properties
            def n = new Equipment(propsMap)
            n.setOrganization(neworg)
            n.save()
            equips.put(it.id,n)
        }

        //copy supplies
        def supply = Supply.findAllByOrganization(org)
        log.info "User: " + user.email + " Org copy: " + org.name + " to new org: " + neworg.name +  " found ("+supply.size+") supply categories"
        supply.each {
            def propsMap = it.properties
            def n = new Supply(propsMap)
            n.setOrganization(neworg)
            n.save()
            supplies.put(it.id,n)
        }

        //copy projects
        def project = Project.findAllByOrganization(org)
        log.info "User: " + user.email + " Org copy: " + org.name + " to new org: " + neworg.name +  " found ("+project.size+") projects"
        project.each {
            def propsMap = it.properties
            def n = new Project(propsMap)
            n.setOrganization(neworg)
            def p = [new HashSet()]
            n.setProducts(p)
            projectService.createProjectFeeSchedule(n)
            n.save()
            projects.put(it.id,n)
        }

        //copy products
        def product = Product.findAllByOrganization(org)
        log.info "User: " + user.email + " Org copy: " + org.name + " to new org: " + neworg.name +  " found ("+product.size+") products"
        product.each {
            def propsMap = it.properties
            def n = new Product(propsMap)
            n.setOrganization(neworg)
            def p = [new HashSet()]
            n.setProjects(p)
            n.save(failOnError:true)
            products.put(it.id,n)
			

            //need to copy allocated and COGS and OTHER			
            def pAlloc = CostplusAllocated.findAllByProduct(it)	
            pAlloc.each {
                def costa = it.properties
                def n1 = new CostplusAllocated(costa)
                if(it.labor) {
                    n1.setLabor(labors.get(costa.laborId))
                }
                if(it.equipment) {
                    n1.setLabor(labors.get(costa.laborId))
                }
                n1.setProduct(products.get(it.productId))
                n1.setOrganization(neworg)
                n1.save()
            }		
            def pCogs = CostplusCogs.findAllByProduct(it)	
            pCogs.each {
                def costa = it.properties
                def n1 = new CostplusCogs(costa)
                n1.setProduct(products.get(it.productId))
                n1.setSupply(supplies.get(it.supplyId))
                n1.setOrganization(neworg)
                n1.save()
            }	

            def pOther = CostplusOther.findAllByProduct(it)	
            pOther.each {
                def costa = it.properties
                def n1 = new CostplusOther(costa)
                n1.setProduct(products.get(it.productId))
                n1.setOrganization(neworg)
                n1.save()
            }						
        }


        //copy projectproducts
        project = Project.findAllByOrganization(org)
        project.each {
            def oldProject = it

            //look up any product mappings, create them
            def pp = ProjectProduct.findAllByProject(oldProject)
            println "User: " + user.email + " Org copy: " + org.name + " to new org: " + neworg.name +  " found ("+pp.size+") ProjectProduct"
            pp.each {
                def oldPP = it;
                def newProject = projects.get(oldPP.projectId)
                def newProduct = products.get(oldPP.productId)
                def newProjectProduct = new ProjectProduct(product:newProduct, project: newProject, basePrice: oldPP.basePrice, recoveryPercent: oldPP.recoveryPercent)
                newProjectProduct.save(failOnError:true)
            }

        }

        //get proforma for the copied org
        def proforma = Proforma.findByOrganization(org)
        println "Creating proforma from proforma Id: "+proforma.id + " name: " +proforma.name
        //expenses
        def exps = ProformaExpense.findAllByProforma(proforma)
        println "Date: " + new Date() + " User: " + user.email + " Org copy: " + org.name + " to new org: " + neworg.name +  " found ("+exps.size+") proforma expenses"
        exps.each {			
            def oldexp1 = it
            def n = ProformaExpense.findByExpenseAndProforma(it.expense,newproforma)
            n.setYear1(it.year1)
            n.setYear2(it.year2)
            n.setYear3(it.year3)
            n.save(failOnError:true)
        }


        //labor exp
        def plforcasts = Proformalaborforecast.findAllByProforma(proforma)
        println "Date: " + new Date() + " User: " + user.email + " Org copy: " + org.name + " to new org: " + neworg.name +  " found ("+plforcasts.size+") proforma labor expenses"
        plforcasts.each {
            def oldexp1 = it
            def l = labors.get(oldexp1.laborId)
            def n1 = new Proformalaborforecast(it.properties)
            n1.setLabor(l)
            n1.setProforma(newproforma)
            n1.save(failOnError:true)
        }

        //equip exp
        def peforcasts = Proformaequipmentforecast.findAllByProforma(proforma)
        println "Date: " + new Date() +  " User: " + user.email + " Org copy: " + org.name + " to new org: " + neworg.name +  " found ("+peforcasts.size+") proforma equip expenses"
        peforcasts.each {
            def e = equips.get(it.equipmentId)
            def n2 = new Proformaequipmentforecast(it.properties)
            n2.setEquipment(e)
            n2.setProforma(newproforma)
            n2.save(failOnError:true)			
        }

        //create proforma projects
        def pprojs = Proformaproject.findAllByProforma(proforma)
        println "Date: " + new Date() + " User: " + user.email + " Org copy: " + org.name + " to new org: " + neworg.name +  " found ("+pprojs.size+") proforma projects"
        pprojs.each {
            def oldPP = it
            def newProject = projects.get(oldPP.projectId)
            def newPproj = new Proformaproject(proforma: newproforma, project:newProject, rev1:oldPP.rev1, rev2:oldPP.rev2, rev3:oldPP.rev3, cost1:oldPP.cost1, cost2:oldPP.cost2, cost3:oldPP.cost3)
            newPproj.save(failOnError:true)

            //ProformaProjectRevenues

            //ProformaProjectCogs

            //create proforma products
            def pprods = Proformaproduct.findAllByProject(oldPP)
            println "Date: " + new Date() + " User: " + user.email + " Org copy: " + org.name + " to new org: " + neworg.name +  " found ("+pprods.size+") proforma products"
            pprods.each {
                def oldProd = it
                def newProduct = products.get(oldProd.productId)
                def pp = new Proformaproduct(it.properties)
                def p = [new HashSet()]
                pp.setForecasts(p)
                pp.setProduct(newProduct)
                pp.setProject(newPproj)
                pp.save(failOnError:true)

                //create proforma forecasts
                def ppfore = Proformaproductforecast.findAllByProduct(oldProd)
                println "Date: " + new Date() + " User: " + user.email + " Org copy: " + org.name + " to new org: " + neworg.name +  " found ("+ppfore.size+") proforma product forecasts for "+ newProduct.name
                ppfore.each {
                    def oldFore = it
                    def ppf = new Proformaproductforecast(it.properties)
                    ppf.setProduct(pp)
                    ppf.save(failOnError:true)
                }
            }
        }
        println "copyOrganization: done"
        return neworg
    }


    def getProformaTotals(Organization org) {

    }

}