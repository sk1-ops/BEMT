package com.provia.bemt.domain

class SnapshotLabor {
		String name
		String type
		Integer annualSalary
		Integer benefitPercent
		BigDecimal year1
		BigDecimal year2
		BigDecimal year3	
		
		static belongsTo = [snapshot: Snapshot]
		static hasMany = [forecasts: SnapshotLaborForecast]

    static mapping = {
      forecasts cascade: 'all-delete-orphan'
    }		

    static constraints = {
    	
    }
}