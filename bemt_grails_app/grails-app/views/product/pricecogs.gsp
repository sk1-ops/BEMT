<html>
	<head>
		<meta name="layout" content="../layouts/default"/>
		<title>${obj.name}</title>
	</head>
	<body>
		<!--// header //-->
		<g:render template="priceheader" model="['title':'Supplies: ' + obj.name.capitalize(), bc: 'Supplies']"/>    

		<!--// instructional content //-->
    <div class="row">
     	<div class="small-10 columns">
     		<p>Please add supplies that are consumed (either partial use, single use or multi-use) when collecting specimen/product or delivering biobanking services (for example cassettes, or gloves). Those supplies that are not consumed this way, but may degrade over time (such as a cutting board or LN2) do not need to be listed here. Rather they can be added to overall expenses later.</p>
     		<p><b>Actions:</b> Select supplies from the list below. If the list is missing a supply, please go back to My Biobank->My Lab Supplies and add it. Once you select from the list, specify the quantity of that supply that is consumed for each unit of specimen/product or service. Repeat for all supplies that are consumed (wholly or partially) for this specimen/product or service.</p>
	    </div>
	 	</div>

		<div class="row">
			<div class="large-6 columns">
				<h5><b>Supply</b> <i class="fa fa-asterisk required_mark"></i></h5>
				<g:form url="[resource:obj, action:'']" id="unit_form">
					<g:hiddenField id="organization.id" name="organization.id" value="${userOrganization.id}"></g:hiddenField>
					<g:hiddenField id="supply_cost_field" name="cost" value=""></g:hiddenField>
					<g:hiddenField id="unit_product" name="product.id" value="${obj.id}"></g:hiddenField>
					<g:hiddenField id="unit_type" name="type" value="unit"></g:hiddenField>
					<div class="row">
						<div class="large-10 columns">
							<select id="supply_formselect" name="supply.id" style="font-size:0.8em" onchange="Supply.updateAllocationSupplyType();">
								<option value="">-Choose Supply-</option>
			    			<g:each in="${supplies}" var="opt">
			    				<g:if test="${opt.unitPrice == 0}">		    				
										<g:set var="optionText" value="${opt.name} at a price of \$0.00 per ${opt.units} (price needs to be set)" />
									</g:if>
									<g:else>
										<g:set var="optionText" value="${opt.name} at a price of \$${opt.unitPrice} per ${opt.units}" />
									</g:else>
		    					<g:if test="${cogs?.supply?.id == opt.id}">
						        <option selected="selected" value="${opt.id}">${optionText}</option>
						      </g:if>
					       	<g:else>
										<option value="${opt.id}">${optionText}</option>
						      </g:else>
						    </g:each>
							</select>
						</div>
					</div>
					<div class="row">
						<div class="large-3 columns">
			        <label>Quantity <i class="fa fa-asterisk required_mark"></i></label>
		         	<input onchange="Supply.updateAllocationSupplyQty();" type="text" id="supply_qty" name="quantity" value="${cogs.quantity}" maxlength="8"/>
						</div>
						<div class="large-3 columns">
			        <label>Cost Per Unit</label>
			        <div class="font200">$<span id="supply_price">--</span></div>
						</div>
						<div class="large-4 columns">
			        <label>Calculated Cost</label>
			        <div class="font200">$<span id="supply_cost">--</span></div>
						</div>
						<div class="large-3 columns"></div>
					</div>

					<g:render template="../components/form-required"/>
					<g:actionSubmit onclick="return Product.checkQty('supply_qty');" class="save button bemtbutton radius" action="savecogs" value="Add Supply"></g:actionSubmit>			
				</g:form>
			</div>
			<div class="large-6 columns">
				
			</div>
		</div>
		<br/>
		<div class="row">
			<div class="large-6 columns">	
				<div class="font200">Total: <g:formatNumber number="${unitCost}" type="currency" currencyCode="USD" /> </div>
				<br/>
				<g:if test="${supplycogs}">
					<table class="listing" width="90%">
						<thead>
							<tr>
								<th>Supply</th>
								<th width="50" class="text-center">Quantity</th>
								<th width="120" class="text-center">Cost</th>
								<th width="50" class="text-center"></th>
							</tr>
						</thead>
						<tbody>
							<g:each in="${supplycogs}" status="i" var="c">
								<tr>
									<td>${c.supply.name}</td>
									<td class="text-center">${c.quantity}</td>
									<td class="text-center"><g:formatNumber number="${c.cost}" type="currency" currencyCode="USD" /></td>
									<td class="text-center"><g:link controller="costplusCogs" action="delete" id="${c.id}" params="[productId: obj.id]" class="ctl has-tip tip-top" data-options="disable_for_touch:true" data-tooltip="" title="click to remove" onclick="return confirm('Are you sure you want to delete this?');"><i class="fa fa-times remove"></i></g:link></td>	
								</tr>
							</g:each>
						</tbody>
					</table>
				</g:if>
			</div>
			<div class="large-6 columns">
			
			</div>
		</div>			
	</body>
</html>	
