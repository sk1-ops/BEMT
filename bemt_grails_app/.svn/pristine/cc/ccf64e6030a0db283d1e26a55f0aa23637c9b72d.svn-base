<h5>Surveyed biobank reported the following Equipment:</h5>
<g:if test="${details}">
	<table class="small-12 md-results-detail">
		<thead>
			<tr>
				<th>Equipment</th>
				<th>Buy/Lease</th>
				<th>Price</th>
				<th>Service Contract</th>
				<th>Usable Life</th>
				<th># of Units</th>
				<th width="30"></th>
			</tr>
		</thead>
		<tbody>
			<g:each in="${details}" status="i" var="s">
				<tr>
					<td>-${s.type.name}</td>
					<td>${s.buy.name}</td>
					<td>${s.price.name}</td>
					<td>${s.contract.name}</td>
					<td>
						${s.life}
						<g:if test="${s.life != 'not reported'}">
							years
						</g:if>
					</td>
					<td>${s.units}</td>
					<td><a href="#" class="copylabor" onclick="$(this).trigger('bemt.copy');" bemt-route="/bemt/equipment/copy?id=${s.id}"><i class="fa fa-copy"></i></a></td>
				</tr>
			</g:each>
		</tbody>
	</table>
</g:if>
<g:else>
	<g:render template="../components/emptylist" model="['message':'Surveyed biobank did not report any Equipment.']"></g:render>
</g:else>