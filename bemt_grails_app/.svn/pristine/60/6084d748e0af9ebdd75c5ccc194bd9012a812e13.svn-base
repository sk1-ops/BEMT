package com.provia.bemt.domain

class SnapshotProductForecast {
	  Integer period
	  Integer quantity
		BigDecimal price
		BigDecimal cost
		
		static belongsTo = [product: SnapshotProduct]

		static mapping = {
      sort period:"asc"
    }

    static constraints = {
    	
    }
}