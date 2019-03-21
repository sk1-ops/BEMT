package com.provia.bemt.domain

class Snapshot {
		String name
		String description
		Date created

		static belongsTo = [organization: Organization]
		static hasMany = [projects: SnapshotProject, expenses: SnapshotExpense, labors: SnapshotLabor, equipments: SnapshotEquipment]

    static mapping = {
      projects cascade: 'all-delete-orphan'
      expenses cascade: 'all-delete-orphan'
      labors cascade: 'all-delete-orphan'
      equipments cascade: 'all-delete-orphan'
      sort created: 'desc'
    }			

    static constraints = {
    	name blank: false
    }
}