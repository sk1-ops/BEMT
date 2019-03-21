<html>
	<head>
		<meta name="layout" content="../layouts/default"/>
		<title>${obj.name}</title>
	</head>
	<body>
		<!--// header //-->
		<g:render template="priceheader" model="['title':'Allocate Costs: ' + obj.name.capitalize(), bc: 'Allocate Cost']"/>    

		<!--// instructional content //-->
    <div class="row">
     	<div class="small-10 columns">
				<p>For both labor and equipment, here is where you can specify how much of each is directly used when producing/delivering one unit of your specimen/product or service. This direct use of labor and equipment are legitimate costs that should be accounted for when determining the true costs of your specimens/products and services. For example, if your Pathologist spends 10 minutes on average working on each specimen, add that cost below. If your Flow Cytometer is used for 20 minutes to process 5 specimens, add 4 minutes for Flow Cytometer (20 minutes divided by 5 specimens). Every piece of equipment involved in collection, preparing, storing, delivering a specimen as well as every person directly spending time on it can be included in this costing. Be as thorough as possible. The more thorough you are, the more likely to justify your costs to end users and realize higher cost recovery.</p>
	    </div>
	 	</div>

		<div class="row">
			<div class="large-6 columns">

				<h5><b>Allocate Labor</b> <i class="fa fa-asterisk required_mark"></i></h5>
				<g:form url="[resource:obj, action:'saveallocated']" id="unit_form" onsubmit="return checkLaborCOGSForm('equip');">
					<g:hiddenField id="labor_organization" name="organization.id" value="${userOrganization.id}"></g:hiddenField>
					<g:hiddenField id="labor_cost_field" name="cost" value=""></g:hiddenField>
					<g:hiddenField id="labor_product" name="product.id" value="${obj.id}"></g:hiddenField>
					<g:hiddenField id="labor_type" name="type" value="labor"></g:hiddenField>				
					<div class="row">
						<div class="large-10 columns">
							<select name="labor.id" onchange="Labor.updateLaborAllocation(this);" id="labor">
								<option value="">-Choose Labor-</option>
			    			<g:each in="${laborList}" var="opt">
									<option value="${opt.id}">${opt.name} (${opt.category.name})</option>
						    </g:each>
							</select>
						</div>
					</div>
					<div class="row">
						<div class="large-3 columns">
			        <label>Minutes <i class="fa fa-asterisk required_mark"></i></label>
		         	<input onchange="Labor.updateLaborAllocationQty();" type="text" id="labor_qty" name="quantity" value="" maxlength="4" placeholder="" />
						</div>
						<div class="large-3 columns">
			        <label>Cost/Minute</label>
			        <div class="font200">$<span id="labor_price">--</span></div>
						</div>
						<div class="large-4 columns">
			        <label>Calculated Cost</label>
			        <div class="font200">$<span id="labor_cost">--</span></div>
						</div>
						<div class="large-3 columns"></div>
					</div>

					<g:render template="../components/form-required"/>
					<g:actionSubmit class="save button tiny radius" action="saveallocated" value="Add Allocated Labor Cost"></g:actionSubmit>			
				</g:form>

			</div>
			<div class="large-6 columns">

				<h5><b>Allocate Equipment</b> <i class="fa fa-asterisk required_mark"></i></h5>
				<g:form url="[resource:obj, action:'']" id="equipment_form" onsubmit="">
					<g:hiddenField id="equipment_organization" name="organization.id" value="${userOrganization.id}"></g:hiddenField>
					<g:hiddenField id="equipment_cost_field" name="cost" value=""></g:hiddenField>
					<g:hiddenField id="equipment_product" name="product.id" value="${obj.id}"></g:hiddenField>
					<g:hiddenField id="equipment_type" name="type" value="equipment"></g:hiddenField>				
					<div class="row">
						<div class="large-10 columns">
							<select name="equipment.id" onchange="Equipment.updateEquipmentAllocation(this);">
								<option value="">-Choose Equipment-</option>
				    		<optgroup label="Purchased Equipment">
				    			<g:each in="${equipList}" var="opt">
				    				<g:if test="${opt.type == 'purchased'}">
							        <option value="${opt.id}">${opt.name} (${opt.equip.name})</option>
										</g:if>
									</g:each>
					    	</optgroup>
				    		<optgroup label="Leased Equipment">
				    			<g:each in="${equipList}" var="opt">
				    				<g:if test="${opt.type != 'purchased'}">
							        <option value="${opt.id}">${opt.name} (${opt.equip.name})</option>
										</g:if>
									</g:each>
					    	</optgroup>
							</select>
						</div>
					</div>
					<div class="row">
						<div class="large-3 columns">
			        <label>Minutes <i class="fa fa-asterisk required_mark"></i></label>
		         	<input onchange="Equipment.updateEquipmentAllocationQty();" type="text" id="equipment_qty" name="quantity" value="" maxlength="6" placeholder="" />
						</div>
						<div class="large-3 columns">
			        <label>Cost/Minute</label>
			        <div class="font200">$<span id="equipment_price">--</span></div>
						</div>
						<div class="large-4 columns">
			        <label>Calculated Cost</label>
			        <div class="font200">$<span id="equipment_cost">--</span></div>
						</div>
						<div class="large-3 columns"></div>
					</div>
					<g:render template="../components/form-required"/>
					<g:actionSubmit onclick="return Equipment.checkAllocated();" class="save button tiny radius" action="saveallocated" value="Add Allocated Equipment Cost"></g:actionSubmit>			
				</g:form>

			</div>
		</div>
		<br/>
		<div class="row">
			<div class="large-6 columns">	
				<div class="font200">Total: <g:formatNumber number="${laborCost}" type="currency" currencyCode="USD" /> </div>
				<br/>
				<g:if test="${allocatedCosts && laborCost > 0}">
					<table class="listing" width="90%">
						<thead>
							<tr>
								<th>Labor</th>
								<th width="50" class="text-center">Minutes</th>
								<th width="100" class="text-center">Cost</th>
								<th width="40" class="text-center"></th>
							</tr>
						</thead>
						<tbody>
							<g:each in="${allocatedCosts}" status="i" var="c">
								<g:if test="${c.labor}">
									<tr>
										<td>${c.labor.name}</td>
										<td class="text-center">${c.quantity}</td>
										<td class="text-center"><g:formatNumber number="${c.cost}" type="currency" currencyCode="USD" /></td>
										<td class="text-center"><g:link controller="costplusAllocated" action="delete" id="${c.id}" params="[productId: obj.id]" class="ctl has-tip tip-top" data-options="disable_for_touch:true" data-tooltip="" title="click to remove" onclick="return confirm('Are you sure you want to delete this?');"><i class="fa fa-times remove"></i></g:link></td>	
									</tr>
								</g:if>
							</g:each>
						</tbody>
					</table>
				</g:if>
			</div>
			<div class="large-6 columns">
				<div class="font200">Total: <g:formatNumber number="${equipmentCost}" type="currency" currencyCode="USD" /> </div>
				<br/>
				<g:if test="${allocatedCosts && equipmentCost > 0}">
					<table class="listing" width="90%">
						<thead>
							<tr>
								<th>Equipment</th>
								<th width="50" class="text-center">Minutes</th>
								<th width="100" class="text-center">Cost</th>
								<th width="40" class="text-center"></th>
							</tr>
						</thead>
						<tbody>
							<g:each in="${allocatedCosts}" status="i" var="c">
								<g:if test="${c.equipment}">
									<tr>
										<td>${c.equipment.name}</td>
										<td class="text-center">${c.quantity}</td>
										<td class="text-center"><g:formatNumber number="${c.cost}" type="currency" currencyCode="USD" /></td>
										<td class="text-center"><g:link controller="costplusAllocated" action="delete" id="${c.id}" params="[productId: obj.id]" data-options="disable_for_touch:true" class="ctl has-tip tip-top" data-tooltip="" title="click to remove" onclick="return confirm('Are you sure you want to delete this?');"><i class="fa fa-times remove"></i></g:link></td>	
									</tr>
								</g:if>
							</g:each>
						</tbody>
					</table>						
				</g:if>
			</div>
		</div>		
	</body>
</html>	