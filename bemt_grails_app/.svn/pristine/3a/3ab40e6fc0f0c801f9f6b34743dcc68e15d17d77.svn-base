<html>
	<head>
		<meta name="layout" content="../layouts/default"/>
		<title>Edit Biobank</title>
	</head>
	<body>		
		<!--// header //-->
		<g:render template="header" model="['title':'Edit Biobank', 'bc':'Edit Biobank']"/>    

		<!--// form //-->
    <div class="row">
     	<div class="small-8 columns end">
     	<p>%{--This is some stuff about what we need to do.....--}%</p>
			</div>
		</div>

		<!--// form //-->
    <div class="row">
     	<div class="small-6 columns end">
				<g:form url="[resource:obj, action:'save']" id="organization_form">
	     		<div class="form_required"><i class="fa fa-asterisk required_mark"></i> denotes required field</div>
					<g:render template="form"/>
					<div class="ctl-btn-group">
						<g:actionSubmit class="save button bemtbutton radius" action="update" value="Save"></g:actionSubmit>			
						<bemt:button controller="home" action="index" function="return confirm('Are you sure you want to cancel without saving your changes?');">Cancel</bemt:button>
					</div>
				</g:form>
			</div>
		</div>		

	</body>
</html>	
