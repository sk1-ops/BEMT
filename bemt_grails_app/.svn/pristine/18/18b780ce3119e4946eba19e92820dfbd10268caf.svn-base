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
		<g:render template="header" model="['title':'Project Summary: '+ obj.snapshot.name, 'bc':'Manage', snapshot: obj.snapshot]"/> 	
		
		<!--// instructional content //-->
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
	   					<td class="col1" colspan="4"><h5><b>Project Revenue</b></h5></td>
	   				</tr>

	   				<g:each in="${products}" status="i" var="c">
		   				<tr class="row">
		   					<td class="col1"><g:link controller="snapshotProduct" id="${c.id}" action="show" class=""><b>${c.name}</b></g:link></td>
		   					<td class="colyear"><g:formatNumber number="${c.rev1}" type="currency" currencyCode="USD" /></td>
		   					<td class="colyear"><g:formatNumber number="${c.rev2}" type="currency" currencyCode="USD" /></td>
		   					<td class="colyear"><g:formatNumber number="${c.rev3}" type="currency" currencyCode="USD" /></td>
		   				</tr>
		   				<g:set var="year1rev" value="${year1rev + c.rev1}" />
		   				<g:set var="year2rev" value="${year2rev + c.rev2}" />
		   				<g:set var="year3rev" value="${year3rev + c.rev3}" />
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
		   					<td class="col1"><g:link controller="snapshotProduct" id="${c.id}" action="show" class=""><b>${c.name}</b></g:link></td>
		   					<td class="colyear"><g:formatNumber number="${c.cogs1}" type="currency" currencyCode="USD" /></td>
		   					<td class="colyear"><g:formatNumber number="${c.cogs2}" type="currency" currencyCode="USD" /></td>
		   					<td class="colyear"><g:formatNumber number="${c.cogs3}" type="currency" currencyCode="USD" /></td>
		   				</tr>
		   				<g:set var="year1cogs" value="${year1cogs + c.cogs1}" />
		   				<g:set var="year2cogs" value="${year2cogs + c.cogs2}" />
		   				<g:set var="year3cogs" value="${year3cogs + c.cogs3}" />
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
				<bemt:button controller="snapshot" id="${obj.snapshot.id}" action="show">Done</bemt:button>
	    </div>
    </div>	
	</body>
</html>	