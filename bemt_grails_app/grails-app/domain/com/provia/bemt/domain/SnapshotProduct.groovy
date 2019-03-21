package com.provia.bemt.domain

class SnapshotProduct {
		String name
		BigDecimal rev1
		BigDecimal rev2
		BigDecimal rev3
		BigDecimal cogs1
		BigDecimal cogs2
		BigDecimal cogs3
		BigDecimal price1
		BigDecimal price2
		BigDecimal price3
		BigDecimal cost1
		BigDecimal cost2
		BigDecimal cost3
		Double priceChange2
		Double priceChange3
		Double costChange2
		Double costChange3
		

		static belongsTo = [project: SnapshotProject]
		static hasMany = [forecasts: SnapshotProductForecast]

    static mapping = {
      projects forecasts: 'all-delete-orphan'
    }			

    static constraints = {
    	name blank: false
    }
}