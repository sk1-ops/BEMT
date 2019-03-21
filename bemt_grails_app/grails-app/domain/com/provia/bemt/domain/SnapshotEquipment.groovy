package com.provia.bemt.domain

class SnapshotEquipment {
		String name
		String type
		String equipment
		Integer cost
		Integer usableLife
		Integer annualBillableHours
		Integer annualServiceContract
		BigDecimal year1
		BigDecimal year2
		BigDecimal year3			
		
		static belongsTo = [snapshot: Snapshot]
		static hasMany = [forecasts: SnapshotEquipmentForecast]

    static mapping = {
      forecasts cascade: 'all-delete-orphan'
    }		

    static constraints = {
			type inList:["purchased", "leased"]    	
    }
}