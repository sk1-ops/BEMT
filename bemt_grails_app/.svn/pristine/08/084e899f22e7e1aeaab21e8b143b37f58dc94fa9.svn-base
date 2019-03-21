<html>
	<head>
		<meta name="layout" content="../layouts/default"/>
		<title>My Forecast</title>
	</head>
	<body>

		<!--// header //-->
		<g:render template="header" model="['page':'labor', 'title':'Forecast Expenses: Forecast Labor', 'bc':'Forecast', 'bcId':obj.id]"/> 	

		<g:if test="${year == '1'}"><g:set var="months" value="${1..12}" /></g:if>
		<g:if test="${year == '2'}"><g:set var="months" value="${13..24}" /></g:if>
		<g:if test="${year == '3'}"><g:set var="months" value="${25..36}" /></g:if>



		<!--// instructional content //-->
		<g:form url="[resource:obj, action:'updatelabor']">

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
	     					<th class="col1">Months ${months[0]}-${months[11]}</th>
		     				<g:each in="${months}" var="c">
		     					<th class="colmonth">${c}</th>
		     				</g:each>
	     				</tr>
	     			</thead>
	     			<tbody>
	     				<tr>
		     				<td><b>Labor Categories</b></td>
		     				<g:each in="${months}" var="c" status="i">
		     					<td class="colmonth">#FTE</td>
		     				</g:each>
	     				</tr><!--
	     				<g:each in="${labor}" var="c" status="i">
		     				<tr>
			     				<td>
			   						${c.name}<br/>
			   						<span class="labordetails"><i><g:formatNumber number="${c.annualSalary}" type="currency" currencyCode="USD" />/<g:formatNumber number="${c.benefitPercent/100}" type="percent" currencyCode="USD" /></i></span>			     					
			     				</td>
			     				<g:each in="${months}" var="month" status="j">
			     					<td class="colmonth">SUGGESTED
			     					</td>
			     				</g:each>
		     				</tr>
	     				</g:each>
	     				-->
	     				<g:each in="${labor}" var="c" status="i">
		     				<tr>
			     				<td class="component">
			   						${c.name}<br/>
			   						<span class="labordetails"><i><g:formatNumber number="${c.annualSalary}" type="currency" currencyCode="USD" />/<g:formatNumber number="${c.benefitPercent/100}" type="percent" currencyCode="USD" /></i></span>			     					
			     				</td>
			     				<g:each in="${months}" var="month" status="j">
			     					<td class="colmonth">
			     						<input class="tinyinput" type="input" name="qty_${c.id}_${month}" value="${forecasts[c.id][(month-1)][1]}"></input>
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
					<g:actionSubmit class="save button bemtbutton radius" action="updatelabor" value="Save Forecast"></g:actionSubmit>			
					<bemt:button controller="proforma" action="showlabor" function="return confirm('Are you sure you want to cancel without updating the forecast?');">Cancel</bemt:button>
		    </div>
	    </div>
    </g:form>
	</body>
</html>	