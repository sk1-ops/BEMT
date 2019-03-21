    <div class="row">
     	<div class="small-12 columns">
     		<br/>
     		<g:if test="${bc}">
	     		<div class="bemt-breadcrumb">
						<g:if test="${page == 'labor'}">	     		
			     		<g:link controller="proforma" action="showlabor">&larr; Back to Labor Summary</g:link> / ${bc}
			     	</g:if>
						<g:elseif test="${page == 'equipment'}">	     		
			     		<g:link controller="proforma" action="showequipment">&larr; Back to Equipment Summary</g:link> / ${bc}
			     	</g:elseif>
						<g:elseif test="${page == 'summary'}">	     		
							<g:link controller="proforma" action="show">&larr; Back to Forecast Summary</g:link> / ${bc}						
						</g:elseif>
						<g:else>
							<g:link action="index">&larr; Back to My Forecast</g:link> / ${bc}
						</g:else>
		     	</div>
		     	<br/>
		    </g:if>
     		<div class="right"><h2><i class="fa fa-line-chart"></i></h2></div>
     		<h5 class="biobank-header">Biobank: <%= session.org.name%></h5>
				<h2>${title}</h2>
			</div>
		</div>
    <div class="row">
     	<div class="small-8 columns">
				<g:render template="../components/flashmessage" model="[flash: flash]"/>
				<g:render template="../components/validationerrormessage" model="[bean: proforma]"/>
			</div>
		</div>	


