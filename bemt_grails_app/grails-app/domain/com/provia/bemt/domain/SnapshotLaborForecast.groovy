package com.provia.bemt.domain

class SnapshotLaborForecast {
	  Integer period
	  BigDecimal quantity
		
		static belongsTo = [labor: SnapshotLabor]

		static mapping = {
      sort period:"asc"
    }

    static constraints = {
    	period minSize: 1, maxSize: 36
		  quantity blank: false    	
    }
}