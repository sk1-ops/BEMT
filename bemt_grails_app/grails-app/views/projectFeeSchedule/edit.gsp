<html>
	<head>
		<meta name="layout" content="../layouts/default"/>
		<title>My Projects</title>
	</head>
	<body>
		<!--// header //-->
		<g:render template="header" model="['title':'Fee Schedule']"/>   


		<!--// instructional content //-->
		<div class="row">
     	<div class="small-10 columns">
				<p>Some text about the fee schedule? </p>
			</div>
		</div>
    <div class="row">
     	<div class="small-12 columns">
				<g:form url="[resource:obj, action:'update']">
					<g:render template="form"/>
					<div class="ctl-btn-group">
						<g:actionSubmit class="save button tiny radius" action="update" value="Save"></g:actionSubmit>			
						<bemt:button controller="projectFeeSchedule" action="show" id="${obj.id}" function="return confirm('Are you sure you want to cancel without saving your changes?');">Cancel</bemt:button>
					</div>
				</g:form>
			</div>
		</div>
	</body>
</html>	