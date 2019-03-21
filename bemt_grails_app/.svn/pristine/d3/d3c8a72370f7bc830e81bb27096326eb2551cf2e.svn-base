<g:if test="${objListPurchased}">
	<table width="100%" class="listing">
		<thead>
			<tr>
				<th>Purchased Equipment Name</th>
				<th width="175" class="text-center">Type</th>
				<th width="115" class="text-center">Purchase Price</th>
				<th width="90" class="text-center">Usable Life</th>
				<th width="125" class="text-center">Annual Billable Hours</th>
				<th width="125" class="text-center">Annual Service Contract</th>
				<th width="70" class="text-center"><div class="listitem-actions"><i class="fa fa-cog"></i></div></th>
			</tr>
		</thead>
		<tbody>
			<g:each in="${objListPurchased}" status="i" var="obj">
				<tr>
					<td>${obj.name}</td>
					<td class="text-center">${obj.equip}</td>
					<td class="text-center"><g:formatNumber number="${obj.cost}" type="currency" currencyCode="USD" /></td>
					<td class="text-center">${obj.usableLife} years</td>
					<td class="text-center">${obj.annualBillableHours} hours</td>
					<td class="text-center"><g:formatNumber number="${obj.annualServiceContract}" type="currency" currencyCode="USD" /></td>

					<td class="text-center">
						<g:link action="edit" id="${obj.id}" class="ctl has-tip tip-top" data-options="disable_for_touch:true" data-tooltip="" title="Click to edit equipment category entry"><i class="fa fa-pencil edit"></i></g:link>
						<g:link controller="equipment" action="delete" id="${obj.id}" class="ctl has-tip tip-top" data-options="disable_for_touch:true" data-tooltip="" title="Click to delete equipment category entry" onclick="return confirm('Are you sure you want to delete this piece of Equipment?');"><i class="fa fa-times remove"></i></g:link>
					</td>
				</tr>
			</g:each>
		</tbody>
	</table>
	<br/><br/>
</g:if>

<g:if test="${objListLeased}">
	<table width="100%" class="listing">
		<thead>
			<tr>
				<th>Leased Equipment Name</th>
				<th width="175" class="text-center">Type</th>
				<th width="115" class="text-center">Annual Lease</th>
				<th width="90" class="text-center">Lease Duration</th>
				<th width="125" class="text-center">Annual Billable Hours</th>
				<th width="125" class="text-center">Annual Service Contract</th>
				<th width="70" class="text-center"></th>
			</tr>
		</thead>
		<tbody>
			<g:each in="${objListLeased}" status="i" var="obj">
				<tr>
					<td>${obj.name}</td>
					<td class="text-center">${obj.equip}</td>
					<td class="text-center"><g:formatNumber number="${obj.cost}" type="currency" currencyCode="USD" /></td>
					<td class="text-center">${obj.usableLife} years</td>
					<td class="text-center">${obj.annualBillableHours} hours</td>
					<td class="text-center"><g:formatNumber number="${obj.annualServiceContract}" type="currency" currencyCode="USD" /></td>

					<td class="text-center">
						<g:link action="edit" id="${obj.id}" class="ctl has-tip tip-top" title="Click to edit equipment category entry" data-tooltip=""><i class="fa fa-pencil edit"></i></g:link>
						<g:link controller="equipment" action="delete" id="${obj.id}" class="ctl has-tip tip-top" data-options="disable_for_touch:true" data-tooltip="" title="Click to delete equipment category entry" onclick="return confirm('Are you sure you want to delete this piece of Equipment?');"><i class="fa fa-times remove"></i></g:link>
					</td>
				</tr>
			</g:each>
		</tbody>
	</table>
</g:if>