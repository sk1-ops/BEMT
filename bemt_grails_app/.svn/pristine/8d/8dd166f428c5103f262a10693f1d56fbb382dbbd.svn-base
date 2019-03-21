package com.provia.bemt.controller

import com.provia.bemt.domain.*

class MarketdataController extends BemtController {

  def index() { 
    //get everything for the main page
    def institutionTypes = SurveyInstitutionType.all
    def operatingModels = SurveyOperatingModel.all
    def facilitySizes = SurveyFacility.all
    def countries = SurveyCountry.all

    //def laborTypes = SurveyLaborType.findAll("from SurveyLaborType as t order by t.name")
    //def equipTypes = SurveyEquipmentType.findAll("from SurveyEquipmentType as t order by t.name")
    //def serviceTypes = SurveyServiceType.findAll("from SurveyServiceType as t order by t.name")
    //def productTypes = SurveyProductType.findAll("from SurveyProductType as t order by t.name")

    def maxAge = Survey.createCriteria().get {
      projections {
        max "age"
      }
    } as Integer



    render(view: 'index', model:[maxAge: maxAge, facilitySizes: facilitySizes, countries: countries, institutionTypes: institutionTypes, operatingModels: operatingModels])
  }

  def about() { }

  def disclaimer() { }

  def search() { 
    def c = Survey.createCriteria()
    def ageMin = params.ageMin.toDouble()
    def ageMax = params.ageMax.toDouble()

    def surveys = c.list {

      if(params.list("institutionType").size() == 1) {
        eq("inst", SurveyInstitutionType.get(params.institutionType)) 
      } else if (params.list("institutionType").size() > 0) {
        or {
          params.institutionType.each {
            eq("inst", SurveyInstitutionType.get(it))
          }
        }        
      }

      if(params.list("country").size() == 1) {
        eq("country", SurveyCountry.get(params.country)) 
      } else if (params.list("country").size() > 0) {
        or {
          params.country.each {
            eq("country", SurveyCountry.get(it))
          }
        }        
      }
      lt("age",ageMax+1)
      gt("age",ageMin-1)
      if(params.practicecr) {
        eq("costRecovery", "Yes")
      }
    }
 
    //print "Returning " + surveys.size() + " Results"
    render template: 'search/search', model: [surveys: surveys], contentType: 'text/plain'
  }

  //action for asynchronous call
  def labor() {
    def id = params.id
    def survey = Survey.get(id)
    render template: 'listing/labor', model: [details: SurveyLabor.findAllBySurvey(survey)], contentType: 'text/plain'
  }

  //action for asynchronous call
  def equipment() {
    def id = params.id
    def survey = Survey.get(id)
    render template: 'listing/equipment', model: [details: SurveyEquipment.findAllBySurvey(survey)], contentType: 'text/plain'
  }

  //action for asynchronous call
  def services() {
    def id = params.id
    def survey = Survey.get(id)
    render template: 'listing/services', model: [details: SurveyService.findAllBySurvey(survey)], contentType: 'text/plain'
  }

  //action for asynchronous call
  def products() {
    def id = params.id
    def survey = Survey.get(id)
    render template: 'listing/products', model: [details: SurveyProduct.findAllBySurvey(survey)], contentType: 'text/plain'
  }

  //action for asynchronous call
  def other() {
    def id = params.id
    render template: 'listing/other'
  }
  //adding labor categories.... use the HIGH side of the range (will add field in table for this to support)
}