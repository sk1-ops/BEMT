/*
 * BEMT Product Component Javascript
 * Version 1.0
 * 
 * Product.js
 * module for page functions
 * functions eveloped as namespaced object
 * 
 * Dependencies: 
 *    jquery JS
 */

//set up namespaces so we can use these without collison
var Product = Product || {};

Product = function() {

  //private properties

  //private methods
  var _calculateUnitCost = function() {
    //get all the pieces, then do the math

    //should be cost+ price + % of indirect, then % of margin

    //get calculated cost and set form field
    var cost = $("#calcCost").html();
    var ongoing = $("#ongoing").val();


    //alert(percent);
    
    var ongoing = BEMT.formatMoney(parseFloat(ongoing));
    var price = parseFloat(cost) + parseFloat(ongoing) ;

    $("#ongoing").val(BEMT.formatMoney(parseFloat(ongoing)));
    $("#display_indirect").html(formatMoney(parseFloat(indirect)));

    $("#unitCost").val(price); 
    $("#display_unitCost").html(BEMT.formatMoney(parseFloat(price)));
  }

  var updateUnitCost = function() {
    _calculateUnitCost();
    $("#btn_unitCostSave").fadeIn(300);
  }  

  var editIndirect = function() {
    $("#indirect").hide();
    $("#edit_indirect").show();
    $("#form_indirect").show();
  }

  var cancelIndirectEdit = function() {
    $("#edit_indirect").hide();
    $("#form_indirect").hide();
    $("#indirect").show();
  }


  var checkIndirect = function() {
    //make sure field is valid
    var ind = $("#entry_indirectPercent").val();
    if(BEMT.checkPercent(ind)) {
      //copy value to form
      $("#form_entry_indirectPercent").val(ind);
      return true;      
    }
    alert("Indirect Cost must be a valid % up to two decimal places (e.g. 15, 10.25)");
    $("#entry_indirectPercent").val($("#form_entry_indirectPercent").val())
    return false;
  }

  var changeIndirect = function() {

  }

  var updateIndirect = function(data) {
    $("#display_indirect").html(BEMT.formatPercentage(data.indirectPercent)+"% / $"+BEMT.formatMoney(parseFloat(data.indirect)));
    $("#display_unitCost").html(BEMT.formatMoney(parseFloat(data.unitCost)));
    $("#edit_indirect").hide();
    $("#form_indirect").hide();
    $("#indirect").show();
    BEMT.showSuccessMessage("Ongoing Supply Fee updated successfully.");
  }


  var checkQty = function(id) {
    var isNum = BEMT.checkNumeric($("#"+id).val());
    if(!isNum) {
      alert("Quantity must be a valid number with up to two decimal places (e.g. 15, 10.25)");
      return false
    }
    return true;
  }
  //make private methods public
  var oPublic = {
    updateUnitCost: updateUnitCost,
    editIndirect : editIndirect,
    updateIndirect : updateIndirect,
    checkIndirect : checkIndirect,
    changeIndirect : changeIndirect,
    cancelIndirectEdit : cancelIndirectEdit,
    checkQty : checkQty
  };

  return oPublic;
}();