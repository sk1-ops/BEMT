<html>
	<head>
		<meta name="layout" content="../layouts/default"/>
		<title>My Forecast</title>
	</head>
	<body>

		<!--// header //-->
		<g:render template="header" model="['title':'Other Project COGS', 'bc':'Other Project COGS', 'bcId':project]"/> 	

		<!--// instructional content //-->
    <div class="row">
     	<div class="small-10 columns">
				<p>
				</p>				
			</div>
		</div>
	    
		<div class="row">
			<div class="small-7 columns">
				<g:form url="[resource:obj, action:'save']">
					<g:hiddenField name="proformaproject" value="${project}" />
					<g:render template="form"/>
					<g:actionSubmit onclick="return Proforma.checkOther();" class="save button bemtbutton radius" action="save" value="Save Project COGS"></g:actionSubmit>			
					<bemt:button controller="proforma" action="show" function="return confirm('Are you sure you want to cancel without updating the forecast?');">Cancel</bemt:button>
				</g:form>
			</div>
     	<div class="small-5 columns">
				<p></p>
			</div>
		</div>
	</body>
</html>	