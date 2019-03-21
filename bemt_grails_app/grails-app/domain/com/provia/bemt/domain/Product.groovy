package com.provia.bemt.domain

class Product {
	String name
	ProductType type
	SpecimanServiceType subtype
	String description
  BigDecimal cost
  BigDecimal unitCost
  BigDecimal indirect
  Double indirectPercent

	static belongsTo = [organization: Organization]
  static hasMany = [projects: ProjectProduct]

  static mapping = {
    sort: "name"
  }  


//Personally, I suggest to set “nullable: true” constraint for every field which is optional and “blank: false” for every obligatory field.
  static constraints = {
  	name blank: false
  	type blank: false
  	subtype blank: false
  	description blank: false, maxSize:1000
    cost nullable: true
    unitCost nullable: true, min: new BigDecimal(0.0)
    indirect blank: false, scale: 2
    indirectPercent blank: false, scale: 2, range: 0..100
  }
}