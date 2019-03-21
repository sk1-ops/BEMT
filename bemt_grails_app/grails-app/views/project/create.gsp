<html>
	<head>
		<meta name="layout" content="../layouts/default"/>
		<title>My Projects</title>
	</head>
	<body>
		<!--// header //-->
		<g:render template="header" model="['title':'My Projects', 'bc':'Add New']"/>    


		<!--// instructional content //-->
		<div class="row">
     	<div class="small-10 columns">
				<p>Names and descriptions are very important.  Please describe your project as clearly as possible. Part of the definition of a project is what specimens/products and services are included. Please make sure you add the specimens/products and services that are included in this project. </p>
			</div>
		</div>
    <div class="row">
     	<div class="small-12 columns">
     		<div class="form_required"><i class="fa fa-asterisk required_mark"></i> denotes required field</div>
				<g:form url="[resource:obj, action:'save']">
					<g:render template="form"/>
					<div class="ctl-btn-group">
						<g:actionSubmit class="save button bemtbutton radius" action="save" value="Save"></g:actionSubmit>			
						<bemt:button controller="project" action="index" function="return confirm('Are you sure you want to cancel without saving your new Project?');">Cancel</bemt:button>
					</div>
				</g:form>
			</div>
		</div>
	</body>
</html>	