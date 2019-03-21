import com.provia.bemt.domain.*
import cr.co.arquetipos.password.*
import grails.util.Environment
import com.provia.bemt.domain.PropertiesLookUp

class BootStrap {

    
    def init = { 
        new PropertiesLookUp(paramName: "PASSWORD_CHANGE_FREQUENCY", paramValue: "120").save(failOnError: false, flush: true)
        new PropertiesLookUp(paramName: "UNIQUE_FROM_PAST_PASSWORDS", paramValue: "24").save(failOnError: false, flush: true)
        new PropertiesLookUp(paramName: "SEND_PASSWORD_EXPIRY_EMAILS", paramValue: "Yes").save(failOnError: false, flush: true)

        def currentEnvironment = Environment.current?.name.toString()
        println "Current Environment: " + currentEnvironment
        println "Current Version:     " + grails.util.Metadata.current.'app.version'
    }

    def destroy = {
  
    }
}
