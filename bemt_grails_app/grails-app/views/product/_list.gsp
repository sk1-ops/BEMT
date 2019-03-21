<p>A red dollar sign ( <i style="font-size:1.3em;color:red;font-weight:bold" class="fa fa-dollar"></i> ) indicates ${objName}s without a unit cost. Click the dollar sign to assign a unit cost.</i>
<table width="100%" class="listing">
	<thead>
		<tr>
			<th width="225">${objName.capitalize()} Name</th>
			<th width="200" class="text-center">${objName.capitalize()} Type</th>
			<th class="text-center">Description</th>
			<th width="100" class="text-center">Unit Cost</th>
			<th width="90" class="text-center"><div class="listitem-actions"><i class="fa fa-cog"></i></div></th>
		</tr>
	</thead>
	<tbody>
		<g:each in="${objList}" status="i" var="obj">
			<tr>
				<td>${obj.name}</td>
				<td class="text-center">${obj.subtype}</td>
				<td class="">${obj.description}</td>
				<td class="text-center"><g:formatNumber number="${obj.unitCost}" type="currency" currencyCode="USD" /></td>
				<td class="text-center">
					<g:if test="${obj.unitCost <= 0}">
						<g:link action="price" id="${obj.id}" class="ctl" style="color:red;font-weight:bold" title="click to adjust unit cost" data-options="disable_for_touch:true" data-tooltip aria-haspopup="true"><i class="fa fa-dollar price"></i></g:link>&#160;					
						</g:if>
					<g:else>
						<g:link action="price" id="${obj.id}" class="ctl" style="font-weight:bold" title="click to adjust unit cost" data-options="disable_for_touch:true" data-tooltip aria-haspopup="true"><i class="fa fa-dollar price"></i></g:link>&#160;					
					</g:else>
					<g:link action="edit" id="${obj.id}" class="ctl" title="click to edit product name and description" data-tooltip data-options="disable_for_touch:true" aria-haspopup="true"><i class="fa fa-pencil edit">&#160;</i></g:link>
					<g:link controller="product" action="delete" id="${obj.id}" class="ctl" data-tooltip aria-haspopup="true" data-options="disable_for_touch:true" title="click to remove this product" onclick="return confirm('Are you sure you want to delete this product?');"><i class="fa fa-times remove"></i></g:link>
				</td>
			</tr>
		</g:each>
	</tbody>
</table>