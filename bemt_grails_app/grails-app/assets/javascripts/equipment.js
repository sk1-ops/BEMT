/*
 * BEMT Equipment Component Javascript
 * Version 1.0
 * 
 * equipment.js
 * module for Equipment page functions
 * functions eveloped as namespaced object
 * 
 * Dependencies: 
 *    jquery JS
 */

//set up namespaces so we can use these without collison
var Equipment = Equipment || {};

Equipment = function() {

  //private properties

  //private methods
  var _updateEquipmentCost = function() {
    //get qty
    var qty = $("#equipment_qty").val();

    //get price
    var price = $("#equipment_price").html();

    if(qty == '' || price == '--') {
      $("#equipment_cost").html("--");
      $("#equipment_cost_field").val("");
      return;
    } else {
      var cost = BEMT.formatMoney(qty*price);
      $("#equipment_cost").html(cost);
      $("#equipment_cost_field").val(cost);
    }
  }  

  //public methods
  var changeCategory = function() {

    var selectId = $("#form-equipCategory").val();
    var selectText = $("#form-equipCategory option:selected").text();

    if (selectId != "") {
      $("#form-equipName").val(selectText);
    } else {
      $("#form-equipName").val("");      
    }
  }

  var updateEquipmentAllocation = function(select) {
    var id = $(select).val();
    if(id != "") {
      var url = BEMT.getAppRoot()+"/equipment/show/"+id+".json"    
      $.get( url, function( data ) {

        var n = 0;
        //(((annual service * life) + price)/life)/annualBillableHours

        var life = data.usableLife
        var service = data.annualServiceContract
        var price = data.cost
        var hours = data.annualBillableHours
        if(data.type == 'leased') {
          n = (price+service)/(hours*60);
        } else {
          n = (((service*life)+price)/life)/hours/60;
        }
        n = BEMT.formatMoney3(n);

        $("#equipment_price").html(n);
        _updateEquipmentCost();
      });
    } else {
      _updateEquipmentCost();
    }
  }

  var updateEquipmentAllocationQty = function() {
    _updateEquipmentCost();
  }


  var checkAllocated = function() {
    var n = $("#equipment_cost_field").val();
    if(n == '0.00') {
      var doit = confirm("Your cost/minute is less than one penny.  The minimum cost/minute is $0.01 (1 penny).  If you continue, the cost per minute will be set at $0.01.  Click 'cancel' if you do not want to continue.")
      if(doit) {
        $("#equipment_cost_field").val('0.01');
        return true;
      } else {
        return false;
      }
    }
    return true;

  }
  //make module methods public  
  var oPublic = {
    changeCategory: changeCategory,
    updateEquipmentAllocation : updateEquipmentAllocation,
    updateEquipmentAllocationQty : updateEquipmentAllocationQty,
    checkAllocated : checkAllocated

  };

  return oPublic;
}();