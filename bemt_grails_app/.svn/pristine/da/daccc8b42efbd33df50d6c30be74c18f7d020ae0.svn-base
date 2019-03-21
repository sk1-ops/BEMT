<h5>Surveyed biobank reported the following Specimens/Products:</h5>
<g:if test="${details}">
	<table class="small-12 md-results-detail">
		<thead>
			<tr>
				<th>Type</th>
				<th>Stabilization</th>
				<th>Ischemic</th>
				<th>Weight/Vol.</th>
				<th>Preservation</th>
				<th>Data Collected</th>
				<th>Collection</th>
				<th>Distribution</th>
				<th>Price</th>
				<th width="30"></th>

			</tr>
		</thead>
		<tbody>
			<g:each in="${details}" status="i" var="s">
				<tr>
					<td>${s.type.name}</td>
					<td>${s.stabilization}</td>
					<td>${s.ischemicTime}</td>
					<td>${s.weight}</td>
					<td>${s.preservation}</td>
					<td>${s.dataCollected}</td>
					<td>${s.collectionVol}</td>
					<td>${s.distVol}</td>
					<td>${s.price}</td>
					<td><a href="#" class="md-copy" onclick="$(this).trigger('bemt.copy');" bemt-route="/bemt/product/copyproduct?id=${s.id}"><i class="fa fa-copy"></i></a></td>
				</tr>
			</g:each>
		</tbody>
	</table>
</g:if>
<g:else>
	<g:render template="../components/emptylist" model="['message':'Surveyed biobank did not report any Specimens/Products.']"></g:render>
</g:else>