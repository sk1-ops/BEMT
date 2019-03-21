package com.provia.bemt.domain

class Organization {
	String name
	Bemtuser owner
	Boolean template
  Boolean deleted
  String description

  static hasMany = Product, Labor, Equipment, Supply, Snapshot

  static constraints = {
  	name blank: false
  	owner nullable: true
    description blank: false, maxSize:1000    
  }

  static mapping = {
    template defaultValue: 0
    deleted defaultValue: 0
  }

	String toString() { name }

}
