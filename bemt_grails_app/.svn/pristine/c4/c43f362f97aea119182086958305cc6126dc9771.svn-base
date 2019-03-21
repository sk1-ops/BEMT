/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.codehaus.groovy.grails.commons.ApplicationAttributes
import org.codehaus.groovy.grails.commons.ConfigurationHolder

/**
     * Bootstrap class which turns on scheduler if autoStartup config parameter is set to true.
 *
 * @author Sergey Nebolsin
 *
 * @since 0.3
 */
class QuartzBootStrap {
    def quartzScheduler

    def init = {servletContext ->
//        println("--------------------------------------------------------------")
//        println(" ConfigurationHolder.config "+ConfigurationHolder.config)
//        println("--------------------------------------------------------------")
        if(ConfigurationHolder.config?.quartz?.autoStartup) quartzScheduler.start()
    }
    def destroy = {}
}
