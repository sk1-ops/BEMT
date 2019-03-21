<html>
	<head>
		<meta name="layout" content="../layouts/default"/>
		<title>Forecast Snapshot</title>
	</head>
	<body>

		<!--// header //-->
		<g:render template="header" model="['title': obj.name, 'bc':'View']"/> 	

		<g:set var="year1rev" value="${0.00}" />
		<g:set var="year2rev" value="${0.00}" />
		<g:set var="year3rev" value="${0.00}" />
		<g:set var="year1cogs" value="${0.00}" />
		<g:set var="year2cogs" value="${0.00}" />
		<g:set var="year3cogs" value="${0.00}" />
		<g:set var="year1expenses" value="${0.00}" />
		<g:set var="year2expenses" value="${0.00}" />
		<g:set var="year3expenses" value="${0.00}" />
		
		<!--// instructional content //-->
    <div class="row">
     	<div class="small-12 columns">
     		<h4>Forecast Snapshot: ${obj.name}</h4>
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
	   					<td class="col1"><span class="topline">Revenue</span></td>
	   					<td class="colyear"></td>
	   					<td class="colyear"></td>
	   					<td class="colyear"></td>
	   				</tr>

						<g:each in="${projects}" var="c" status="i">
		   				<tr class="row entry">
		   					<td class="col1"><g:link controller="snapshotProject" action="show" id="${c.id}" class="radius success tinyest button">View Forecast</g:link>&#160;&#160;<b>${c.name}</b></td>
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
	   					<td class="colyear"><g:formatNumber number="${year1rev}" type="currency" currencyCode="USD" /></td>
	   					<td class="colyear"><g:formatNumber number="${year2rev}" type="currency" currencyCode="USD" /></td>
	   					<td class="colyear"><g:formatNumber number="${year3rev}" type="currency" currencyCode="USD" /></td>
	   				</tr>
	   			</tbody>
     		</table>

     		<!-- COGS table -->
     		<table class="proforma-summary">
     			<tbody>
	   				<tr class="row summary">
	   					<td class="col1"><span class="topline">Cost of Goods Sold</span></td>
	   					<td class="colyear"></td>
	   					<td class="colyear"></td>
	   					<td class="colyear"></td>
	   				</tr>

						<g:each in="${projects}" var="c">
		   				<tr class="row entry">
		   					<td class="col1">
		   					<g:link controller="snapshotProject" action="show" id="${c.id}" class="radius success tinyest button">View Forecast</g:link>&#160;&#160;<b>${c.name}</b>
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
	   					<td class="colyear"><g:formatNumber number="${year1cogs}" type="currency" currencyCode="USD" /></td>
	   					<td class="colyear"><g:formatNumber number="${year2cogs}" type="currency" currencyCode="USD" /></td>
	   					<td class="colyear"><g:formatNumber number="${year3cogs}" type="currency" currencyCode="USD" /></td>
	   				</tr>
	   			</tbody>
     		</table>

				<g:set var="year1gross" value="${year1rev - year1cogs}" />
				<g:set var="year2gross" value="${year2rev - year2cogs}" />
				<g:set var="year3gross" value="${year3rev - year3cogs}" />	   	     		

     		<!-- Gross Profit -->
     		<table class="proforma-summary">
     			<tbody>
	   				<tr class="row divider">
	   					<td class="col1"><span class="topline">Gross Profit</span></td>
	   					<td class="colyear"><g:formatNumber number="${year1gross}" type="currency" currencyCode="USD" /></td>
	   					<td class="colyear"><g:formatNumber number="${year2gross}" type="currency" currencyCode="USD" /></td>
	   					<td class="colyear"><g:formatNumber number="${year3gross}" type="currency" currencyCode="USD" /></td>
	   				</tr>
	   			</tbody>
     		</table>  


     		<!-- Expenses table -->
     		<table class="proforma-summary">
     			<tbody>
	   				<tr class="row summary">
	   					<td class="col1"><span class="topline">Expenses</span></td>
	   					<td class="colyear"></td>
	   					<td class="colyear"></td>
	   					<td class="colyear"></td>
	   				</tr>

	   				<tr class="row entry">
	   					<td class="col1">
	   						<g:link controller="snapshot" action="showlabor" id="${obj.id}" class="radius success tinyest button">View Forecast</g:link>&#160;&#160;<b>Labor</b>
	   					</td>
	   					<td class="colyear"><g:formatNumber number="${labor[1]}" type="currency" currencyCode="USD" /></td>
	   					<td class="colyear"><g:formatNumber number="${labor[2]}" type="currency" currencyCode="USD" /></td>
	   					<td class="colyear"><g:formatNumber number="${labor[3]}" type="currency" currencyCode="USD" /></td>
	   				</tr>

	   				<tr class="row entry">
	   					<td class="col1">
	   						<g:link controller="snapshot" action="showequipment" id="${obj.id}" class="radius success tinyest button">View Forecast</g:link>&#160;&#160;<b>Equipment</b>
	   					</td>
	   					<td class="colyear"><g:formatNumber number="${equip[1]}" type="currency" currencyCode="USD" /></td>
	   					<td class="colyear"><g:formatNumber number="${equip[2]}" type="currency" currencyCode="USD" /></td>
	   					<td class="colyear"><g:formatNumber number="${equip[3]}" type="currency" currencyCode="USD" /></td>
	   				</tr>

						<g:set var="year1expenses" value="${year1expenses + equip[1] + labor[1]}" />
						<g:set var="year2expenses" value="${year2expenses + equip[2] + labor[2]}" />
						<g:set var="year3expenses" value="${year3expenses + equip[3] + labor[3]}" />


	   				<g:each in="${expenses}" var="exp" status="i">
		   				<tr class="row entry">
		   					<td class="col1">
		   						<b>${exp.name}</b>
		   					</td>
		   					<td class="colyear"><g:formatNumber number="${exp.year1}" type="currency" currencyCode="USD" /></td>
		   					<td class="colyear"><g:formatNumber number="${exp.year2}" type="currency" currencyCode="USD" /></td>
		   					<td class="colyear"><g:formatNumber number="${exp.year3}" type="currency" currencyCode="USD" /></td>
		   				</tr>
							<g:set var="year1expenses" value="${year1expenses + exp.year1}" />
							<g:set var="year2expenses" value="${year2expenses + exp.year2}" />
							<g:set var="year3expenses" value="${year3expenses + exp.year3}" />	   				
						</g:each>

	   				<tr class="row totals">
	   					<td class="col1"><b>Total Expenses</b></td>
	   					<td class="colyear"><g:formatNumber number="${year1expenses}" type="currency" currencyCode="USD" /></td>
	   					<td class="colyear"><g:formatNumber number="${year2expenses}" type="currency" currencyCode="USD" /></td>
	   					<td class="colyear"><g:formatNumber number="${year3expenses}" type="currency" currencyCode="USD" /></td>
	   				</tr>
	   			</tbody>
     		</table>


				<g:set var="year1net" value="${year1gross - year1expenses}" />
				<g:set var="year2net" value="${year2gross - year2expenses}" />
				<g:set var="year3net" value="${year3gross - year3expenses}" />

				<!-- Net Income -->
     		<table class="proforma-summary">
     			<tbody>
	   				<tr class="row divider">
	   					<td class="col1"><span class="topline">Operating Income</span></td>
	   					<td class="colyear"><g:formatNumber number="${year1net}" type="currency" currencyCode="USD" /></td>
	   					<td class="colyear"><g:formatNumber number="${year2net}" type="currency" currencyCode="USD" /></td>
	   					<td class="colyear"><g:formatNumber number="${year3net}" type="currency" currencyCode="USD" /></td>
	   				</tr>
	   			</tbody>
     		</table>       		

     		<!-- End Cash -->
     		<table class="proforma-summary">
     			<tbody>
	   				<tr class="row divider">
	   					<td class="col1"><span class="topline">End Cash</span></td>
	   					<td class="colyear"><g:formatNumber number="${year1net}" type="currency" currencyCode="USD" /></td>
	   					<td class="colyear"><g:formatNumber number="${year1net + year2net}" type="currency" currencyCode="USD" /></td>
	   					<td class="colyear"><g:formatNumber number="${year1net + year2net + year3net}" type="currency" currencyCode="USD" /></td>
	   				</tr>
	   			</tbody>
     		</table>   
     		
			</div>
		</div>

	</body>
</html>	