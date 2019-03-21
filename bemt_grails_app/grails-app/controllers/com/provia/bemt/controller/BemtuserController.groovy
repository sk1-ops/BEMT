package com.provia.bemt.controller

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional
import cr.co.arquetipos.password.*
import com.provia.bemt.domain.PasswordHistory
import com.provia.bemt.domain.Bemtuser
import com.provia.bemt.domain.Organization
import com.provia.bemt.domain.Proforma
import com.provia.bemt.service.OrganizationService

class BemtuserController extends BemtController {
    def organizationService
    def userService

    static allowedMethods = [change_password: "POST", update: "POST"]

    def show(Bemtuser obj) { 
        super.isValid(obj) //check to see if user can act on this obj
        render(view: 'show', model:[obj: obj])
    }

    @Transactional
    def change_password(Bemtuser obj) {
        super.isValid(obj) //check to see if user can act on this obj
        def cPassword = params.current_password
        def nPassword = params.new_password
        def nPasswordConfirm = params.new_password_confirm

        if (!PasswordTools.checkDigestBase64(cPassword,obj.password)) { //check to see if old password matches what is currently stored
            def error = [message: "The current password you entered does not match the password associated with your user account."]
            respond obj, view:'show', model:[obj: obj, error: error]
            return
        } else if (nPassword != nPasswordConfirm) { //make sure two entered passwords
            def error = [message: "The new passwords do not match, please make sure they match."]
            respond obj, view:'show', model:[obj: obj, error: error]
            return
        } else if (PasswordTools.checkDigestBase64(nPassword,obj.password)) { //check to make sure new password doesn't match old
            def error = [message: "The new password can not match your old password.  Please select a new one."]
            respond obj, view:'show', model:[obj: obj, error: error]
            return
        } else if (!checkPassword(nPassword)) { //check to make sure new password is at least 8 chars
            def error = [message: "Your password must be at least 8 characters with no spaces and have any three of the following: uppercase character, lowercase character, numeric character and special character."]
            respond obj, view:'show', model:[obj: obj, error: error]
            return
        } 
        if(userService.differentFromPast(obj,nPassword))
        {
            def ePassword = PasswordTools.saltPasswordBase64(nPassword)
            obj.password = ePassword
            def currentDate = new Date()
            obj.dateModified = currentDate
            //println(" Modified Date = " + obj.dateModified)
            obj.expirationDate = currentDate + changePasswordFrequency()
            //println(" expirationDate Date = " + obj.expirationDate)
            obj.notificationSent = "N"
      
            if (!obj.save()) {
                respond obj.errors, view:'show', model:[obj: obj]
                return
            } else {
                def passwordHis = new PasswordHistory(bemtuser:obj,password:ePassword,changeDate:currentDate).save() 
                request.withFormat {
                    form {
                        flash.message = "Your Password has been changed successfully!  Please use your new password next time you log in to this site."
                        redirect action: 'show', id: obj.id
                    }
        '*' {respond obj, [status: UDPATED]}
                }
            }
        }
        else{
            def number = userService.uniqueFromPastPasswords()
            def error = [message: " Please enter a password different from past "+number+" passwords."]
            respond obj, view:'show', model:[obj: obj, error: error]
            return
        }
    }   

    @Transactional
    def update(Bemtuser obj) {
        super.isValid(obj) //check to see if user can act on this obj
        if(!obj.save()) {
            respond obj.errors, view:'show', model:[obj: obj]
            return
        } else {
            session.user = obj
            request.withFormat {
                form {
                    flash.message = "Your Profile was updated successfully!"
                    redirect action: 'show', id: obj.id
                }
        '*' {respond obj, [status: UDPATED]}
            }
        }
    }   

    def logout() { 
        log.info "User agent: " + request.getHeader("User-Agent")
        session.user = null
        session.org = null
        session.orglist = null
        flash.message = "Successfully Logged Out!"
        redirect controller: 'public', view: 'index'
    }
}
