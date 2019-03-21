package com.provia.bemt.domain

class Proformalaborforecast {
	  Integer period
	  BigDecimal quantity

		static belongsTo = [proforma: Proforma, labor: Labor]

		static mapping = {
      sort period:"asc"
    }
    
    static constraints = {
    	period minSize: 1, maxSize: 36
		  quantity blank: false
    }
}