package com.provia.bemt.domain

class SurveyLaborType {

  String name

	static mapping = {
    sort "name"
  }  

  static constraints = {
  	name blank: false
  }
}