/*
 * BEMT Proforma Component Javascript
 * Version 1.0
 * 
 * proformna.js
 * module for Proforma (Forecast) page functions
 * functions eveloped as namespaced object
 * 
 * Dependencies: 
 *    jquery JS
 */

//set up namespaces so we can use these without collison
var Proforma = Proforma || {};

Proforma = function() {

  //private properties

  //private methods (start with _)

  var _updateForecasts = function(equip, month, year) {
    var range = Number(year) * 12;
    for(var i=month; i < range; i++) {

      //get the monthly values
      var qty = $("#form_total_"+equip+"_"+i).val();
      var added = $("#form_added_"+equip+"_"+i).val();
      var newQty = parseFloat(qty) + parseFloat(added);
      //alert(i+', '+qty);
      var nextMonth = i + 1;
      _updateCurrentEquipment(equip,nextMonth,newQty);
    }   
  }

  var _updateCurrentEquipment = function(equip,month,newQty) { 
    $("#form_total_"+equip+"_"+month).val(newQty);
    $("#total_"+equip+"_"+month).html(newQty);
    
    //check the choice in the select box
    var value = $("#form_added_"+equip+"_"+month).val();
    
    //remove the current options
    $("#form_added_"+equip+"_"+month+" option").each(function() {
      $(this).remove();
    });

    var bottomRange = -Math.abs(newQty);
    var topRange = 10;
    //alert("range: "+bottomRange+', '+topRange);

    var selectOptions = [];
    for(var i=bottomRange; i <= topRange; i++) {
      selectOptions.push('<option value="'+ i +'">'+ i +'</option>');
    }

    //assign new options 
    $("#form_added_"+equip+"_"+month).html(selectOptions.join(''));
    $("#form_added_"+equip+"_"+month).val(value);
  }


  //public methods
  var setEquipmentQty = function(equip, month, year) {
    _updateForecasts(equip, month, year);
  }

  var adjustStartEquipment = function(obj, equip) {
    var start = $(obj).val();
    $("#form_total_"+equip+"_1").val(start);
    _updateForecasts(equip, 1, 1)
  }

  var removeProjectFromProforma = function() {
    var doit = confirm("Are you sure you want to remove this Project from your Forecast? \n\nDoing so will remove all Specimen/Products and Services and volume-based forecasts associated with this Project.\n");
    if(doit) {
      return true;
    } else {
      return false;
    }
  }

  var removeOtherFromProformaProject = function() {
    var doit = confirm("Are you sure you want to remove from your Project?");
    if(doit) {
      return true;
    } else {
      return false;
    }
  }  

  var adjustForecast = function(list, type, period) {
    var percent = parseInt($(list).val());
    var base = parseFloat($("#"+type+period+"_field").val());

    var newVal = 0

    if(percent == 0) {
      newVal = $("#orig_"+type).val();
    } else {
      var adjust = base * (percent/100);
      newVal = BEMT.formatMoney(base+adjust);
    }
    //udpate hidden form field
    $("#"+type+period+"_field").val(newVal);

    //change the values in the columns
    for (var i=1; i < 13; i++) {
      var cell = i+(12*(period-1));
      $("#"+type+"_"+cell).html(newVal);
    }
    // if year 2, update year 3 as well
    if(period == 2) {
      for (var i=25; i <= 36; i++) {
        var cell = i;
        $("#"+type+"_"+cell).html(newVal);
      }
      $("#"+type+"3_field").val(newVal);
      $("#"+type+"Change3").val("0");
    }
  }

  var _checkQty = function(value) {    
    if(!BEMT.checkInteger(value)) {
      alert("Quantity must be a integer.");
      return false;
    }

    if(value > 100000) {
      alert("Quantity must be 100,000 or less");
      return false;      
    }  
    return true;  
  }

  var setForecast = function(field, period1, period2) {
    var value = parseInt($("#"+field).val());
    //check to make sure that the forecast isn't a crazy number
    if(_checkQty(value)) {
      for (var i=period1; i <= period2; i++) {
        $("#qty_"+i).val(value);
      }
    }

    return false;
  }

  var checkForecastQty = function() {
    for(i = 1; i <= 36; i++) {
      var value = $("#qty_"+i).val();
      if(!BEMT.checkInteger(value) && value == '') {
        $("#qty_"+i).val('0');
      }
      else if(!_checkQty(value)) {
        $("#qty_"+i).focus();
        return false;
      }
    }
    return true;

  }

  var checkOther = function() {

    for(i=1; i <=3; i++) {
      var n = $("#year"+i).val();
      var value = $("#qty_"+i).val();
      if(!BEMT.checkMoney(n) && n == '') {
        $("#year"+i).val("0.00");
      } else if(!BEMT.checkMoney(n)) {
        alert("Entry must be valid dollar amount (1, 325.50, 4,000)");
        $("#year"+i).focus();
        return false;
      }
    }
    return true;
  }

  //make private methods public
  var oPublic = {
    setEquipmentQty: setEquipmentQty,
    adjustStartEquipment: adjustStartEquipment,
    removeProjectFromProforma: removeProjectFromProforma,
    removeOtherFromProformaProject : removeOtherFromProformaProject,
    adjustForecast : adjustForecast,
    setForecast : setForecast,
    checkForecastQty: checkForecastQty,
    checkOther : checkOther
  };

  return oPublic;
}();