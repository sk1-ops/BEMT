<html>
	<head>
		<meta name="layout" content="../layouts/default"/>
		<title>My Forecast</title>
	</head>
	<body>

		<!--// header //-->
		<g:render template="header" model="['page':'summary', 'title':'Equipment Expenses', 'bc':'Equipment Summary', 'bcId':obj.id]"/> 

		<g:set var="year1exp" value="${0.00}" />
		<g:set var="year2exp" value="${0.00}" />
		<g:set var="year3exp" value="${0.00}" />

    <div class="row">
     	<div class="small-10 columns">
				<p>
				</p>
			</div>
		</div>		
		<!--// instructional content //-->
		<g:form url="[resource:obj, action:'update']">
			<div class="row">
	     	<div class="small-12 columns">
	     		<h4>Forecast Summary</h4>
	     		<br/>
				</div>
			</div>
	    <div class="row">
	     	<div class="small-12 columns">
	     		<table class="proforma-summary">
	     			<thead>
	     				<tr>
	     					<th class="col1"></th>
	     					<th class="colyear">Year 1</th>
	     					<th class="colyear">Year 2</th>
	     					<th class="colyear">Year 3</th>
	     				</tr>
	     			</thead>
	     		</table>
	     		<!-- revenue table -->
	     		<table class="proforma-summary">
	     			<tbody>
		   				<tr class="row summary">
		   					<td class="col1"><span class="topline">Equipment</span></td>
		   					<td class="colyear">
		   						<g:link controller="proforma" params="['year':1]" action="editequipment" class="radius success tinyest button"><i class="fa fa-plus"></i> Forecast Year 1</g:link>
		   					</td>
		   					<td class="colyear">
		   						<g:link controller="proforma" params="['year':2]" action="editequipment" class="radius success tinyest button"><i class="fa fa-plus"></i> Forecast Year 2</g:link>
		   					</td>
		   					<td class="colyear">
		   						<g:link controller="proforma" params="['year':3]" action="editequipment" class="radius success tinyest button"><i class="fa fa-plus"></i> Forecast Year 3</g:link>
		   					</td>
		   				</tr>
							<g:each in="${equipment}" var="c" status="i">
			   				<tr class="row entry">
			   					<td class="col1">
			   						${c.name}
			   						<br/>
			   						<g:if test="${c.type == 'leased'}">
				   						<span class="equipmentdetails"><i><g:formatNumber number="${c.cost/12}" type="currency" currencyCode="USD" /> per month/<g:formatNumber number="${c.annualServiceContract}" type="currency" currencyCode="USD" /> annual service contract</i></span>
				   					</g:if>
				   					<g:else>
				   						<span class="equipmentdetails"><i>Purchased for <g:formatNumber number="${c.cost}" type="currency" currencyCode="USD" />/<g:formatNumber number="${c.annualServiceContract}" type="currency" currencyCode="USD" /> annual service contract</i></span>
				   					</g:else>
			   					</td>
			   					<td class="colyear"><g:formatNumber number="${expenses[c.id][1]}" type="currency" currencyCode="USD" /></td>
			   					<td class="colyear"><g:formatNumber number="${expenses[c.id][2]}" type="currency" currencyCode="USD" /></td>
			   					<td class="colyear"><g:formatNumber number="${expenses[c.id][3]}" type="currency" currencyCode="USD" /></td>
			   				</tr>
			   				<g:set var="year1exp" value="${year1exp + expenses[c.id][1]}" />
			   				<g:set var="year2exp" value="${year2exp + expenses[c.id][2]}" />
			   				<g:set var="year3exp" value="${year3exp + expenses[c.id][3]}" />		   				
			   			</g:each>
		   				<tr class="row entry">
		   					<td class="col1"><b>Total Equipment Expense</b></td>
		   					<td class="colyear"><g:formatNumber number="${year1exp}" type="currency" currencyCode="USD" /></td>
		   					<td class="colyear"><g:formatNumber number="${year2exp}" type="currency" currencyCode="USD" /></td>
		   					<td class="colyear"><g:formatNumber number="${year3exp}" type="currency" currencyCode="USD" /></td>
		   				</tr>
		   			</tbody>
	     		</table>
				</div>
			</div>	    
			<div class="row">
		    <div class="large-12 columns">
					<bemt:button controller="proforma" action="show">Done</bemt:button>
		    </div>
	    </div>
    </g:form>
	</body>
</html>	