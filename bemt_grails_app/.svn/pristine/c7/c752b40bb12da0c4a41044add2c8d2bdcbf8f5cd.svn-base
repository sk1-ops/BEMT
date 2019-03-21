<html>
	<head>
		<meta name="layout" content="../layouts/default"/>
		<title>My Forecast</title>
	</head>
	<body>
		<g:set var="year1rev" value="${0.00}" />
		<g:set var="year2rev" value="${0.00}" />
		<g:set var="year3rev" value="${0.00}" />
		<g:set var="year1cogs" value="${0.00}" />
		<g:set var="year2cogs" value="${0.00}" />
		<g:set var="year3cogs" value="${0.00}" />
		<!--// header //-->
		<g:render template="header" model="['title':'Project Summary: '+ obj.project.name, 'bc':'Manage']"/> 	
		
		<!--// instructional content //-->
    <div class="row">
     	<div class="small-10 columns">
				<p>
				</p>
			</div>
		</div>
    <div class="row">
     	<div class="small-12 columns">
     		<h4>Project Forecast</h4>
     		<br/>
			</div>
		</div>
    <div class="row">
     	<div class="small-12 columns">
     		<table class="proforma-summary">
     			<thead>
     				<tr>
     					<th class="col1"><g:link id="${obj.id}" controller="proformaproject" action="delete" class="radius alert tinyest button" onclick="return Proforma.removeProjectFromProforma();">Remove Project</g:link></th>
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
	   					<td class="col1" colspan="4"><h5><b>Project Revenue</b></h5></td>
	   				</tr>

	   				<g:each in="${obj.products}" status="i" var="c">
		   				<tr class="row">
		   					<td class="col1"><g:link controller="proformaproduct" id="${c.id}" action="show" class="radius tinyest button success">Forecast</g:link>&#160;&#160;${c.product.name}</td>
		   					<td class="colyear"><g:formatNumber number="${c.price1 * qtys[c.id][1]}" type="currency" currencyCode="USD" /></td>
		   					<td class="colyear"><g:formatNumber number="${c.price2  * qtys[c.id][2]}" type="currency" currencyCode="USD" /></td>
		   					<td class="colyear"><g:formatNumber number="${c.price3  * qtys[c.id][3]}" type="currency" currencyCode="USD" /></td>
		   				</tr>
		   				<g:set var="year1rev" value="${year1rev + (c.price1 * qtys[c.id][1])}" />
		   				<g:set var="year2rev" value="${year2rev + (c.price2 * qtys[c.id][2])}" />
		   				<g:set var="year3rev" value="${year3rev + (c.price3 * qtys[c.id][3])}" />
		   			</g:each>
		   				<tr class="row">
		   					<td class="col1"><g:link controller="proformaProjectRevenue" action="create" params="[ppId: obj.id]" class="radius tinyest button"><i class="fa fa-plus"></i> Add Other Revenue</g:link></td>
		   					<td class="colyear"></td>
		   					<td class="colyear"></td>
		   					<td class="colyear"></td>
		   				</tr>
	   				<g:each in="${obj.revenues}" status="i" var="c">
		   				<tr class="row">
		   					<td class="col1"><g:link controller="proformaProjectRevenue" id="${c.id}" action="edit" class="radius tinyest button success">Forecast</g:link>&#160;<g:link controller="proformaProjectRevenue" id="${c.id}" action="delete" class="radius tinyest button alert" onclick="return Proforma.removeOtherFromProformaProject();">Remove</g:link>&#160;&#160;${c.name}</td>
		   					<td class="colyear"><g:formatNumber number="${c.year1}" type="currency" currencyCode="USD" /></td>
		   					<td class="colyear"><g:formatNumber number="${c.year2}" type="currency" currencyCode="USD" /></td>
		   					<td class="colyear"><g:formatNumber number="${c.year3}" type="currency" currencyCode="USD" /></td>
		   				</tr>
		   				<g:set var="year1rev" value="${year1rev + c.year1}" />
		   				<g:set var="year2rev" value="${year2rev + c.year2}" />
		   				<g:set var="year3rev" value="${year3rev + c.year3}" />
		   			</g:each>

	   				<tr class="row entry">
	   					<td class="col1"><b>Total Revenue</b></td>
	   					<td class="colyear"><b><g:formatNumber number="${year1rev}" type="currency" currencyCode="USD" /></b></td>
	   					<td class="colyear"><b><g:formatNumber number="${year2rev}" type="currency" currencyCode="USD" /></b></td>
	   					<td class="colyear"><b><g:formatNumber number="${year3rev}" type="currency" currencyCode="USD" /></b></td>
	   				</tr>
	   			</tbody>
     		</table>

     		<!-- COGS table -->
     		<table class="proforma-summary">
     			<tbody>
	   				<tr class="row summary">
	   					<td class="col1" colspan="4"><h5><b>Cost of Good Sold (COGS)</b></h5></td>
	   				</tr>

	   				<g:each in="${products}" status="i" var="c">
		   				<tr class="row">
		   					<td class="col1">${c.product.name}</td>
		   					<td class="colyear"><g:formatNumber number="${c.cost1 * qtys[c.id][1]}" type="currency" currencyCode="USD" /></td>
		   					<td class="colyear"><g:formatNumber number="${c.cost2 * qtys[c.id][2]}" type="currency" currencyCode="USD" /></td>
		   					<td class="colyear"><g:formatNumber number="${c.cost3 * qtys[c.id][3]}" type="currency" currencyCode="USD" /></td>
		   				</tr>
		   				<g:set var="year1cogs" value="${year1cogs + (c.cost1 * qtys[c.id][1])}" />
		   				<g:set var="year2cogs" value="${year2cogs + (c.cost2 * qtys[c.id][2])}" />
		   				<g:set var="year3cogs" value="${year3cogs + (c.cost3 * qtys[c.id][3])}" />
		   			</g:each>

		   				<tr class="row">
		   					<td class="col1"><g:link controller="proformaProjectCogs" action="create" params="[ppId: obj.id]" class="radius tinyest button"><i class="fa fa-plus"></i> Add Other COGS</g:link></td>
		   					<td class="colyear"></td>
		   					<td class="colyear"></td>
		   					<td class="colyear"></td>
		   				</tr>

	   				<g:each in="${obj.cogs}" status="i" var="c">
		   				<tr class="row">
		   					<td class="col1"><g:link controller="proformaProjectCogs" id="${c.id}" action="edit" class="radius tinyest button success">Forecast</g:link>&#160;<g:link controller="proformaProjectCogs" id="${c.id}" action="delete" class="radius tinyest button alert" onclick="return Proforma.removeOtherFromProformaProject();">Remove</g:link>&#160;&#160;${c.name}</td>
		   					<td class="colyear"><g:formatNumber number="${c.year1}" type="currency" currencyCode="USD" /></td>
		   					<td class="colyear"><g:formatNumber number="${c.year2}" type="currency" currencyCode="USD" /></td>
		   					<td class="colyear"><g:formatNumber number="${c.year3}" type="currency" currencyCode="USD" /></td>
		   				</tr>
		   				<g:set var="year1cogs" value="${year1cogs + c.year1}" />
		   				<g:set var="year2cogs" value="${year2cogs + c.year2}" />
		   				<g:set var="year3cogs" value="${year3cogs + c.year3}" />
		   			</g:each>
	   				<tr class="row totals">
	   					<td class="col1"><b>Total COGS</b></td>
	   					<td class="colyear"><b><g:formatNumber number="${year1cogs}" type="currency" currencyCode="USD" /></b></td>
	   					<td class="colyear"><b><g:formatNumber number="${year2cogs}" type="currency" currencyCode="USD" /></b></td>
	   					<td class="colyear"><b><g:formatNumber number="${year3cogs}" type="currency" currencyCode="USD" /></b></td>
	   				</tr>
	   			</tbody>
     		</table>

     		<!-- Gross Profit -->
     		<table class="proforma-summary">
     			<tbody>
	   				<tr class="row">
	   					<td class="col1"><h5><b>Gross Profit</b></h5></td>
	   					<td class="colyear"><b><g:formatNumber number="${year1rev - year1cogs}" type="currency" currencyCode="USD" /></b></td>
	   					<td class="colyear"><b><g:formatNumber number="${year2rev - year2cogs}" type="currency" currencyCode="USD" /></b></td>
	   					<td class="colyear"><b><g:formatNumber number="${year3rev - year3cogs}" type="currency" currencyCode="USD" /></b></td>
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
	</body>
</html>	