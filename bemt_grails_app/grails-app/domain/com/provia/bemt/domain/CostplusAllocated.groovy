package com.provia.bemt.domain

class CostplusAllocated {

	Product product
	Equipment equipment	
  Labor labor
	Integer quantity
	BigDecimal cost

	static belongsTo = [organization: Organization]

  static constraints = {
  	product blank: false
  	equipment nullable: true
    labor nullable: true
  	quantity minSize: 0
  	cost blank: false
  }
}