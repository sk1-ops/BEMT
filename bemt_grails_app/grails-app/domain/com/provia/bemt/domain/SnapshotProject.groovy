package com.provia.bemt.domain

class SnapshotProject {
		String name
		BigDecimal rev1
		BigDecimal rev2
		BigDecimal rev3
		BigDecimal cogs1
		BigDecimal cogs2
		BigDecimal cogs3
		
		static belongsTo = [snapshot: Snapshot]
		static hasMany = [products: SnapshotProduct]

    static mapping = {
      products cascade: 'all-delete-orphan'
    }		

    static constraints = {
    	name blank: false
			rev1 nullable: true    	
			rev2 nullable: true    	
			rev3 nullable: true    	
			cogs1 nullable: true    	
			cogs2 nullable: true    	
			cogs3 nullable: true    	
    }
}