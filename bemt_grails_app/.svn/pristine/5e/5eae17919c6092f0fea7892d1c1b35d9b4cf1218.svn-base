<html>
	<head>
		<meta name="layout" content="../layouts/default"/>
		<title>My Forecast</title>
	</head>
	<body>

		<!--// header //-->
		<g:render template="header" model="['page':'equipment', 'title':'Forecast Expenses: Forecast Equipment', 'bc':'Forecast', 'bcId':obj.id]"/> 	

		<g:if test="${year == '1'}"><g:set var="months" value="${1..12}" /></g:if>
		<g:if test="${year == '2'}"><g:set var="months" value="${13..24}" /></g:if>
		<g:if test="${year == '3'}"><g:set var="months" value="${25..36}" /></g:if>



		<!--// instructional content //-->
		<g:form url="[resource:obj, action:'updateequipment']">

			<g:hiddenField name="year" value="${year}" />


	    <div class="row">
	     	<div class="small-12 columns">
	     		<h4><i class="fa fa-calendar"></i> Year ${year} Forecast</h4>
	     		<br/>
                </div>
            </div>
	    <div class="row">
	     	<div class="small-12 columns">
	     		<table class="proforma-forecast">
	     			<thead>
	     				<tr>
	     					<th colspan="2" class="col1">Months ${months[0]}-${months[11]}</th>
		     				<g:each in="${months}" var="c">
		     					<th class="colmonth">${c}</th>
		     				</g:each>
	     				</tr>
	     			</thead>
	     			<tbody><!--
	     				<tr>
		     				<td colspan="2"><b>Equipment</b></td>
		     				<g:each in="${months}" var="c" status="i">
		     					<td class="colmonth">QTY</td>
		     				</g:each>
	     				</tr>-->
	     				<g:each in="${equipment}" var="c" status="i">
		     				<tr>
			     				<td rowspan="2" class="component">
			   						${c.name}<br/>
			   						<span class="equipmentdetails"><i><g:formatNumber number="${c.cost}" type="currency" currencyCode="USD" />/<g:formatNumber number="${c.annualServiceContract}" type="currency" currencyCode="USD" /></i></span>			     					
			     				</td>
				     			<td width="50"><div style="margin:0 0 0 5px;font-size:0.8em">Start:</div></td>
			     				<g:each in="${months}" var="month" status="j">			     					
			     					<td class="colmonth">
			     						<g:if test="${month == 1}">
			     							<g:select class="tinyselect" id="start_${c.id}_${month}" name="start_${c.id}_${month}" onchange="Proforma.adjustStartEquipment(this, ${c.id}, ${month}, ${year});" from="${0..10}" value="${forecasts[c.id][month-1][1]}"/>
			     						</g:if>
			     						<g:else>
					     					<div id="total_${c.id}_${month}">${forecasts[c.id][month-1][1]}</div>
			     						</g:else>
			     					</td>
										<g:hiddenField name="form_total_${c.id}_${month}" id="form_total_${c.id}_${month}" value="${forecasts[c.id][month-1][1]}"/>
			     				</g:each>
		     				</tr>
		     				<tr>
				     			<td><div style="margin:0 0 0 5px;font-size:0.8em">Added:</div></td>
			     				<g:each in="${months}" var="month" status="j">
			     					<td class="colmonth">
			     						<g:if test="${month != 36}">
				     						<g:select class="tinyselect" from="${-forecasts[c.id][month-1][1]..10}" onchange="Proforma.setEquipmentQty(${c.id}, ${month}, ${year}); return false;" id="form_added_${c.id}_${month}" name="form_added_${c.id}_${month}" value="${forecasts[c.id][month-1][2]}"/>
				     					</g:if>			     						
			     					</td>
			     				</g:each>
		     				</tr>
	     				</g:each>
	     			</tbody>
	     		</table>
	     	</div>
	    </div>

	    <div class="row">
		    <div class="large-12 columns">
					<g:actionSubmit class="save button bemtbutton radius" action="updateequipment" value="Save Forecast"></g:actionSubmit>			
					<bemt:button controller="proforma" action="showequipment" function="return confirm('Are you sure you want to cancel without updating the forecast?');">Cancel</bemt:button>
		    </div>
	    </div>
    </g:form>
	</body>
</html>	