package com.provia.bemt.domain

class Bemtuser {

	String nameFirst
	String nameLast
	String password
	String email
        Date dateCreated 
        Date lastLogin
        Integer loginCount
        Date dateModified
        Date expirationDate
        String notificationSent

    String toString() {"$nameFirst"}

    static constraints = {
    	nameFirst blank: false, nullable: false, maxSize: 20, minSize:1
    	nameLast blank: false, nullable: false, maxSize: 20, minSize:1
    	password blank: false, nullable: false
    	email email: true, blank: false, unique: true, nullable: false
        dateCreated blank: true, nullable: true
        lastLogin blank: true, nullable: true
        loginCount blank: true, nullable: true
        dateModified blank: true, nullable: true
        expirationDate blank: true, nullable: true
        notificationSent blank: true, nullable: true
    }
  
}
