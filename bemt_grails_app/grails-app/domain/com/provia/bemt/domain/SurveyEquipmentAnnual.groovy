package com.provia.bemt.domain

class SurveyEquipmentAnnual {
	

  String name
  Integer copyable

  static constraints = {
  	name blank: false
  }
}