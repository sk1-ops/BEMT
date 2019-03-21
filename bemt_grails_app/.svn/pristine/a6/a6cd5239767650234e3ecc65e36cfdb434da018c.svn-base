package com.provia.bemt.domain

class Proformaproject {
		Project project
		BigDecimal rev1
		BigDecimal rev2
		BigDecimal rev3
		BigDecimal cost1
		BigDecimal cost2
		BigDecimal cost3
		SortedSet products

		static belongsTo = [proforma: Proforma]
		static hasMany = [products: Proformaproduct, revenues: ProformaProjectRevenue, cogs: ProformaProjectCogs]

    static mapping = {
      products cascade: 'all-delete-orphan'
      revenues cascade: 'all-delete-orphan'
      cogs cascade: 'all-delete-orphan'
      products sort: 'product', order: 'asc'
    	rev1 defaultValue: "0.00"
    	rev2 defaultValue: "0.00"
    	rev3 defaultValue: "0.00"
    	cost1 defaultValue: "0.00"
    	cost2 defaultValue: "0.00"
    	cost3 defaultValue: "0.00"
    }			

    static constraints = {
    	project blank: false
    }
}