<html>
	<head>
		<meta name="layout" content="../layouts/default"/>
		<title>Create Supply</title>
	</head>
	<body>
		
		<!--// header //-->
		<g:render template="header" model="['title':'Add Lab Supply', 'bc':'Add New']"/>
    
		<!--// instructional content //-->
    <!--
    <div class="row">
     	<div class="small-10 columns">
     		<p>Some helpful content here....</p>
			</div>
		</div>
		-->
		<!--// form //-->
    <div class="row">
     	<div class="small-12 columns">
				<g:form url="[resource:obj, action:'save']">
	     		<div class="form_required"><i class="fa fa-asterisk required_mark"></i> denotes required field</div>
					<g:render template="form_unit"/>
					<div class="ctl-btn-group">
						<g:actionSubmit class="save button bemtbutton radius" action="save" value="Save"></g:actionSubmit>			
						<g:actionSubmit class="save button bemtbutton radius" action="saveadd" value="Save and Add Another"></g:actionSubmit>			
						<bemt:button controller="supply" action="index" function="return confirm('Are you sure you want to cancel without saving this Supply?');">Cancel</bemt:button>
					</div>
				</g:form>
			</div>
		</div>
	</body>
</html>	