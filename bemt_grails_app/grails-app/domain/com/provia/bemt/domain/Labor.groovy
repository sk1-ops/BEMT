package com.provia.bemt.domain

class Labor {
 
  String name
	LaborType category
	Integer annualSalary
	Integer benefitPercent

	static belongsTo = [organization: Organization]

  static constraints = {
  	name blank: false
  	category blank: false
  	annualSalary blank: false, minSize: 0
  	benefitPercent blank: false, minSize: 0, maxSize: 100
  }
}
