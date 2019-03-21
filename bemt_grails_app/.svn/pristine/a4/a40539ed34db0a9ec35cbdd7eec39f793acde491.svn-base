package com.provia.bemt.domain

class ProformaProjectRevenue {

	String name
	BigDecimal year1
	BigDecimal year2
	BigDecimal year3
	String description

	static belongsTo = [proformaproject: Proformaproject]

    static constraints = {
    	year1 blank: false
    	year2 blank: false
    	year3 blank: false
    	description nullable: true
    }
}