<g:if test="${error.message}">
	<div class="flasherror">
		<div class="left" style="padding:5px 0 0 0px;"><i class="fa fa-3x fa-warning" style="color:red"></i> </div>
		<div style="margin:0 0 0 50px"><h5>There were errors.</h5></div>
	  <div style="margin:0 0 0 50px"><p>${error.message}</p></div>
	</div>
</g:if>