<html>
	<head>
		<meta name="layout" content="../layouts/default"/>
		<title>My Forecast</title>
	</head>
	<body>

		<!--// header //-->
		<g:render template="header" model="['title':'Product Summary: '+ obj.product.name, 'bc':'Manage', 'bcId':obj.id]"/> 	
		
		<!--// instructional content //-->
		<g:form url="[resource:obj, action:'update']">
			<g:hiddenField id="orig_price" name="orig_price" value="${obj.price1}" />
			<g:hiddenField id="orig_cost" name="orig_cost" value="${obj.cost1}" />

			<g:hiddenField id="price2_field" name="price2" value="${obj.price2}" />
			<g:hiddenField id="price3_field" name="price3" value="${obj.price3}" />
			<g:hiddenField id="cost2_field" name="cost2" value="${obj.cost2}" />
			<g:hiddenField id="cost3_field" name="cost3" value="${obj.cost3}" />

	    <div class="row">
	     	<div class="small-10 columns">
					<p>
					</p>
				</div>
			</div>
	    <div class="row">
	     	<div class="small-12 columns">
	     	  <div class="right">
	     	  	<g:link controller="product" action="price" id="${obj.product.id}" param="[proformaProductId: obj.id]" class="button bemtbutton alert radius">Adjust Cost</g:link>
	     	  	<g:link controller="project" action="price" id="${obj.project.project.id}" param="[proformaProductId: obj.id]" class="button bemtbutton alert radius">Adjust Price</g:link>
					</div>
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
		     				<td class="volumeset">
			     				<div class="right inputfield" style="height:25px;"><input type="input" id="setField1" class="setfield" name=""/> <button class="setfield radius success" onclick="Proforma.setForecast('setField1', 1, 12); return false;">Set -&gt;</button></div>
		     					<div class="left inputlabel">Volume:</div>
								</td>
		     				<g:each in="${1..12}" var="c" status="i">
		     					<td class="colmonth"><input class="small" type="input" name="qty_${c}" id="qty_${c}" value="${qtys[c-1].quantity}"></input></td>
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
		     				<td class="volumeset">
			     				<div class="right inputfield" style="height:25px;"><input type="input" id="setField2" class="setfield" name=""/> <button class="setfield radius success" onclick="Proforma.setForecast('setField2', 13, 24); return false;">Set -&gt;</button></div>
		     					<div class="left inputlabel">Volume:</div>
								</td>
		     				<g:each in="${13..24}" var="c"  status="i">
		     					<td class="colmonth"><input class="small" type="input" id="qty_${c}" name="qty_${c}" value="${qtys[(c-1)].quantity}"></input></td>
		     				</g:each>
	     				</tr>
	     				<tr>
		     				<td class="colheader">
		     					<div class="pull-right">
		     						<g:render template="percentChange" model="['type':'price', 'year':'2', 'value': obj.priceChange2]"/> 	
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
		     						<g:render template="percentChange" model="['type':'cost', 'year':'2', 'value': obj.costChange2]"/> 	
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
		     				<td class="volumeset">
			     				<div class="right inputfield" style="height:25px;"><input type="input" id="setField3" class="setfield" name=""/> <button class="setfield radius success" onclick="Proforma.setForecast('setField3', 25, 36); return false;">Set -&gt;</button></div>
		     					<div class="left inputlabel">Volume:</div>
								</td>
			     				<g:each in="${25..36}" var="c" status="i">
		     					<td class="colmonth"><input class="small" type="input" id="qty_${c}" name="qty_${c}" value="${qtys[(c-1)].quantity}"></input></td>
		     				</g:each>
	     				</tr>
	     				<tr>
		     				<td class="colheader">
		     					<div class="pull-right">
		     						<g:render template="percentChange" model="['type':'price', 'year':'3', 'value': obj.priceChange3]"/> 	
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
		     						<g:render template="percentChange" model="['type':'cost', 'year':'3', 'value': obj.costChange3]"/> 	
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
	    <div class="row">
		    <div class="large-12 columns">
					<g:actionSubmit onclick="return Proforma.checkForecastQty();" class="save button bemtbutton radius" action="update" value="Save Forecast"></g:actionSubmit>			
					<bemt:button controller="proformaproject" id="${obj.project.id}" action="show" function="return confirm('Are you sure you want to cancel without updating the forecast?');">Cancel</bemt:button>
		    </div>
	    </div>
    </g:form>
	</body>
</html>	