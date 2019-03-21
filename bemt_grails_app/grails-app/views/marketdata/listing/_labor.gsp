<h5>Surveyed biobank reported the following Labor Categories:</h5>
<g:if test="${details}">
	<table class="small-9 md-results-detail">
		<thead>
			<tr>
				<th>Labor Category</th>
				<th>Salary Range</th>
				<th>Fringe Benefits</th>
				<th>FTE</th>
				<th width="30"></th>
			</tr>
		</thead>
		<tbody>
			<g:each in="${details}" status="i" var="s">
				<tr>
					<td>${s.type.name}</td>
					<td>${s.range.name}</td>
					<td>${s.fringe.name}</td>
					<td>${s.fte}</td>
					<td><a href="#" class="md-copy" onclick="$(this).trigger('bemt.copy');" bemt-route="/bemt/labor/copy?id=${s.id}"><i class="fa fa-copy"></i></a></td>
				</tr>
			</g:each>
		</tbody>
	</table>
</g:if>
<g:else>
	<g:render template="../components/emptylist" model="['message':'Surveyed biobank did not report any Labor Categories.']"></g:render>
</g:else>	