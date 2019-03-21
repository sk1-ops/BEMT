package com.provia.bemt.domain

class Equipment {

  String name
	EquipmentType equip
  String type
	Integer cost
	Integer usableLife
	Integer annualBillableHours
	Integer annualServiceContract

	static belongsTo = [organization: Organization]

  static constraints = {
    name blank: false
  	equip blank: false
    type inList:["purchased", "leased"]
  	cost minSize: 0
  	usableLife minSize: 0, maxSize: 25  	
  	annualBillableHours minSize: 0, maxSize: 2000  	
  	annualServiceContract minSize: 0
  }
}
