<html>
	<head>
		<meta name="layout" content="../layouts/default"/>
		<title>New ${productType.name.capitalize()}</title>
	</head>
	<body>

		<!--// header //-->
		<g:render template="header" model="['title':'Add ' + productType.name.capitalize(), 'bc':'Add New']"/>    

		<!--// instructional content //-->
    <div class="row">
     	<div class="small-10 columns">
     		<g:if test="${productType.name.toLowerCase() == 'service'}">
     			<p>Names and descriptions are very important.  Please describe your service as clearly as possible. </p>

     		</g:if>
     		<g:else>
	     		<p>Names and descriptions are very important.  Please describe your specimen/product as clearly as possible.  Consider adding the following components to your description:
		     		<ul>
							<li>Approximate time from acquisition to stabilization (ischemic lag)</li>
							<li>Mechanism of Stabilization</li>
							<li>Type of Long Term Preservation</li>
							<li>Other Descriptors: Weight (gm); Aliquot volume (ml)</li>
						</ul>
					</p>
				</g:else>
	    </div>
	 	</div>

	 	<!--// form //-->
    <div class="row">
     	<div class="small-12 columns">
				<g:form url="[resource:obj, action:'save']">
					<g:render template="form"/>
					<div class="ctl-btn-group">
						<g:render template="../components/form-required"/>
						<g:actionSubmit class="save button bemtbutton radius" action="save" value="Save"></g:actionSubmit>			
						<g:actionSubmit class="save button bemtbutton radius" action="saveadd" value="Save and Add Another"></g:actionSubmit>			
						<bemt:button controller="product" action="index" function="return confirm('Are you sure you want to cancel without saving your new product?');">Cancel</bemt:button>
					</div>	
				</g:form>
			</div>
		</div>
	</body>
</html>	