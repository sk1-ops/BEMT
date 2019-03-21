package com.provia.bemt.domain

class SurveyLabor {

  SurveyLaborType type
  SurveyLaborSalaryRange range
	SurveyLaborFringeRate fringe
	String fte

	static belongsTo = [survey: Survey]

  static constraints = {
  	type blank: false
  	range blank: false
  	fringe blank: false
  	fte blank: false

  }
}