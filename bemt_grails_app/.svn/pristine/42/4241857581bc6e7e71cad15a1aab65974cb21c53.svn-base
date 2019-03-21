package com.provia.bemt.domain

class Disclaimer {
  String description

  static belongsTo = [fee: ProjectFeeSchedule]

	//Personally, I suggest to set “nullable: true” constraint for every field which is optional and “blank: false” for every obligatory field.
  static constraints = {
    description blank: false, maxSize:1000
  }
}