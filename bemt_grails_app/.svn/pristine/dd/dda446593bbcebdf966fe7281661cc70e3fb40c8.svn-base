<g:if test="${attrs.controller && attrs.action}">
	<g:if test="${attrs.function}">
		<g:link controller="${attrs.controller}" id="${attrs.id}" action="${attrs.action}" params="${attrs.params}" class="button bemtbutton radius" onclick="${attrs.function}">
			<g:if test="${attrs.type == 'search'}">
				<i class="fa fa-search"></i>&#160;
			</g:if>
			<g:if test="${attrs.type == 'new'}">
				<i class="fa fa-plus"></i>&#160;
			</g:if>			
			<g:if test="${attrs.type == 'print'}">
				<i class="fa fa-print font125"></i>&#160;
			</g:if>			
			${labelHtml}
		</g:link> 
	</g:if>
	<g:else>
		<g:link controller="${attrs.controller}" id="${attrs.id}" action="${attrs.action}" params="${attrs.params}" class="button bemtbutton radius">
			<g:if test="${attrs.type == 'search'}">
				<i class="fa fa-search"></i>&#160;
			</g:if>
			<g:if test="${attrs.type == 'new'}">
				<i class="fa fa-plus"></i>&#160;
			</g:if>			
			<g:if test="${attrs.type == 'print'}">
				<i class="fa fa-print font125"></i>&#160;
			</g:if>			
			${labelHtml}
		</g:link>
	</g:else>
</g:if>
<g:elseif test="${attrs.function}">
	<a href="#" onclick="${attrs.function}" class="button bemtbutton radius">
		<g:if test="${attrs.type == 'search'}">
			<i class="fa fa-search"></i>&#160;
		</g:if>
		<g:if test="${attrs.type == 'new'}">
			<i class="fa fa-plus"></i>&#160;
		</g:if>			
		<g:if test="${attrs.type == 'print'}">
			<i class="fa fa-print font125"></i>&#160;
		</g:if>			
		${labelHtml}
	</a> 
</g:elseif>
<g:else>
	BUTTON NOT SUPPORTED, must use controller/action or onlick function ("function")
</g:else>
