<html>
	<head>
		<meta name="layout" content="../layouts/default"/>
		<title>My Products &amp; Services</title>
	</head>
	<body>

		<!--// step navigation (as requested) //-->
    <div class="row">
     	<div class="small-12 columns">
     		<g:link controller="project" action="index" class="button success stepnav radius">Next: My Projects <i class="fa fa-angle-double-right"></i></g:link>
			</div>
		</div>	

		<!--// header //-->
		<g:render template="header" model="['title':'Specimens/Products & Services']"/> 	
		
		<!--// instructional content //-->
    <div class="row">
     	<div class="small-10 columns">
				<p>Creating a master list of biobanking specimen/products and services will allow you to specify your biobanks offerings, determine direct costs for these specimen/products and services, set prices/fees for them and begin to develop a financial plan based on the volumes of these that you plan on producing and distributing. </p>
				<p><i><b>Actions:</b> Click the + Add button and specify whether you want to add a specimen/product to your list or a service.</i></p>

				<div class="ctl-btn-group">
					<a href="#" data-dropdown="create-product-dd" class="button bemtbutton radius dropdown"><i class="fa fa-plus"></i> Add</a><br>
					<ul id="create-product-dd" data-dropdown-content class="f-dropdown">
					  <li><g:link action="create" controller="product" params="[productTypeId: specimenType.id]">New Specimen/Product</g:link></li>
					  <li><g:link action="create" controller="product" params="[productTypeId: serviceType.id]">New Service</g:link></li>
					</ul>
				</div> 
			</div>
		</div>

		<!--// list //-->
		<g:if test="${specimens || services}">
			<div class="row">
     		<div class="small-12 columns">	
 					<g:if test="${specimens}">
						<h4>Specimen Products</h4>
						<g:render template="list" model="[objList: specimens, objName: 'specimen']"/>
					</g:if>
					<g:if test="${services}">
						<h4>Service Offerings</h4>
						<g:render template="list" model="[objList: services, objName: 'service']"/>
					</g:if>
				</div>
			</div>
		</g:if>
		<g:else>
			<div class="row">
		   	<div class="small-8 columns">
					<g:render template="../components/emptylist" model="['message':'You haven\'t created any Specimen/Products or Services yet.  Go ahead and create some!']"></g:render>
				</div>
			</div>
		</g:else>
	</body>
</html>	