package com.provia.bemt.domain

class SurveySpend {

  SurveySpendItem item
  BigDecimal spendDollar
	Double spendPercent

	static belongsTo = [survey: Survey]

  static constraints = {
  	item blank: false

  	/* add constraint to only allow 3 values for type, "time", "ops" and "startup"*/

  }
}