package com.provia.bemt.domain

class Proformaproductforecast {
	  Integer period
	  Integer quantity

		static belongsTo = [product: Proformaproduct]

		static mapping = {
      sort period:"asc"
    }

    static constraints = {
    	period minSize: 1, maxSize: 36
		  quantity blank: false
    }
}