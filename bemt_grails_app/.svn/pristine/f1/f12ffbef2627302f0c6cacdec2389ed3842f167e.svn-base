package com.provia.bemt.domain

class ProjectFeeSchedule {
	String name
  String description

  static hasMany = [disclaimers: Disclaimer]

	//Personally, I suggest to set “nullable: true” constraint for every field which is optional and “blank: false” for every obligatory field.
  static constraints = {
  	name blank: false, maxSize:100
    description blank: false, maxSize:1000
  }
}