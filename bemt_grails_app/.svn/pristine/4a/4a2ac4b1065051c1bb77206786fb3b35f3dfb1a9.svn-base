<table width="100%" class="listing">
	<thead>
		<tr>
			<th>Project Name</th>
			<th width="100" class="text-center"># Offerings</th>
			<th width="125" class="text-center">Fee Schedule</th>
			<th width="125" class="text-center">Set/Edit Prices</th>
			<th width="80" class="text-center"><div class="listitem-actions"><i class="fa fa-cog"></i></div></th>
		</tr>
	</thead>
	<tbody>
		<g:each in="${objList}" status="i" var="obj">
			<tr>
				<td>${obj.name}</td>
				<td class="text-center">${obj.products.size()}</td>
				<td class="text-center">
					<g:if test="${obj.products.size() == 0}">	   
						no offerings
					</g:if>
					<g:else>
						<g:link controller="projectFeeSchedule" action="show" id="${obj.fee.id}">View</g:link>
					</g:else>
				</td>
				<td class="text-center">
					<g:if test="${obj.products.size() == 0}">	   
						no offerings
					</g:if>
					<g:else>
						<g:link action="price" id="${obj.id}">Set/Edit</g:link>
					</g:else>
				</td>
				<td class="text-center">
					<g:link action="edit" id="${obj.id}" class="ctl tip-top" title="click to edit" data-tooltip="" data-options="disable_for_touch:true"><i class="fa fa-pencil edit">&#160;</i></g:link>
					<g:link action="delete" id="${obj.id}" class="ctl tip-top" data-tooltip="" data-options="disable_for_touch:true" title="click to remove this project" onclick="return confirm('Are you sure you want to delete this project?');"><i class="fa fa-times remove"></i></g:link>
				</td>
			</tr>
		</g:each>
	</tbody>
</table>