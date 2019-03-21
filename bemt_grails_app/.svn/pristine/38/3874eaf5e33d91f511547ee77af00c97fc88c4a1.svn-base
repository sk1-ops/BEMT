<html>
	<head>
		<meta name="layout" content="../layouts/default"/>
		<title>Equipment</title>
	</head>
	<body>

		<!--// step navigation (as requested) //-->
    <div class="row">
     	<div class="small-12 columns">
     		<g:link controller="supply" action="index" class="button success stepnav radius">Next: My Lab Supplies <i class="fa fa-angle-double-right"></i></g:link>
			</div>
		</div>	

		<!--// header //-->
		<g:render template="header" model="['title':'Equipment']"/>    


		<!--// instructional content //-->
		<div class="row">
     	<div class="small-9 columns">
				<p>Creating a master list of biobanking equipment will allow you to determine total equipment costs, plan project specific equipment costs, and also allocate the cost of equipment in your specimens/products and services.</p>
				<p><i><b>Actions:</b> Click the + Add button to begin adding equipment.  Start by specifying whether its equipment purchased or equipment leased.</i></p>
				<div class="ctl-btn-group">
					<a href="#" data-dropdown="create-equip-dd" class="button bemtbutton radius dropdown"><i class="fa fa-plus"></i> Add</a><br>
					<ul id="create-equip-dd" data-dropdown-content class="f-dropdown">
					  <li><g:link action="create" controller="equipment" params="[type:'purchased']">Purchased Equipment</g:link></li>
					  <li><g:link action="create" controller="equipment" params="[type:'leased']">Leased Equipment</g:link></li>
					</ul>				
				</div>
			</div>
		</div>
		
		<!--// list //-->
		<g:if test="${objListLeased || objListPurchased}">
			<div class="row">
     		<div class="small-12 columns">				
					<g:render template="list"/>
				</div>
			</div>
		</g:if>
		<g:else>
			<div class="row">
		   	<div class="small-8 columns">
					<g:render template="../components/emptylist" model="['message':'You haven\'t added any Equipment yet.  Go ahead and add some!']"></g:render>
				</div>
			</div>
		</g:else>						    	
	</body>
</html>	