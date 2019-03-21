package com.provia.bemt.domain

class SurveyLaborSalaryRange {

  String name
  BigDecimal copyable

  static constraints = {
  	name blank: false
  	copyable blank: false
  }
}