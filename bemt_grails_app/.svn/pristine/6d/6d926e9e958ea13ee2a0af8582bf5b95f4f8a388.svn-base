/*
 * BEMT Labor Component Javascript
 * Version 1.0
 * 
 * labor.js
 * module for labor page functions
 * functions eveloped as namespaced object
 * 
 * Dependencies: 
 *    jquery JS
 */

var Labor = Labor || {};

Labor = function() {

  //private properties

  //private methods
  var _updateLaborCost = function() {
    //get qty
    var qty = $("#labor_qty").val();

    //get price
    var price = $("#labor_price").html();

    if(qty == '' || price == '--') {
      $("#labor_cost").html("--");
      $("#labor_cost_field").val("");
      return;
    } else {
      var cost = BEMT.formatMoney(qty*price);
      $("#labor_cost").html(cost);
      $("#labor_cost_field").val(cost);
    }
  }  

  //public methods
  var changeCategory = function() {
  	var selectId = $("#form-laborCategory").val();
  	var selectText = $("#form-laborCategory option:selected").text();
  	if (selectId != "") {
	  	$("#form-laborName").val(selectText);
    } else {
      $("#form-laborName").val("");      
    }
	}


  var updateLaborAllocation = function(select) {
    var id = $(select).val();
    if(id != "") {
      var url = BEMT.getAppRoot()+"/labor/show/"+id+".json"    
      $.get( url, function( data ) {
        var n = 0;
        var salary = data.annualSalary
        var benefit = data.benefitPercent
        benefit = BEMT.formatPercentage(benefit/100);
        n = ((salary + (salary*benefit))/2000)/60;
        n = BEMT.formatMoney(n);
        $("#labor_price").html(n);
        _updateLaborCost();
      });
    } else {
      _updateLaborCost();
    }
  }

  var updateLaborAllocationQty = function() {
    _updateLaborCost();
  }

  //make module methods public  
  var oPublic = {
    changeCategory: changeCategory,
    updateLaborAllocation : updateLaborAllocation,
    updateLaborAllocationQty : updateLaborAllocationQty
  };

  return oPublic;
}();