/*
 * BEMT Supply Component Javascript
 * Version 1.0
 * 
 * supply.js
 * module for Supply page functions
 * functions eveloped as namespaced object
 * 
 * Dependencies: 
 *    jquery JS
 */

//set up namespaces so we can use these without collison
var Supply = Supply || {};

Supply = function() {

  //private properties

  //private methods
  var _updateCOGS = function() {
    //get qty
    var qty = $("#supply_qty").val();

    //get price
    var price = $("#supply_price").html();

    if(qty == '' || price == '--') {
      $("#supply_cost").html("--");
      $("#supply_cost_field").val("");
      return;
    } else {
      var cost = BEMT.formatMoney(qty*price);
      if(cost != 'NaN') {
        $("#supply_cost").html(cost);
        $("#supply_cost_field").val(cost);
      } else {
        $("#supply_cost").html('0.00');
        $("#supply_cost_field").val('0.00');
      }
    }
  }

  var _resetCOGSForm = function() {
    $("#supply_qty").val("");
    $("#supply_price").html("--");
    $("#supply_cost").html("--");
    _updateCOGS();
  }
  

  //public methods
  var updateAllocationSupplyType = function() {
    var id = $("#supply_formselect").val();
    if(id != "") {
      var url = BEMT.getAppRoot()+"/supply/show/"+id+".json"   
      $.get( url, { "_": $.now() }, function( data ) {
        var n = 0;
        n = BEMT.formatMoney(data.unitPrice);   
        $("#supply_price").html(n);
        _updateCOGS();
        if(n == 0) {
          alert("You have selected a supply that you have not set a price for. If you would like to include this supply in the costing of this product, please return to the My Biobank/Lab Supplies page to set a price for this supply.");
        }

      });
    } else {
      _resetCOGSForm();
    }
  }

  var updateAllocationSupplyQty = function() {
    _updateCOGS();
  }

  //make module methods public
  var oPublic = {
    updateAllocationSupplyType : updateAllocationSupplyType,
    updateAllocationSupplyQty : updateAllocationSupplyQty
  };

  return oPublic;
}();