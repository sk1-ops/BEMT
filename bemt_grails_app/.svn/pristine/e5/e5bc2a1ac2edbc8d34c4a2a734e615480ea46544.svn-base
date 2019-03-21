package com.provia.bemt.domain

class SupplyDefault {

	String name
	BigDecimal annualizedCost
	Integer annualBillableHours	
	BigDecimal unitPrice
	String units	

  static constraints = {
  	name blank: false
  	annualizedCost minSize: 0
  	annualBillableHours minSize: 0, maxSize: 2000
  	unitPrice minSize: 0
  	units blank: false
  }
}