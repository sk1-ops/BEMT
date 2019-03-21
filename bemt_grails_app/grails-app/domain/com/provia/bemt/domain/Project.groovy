package com.provia.bemt.domain

class Project {
	String name
  String description
  ProjectFeeSchedule fee

  static belongsTo = [organization: Organization]
  static hasMany = [products: ProjectProduct]


  static mapping = {
    sort: "name"
  } 
  
//Personally, I suggest to set “nullable: true” constraint for every field which is optional and “blank: false” for every obligatory field.
  static constraints = {
  	name blank: false, maxSize:100
    description blank: false, maxSize:1000
  	fee nullable: true
  }
}