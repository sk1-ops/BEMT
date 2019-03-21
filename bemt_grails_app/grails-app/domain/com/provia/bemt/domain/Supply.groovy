package com.provia.bemt.domain

class Supply {

	String name
	BigDecimal unitPrice
	String units
  SupplyType type
  String othertype

	static belongsTo = [organization: Organization]

  static constraints = {
  	name blank: false
  	unitPrice minSize: 0
  	units blank: false
    type blank: false
    othertype nullable: true
  }
}