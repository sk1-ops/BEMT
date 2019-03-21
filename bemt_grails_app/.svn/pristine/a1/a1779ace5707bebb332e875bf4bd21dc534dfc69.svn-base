package com.provia.bemt.domain

class ProjectProduct {
	BigDecimal basePrice
	Double recoveryPercent

  static belongsTo = [project: Project, product: Product]

  static constraints = {
    basePrice nullable: true
    recoveryPercent nullable: true
  }

  static mappings = {
    basePrice defaultValue: "0.00"
    recoveryPercent defaultValue: "0"
  }
}