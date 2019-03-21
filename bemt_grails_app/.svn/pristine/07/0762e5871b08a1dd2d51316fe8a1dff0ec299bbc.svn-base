/*
 * BEMT Application Javascript
 * Version 1.0
 * 
 * bemt.js
 * module for general UI stuff for BEMT app
 * functions eveloped as namespaced object
 * 
 * Dependencies: 
 *    jquery JS
 */

//set up namespaces so we can use these without collison
var BEMT = BEMT || {};

BEMT = function() {

  //private properties/vars
  var SESSION_END_TIMER = null;
  var MESSAGE_SUCCESS = "success";
  var MESSAGE_INFO = "into";
  var MESSAGE_ERROR = "error"; 
  var APP_ROOT = "";


  //private methods (start with _)
  var _showFlash = function (msg,type) {
    $(".asyncmessage."+type).html("<p>"+msg+"</p>")
    $(".asyncmessage."+type).show();
    if(type != 'error') {
      setTimeout(function() {
        $(".asyncmessage."+type).fadeOut(500);
      }, 2000);   
    }
  }  

  var _initEventHandlers = function() {
    $(".basic-page .flashmessage.info").each(function() {
      var n = $(this);
      setTimeout(function() {
        $(n).fadeOut(500, function() {
          $(this).remove();
        });
      }, 2000);     
    });
  }  

  var _getAppRoot = function() {
    return APP_ROOT;
  }

  var _sessionTimer = function () {
    /*
      note, this should be set for 5 min less than server timeout (or more).  The GRAILS default with bundled
      Tomcat is 60 minutes, so warn after 45 minutes 
      45 minutes * 60 seconds * 1000ms = 2700000 ms
    */
    setTimeout(_sessionAlert, 2700000);
  }  

  var _sessionAlert = function () {
    SESSION_END_TIMER = setTimeout(_handleSessionEnd, 300000);
    _showSessionModal();
  }

  var _showSessionModal = function() {
    var s = "<div id=\"sessionTimeout\" class=\"small reveal-modal\" data-reveal>";
    s += "<h2>Session Timeout Warning</h2>"
    s += "<p class=\"lead\">Session will timeout in 5 minutes</p>";
    s += "<p>You will be logged off in 5 minutes due to inactivity.  If you wish to continue on this page, click Continue.  Otherwise you will be logged off and your work will not be saved.</p>";
    s += "<a href=\"#\" onclick=\"BEMT.resetSession();\" class=\"button tiny\">Continue</a>";
    s += "</div>"

    $("body").append(s);
    $('#sessionTimeout').foundation('reveal', 'open');
  }

  var _removeSessionModal = function() {
    $('#sessionTimeout').foundation('reveal', 'close');
    $("#sessionTimeout").remove();
  }

  var _handleSessionEnd = function() {
    _removeSessionModal();
    $.get(getAppRoot()+"/bemtuser/logout", function() {
      alert("Your session has expired.  Please log in again.");
      _redirectToLogin();
    });
  }

  var _redirectToLogin = function() {
    window.location = "/";
  }


  //public methods
  var checkForAndHandleJSONReturnError = function(data) {
    if(data.error) {
      alert("There was an error: "+ data.message)
      return true;
    } 
    return false;
  }

  var handleAsyncError = function(request, msg, error) {
    //Type: Function( jqXHR jqXHR, String textStatus, String errorThrown )
    //alert("BemtAjax: Error: "+msg+", "+ error);
    showErrorMessage(request.responseText);
  };  

  var handleAsyncSuccess = function(msg) {
    showSuccessMessage(msg);
  }

  var toBeDone = function()  {
   alert("This feature will done completed in a later Sprint!");
  }


  var init = function(initSession, approot) {    
    APP_ROOT = approot;
    _initEventHandlers();
    if(initSession) {
      _sessionTimer();
    }
  }

  var showSuccessMessage = function (msg) {
    _showFlash(msg,MESSAGE_SUCCESS)
  }

  var showInfoMessage = function (msg) {
    _showFlash(msg,MESSAGE_INFO)   
  }

  var showErrorMessage = function (msg) {
    _showFlash(msg,MESSAGE_ERROR)
  }

  var clearErrorMessages =function() {
    $(".asyncmessage."+MESSAGE_ERROR).hide();    
  }

  var formatMoney = function(n) {
    return n.toFixed(2);
  }

  var formatMoney3 = function(n) {
    return n.toFixed(3);
  }

  var formatPercentage = function(n) {
    return n.toFixed(2);
  }

  var formatDecimal = function(n) {
    return n.toFixed(2);
  }

  var checkNumeric = function(n) {
    var regex1 = /\b[0-9]{1,4}\.[0-9]{2}\b/;
    var regex2 = /\b[0-9]{1,4}\b/;

    if(n.indexOf(".") > -1) {
      if (regex1.test(n)) {
        return true
      }
    } else {
      if (regex2.test(n)) {
        return true;
      }
    }
    return false;
  }

  var checkPercent = function(n) {
    var regex1 = /[0-9]{0,3}\.[0-9]{1,2}\b/;
    var regex2 = /[0-9]{1,3}\b/;

    if(n.indexOf(".") > -1) {
      if (regex1.test(n)) {
        return true
      }
    } else {
      if (regex2.test(n)) {
        return true;
      }
    }
    return false;
  }

  var checkInteger = function(n) {
    return !isNaN(n) && parseInt(Number(n)) == n && !isNaN(parseInt(n, 10));
  }  

  var checkMoney = function(n) {
    var isCurrencyRegEx    = /^[0-9]\d*(((,\d{3}){1})?(\.\d{0,2})?)$/
    return isCurrencyRegEx.test(n)
  }

  var resetSession = function () {
    _removeSessionModal();
    clearTimeout(SESSION_END_TIMER);
    $.get(_getAppRoot()+"/home/keepalive")
    _sessionTimer();
  }  

  var getAppRoot = function() {
    return APP_ROOT
  }

  //make module methods public  
  var oPublic = {
    init: init,
    showSuccessMessage : showSuccessMessage,
    showInfoMessage : showInfoMessage,
    showErrorMessage : showErrorMessage,
    handleAsyncError : handleAsyncError,
    handleAsyncSuccess : handleAsyncSuccess,
    checkForAndHandleJSONReturnError : checkForAndHandleJSONReturnError,
    toBeDone : toBeDone,
    formatMoney : formatMoney,
    formatMoney3 : formatMoney3,
    formatPercentage : formatPercentage,
    formatDecimal : formatDecimal,
    checkNumeric : checkNumeric,
    checkPercent : checkPercent,
    checkInteger : checkInteger,
    checkMoney : checkMoney,
    resetSession : resetSession,
    clearErrorMessages : clearErrorMessages,
    getAppRoot : getAppRoot
  };
  return oPublic;
}();