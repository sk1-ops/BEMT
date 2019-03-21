package com.provia.bemt.domain

class ProformaExpense {

	ProformaExpenseType expense
	BigDecimal year1
	BigDecimal year2
	BigDecimal year3
	String description

	static belongsTo = [proforma: Proforma]

    static constraints = {
    	year1 blank: false
    	year2 blank: false
    	year3 blank: false
    	description nullable: true
    }
}