<g:if test="${flash.message}">
	<div class="flashmessage info">
	  ${flash.message}
	</div>
</g:if>

<g:if test="${flash.error}">
	<div class="flashmessage error">
	  ${flash.error}
	</div>
</g:if>

<!-- used for async messaging -->
<div class="asyncmessage success hide">
  
</div>

<div class="asyncmessage error hide">

</div>



