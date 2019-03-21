package com.provia.bemt.domain

class SnapshotEquipmentForecast {
	  Integer period
	  Integer quantity
	  Integer added
		
		static belongsTo = [equipment: SnapshotEquipment]

		static mapping = {
      sort period:"asc"
    }

    static constraints = {
    	period minSize: 1, maxSize: 36
		  quantity blank: false 
		  added blank: false  	
    }
}