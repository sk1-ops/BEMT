<html>
	<head>
		<meta name="layout" content="../layouts/default"/>
		<title>Supplies</title>
	</head>
	<body>

		<!--// step navigation (as requested) //-->
    <div class="row">
     	<div class="small-12 columns">
     		<g:link controller="product" action="index" class="button success stepnav radius">Next: My Specimen Products &amp; Services <i class="fa fa-angle-double-right"></i></g:link>
			</div>
		</div>	

		<!--// header //-->
		<g:render template="header" model="['title':'Lab Supplies']"/>    

		<!--// instructional content //-->
		<div class="row">
     	<div class="small-10 columns">
	     	<p>Creating a master list of biobanking supplies will allow you to allocate the costs of your supplies to the specimen/products and services you collect and distribute. This list should include supplies that are consumed (either single use or multi-use) when collecting specimen/product or delivering biobanking services (for example cassettes, or gloves). Those supplies that are not consumed this way, but may degrade over time (such as a cutting board or LN2) do not need to be listed here. Rather they can be added to overall expenses later.</p>
				<p><i><b>Actions:</b> Click the + Add button to begin adding supplies.</i></p>
				<div class="ctl-btn-group">
					<g:link action="create" controller="supply" class="button bemtbutton radius"><i class="fa fa-plus"></i> Add Supply</g:link>
				</div>
			</div>
		</div>

		<!--// list //-->
		<g:if test="${objList}">
			<div class="row">
		   	<div class="small-12 columns">
					<g:render template="list"/>
				</div>
			</div>
		</g:if>
		<g:else>
			<div class="row">
		   	<div class="small-8 columns">
					<g:render template="../components/emptylist" model="['message':'You haven\'t created any Supplies yet.  Go ahead and create some!']"></g:render>
				</div>
			</div>
		</g:else>						    	

	</body>
</html>	