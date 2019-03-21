<table width="100%" class="listing">
	<thead>
		<tr>
			<th>Title</th>
			<th width="280"class="text-center">Labor Category</th>
			<th width="180" class="text-center">Annualized Salary ($)</th>
			<th width="150" class="text-center">Fringe Benefit (%)</th>
			<th width="70" class="text-center"><div class="listitem-actions"><i class="fa fa-cog"></i></div></th>
		</tr>
	</thead>
	<tbody>
		<g:each in="${objList}" status="i" var="obj">
			<tr>
				<td>${obj.name}</td>
				<td class="text-center">${obj.category}</td>
				<td class="text-center"><g:formatNumber number="${obj.annualSalary}" type="currency" currencyCode="USD" /></td>
				<td class="text-center">${obj.benefitPercent}%</td>
				<td class="text-center">
					<g:link action="edit" id="${obj.id}" class="ctl has-tip tip-top" data-options="disable_for_touch:true" data-tooltip="" title="Click here to edit labor category"><i class="fa fa-pencil edit"></i></g:link>
					<g:link controller="labor" action="delete" id="${obj.id}" class="ctl has-tip tip-top" data-options="disable_for_touch:true" data-tooltip="" title="Click to remove this labor category entry" onclick="return confirm('Are you sure you want to delete this labor category?');"><i class="fa fa-times remove"></i></g:link>
				</td>
			</tr>
		</g:each>
	</tbody>
</table>