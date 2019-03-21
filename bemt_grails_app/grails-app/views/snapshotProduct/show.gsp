<html>
	<head>
		<meta name="layout" content="../layouts/default"/>
		<title>My Forecast</title>
	</head>
	<body>

		<!--// header //-->
		<g:render template="header" model="['title':'Product Summary: '+ obj.project.snapshot.name, 'bc':'View', 'bcId':obj.id]"/> 	
		
		<!--// instructional content //-->
	    <div class="row">
	     	<div class="small-12 columns">
	     		<h4><i class="fa fa-calendar"></i> 36 Month Forecast</h4>
	     		<br/>
                </div>
            </div>
	    <div class="row">
	     	<div class="small-12 columns">
	     		<table class="proforma-forecast">
	     			<thead>
	     				<tr>
	     					<th class="col1">Months 1-12</th>
		     				<g:each in="${1..12}" var="c">
		     					<th class="colmonth">${c}</th>
		     				</g:each>
	     				</tr>
	     			</thead>
	     			<tbody>
	     				<tr>
		     				<td>Monthly Volume:</td>
		     				<g:each in="${1..12}" var="c" status="i">
		     					<td class="colmonth">${forecasts[c-1].quantity}</td>
		     				</g:each>
	     				</tr>
	     				<tr>
		     				<td>Price ($):</td>
		     				<g:each in="${1..12}" var="c">
		     					<td class="colmonth">$<span id="price_${c}">${obj.price1}</span></td>
		     				</g:each>
	     				</tr>
	     				<tr>
		     				<td>COGS ($):</td>
		     				<g:each in="${1..12}" var="c">
		     					<td class="colmonth">$<span id="cost_${c}">${obj.cost1}</span></td>
		     				</g:each>
	     				</tr>
	     			</tbody>
	     		</table>
	     	</div>
	    </div>
	 
	    <div class="row">
	     	<div class="small-12 columns">
	     		<table class="proforma-forecast">
	     			<thead>
	     				<tr>
	     					<th class="col1">Months 13-24</th>
		     				<g:each in="${13..24}" var="c">
		     					<th class="colmonth">${c}</th>
		     				</g:each>
	     				</tr>
	     			</thead>
	     			<tbody>
	     				<tr>
		     				<td class="colheader">
		     					Monthly Volume:
		     				</td>
		     				<g:each in="${13..24}" var="c"  status="i">
		     					<td class="colmonth">${forecasts[(c-1)].quantity}</td>
		     				</g:each>
	     				</tr>
	     				<tr>
		     				<td class="colheader">
		     					<div class="pull-right">
		     						<g:formatNumber number="${obj.priceChange2}" type="currency" currencyCode="USD" />
		     					</div>
		     					Price ($):
		     				</td>
		     				<g:each in="${13..24}" var="c">
		     					<td class="colmonth">$<span id="price_${c}">${obj.price2}</span></td>
		     				</g:each>
	     				</tr>
	     				<tr>
		     				<td class="colheader">
		     					<div class="pull-right">
		     						<g:formatNumber number="${obj.costChange2/100}" type="percent"/>
		     					</div>
		     					COGS ($):
		     				</td>
		     				<g:each in="${13..24}" var="c">
		     					<td class="colmonth">$<span id="cost_${c}">${obj.cost2}</span></td>
		     				</g:each>
	     				</tr>
	     			</tbody>
	     		</table>
	     	</div>
	    </div>

	    <div class="row">
	     	<div class="small-12 columns">
	     		<table class="proforma-forecast">
	     			<thead>
	     				<tr>
	     					<th class="col1">Months 25-36</th>
		     				<g:each in="${25..36}" var="c">
		     					<th class="colmonth">${c}</th>
		     				</g:each>
	     				</tr>
	     			</thead>
	     			<tbody>
	     				<tr>
		     				<td>Monthly Volume:</td>
		     				<g:each in="${25..36}" var="c" status="i">
		     					<td class="colmonth">${forecasts[(c-1)].quantity}</td>
		     				</g:each>
	     				</tr>
	     				<tr>
		     				<td class="colheader">
		     					<div class="pull-right">
		     						<g:formatNumber number="${obj.priceChange3}" type="currency" currencyCode="USD" />
		     					</div>
		     					Price ($):
		     				</td>
		     				<g:each in="${25..36}" var="c">
		     					<td class="colmonth">$<span id="price_${c}">${obj.price3}</span></td>
		     				</g:each>
	     				</tr>
	     				<tr>
		     				<td class="colheader">
		     					<div class="pull-right">
		     						<g:formatNumber number="${obj.costChange3/100}" type="percent"/>
		     					</div>
		     					COGS ($):
		     				</td>
		     				<g:each in="${25..36}" var="c">
		     					<td class="colmonth">$<span id="cost_${c}">${obj.cost3}</span></td>
		     				</g:each>
	     				</tr>
	     			</tbody>
	     		</table>
	     	</div>
	    </div>
	</body>
</html>	