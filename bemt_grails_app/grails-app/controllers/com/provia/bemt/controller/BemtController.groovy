package com.provia.bemt.controller

import static org.springframework.http.HttpStatus.*
import com.provia.bemt.domain.*
import grails.converters.*
import com.provia.bemt.service.*

/**
 * BEMT Controller
 * 
 * dan.reed@wrycan.com
 */

abstract class BemtController {

 	/* returnJsonException
	 * json error handling
	 * quick function that formats en exception so that it can be returned as JSON for ASYNC calls.
	 */

	 public void returnJsonException (Exception e) {
	 		render([error: true, message: e.getMessage()] as JSON)
	 }

  protected static int changePasswordFrequency()
  {
      def numberOfDays = 0
      def lookup = PropertiesLookUp.findByParamName('PASSWORD_CHANGE_FREQUENCY')
      numberOfDays = Integer.parseInt(lookup.paramValue)
      return numberOfDays
  }
  
  protected boolean checkPassword(String pw) {  	
    def pass = false
    def passed = 0
    //check length
    if((pw!=null) &&( pw.size() < 8)) {
    	return pass
    }	
    if(pw.contains(" "))
    {
        return pass
    }
    if (pw.any{Character.isUpperCase(it as Character)}) {
    	passed++
    }

    if (pw.any{Character.isLowerCase(it as Character)}) {
    	passed++
    }

    if (pw ==~ ~/^(?=.*[0-9]).*$/) {
    	passed++
    }

    if (pw ==~ ~/^(?=.*[!@#$%&\^\*\(\)\_\+\|\~\-\=\\\`\{\}\[\]\:\'\<\>\?\,\.\/]).*$/) {
    	passed++
    }
            
    //def m = pw ==~ ~/^(?=.{8,})(?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$/
    if (passed > 2) {
	    pass = true    	
    }
    
    return pass
    
  }

	/* isValid
	 * checks to ensure that the obj exists and belongs to the user.  
	 * If not valid, should result in a 404
	 */
  protected void isValid(Object obj) {    

  	def valid = false

  	if(obj == null) {
  		//leave false
  	} else if (obj instanceof Organization) {
	    if (session.user.id != null) {
		    valid = true
		  }  		
  	} else if (obj instanceof Bemtuser) {
	    if (session.user.id == obj.id) {
		    valid = true
		  }
		  //objects that are directly related to Orgs
  	} else if (obj instanceof ProjectFeeSchedule) {
  		//get project and check that
  		def proj = Project.findByFee(obj)
	    if (session.org.id == proj.organization.id) {
		    valid = true
		  }
		} else if (obj instanceof CostplusAllocated || obj instanceof CostplusCogs || obj instanceof CostplusOther || obj instanceof Equipment || obj instanceof Labor || obj instanceof Product || obj instanceof Project || obj instanceof Snapshot || obj instanceof Supply) {
	    if (session.org.id == obj.organization.id) {
		    valid = true
		  }
		  //objects that are directly related to Proforma
  	} else if (obj instanceof ProformaExpense || obj instanceof Proformaproject) {
  		def proforma = Proforma.findByOrganization(session.org)
	    if (proforma.id == obj.proforma.id) {
		    valid = true
		  }
		  //objects that are directly related to Proforma via proformaproject
  	} else if (obj instanceof ProformaProjectCogs || obj instanceof ProformaProjectRevenue) {
  		def proforma = Proforma.findByOrganization(session.org)
	    if (proforma.id == obj.proformaproject.proforma.id) {
		    valid = true
		  }
		  //objects that are directly related to Proforma via project
  	} else if (obj instanceof Proformaproduct ) {
  		def proforma = Proforma.findByOrganization(session.org)
	    if (proforma.id == obj.project.proforma.id) {
		    valid = true
		  }
		  //objects that are directly related to Organization via snapshot
  	} else if (obj instanceof SnapshotLabor || obj instanceof SnapshotProject || obj instanceof SnapshotEquipment) {
	    if (obj.snapshot.organization.id == session.org.id) {
		    valid = true
		  }
		  //objects that are directly related to Organization via snapshot via project
  	} else if (obj instanceof SnapshotProduct) {
	    if (obj.project.snapshot.organization.id == session.org.id) {
		    valid = true
		  }
		}

	  if (!valid) {
	  	notFound();
	  }
  } 

	/* notFound
	 * will send a 404 to the client in the result of a resource not being found or not being valid for the user
	 * reference http://www.restapitutorial.com/lessons/httpmethods.html
	 */
	def notFound = {
		log.error("Unauthorized access, throwing 404!")
    return response.sendError(404)   
	}

	/* notSupported
	 * will send a 405 to the client in the result of a action not supported
	 * reference http://www.restapitutorial.com/lessons/httpmethods.html
	 */
	def notSupported = {
		log.error("Not supported, throwing 405!")
    return response.sendError(405)   
	}

}