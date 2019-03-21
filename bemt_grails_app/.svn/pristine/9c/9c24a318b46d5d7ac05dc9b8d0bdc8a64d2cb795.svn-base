<html>
	<head>
		<meta name="layout" content="../layouts/default"/>
		<title>My Forecast</title>
	</head>
	<body>

		<!--// header //-->
		<g:render template="header" model="['page':'proforma', 'title':'Expense: ' + obj.expense.name , 'bc':'Forecast', 'bcId':obj.id]"/> 	

		<!--// instructional content //-->
		<g:form url="[resource:obj, action:'update']">

			<g:hiddenField name="year" value="${year}" />


	    <div class="row">
	     	<div class="small-10 columns">
					<p>
						
					</p>				
				</div>
			</div>
	    
			<div class="row">
	     	<div class="small-5 columns">
					<p>Example of <b>${obj.expense.name}</b> include:</p>
					<g:if test="${obj.expense.name == 'Marketing and Sales'}">	     		
						<ul>
							<li>Collateral (pamphlets, brochures, etc)</li>
							<li>Website</li>
							<li>Conferences
								<li>Public Relations</li>
							</li>
    					<li>Advertising
    						<li>Other</li>
							</li>
						</ul>
		     	</g:if>
					<g:elseif test="${obj.expense.name == 'Informatics Computers and Electronics'}">	     		
						<ul>
							<li>Software</li>
							<li>Hardware</li>
							<li>Other Systems</li>
						</ul>
		     	</g:elseif>
					<g:elseif test="${obj.expense.name == 'Professional Services'}">	     		
						<ul>
							<li>Legal</li>
    					<li>Accountants</li>
    					<li>Consultants</li>
    					<li>Advisors / Board Members</li>
    					<li>Speakers</li>
						</ul>
					</g:elseif>
					<g:elseif test="${obj.expense.name == 'Facilities'}">	     		
						<ul>
							<li>Rent</li>
							<li>Furnishing</li>
							<li>Construction</li>
							<li>Offsite Storage</li>
							<li>Utilities</li>
						</ul>
					</g:elseif>
					<g:elseif test="${obj.expense.name == 'Ongoing Lab Supply Expense'}">	     		
						<ul>
							<li>Ongoing supply of Gases</li>
	    				<li>Small Re-usable Supplies (e.g. cutting boards)</li>
						</ul>
					</g:elseif>
					<g:elseif test="${obj.expense.name == 'Other'}">	     		
						<ul>
							<li>Certifications, Accreditations, Licenses</li>
							<li>General Supplies (Office and Laboratory)</li>
							<li>Travel Expenses</li>
							<li>Meals and Entertainment</li>
							<li>Human Resources</li>
							<li>Professional Development</li>
						</ul>
					</g:elseif>				
				</div>
				<div class="small-7 columns">
					<h5>Yearly Forecasts</h5>
					<table class="proforma-forecast">
						<thead>
							<tr>
								<th class="text-center">Year 1</th>
								<th class="text-center">Year 2</th>
								<th class="text-center">Year 3</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td class="text-center" style="height:150px;width:33%">
									<div style="margin:0 auto;width:140px;">
										<div class="row collapse">
								      <div class="small-3 columns">
								        <span class="prefix radius">$</span>
								      </div>
								      <div class="small-9 columns">
								        <g:field class="radius" type="text" value="${obj.year1}" id="year1" name="year1"/>
								      </div>
								    </div>	
								  </div>
								</td>
								<td class="text-center" style="height:150px;width:33%">
									<div style="margin:0 auto; width:140px;">
										<div class="row collapse">
								      <div class="small-3 columns">
								        <span class="prefix radius">$</span>
								      </div>
								      <div class="small-9 columns">
								        <g:field class="radius" type="text" value="${obj.year2}" id="year2" name="year2"/>
								      </div>
								    </div>	
								  </div>
								</td>
								<td class="text-center" style="height:150px;width:33%">
									<div style="margin:0 auto;width:140px;">
										<div class="row collapse">
								      <div class="small-3 columns">
								        <span class="prefix radius">$</span>
								      </div>
								      <div class="small-9 columns">
								        <g:field class="radius" type="text" value="${obj.year3}" id="year3" name="year3"/>
								      </div>
								    </div>	
								  </div>
								</td>
							</tr>
						</tbody>
					</table>
					<div class="row">
				    <div class="small-12 columns">
			        <label>Notes/Comments</label>
			        <p class="example">Make some notes/comments about this expense for future reference</p>
							<g:textArea id="description" name="description" value="${obj.description}" rows="3"></g:textArea>
						</div>
					</div>			
					<g:actionSubmit class="save button tiny radius" action="update" value="Save Expense Forecast"></g:actionSubmit>			
					<bemt:button controller="proforma" action="show" function="return confirm('Are you sure you want to cancel without updating the forecast?');">Cancel</bemt:button>

				</div>
			</div>

    </g:form>
	</body>
</html>	