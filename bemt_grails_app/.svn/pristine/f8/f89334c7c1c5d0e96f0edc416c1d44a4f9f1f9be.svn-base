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

    
		<!--// instructional content //-->
	
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
	   						<g:link controller="snapshot" params="['year':1]" id="${obj.id}" action="showequipforecast" class="radius tinyest button"><i class="fa fa-plus"></i> Show Year 1</g:link>
	   					</td>
	   					<td class="colyear">
	   						<g:link controller="snapshot" params="['year':2]" id="${obj.id}" action="showequipforecast" class="radius tinyest button"><i class="fa fa-plus"></i> Show Year 2</g:link>
	   					</td>
	   					<td class="colyear">
	   						<g:link controller="snapshot" params="['year':3]" id="${obj.id}" action="showequipforecast" class="radius tinyest button"><i class="fa fa-plus"></i> Show Year 3</g:link>
	   					</td>
	   				</tr>
						<g:each in="${equip}" var="c" status="i">
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
		   					<td class="colyear"><g:formatNumber number="${c.year1}" type="currency" currencyCode="USD" /></td>
		   					<td class="colyear"><g:formatNumber number="${c.year2}" type="currency" currencyCode="USD" /></td>
		   					<td class="colyear"><g:formatNumber number="${c.year3}" type="currency" currencyCode="USD" /></td>
		   				</tr>
		   				<g:set var="year1exp" value="${year1exp + c.year1}" />
		   				<g:set var="year2exp" value="${year2exp + c.year2}" />
		   				<g:set var="year3exp" value="${year3exp + c.year3}" />		   				
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
				<bemt:button controller="snapshot" id="${obj.id}" action="show">Done</bemt:button>
	    </div>
    </div>
	</body>
</html>	