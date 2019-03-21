package com.provia.bemt.domain

class ProductType {

		String name
		ProductType parent

		String toString() { name }

    static constraints = {
    	name nullable: false
    	parent nullable: true
    }
}
