<html>
	<head>
		<meta name="layout" content="../layouts/default"/>
		<title>Copy Biobank</title>
	</head>
	<body>		
		<!--// header //-->
		<g:render template="header" model="['title':'Copy Biobank', 'bc':'Copy Biobank']"/>    

		<!--// form //-->
    <div class="row">
     	<div class="small-8 columns end">
     	<p>Copying this Biobank will create a copy of all the data for the selected Biobank and save a copy as a new Biobank with the name you specify below.</p>
			</div>
		</div>

		<!--// form //-->
    <div class="row">
     	<div class="small-6 columns end">
				<g:form url="[resource:obj, action:'savecopy']" id="organization_form">
	     		<div class="form_required"><i class="fa fa-asterisk required_mark"></i> denotes required field</div>
					<g:hiddenField name="copyorg" value="${obj.id}" />
					<g:render template="form"/>
					<div class="ctl-btn-group">
						<g:actionSubmit class="save button bemtbutton radius" action="savecopy" value="Save Copy"></g:actionSubmit>			
						<bemt:button controller="home" action="index" function="return confirm('Are you sure you want to cancel without saving your changes?');">Cancel</bemt:button>
					</div>
				</g:form>
			</div>
		</div>		

	</body>
</html>	
