<h5>Surveyed biobank reported the following Services:</h5>
<g:if test="${details}">
	<table class="small-9 md-results-detail">
		<thead>
			<tr>
				<th>Service</th>
				<th>Price</th>
				<th wdith="30"></th>
			</tr>
		</thead>
		<tbody>
			<g:each in="${details}" status="i" var="s">
				<tr>
					<td>${s.type}</td>
					<td>${s.price}</td>
					<td><a href="#" class="md-copy" onclick="$(this).trigger('bemt.copy');" bemt-route="/bemt/product/copyservice?id=${s.id}"><i class="fa fa-copy"></i></a></td>
				</tr>
			</g:each>
		</tbody>
	</table>
</g:if>
<g:else>
	<g:render template="../components/emptylist" model="['message':'Surveyed biobank did not report any Services.']"></g:render>
</g:else>	