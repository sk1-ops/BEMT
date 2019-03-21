/*
 * BEMT Project Component Javascript
 * Version 1.0
 * 
 * Project.js
 * module for page functions
 * functions eveloped as namespaced object
 * 
 * Dependencies: 
 *    jquery JS
 */

//set up namespaces so we can use these without collison
var Project = Project || {};

Project = function() {

  //private properties

  //private methods
  var _calculateRecovery = function(id) {
    var unitCost = $("#unitCost_"+id).val();
    var basePrice = $("#display_basePrice_"+id).val();
    var recover = "";
    if(unitCost == 0 && basePrice > 0) {
      $("#display_recoveryPercent_"+id).html("&#8734;");
    } else {        
      recovery = BEMT.formatDecimal((basePrice/unitCost) * 100);
      $("#display_recoveryPercent_"+id).html(recovery);
    }
    $("#basePrice_"+id).val(basePrice);
  }

  var _showSuccess = function(id) {
    $("#save_button_"+id).attr("disabled","disabled");
    $("#save_button_"+id).removeClass("alert");
    $("#save_button_"+id).addClass("success");
    $("#save_button_"+id).attr("value","Saved");
    BEMT.showSuccessMessage("Base Price updated successfully.")
  }

  var _resetSaveButton = function(id) {
    $("#save_button_"+id).removeAttr("disabled");
    $("#save_button_"+id).removeClass("success");
    $("#save_button_"+id).addClass("alert");
    $("#save_button_"+id).attr("value","Save");
  }

  //public methods  
  var updateBasePrice = function(id) {
    var price = $("#display_basePrice_"+id).val();
    if(BEMT.checkNumeric(price)) {
      _calculateRecovery(id);
      if(!$("#save_button_"+id).is(":visible")) {
        $("#save_button_"+id).fadeIn(300);
      }
    } else {
      alert("Price per Unit must be a valid dollar amount (e.g. 125, 45.50, etc)");
      $("#display_basePrice_"+id).val($("#basePrice_"+id).val());    
    }
  }  

  var checkBasePrice = function() {


  }

  var saveBasePrice = function(data) {
    //use data to show what we need
    if(!BEMT.checkForAndHandleJSONReturnError(data)) {
      var id = data.id;
      _calculateRecovery(id);
      _showSuccess(id);
      setTimeout(function() {
        $("#save_button_"+id).fadeOut(500, function() {
          _resetSaveButton(id);
        });
      }, 1000);
    }
  }  

  var _initializeEventBindings = function() {
    $(document).on('bemt.copydisclaimer', function(evt, text) {
      //so some shit
      $("#description").val(text);  
    }); 

  }

  var initPage = function() {
    _initializeEventBindings();
  }

  //make private methods public
  var oPublic = {
    updateBasePrice: updateBasePrice,
    saveBasePrice: saveBasePrice,
    checkBasePrice: checkBasePrice,
    initPage: initPage
  };

  return oPublic;
}();