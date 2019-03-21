<html>
	<head>
		<meta name="layout" content="../layouts/default"/>
		<title>Labor Categories</title>
	</head>
	<body>  

		<!--// step navigation (as requested) //-->
    <div class="row">
     	<div class="small-12 columns">
     		<g:link controller="equipment" action="index" class="button success stepnav radius">Next: My Equipment <i class="fa fa-angle-double-right"></i></g:link>
			</div>
		</div>	

		<!--// header //-->
		<g:render template="header" model="['title':'Labor Categories']"/>
    
  	<!--// instructional content //-->
    <div class="row">
     	<div class="small-10 columns">
				<p>Creating a master list of biobanking labor categories will allow you to determine total labor costs, plan project specific labor costs, and also allocate labor costs to individual specimens/products and services. </p>
				<p><i><b>Actions:</b> Click the + Add button to begin adding labor categories of employees/contractors that work in your biobank.</i></p>
				<div class="ctl-btn-group">
					<bemt:button type="new" action="create" controller="labor" title="Click to begin adding labor categories of employees/contractors that work in your biobank.">Add</bemt:button>
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
					<g:render template="../components/emptylist" model="['message':'You haven\'t created any Labor Categories yet.  Go ahead and create some!']"></g:render>
				</div>
			</div>
		</g:else>						    	
	</body>
</html>	