<html>
	<head>
		<meta name="layout" content="../layouts/default"/>
		<title>${obj.name}</title>
	</head>
	<body>
		<!--// header //-->
		<g:render template="priceheader" model="['title':'Other Costs: ' + obj.name.capitalize(), bc: 'Other Costs']"/>    

		<!--// instructional content //-->
    <div class="row">
     	<div class="small-10 columns">
				<p>Any other direct costs associated with delivering a unit of your specimen/product or service. For example, here you could add shipping costs, printing costs, etc.</p>
	    </div>
	 	</div>

		<div class="row">
			<div class="large-8 columns">

				<g:form url="[resource:obj, action:'saveother']">
					<g:hiddenField id="other_organization" name="organization.id" value="${userOrganization.id}"></g:hiddenField>
					<g:hiddenField id="other_product" name="product.id" value="${obj.id}"></g:hiddenField>
					<div class="row">
						<div class="large-12 columns">
			        <label>Cost Description (max 250 chars) <i class="fa fa-asterisk required_mark"></i></label>
							<input type="text" id="other_other" name="other" value="${desc}" placeholder="" maxlength="250" />
						</div>
					</div>
					<div class="row collapse">
		        <div class="small-1 columns">
		          <span class="prefix radius">$</span>
		        </div>						
		        <div class="small-2 columns">
		          <input type="text" value="${cost}" id="other_cost" name="cost" maxlength="10">
		        </div>
		        <div class="small-9 columns">
		        </div>
		      </div>			        
					<g:render template="../components/form-required"/>
					<g:actionSubmit class="save button tiny radius" action="saveother" value="Add Other Cost"></g:actionSubmit>			
				</g:form>

			</div>
			
		</div>
		<br/>
		<div class="row">
			<div class="large-8 columns">	
				<div class="font200">Total: <g:formatNumber number="${otherCost}" type="currency" currencyCode="USD" /> </div>
				<br/>
				<g:if test="${otherCost > 0}">
					<table class="listing" width="90%">
						<thead>
							<tr>
								<th width="400" class="">Desc</th>
								<th width="100" class="text-center">Cost</th>
								<th width="50" class="text-center"></th>
							</tr>
						</thead>
						<tbody>
							<g:each in="${otherCosts}" status="i" var="c">
								<tr>
									<td>${c.other}</td>
									<td class="text-center"><g:formatNumber number="${c.cost}" type="currency" currencyCode="USD" /></td>
									<td class="text-center"><g:link controller="costplusOther" action="delete" id="${c.id}" params="[productId: obj.id]" class="ctl has-tip tip-top" data-options="disable_for_touch:true" data-tooltip="" title="click to remove" onclick="return confirm('Are you sure you want to delete this?');"><i class="fa fa-times remove"></i></g:link></td>	
								</tr>
							</g:each>
						</tbody>
					</table>
				</g:if>
			</div>
		</div>		
	</body>
</html>	