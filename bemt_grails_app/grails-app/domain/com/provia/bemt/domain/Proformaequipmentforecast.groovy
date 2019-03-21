package com.provia.bemt.domain

class Proformaequipmentforecast {
	  Integer period
	  Integer quantity
	  Integer added

		static belongsTo = [proforma: Proforma, equipment: Equipment]

    static constraints = {
    	period minSize: 1, maxSize: 36
		  quantity blank: false
		  added blank: false
    }
}