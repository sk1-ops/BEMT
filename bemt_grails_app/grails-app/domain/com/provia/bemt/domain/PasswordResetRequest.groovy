package com.provia.bemt.domain

class PasswordResetRequest {

	String token
    Bemtuser owner
    Date dateCreated

    static constraints = {
    	token blank: false
    }

}