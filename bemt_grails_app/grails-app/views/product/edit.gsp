<html>
	<head>
		<meta name="layout" content="../layouts/default"/>
		<title>Edit Product</title>
	</head>
	<body> 

		<!--// header //-->
		<g:render template="header" model="['title':'Edit '+ productType.name.capitalize() + ' Details', 'bc':'Edit']"/>    

		<!--// instructional content //-->

	 	<!--// form //-->
    <div class="row">
     	<div class="small-12 columns">	 	
				<g:form url="[resource:obj, action:'update']">
	     		<div class="form_required"><i class="fa fa-asterisk required_mark"></i> denotes required field</div>
					<g:render template="form"/>
					<div class="ctl-btn-group">
						<g:actionSubmit class="save button bemtbutton radius" action="update" value="Save"></g:actionSubmit>			
						<bemt:button controller="product" action="index" function="return confirm('Are you sure you want to cancel without saving your new Product?');">Cancel</bemt:button>
					</div>
				</g:form>
			</div>
		</div>
	</body>
</html>	