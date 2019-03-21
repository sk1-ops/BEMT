package com.provia.bemt.domain

class CostplusCogs {

	Product product
	Supply supply	
	BigDecimal quantity
	BigDecimal cost
  String type

	static belongsTo = [organization: Organization]

  static constraints = {
  	product blank: false
  	supply blank: false
  	quantity blank: false, minSize: 0
  	cost blank: false
    type blank: false 
  }
}