<div class="row">
	<div class="small-12 columns">
		<h4>Supplies</h4>
		<table width="100%" class="listing">
			<thead>
				<tr>
					<th>Supply</th>
					<th width="300" class="text-center">Supply Type</th>
					<th width="120" class="text-center">Cost Per Unit</th>
					<th width="120" class="text-center">Units</th>
					<th width="70" class="text-center"><div class="listitem-actions"><i class="fa fa-cog"></i></div></th>
				</tr>
			</thead>
			<tbody>
				<g:each in="${objList}" status="i" var="obj">
					<tr>
						<td>${obj.name}</td>
						<td class="text-center"><%= obj.type.name%></td>
						<td class="text-center"><g:formatNumber number="${obj.unitPrice}" type="currency" currencyCode="USD" /></td>
						<td class="text-center"><%= obj.units%></td>
						<td class="text-center">
							<g:link action="edit" id="${obj.id}" class="ctl has-tip tip-top" data-options="disable_for_touch:true" title="click to edit" data-tooltip=""><i class="fa fa-pencil edit">&#160;</i></g:link>
							<g:link action="delete" id="${obj.id}" class="ctl has-tip tip-top" data-options="disable_for_touch:true" data-tooltip="" title="click to delete" onclick="return confirm('Are you sure you want to delete this Supply?');"><i class="fa fa-times remove"></i></g:link>
						</td>
					</tr>
				</g:each>
			</tbody>
		</table>
	</div>
</div>