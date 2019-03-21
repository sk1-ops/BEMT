package com.provia.bemt.domain

class CostplusOther {

  Product product
	String other
	BigDecimal cost

	static belongsTo = [organization: Organization]

  static constraints = {
    product blank: false
  	other blank: false
  	cost blank: false
  }
}