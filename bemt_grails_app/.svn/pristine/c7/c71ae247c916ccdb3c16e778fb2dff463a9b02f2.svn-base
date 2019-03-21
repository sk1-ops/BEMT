/*
 * BEMT Bemtuser Javascript
 * Version 1.0
 * 
 * bemt.js
 * module for Bemtuser page functions
 * functions eveloped as namespaced object
 * 
 * Dependencies: 
 *    jquery JS
 */

//set up namespaces so we can use these without collison
var BEMTUser = BEMTUser || {};

BEMTUser = function() {
  //private properties

  //private methods (start with _)

  //public methods
  var initPage = function() {
    //listeners
    $( "#password_form" ).submit(function(e) {
      var cPassword = $("#current_password").val();
      var nPassword = $("#new_password").val();
      var nPasswordConfirm = $("#new_password_confirm").val();

      //check to make sure something was filled out.
      if(cPassword == "" || nPassword == "" || nPasswordConfirm == "") {
        alert("You must fill out your current password and provide a new password and confirm the new password.")
        return false;
      }

      if(nPassword != nPasswordConfirm) {
        alert("Your new password and confirmation field do not match")
        return false;
      }

      if(nPassword == cPassword) {
        alert("Your old password and new password must not be the same.")
        return false;
      }
    });
  }

  //make module methods public  
  var oPublic = {
    initPage: initPage
  };
  return oPublic;
}();