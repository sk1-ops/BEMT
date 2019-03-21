class SecurityFilters {
  def filters = {
    /* login check will see if user is logged in and has access to the resources.  If not, redirect to login and 
    pass along the controller and action they were attempting to call so we can redirect */
  
    loginCheck(controller: 'assets|public', invert:true) {
      before = {
        if (!session.user) {
          redirect(controller: 'public', action: 'index', params:[]) /* was action:login */
          return false
        }
      }
    }
  
    allExceptPublicAndUser(controller:'bemtuser|public', invert:true) {
      //after filter will add the session user to the model so it can be used in things like the topnav
      after = { model ->
        if(session.user) {
          model?.loggedInUser = session.user        
          model?.userOrganization = session.org                  
          model?.userOrganizations = session.orglist                  
        }
      }       
    }
  }
}