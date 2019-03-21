<g:hasErrors>
	<div class="flasherror">
		<h5>There were errors.</h5>
		<g:eachError var="error">
			<p <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></p>
		</g:eachError>
	</div>
</g:hasErrors>