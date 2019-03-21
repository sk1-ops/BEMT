	<div class="md-results-count">${surveys.size} matching result(s)</div>
	<table class="table small-12 md-results">
		<thead>
			<tr class="md-results-row">
				<th width="40"></th>
				<th>Type</th>
				<th>Country</th>
				<th>Model</th>
				<th>Size</th>
				<th>Age</th>
				<th width="100">Practices<br/>Cost Recovery</th>
			</tr>		     				
		</thead>
	<tbody>
		<g:if test="${surveys}">
			<g:each in="${surveys}" status="i" var="s">
				<tr id="row_${s.id}" class="md-results-row">
					<td class="md-detail-toggle"><a href="#" onclick="$(document).triggerHandler('bemt.showmarketdetail', [ ${s.id} ]); return false;"><i class="toggle fa fa-plus-square"></i></a></td>
					<td>${s.inst.name}</td>
					<td>${s.country.name}</td>
					<td>${s.model.name}</td>
					<td>${s.facility.name}</td>
					<td>${s.age}</td>
					<td>${s.costRecovery}</td>
				</tr>
				<tr id="detailrow_${s.id}" class="hide md-details-row">
					<td colspan="7">
					 	<div class="clearfix md-detail-instructions">Click the categories below to view details.</div>
						<div class="clearfix">
								<dl class="tabs vertical" data-tab>
							  <dd class="active"><a href="#panel_${s.id}_1">&#160;View Labor Categories</a></dd>
							  <dd><a href="#panel_${s.id}_2">&#160;View Equipment</a></dd>
							  <dd><a href="#panel_${s.id}_3">&#160;View Specimens/Products</a></dd>
							  <dd><a href="#panel_${s.id}_4">&#160;View Services</a></dd>
							  <!--<dd><a href="#panel_${s.id}_5">&#160;View Other</a></dd>-->
							</dl>
							<div class="tabs-content vertical">
							  <div class="content active" id="panel_${s.id}_1" style="width:100%" bemt-load="/bemt/marketdata/labor/${s.id}">
							  	<div class="md-load-widget">
							  		<i class="fa fa-4x fa-circle-o-notch fa-spin"></i><br/><br/>
							  		loading labor categories...		
							  	</div>
							  </div>
							  <div class="content" id="panel_${s.id}_2" style="width:100%" bemt-load="/bemt/marketdata/equipment/${s.id}">
							  	<div class="md-load-widget">
							  		<i class="fa fa-4x fa-circle-o-notch fa-spin"></i><br/><br/>
							  		loading equipment...		
							  	</div>
							  </div>
							  <div class="content" id="panel_${s.id}_3" style="width:100%" bemt-load="/bemt/marketdata/products/${s.id}">
							  	<div class="md-load-widget">
							  		<i class="fa fa-4x fa-circle-o-notch fa-spin"></i><br/><br/>
							  		loading specimens/products...		
							  	</div>
							  </div>
							  <div class="content" id="panel_${s.id}_4" style="width:100%" bemt-load="/bemt/marketdata/services/${s.id}">
							  	<div class="md-load-widget">
							  		<i class="fa fa-4x fa-circle-o-notch fa-spin"></i><br/><br/>
							  		loading services...		
							  	</div>
							  </div><!--
							  <div class="content" id="panel_${s.id}_5" style="width:100%" bemt-load="/bemt/marketdata/other/${s.id}">
							  	<div class="md-load-widget">
							  		<i class="fa fa-4x fa-circle-o-notch fa-spin"></i><br/><br/>
							  		loading other...		
							  	</div>
							  </div>-->
							</div>
						</div>
						<div class="md-row-sep clearfix"></div>
					</td>
				</tr>
			</g:each>
		</g:if>
		<g:else>
			<tr>
				<td colspan="7">
					<div style="margin:20px auto; width:450px"><g:render template="../components/emptylist" model="['message':'None of the Surveyed Biobanks meet the search criteria.']"></g:render></div>
				</td>
			</tr>
		</g:else>				
	</tbody>
</table>