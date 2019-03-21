<html>
	<head>
		<meta name="layout" content="../layouts/default"/>
		<title>My Forecast</title>
	</head>
	<body>

		<!--// header //-->
		<g:render template="header" model="['title':'My Forecast', 'bc':'Manage']"/> 	

		<g:set var="year1rev" value="${0.00}" />
		<g:set var="year2rev" value="${0.00}" />
		<g:set var="year3rev" value="${0.00}" />
		<g:set var="year1cogs" value="${0.00}" />
		<g:set var="year2cogs" value="${0.00}" />
		<g:set var="year3cogs" value="${0.00}" />
		
		<!--// instructional content //-->
		<!--
    <div class="row">
     	<div class="small-10 columns">
				<p>
				</p>
			</div>
		</div>-->
    <div class="row">
     	<div class="small-12 columns">
     		<div class="right"><g:link controller="snapshot" action="create" aria-haspopup="true" data-tooltip="" class="has-tip button tiny radius alert" data-options="disable_for_touch:true" title="Your forecast can continually be updated. However, to maintain a 'locked' version (for read only purposes), create a snapshot"><i class="fa fa-camera"></i>&#160;&#160;Create a Snapshot</g:link></div>
     		<p><g:link controller="proforma" action="guide">Click here</g:link> for an introduction to <b>My Forecast</b></p>
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
	   					<td class="col1"><span class="topline">Revenue</span>&#160;&#160;<g:link controller="proformaproject" action="create" class="radius tinyest button"><i class="fa fa-plus"></i> Add project</g:link></td>
	   					<td class="colyear"></td>
	   					<td class="colyear"></td>
	   					<td class="colyear"></td>
	   				</tr>

						<g:each in="${projects}" var="c" status="i">
		   				<tr class="row entry">
		   					<td class="col1"><g:link id="${c.id}" controller="proformaproject" action="show" class="radius success tinyest button">Forecast</g:link>&#160;&#160;<g:link id="${c.id}" controller="proformaproject" action="delete" class="radius alert tinyest button"  onclick="return Proforma.removeProjectFromProforma();">Remove</g:link>&#160;&#160;<b>${c.project.name}</b></td>
		   					<td class="colyear"><g:formatNumber number="${rev[c.id][1]}" type="currency" currencyCode="USD" /></td>
		   					<td class="colyear"><g:formatNumber number="${rev[c.id][2]}" type="currency" currencyCode="USD" /></td>
		   					<td class="colyear"><g:formatNumber number="${rev[c.id][3]}" type="currency" currencyCode="USD" /></td>
		   				</tr>
		   				<g:set var="year1rev" value="${year1rev + rev[c.id][1]}" />
		   				<g:set var="year2rev" value="${year2rev + rev[c.id][2]}" />
		   				<g:set var="year3rev" value="${year3rev + rev[c.id][3]}" />		   				
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
		   					<td class="col1"><b>${c.project.name}</b></td>
		   					<td class="colyear"><g:formatNumber number="${cost[c.id][1]}" type="currency" currencyCode="USD" /></td>
		   					<td class="colyear"><g:formatNumber number="${cost[c.id][2]}" type="currency" currencyCode="USD" /></td>
		   					<td class="colyear"><g:formatNumber number="${cost[c.id][3]}" type="currency" currencyCode="USD" /></td>
		   				</tr>
		   				<g:set var="year1cogs" value="${year1cogs + cost[c.id][1]}" />
		   				<g:set var="year2cogs" value="${year2cogs + cost[c.id][2]}" />
		   				<g:set var="year3cogs" value="${year3cogs + cost[c.id][3]}" />		  		   				
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
	   						<g:link controller="proforma" action="showlabor" class="radius success tinyest button"><i class="fa fa-plus"></i> View/Forecast</g:link>&#160;&#160;<b>Labor</b>
	   					</td>
	   					<td class="colyear"><g:formatNumber number="${labor[1]}" type="currency" currencyCode="USD" /></td>
	   					<td class="colyear"><g:formatNumber number="${labor[2]}" type="currency" currencyCode="USD" /></td>
	   					<td class="colyear"><g:formatNumber number="${labor[3]}" type="currency" currencyCode="USD" /></td>
	   				</tr>

	   				<tr class="row entry">
	   					<td class="col1">
	   						<g:link controller="proforma" action="showequipment" class="radius success tinyest button"><i class="fa fa-plus"></i>&#160;&#160;View/Forecast</g:link> <b>Equipment</b>
	   					</td>
	   					<td class="colyear"><g:formatNumber number="${equip[1]}" type="currency" currencyCode="USD" /></td>
	   					<td class="colyear"><g:formatNumber number="${equip[2]}" type="currency" currencyCode="USD" /></td>
	   					<td class="colyear"><g:formatNumber number="${equip[3]}" type="currency" currencyCode="USD" /></td>
	   				</tr>

						<g:set var="year1expenses" value="${labor[1]+ equip[1]}" />
						<g:set var="year2expenses" value="${labor[2]+ equip[2]}" />
						<g:set var="year3expenses" value="${labor[3]+ equip[3]}" />	   				


	   				<g:each in="${expenses}" var="exp" status="i">
		   				<tr class="row entry">
		   					<td class="col1">
		   						<g:link controller="proformaExpense" id="${exp.id}" action="edit" class="radius success tinyest button"><i class="fa fa-plus"></i>&#160;&#160;View/Forecast</g:link> <b>${exp.expense.name}</b> <g:if test="${exp.description != null}"><i data-tooltip aria-haspopup="true" title="${exp.description}" data-options="disable_for_touch:true" class="has-tip fa fa-comment-o"></i></g:if>
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