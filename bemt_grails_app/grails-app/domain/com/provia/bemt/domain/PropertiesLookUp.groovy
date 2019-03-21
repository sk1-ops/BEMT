package com.provia.bemt.domain

class PropertiesLookUp {

    String paramName
    String paramValue
    Date dateModified
    
    static constraints = {
      	paramName blank: false,  unique: true, nullable: true, maxSize: 30, minSize:1
    	paramValue blank: false, nullable: true
        dateModified blank: true, nullable: true
    }
}
