<!DOCTYPE html>
<html lang="en">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title><g:layoutTitle default="?"/> | BEMT</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">  
    <g:layoutHead/>
    <link rel="stylesheet" href="/bemt/vendor/chartist/chartist.min.css">
    <asset:stylesheet src="app.css"/>   
    <r:layoutResources/>
    <g:setProvider library="jquery"/>    
  </head>
  <body>
    <div class="basic-page">
      <g:render template="/components/topnav"/>
      <g:layoutBody/>
      <r:layoutResources />
      <div class="footer-push">&#160;</div>
    </div> 
    <div id="md-modal-window" class="hide reveal-modal" data-reveal>
    </div>
    
    <g:render template="/components/footer"/>
    <script src="/bemt/vendor/jquery/jquery.min.js" type="text/javascript"></script>
    <script src="/bemt/vendor/jquery-ui/jquery-ui.min.js" type="text/javascript"></script>
    <script src="/bemt/vendor/chartist/chartist.min.js" type="text/javascript"></script>
    <script src="/bemt/vendor/foundation/js/foundation.min.js" type="text/javascript"></script>
    <script src="/bemt/vendor/modernizr/modernizr.js" type="text/javascript"></script>
    <asset:javascript src="application.js"/>
    <script>
      $(document).ready(function() {
        BEMT.init(true,APP_ROOT);
        <g:if test="${pageInitScript}">${pageInitScript}</g:if>
      });      
    </script>
    <g:render template="/components/google"/>
  </body>
</html>