<html>
	<head>
		<meta name="layout" content="../layouts/default"/>
		<title>Edit Supply Details</title>
	</head>
	<body>

		<!--// header //-->
		<g:render template="header" model="['title':'Edit Lab Supply', 'bc':'Edit']"/>

		<!--// instructional content //-->
    <!--
    <div class="row">
     	<div class="small-10 columns">
				<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Nam cursus. Morbi ut mi. Nullam enim leo, egestas id, condimentum at, laoreet mattis, massa. Sed eleifend nonummy diam. Praesent mauris ante, elementum et, bibendum at, posuere sit amet, nibh. Duis tincidunt lectus quis dui viverra vestibulum.</p>
			</div>
		</div>
		-->

		<!--// form //-->
    <div class="row">
     	<div class="small-12 columns">
				<g:form url="[resource:obj, action:'update']">
	     		<div class="form_required"><i class="fa fa-asterisk required_mark"></i> denotes required field</div>
					<g:render template="form_unit"/>
					<div class="ctl-btn-group">
						<g:actionSubmit class="save button bemtbutton radius" action="update" value="Save"></g:actionSubmit>			
						<bemt:button controller="supply" action="index" function="return confirm('Are you sure you want to cancel without saving your changes?');">Cancel</bemt:button>
					</div>
				</g:form>
			</div>
		</div>
	</body>
</html>	