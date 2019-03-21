<html>
	<head>
		<meta name="layout" content="../layouts/default"/>
		<title>My Forecast</title>
	</head>
	<body>

		<!--// header //-->
		<g:render template="header" model="['page':'summary', 'title':'Labor Expenses', 'bc':'Labor Summary', 'bcId':obj.id]"/> 

		<g:set var="year1" value="${0.00}" />
		<g:set var="year2" value="${0.00}" />
		<g:set var="year3" value="${0.00}" />

    
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
	   					<td class="col1"><span class="topline">Labor Category</span></td>
	   					<td class="colyear">
	   						<g:link controller="snapshot" params="['year':1]" id="${obj.id}" action="showlaborforecast" class="radius tinyest button"><i class="fa fa-plus"></i> Show Year 1</g:link>
	   					</td>
	   					<td class="colyear">
	   						<g:link controller="snapshot" params="['year':2]" id="${obj.id}" action="showlaborforecast" class="radius tinyest button"><i class="fa fa-plus"></i> Show Year 2</g:link>
	   					</td>
	   					<td class="colyear">
	   						<g:link controller="snapshot" params="['year':3]" id="${obj.id}" action="showlaborforecast" class="radius tinyest button"><i class="fa fa-plus"></i> Show Year 3</g:link>
	   					</td>
	   				</tr>
						<g:each in="${labor}" var="c" status="i">
		   				<tr class="row entry">
		   					<td class="col1">
		   						${c.name} (${c.type})<br/>
		   						<span class="labordetails"><i><g:formatNumber number="${c.annualSalary}" type="currency" currencyCode="USD" /> annual salary/<g:formatNumber number="${c.benefitPercent/100}" type="percent" currencyCode="USD" /> annual benefits</i></span>
		   					</td>
		   					<td class="colyear"><g:formatNumber number="${c.year1}" type="currency" currencyCode="USD" /></td>
		   					<td class="colyear"><g:formatNumber number="${c.year2}" type="currency" currencyCode="USD" /></td>
		   					<td class="colyear"><g:formatNumber number="${c.year3}" type="currency" currencyCode="USD" /></td>
		   				</tr>
		   				<g:set var="year1rev" value="${year1 + 0}" />
		   				<g:set var="year2rev" value="${year2 + 0}" />
		   				<g:set var="year3rev" value="${year3 + 0}" />		   				
		   			</g:each>
	   				<tr class="row entry">
	   					<td class="col1"><b>Total Labor Expense</b></td>
	   					<td class="colyear"><g:formatNumber number="${year1}" type="currency" currencyCode="USD" /></td>
	   					<td class="colyear"><g:formatNumber number="${year2}" type="currency" currencyCode="USD" /></td>
	   					<td class="colyear"><g:formatNumber number="${year3}" type="currency" currencyCode="USD" /></td>
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