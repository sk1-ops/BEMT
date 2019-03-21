<html>
	<head>
		<meta name="layout" content="../layouts/default"/>
		<title>Create Labor Cateogory</title>
	</head>
	<body>		
		<!--// header //-->
		<g:render template="header" model="['title':'Add Labor Category', 'bc':'Add New']"/>    

		<!--// instructional content //-->
		<div class="row">
     	<div class="small-6 columns">
     		<h4>Helpful Tips &amp; Definitions</h4>
			</div>
		</div>

		<!--// form //-->
    <div class="row">
     	<div class="small-6 columns">
				<ol>
					<li>These are labor categories, not individual employees/contractors.  For example, if you have two (2) Pathologists working in your biobank, as long as they make the same salary, you only need to add “Pathologist” to this list once.  However, if they make different salaries or have different titles, levels, etc. add multiple labor categories for Pathologists. In My Forecast, you will specify how many employees/contractors you have working in the biobank for each labor category.</li>
					<li><b>Annualized Salary:</b> An annual salary for this labor category assuming the employee worked full time. For example, if you have a part-time employee that works 50% of the year and earns $20,000, the annualized would be $40,000.</li>
					<li><b>Fringe Benefit:</b> This represents the average expected costs of employee benefits.  Generally, the organizations have set or estimated a figure for this.</li>
				</ol>					
			</div>
     	<div class="small-6 columns">
				<g:form url="[resource:obj, action:'save']" id="labor_form">
	     		<div class="form_required"><i class="fa fa-asterisk required_mark"></i> denotes required field</div>
					<g:render template="form"/>
					<div class="ctl-btn-group">
						<g:actionSubmit class="save button bemtbutton radius" action="save" value="Save"></g:actionSubmit>			
						<g:actionSubmit class="save button bemtbutton radius" action="saveadd" value="Save and Add Another"></g:actionSubmit>			
						<bemt:button controller="labor" action="index" function="return confirm('Are you sure you want to cancel without saving your new Labor Category?');">Cancel</bemt:button>
					</div>
				</g:form>
			</div>
		</div>

	</body>
</html>	