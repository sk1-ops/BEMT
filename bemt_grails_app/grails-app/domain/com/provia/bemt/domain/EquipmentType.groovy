package com.provia.bemt.domain

class EquipmentType {

		String name
		EquipmentType parent

		String toString() { name }

    static constraints = {
    	name nullable: false
    	parent blank: true
    }
}