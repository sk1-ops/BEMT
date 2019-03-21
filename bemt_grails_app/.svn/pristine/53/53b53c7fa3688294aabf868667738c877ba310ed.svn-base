package com.provia.bemt.domain

class SurveyEquipment {

  SurveyEquipmentType type
  String units
  SurveyEquipmentBuyLease buy
  SurveyEquipmentPrice price
  String life
  SurveyEquipmentAnnual contract

	static belongsTo = [survey: Survey]

  static constraints = {
  	type blank: false
  	units blank: false
  	buy blank: false
  	price blank: false
  	life blank: false
  	contract blank: false
  }
}