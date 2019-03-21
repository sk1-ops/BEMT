<html>
	<head>
		<meta name="layout" content="../layouts/default"/>
		<title>${obj.name}</title>
	</head>
	<body onload="calculateMargin();">
		<!--// header //-->
		<g:render template="headeralt" model="['title':'Unit Costing: ' + obj.name.capitalize(), 'bc':'Unit Costing']"/>    

		<!--// instructional content //-->
    <div class="row">
     	<div class="small-10 columns">
				<p>Determining the unit cost of specimen/product and/or service provision is an essential element of financial planning and maximizing cost recovery. The more thorough you are in defining costs now (both direct and indirect), the greater percentage of costs you'll recover later. There are 4 types of direct costs you are asked to consider here: cogs/lab supplies, allocated labor and equipment costs, as well as any other direct costs (e.g. flat fees).</p>
	    </div>
	 	</div>

		<g:form url="[resource:obj, action:'']" id="product_form">

		 	<div class="row">
	     	<div class="small-6 columns">
					<h3>Product Details</h3>
					<div class="cp-proddetail clearfix">
						<div class="labeltag">Name:</div> 
						<div class="value">${obj.name}</div>
					</div>
					<br/>
					<div class="cp-proddetail clearfix">
						<div class="labeltag">Description:</div> 
						<div class="value">${obj.description}</div>
					</div>
	     	</div>
	     	<div class="small-6 columns">     		
					<h3>Unit Cost</h3>
					<h5><b>Step 1: Specify Direct Costs</b></h5>  		
					<table class="listing" width="100%">
						<thead>
							<tr>
								<th>Cost</th>
								<th width="105" class="text-center">Amount</th>
								<th width="50" class="text-center"></th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td><span data-tooltip aria-haspopup="true"  class="has-tip" data-options="disable_for_touch:true" title="Supplies that are used or consumed in the production of specimen/products or the delivery of services. "><i class="fa fa-question-circle"></i> Cost of Goods Sold (COGS) - Supplies</span></td>
								<td class="text-center"><g:formatNumber number="${totalCOGS}" type="currency" currencyCode="USD" /></td>
								<td class="text-center"><g:link action="pricecogs" id="${obj.id}" class="ctl"><i class="fa fa-pencil edit" title="click to calculate Supply costs" data-options="disable_for_touch:true" data-tooltip aria-haspopup="true"></i></g:link></td>	
							</tr>
							<tr>
								<td><span data-tooltip aria-haspopup="true"  class="has-tip" data-options="disable_for_touch:true" title="Fixed costs that are allocated for each individual unit of a product or service. "><i class="fa fa-question-circle"></i> Allocated Expenses (Labor &amp; Equipment)</span></td>
								<td class="text-center"><g:formatNumber number="${totalAllocated}" type="currency" currencyCode="USD" /></td>
								<td class="text-center"><g:link action="priceallocated" id="${obj.id}" class="ctl"><i class="fa fa-pencil edit" title="click to calculate Allocated Expenses" data-options="disable_for_touch:true" data-tooltip aria-haspopup="true"></i></g:link></td>	
							</tr>
							<tr>
								<td>Other Costs</td>
								<td class="text-center"><g:formatNumber number="${totalOther}" type="currency" currencyCode="USD" /></td>
								<td class="text-center"><g:link action="priceother" id="${obj.id}" class="ctl"><i class="fa fa-pencil edit" title="click to calculate other costs" data-options="disable_for_touch:true" data-tooltip aria-haspopup="true"></i></g:link></td>	
							</tr>
							<tr>
								<td align="right"><b>Total Direct Costs</b></td>
								<td class="text-center"><b>$<span id="calcCost"><g:formatNumber number="${totalCOGS + totalAllocated + totalOther}" minFractionDigits="2" maxFractionDigits="2"/></span></b></td>
								<td class="text-center"></td>	
							</tr>
						</tbody>
					</table>
					<h5><b>Step 2: Specify Indirect Costs</b></h5>  		   		

					<div class="row" style="margin-bottom:10px;">
						<div class="small-4 columns">
							<h5>Indirect Costs: <br/><span style="font-size:0.8em" data-options="disable_for_touch:true" data-tooltip aria-haspopup="true" title="Many institutions have a standard indirect rate that can be applied on top of direct costs.<br/> If you know your indirect rate or can estimate one, add it here to reflect the costs associated with overhead.">(what's this <i class="fa fa-question-circle"></i>)</span></h5>
						</div>
						<div class="small-5 columns">
		        	<div id="indirect"><h5><b><span id="display_indirect"><g:formatNumber number="${obj.indirectPercent}" minFractionDigits="2" maxFractionDigits="2"/>% / $<g:formatNumber number="${obj.indirect}" minFractionDigits="2" maxFractionDigits="2"/></span></b> <a href="#" class="ctl" style="font-size:1.0em" onclick="Product.editIndirect();"><i class="fa fa-pencil edit" title="click to specify an ongoing supply fee." data-options="disable_for_touch:true" data-tooltip aria-haspopup="true"></i></a></h5></div>

							<div id="edit_indirect" class="row collapse hide">
				        <div class="small-5 columns">
				          <input type="text" style="margin:0" value="${obj.indirectPercent}" id="entry_indirectPercent" onchange="Product.changeIndirect();" maxlength="6">
				        </div>
				        <div class="small-2 columns">
				          <span class="postfix radius">%</span>
				        </div>
				        <div class="small-5 columns">				        	
				        </div>
				      </div>			        
						</div>
						<div id="form_indirect" class="small-3 columns hide" style="padding-top:6px;">
							<g:form action="updateindirect" id="form_${obj.id}" name="form_${obj.id}">
								<g:hiddenField name="indirectPercent" id="form_entry_indirectPercent" value="${obj.indirectPercent}"/>								
						    <g:submitToRemote before="if(!Product.checkIndirect()) return false;" class="button alert save_indirect radius" url="[resource: obj, action: 'updateindirect']" onSuccess="Product.updateIndirect(data);" onFailure="BEMT.handleAsyncError(XMLHttpRequest,textStatus,errorThrown);" value="Save"/>									
								<a class="button secondary save_indirect radius" onclick="Product.cancelIndirectEdit();">Cancel</a> 
							</g:form>							
						</div>
					</div>
 				<div class="row" style="border-top:1px solid #ccc">
					<div class="small-6 columns" style="text-align:right">					
						<h5>Unit Cost:</h5>
					</div>
					<div class="small-6 columns">
						<h5><b>$ <span id="display_unitCost"><g:formatNumber number="${obj.unitCost}" minFractionDigits="2" maxFractionDigits="2"/></span></b></h5>
					</div>
				</div>

				</div>											
			</div>
		</g:form>
	</body>
</html>	