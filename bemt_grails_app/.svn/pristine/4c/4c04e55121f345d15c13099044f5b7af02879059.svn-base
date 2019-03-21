<html>
	<head>
		<meta name="layout" content="../layouts/default"/>
		<title>My Projects</title>
	</head>
	<body>

		<!--// step navigation (as requested) //-->
    <div class="row">
     	<div class="small-12 columns">
     		<g:link controller="proforma" action="index" class="button success stepnav radius">Next: My Forecast <i class="fa fa-angle-double-right"></i></g:link>
			</div>
		</div>	

		<!--// header //-->
		<g:render template="header" model="['title':'My Projects']"/>    


		<!--// instructional content //-->
		<div class="row">
     	<div class="small-10 columns">
				<p>Creating a master list of projects will allow you to specify specific specimen/products and services in each project, give each a project specific fee/price, add these projects to your financial plan with associated volumes creating a project specific financial plan as well as a complete biobank financial plan. </p>
				<p><i><b>Actions:</b> Consider starting with a baseline project for your biobank.  For example, if your biobank does ongoing collections to build a repository, create that as a project.    Then add specific projects for types of clients, or types of biobanking initiatives.  The idea is projects represent a bundle of specimen/products and services with specific fee/prices for specific stakeholders.</i></p>
				<p>Example: An academic biobank may have 4 projects:
					<ol>
						<li>Build a Repository</li>
						<li>Lung Cancer Collections for Principal Investigator Dr. XYZ</li>
						<li>Colon Cancer Collections as part of a Clinical Trial for ABC Pharma</li>
						<li>Tissue Micro-Array preparation for Principal Investigator Dr. XYZ</li>
					</ol>
				</p>
				<div class="ctl-btn-group">
					<bemt:button type="new" action="create" controller="project">Add</bemt:button>
				</div>
				<g:if test="${objList}">
					<g:render template="list"/>
				</g:if>
				<g:else>
					<div class="row">
	  		   	<div class="small-8 columns">
							<g:render template="../components/emptylist" model="['message':'You haven\'t created any Projects yet.  Go ahead and create some!']"></g:render>
						</div>
					</div>
				</g:else>						    	
			</div>
		</div>
	</body>
</html>	