<table>
	<thead>
		<tr>
			<th width="25">ID</th>
			<th width="400">Name</th>
			<th width="100"></th>
		</tr>
	</thead>
	<tbody>
		<g:each in="${organizationList}" status="i" var="org">
			<tr>
				<td>${org.id}</td>
				<td><g:link controller="organization" action="show" id="${org.id}">${org.name}</g:link>
				<td align="center"><g:link action="delete" id="${org.id}" onclick="return confirm('Are you sure you want to delete this organization?');"><i class="fa fa-times ctlicon-remove"></i></g:link></td>
			</tr>
		</g:each>
	</tbody>
</table>
		
