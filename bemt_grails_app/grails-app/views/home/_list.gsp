    <div class="row">
     	<div class="small-12 columns">
     		<table class="table biobanklist listing">
	     		<thead>
	     			<tr>
	     				<th width="170">&#160;&#160;Biobank Name</th>
	     				<th width="70" class="text-center"><span data-options="disable_for_touch:true" data-tooltip aria-haspopup="true" class="has-tip tip-top" title="Step 1 labor: # of Labor Categories Involved in your Biobank">Step 1<br/>Labor</span></th>
	     				<th width="70" class="text-center"><span data-options="disable_for_touch:true" data-tooltip aria-haspopup="true" class="has-tip tip-top" title="Step 2 Equipment: # of Types of Equipment used in your Biobank">Step 2<br/>Equip.</span></th>
	     				<th width="70" class="text-center"><span data-options="disable_for_touch:true" data-tooltip aria-haspopup="true" class="has-tip tip-top" title="Step 3 Supplies: # of Supplies consumed by your Biobank">Step 3<br/>Supplies</span></th>
	     				<th width="80" class="text-center"><span data-options="disable_for_touch:true" data-tooltip aria-haspopup="true" class="has-tip tip-top" title="Step 4 Prod & Svc: # of Specimen, Product, and Service Types collected/distributed by your Biobank">Step 4<br/>Prod &amp; Svc</span></th>
	     				<th width="70" class="text-center"><span data-options="disable_for_touch:true" data-tooltip aria-haspopup="true" class="has-tip tip-top" title="Step 5 Unit Cost: # of Specimen, Product, and Service Types that have Unit Cost Data entered for your Biobank">Step 5<br/>Unit Cost</span></th>
	     				<th width="70" class="text-center"><span data-options="disable_for_touch:true" data-tooltip aria-haspopup="true" class="has-tip tip-top" title="Step 6: Projects: # of Projects or Project Types your Biobank is involved with">Step 6<br/>Projects</span></th>
	     				<th class="text-center" colspan="3" width="305"><span data-options="disable_for_touch:true" data-tooltip aria-haspopup="true" class="tip-top has-tip" title="Step 7: Forecast Years 1,2,3: Your Biobanks forecasted Profit or (Loss) for three years based on currently entered information">Step 7<br/>Forecast Years 1, 2 and 3</span></th>
	     				<th width="110">&#160;</th>
	     			</tr>
	     		</thead>
	     		<tbody>
		     		<g:each in="${objList}" status="i" var="obj">
		     			<tr>
				     		<g:if test="${userOrganization.id == obj.id}">
			     				<td class="biobank-name">
			     					<b><span data-options="disable_for_touch:true" data-tooltip aria-haspopup="true" class="has-tip tip-top" title="${obj.description}">${obj.name} (selected)</span></b>
			     				</td>
			     				<td class="text-center">	
			     					<g:link controller="organization" action="changeorg" params="[org: obj.id, c: 'labor']">${labors.get(obj.id)}</g:link>
			     				</td>
			     				<td class="text-center">	
			     					<g:link controller="organization" action="changeorg" params="[org: obj.id, c: 'equipment']">${equipments.get(obj.id)}</g:link>
			     				</td>
			     				<td class="text-center">	
			     					<g:link controller="organization" action="changeorg" params="[org: obj.id, c: 'supply']">${supplies.get(obj.id)}</g:link>
			     				</td>
			     				<td class="text-center">	
			     					<g:link controller="organization" action="changeorg" params="[org: obj.id, c: 'product']">${products.get(obj.id)}</g:link>
			     				</td>
			     				<td class="text-center">	
			     					<g:link controller="organization" action="changeorg" params="[org: obj.id, c: 'product']">${unitproducts.get(obj.id)}/${products.get(obj.id)}</g:link>
			     				</td>
			     				<td class="text-center">	
			     					<g:link controller="organization" action="changeorg" params="[org: obj.id, c: 'project']">${projects.get(obj.id)}</g:link>
			     				</td>
			     				<td class="text-center forecast-number">	
			     					<g:link controller="proforma" action="show" class="nodecor">
				     					<g:if test="${profits.get(obj.id).get(1) < 0}">
				     						<span style="color:red;">
						     					<g:formatNumber number="${profits.get(obj.id).get(1)}" type="currency" currencyCode="USD" />
						     				</span>
						     			</g:if>
						     			<g:else>
					     					<g:formatNumber number="${profits.get(obj.id).get(1)}" type="currency" currencyCode="USD" />
						     			</g:else>
										</g:link>
			     				</td>
			     				<td class="text-center forecast-number">	
			     					<g:link controller="proforma" action="show" class="nodecor">
				     					<g:if test="${profits.get(obj.id).get(2) < 0}">
				     						<span style="color:red;">
						     					<g:formatNumber number="${profits.get(obj.id).get(2)}" type="currency" currencyCode="USD" />
						     				</span>
						     			</g:if>
						     			<g:else>
					     					<g:formatNumber number="${profits.get(obj.id).get(2)}" type="currency" currencyCode="USD" />
						     			</g:else>
										</g:link>
			     				</td>
			     				<td class="text-center forecast-number">	
			     					<g:link controller="proforma" action="show" class="nodecor">
				     					<g:if test="${profits.get(obj.id).get(3) < -0}">
				     						<span style="color:red;">
						     					<g:formatNumber number="${profits.get(obj.id).get(3)}" type="currency" currencyCode="USD" />
				     						}
						     				</span>
						     			</g:if>
						     			<g:else>
					     					<g:formatNumber number="${profits.get(obj.id).get(3)}" type="currency" currencyCode="USD" />
						     			</g:else>
										</g:link>
			     				</td>
			     			</g:if>
				     		<g:else>
			     				<td class="biobank-name">
		     						<span data-options="disable_for_touch:true" data-tooltip aria-haspopup="true" class="has-tip tip-top" title="${obj.description}"><g:link controller="organization" action="changeorg" params="[org: obj.id]">${obj.name}</g:link></span>
			     				</td>
			     				<td class="text-center">	
			     					${labors.get(obj.id)}
			     				</td>
			     				<td class="text-center">	
			     					${equipments.get(obj.id)}
			     				</td>
			     				<td class="text-center">	
			     					${supplies.get(obj.id)}
			     				</td>
			     				<td class="text-center">	
			     					${products.get(obj.id)}
			     				</td>
			     				<td class="text-center">	
			     					${unitproducts.get(obj.id)}/${products.get(obj.id)}
			     				</td>
			     				<td class="text-center">	
			     					${projects.get(obj.id)}
			     				</td>
			     				<td class="text-center forecast-number">	
			     					<g:if test="${profits.get(obj.id).get(1) < 0}">
			     						<span style="color:red;">
					     					<g:formatNumber number="${profits.get(obj.id).get(1)}" type="currency" currencyCode="USD" />
					     				</span>
					     			</g:if>
					     			<g:else>
				     					<g:formatNumber number="${profits.get(obj.id).get(1)}" type="currency" currencyCode="USD" />
					     			</g:else>
			     				</td>
			     				<td class="text-center forecast-number">	
			     					<g:if test="${profits.get(obj.id).get(2) < 0}">
			     						<span style="color:red;">
					     					<g:formatNumber number="${profits.get(obj.id).get(2)}" type="currency" currencyCode="USD" />
					     				</span>
					     			</g:if>
					     			<g:else>
				     					<g:formatNumber number="${profits.get(obj.id).get(2)}" type="currency" currencyCode="USD" />
					     			</g:else>
			     				</td>
			     				<td class="text-center forecast-number">	
			     					<g:if test="${profits.get(obj.id).get(3) < 0.00}">
			     						<span style="color:red;">
					     					<g:formatNumber number="${profits.get(obj.id).get(3)}" type="currency" currencyCode="USD" />
					     				</span>
					     			</g:if>
					     			<g:else>
				     					<g:formatNumber number="${profits.get(obj.id).get(3)}" type="currency" currencyCode="USD" />
					     			</g:else>
			     				</td>
			     			</g:else>
		     				<td class="text-center">
		     					<g:link controller="organization" action="edit" id="${obj.id}" class="ctl has-tip tip-top" data-options="disable_for_touch:true" data-tooltip="" title="Click here to edit Biobank Name/Description"><i class="fa fa-pencil edit"></i></g:link>&#160;
		     					<g:link controller="organization" action="copy" id="${obj.id}" class="ctl has-tip tip-top" data-options="disable_for_touch:true" data-tooltip="" title="Click here to make a copy of this Biobank"><i class="fa fa-copy edit"></i></g:link>&#160;
		     					<g:link controller="organization" action="reset" id="${obj.id}" class="ctl has-tip tip-top" data-options="disable_for_touch:true" data-tooltip="" title="Click here to reset this Biobank to the system template or to a blank Biobank."><i class="fa fa-refresh edit"></i></g:link>&#160;
		     					<g:link controller="organization" action="delete" id="${obj.id}" class="ctl has-tip tip-top" data-options="disable_for_touch:true" data-tooltip="" title="Click here to permanently delete this Biobank." onclick="return confirm('This action will delete this Biobank and all associated data. Are you sure you want to continue?');"><i class="fa fa-times remove"></i></g:link>
		     				</td>
		     			</tr>
		     		</g:each>
	     		</tbody>
     		</table>
     	</div>
     </div>