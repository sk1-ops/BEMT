<html>
	<head>
		<meta name="layout" content="../layouts/default"/>
		<title>Project | ${obj.name}</title>
	</head>
	<body>
		<g:render template="header" model="['title':'Set Prices: ' + obj.name, 'bc':'Set Prices']"/> 

		<!--// instructional content //-->
			<div class="row">
	     	<div class="small-10 columns">
		     	<p>This is where you set a price for each specimen, product and service in your project. As described earlier, you can have the same specimen, product, or service in multiple projects and each project may have a different price. This could be because you have different price schedules for different client types (e.g. maybe for internal researchers you charge less than for external researchers).</p>
					<p>For each specimen, product, and service listed below, please set a price. The price you set may be influenced by your unit cost, by negotiations with a client/end-user, or by reviewing prices from other biobanks by looking at "Market Data" within the BEMT. When you set or modify a price, you will see two things happen. First, a red "save" button will appear. Click on this button when you are ready to save your change. Also, a value will be shown for "Cost Recovery %". This is meant to compare your price to your cost. For example, if you calculated earlier that your unit cost is $100, and your price is set to $40, your cost recovery % would be 40%. This means if you charge $40 for a unit that cost you $100, you would be recovering 40% of your cost.</p>
				</div>
			</div>
			<div class="row">
				<div class="small-12 columns">
					<h5><b>Specimen/Products/Services</b></h5>
				</div>
			</div>
			<div class="row">
				<div class="small-12 columns">
					<g:if test="${productList}">
						<table width="100%" class="listing">
							<thead>
								<tr>
									<th>Name</th>
									<th width="180" class="text-center">Type</th>
									<th width="105" class="text-center">Unit Cost</th>
									<th width="135" class="text-center">Price Per Unit</th>
									<th width="160" class="text-center">Cost Recovery % <span style="font-size:1em" data-tooltip aria-haspopup="true" title="Ratio of price over unit cost.  The percent of a specimen, product or service's unit cost recovered based on a set price."><i class="fa fa-question-circle"></i></span></th>
									<th width="80" class="text-center"></th>
								</tr>
							</thead>
							<tbody>
								<g:each in="${productList}" status="i" var="prod">
								<tr>
									<td>${prod.product.name}</td>
									<td class="text-center">${prod.product.type}</td>
									<td class="text-center"><g:formatNumber number="${prod.product.unitCost}" type="currency" currencyCode="USD" /></td>
								  
									<td class="text-center">
										<div class="row collapse">
								      <div class="small-3 columns">
								        <span class="prefix radius">$</span>
								      </div>
								      <div class="small-9 columns">
								        <g:field type="text" class="bemt_small_input_field" value="${prod.basePrice}" id="display_basePrice_${prod.id}" name="display_basePrice" onchange="Project.updateBasePrice(${prod.id});" maxlength="6"/>
								      </div>
								    </div>			        										
									</td>
									<td class="text-center"><span id="display_recoveryPercent_${prod.id}"><g:if test="${prod.recoveryPercent}"><g:formatNumber number="${prod.recoveryPercent}" type="number" minFractionDigits="2" maxFractionDigits="2"/></g:if><g:else>&#8734;</g:else></span>%</td>
									<td class="text-center">
									<g:form action="updatebaseprice" id="${obj.id}" name="form_${obj.id}">
										<g:hiddenField name="projectProduct" value="${prod.id}"></g:hiddenField>
										<g:hiddenField name="unitCost" id="unitCost_${prod.id}" value="${prod.product.unitCost}"></g:hiddenField>
										<g:hiddenField name="basePrice" id="basePrice_${prod.id}" value="${prod.basePrice}"></g:hiddenField>
								    <g:submitToRemote id="save_button_${prod.id}" class="hidden button alert save_unitprice radius" id="save_button_${prod.id}" url="[action: 'updatebaseprice']" before="Project.checkBasePrice();" onSuccess="Project.saveBasePrice(data);" onFailure="BEMT.handleAsyncError(XMLHttpRequest,textStatus,errorThrown);" value="Save"/>									
									</g:form>
									</td>
								</tr>
								</g:each>
							</tbody>
						</table><!--
						<div class="right">
							<g:actionSubmit class="btn_basePriceSave hidden save button alert tiny radius" action="updateprice" value="Update Base Prices"></g:actionSubmit>
						</div>-->
						
					</g:if>
					<g:else>
						<g:render template="../components/emptylist" model="['message':'You haven\'t added any Products to this project yet.']"></g:render>							
					</g:else>											
				</div>
			</div>
			<g:hiddenField name="projectid" id="projectid" value="${obj.id}"></g:hiddenField>

	</body>
</html>	