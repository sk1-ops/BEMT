<!DOCTYPE html>
<html lang="en">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title><g:layoutTitle default="?"/> | BEMT</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <g:layoutHead/>
    <asset:stylesheet src="app.css"/>
    <r:layoutResources/>
  </head>
  <body>
    <div class="basic-page">
      <g:render template="/components/topnav-public" />
      <g:layoutBody/>
      <r:layoutResources />
      <div class="footer-push">&#160;</div>
    </div> 
    <g:render template="/components/footer"/>
    <script src="/bemt/vendor/jquery/jquery.min.js" type="text/javascript"></script>
    <script src="/bemt/vendor/foundation/js/foundation.min.js" type="text/javascript"></script>
    <script src="/bemt/vendor/modernizr/modernizr.js" type="text/javascript"></script>
    <asset:javascript src="application.js"/>
    <asset:javascript src="login.js"/>
    <script>
      $(document).ready(function() {
        BEMT.init(false, APP_ROOT);
      });      
    </script>     
    <g:render template="/components/google"/>
  </body>
</html>