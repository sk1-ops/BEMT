package com.provia.bemt.domain

class Proformaproduct implements Comparable {

	Product product
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

   int compareTo(obj) {
       product.name.compareTo(obj.product.name)
   }    

	static belongsTo = [project: Proformaproject]
	static hasMany = [forecasts: Proformaproductforecast]

    static mapping = {
        forecasts cascade: 'all-delete-orphan'
    }		

    static constraints = {
    	price1 blank: false
    	price2 blank: false
    	price3 blank: false
    	cost1 blank: false
    	cost2 blank: false
    	cost3 blank: false
    	priceChange2 blank: false
    	priceChange3 blank: false
    	costChange2 blank: false
    	costChange3 blank: false
    }
}