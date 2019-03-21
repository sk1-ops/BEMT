<html>
	<head>
		<meta name="layout" content="../layouts/default"/>
		<title>${obj.name}</title>
	</head>
	<body>

		<g:render template="header" model="['title':'Fee Schedule', 'bc':'Details']"/> 

    <div class="row">
     	<div class="small-8 columns end">
     		<div class="right"><g:link action="edit" id="${obj.id}" data-options="disable_for_touch:true" class="button bemtbutton radius" title="click to edit name and description" data-tooltip aria-haspopup="true">Edit</g:link></div>
				<h5>Name: <b>${obj.name}</b></h5>
				<h5>Description:</h5>
				<p>${obj.description}</p>
     	</div>
    </div>

    <div class="row">
     	<div class="small-10 columns">

     	</div>
    </div>
    <div class="row">
     	<div class="small-11 columns" style="padding-bottom:5px;margin-bottom:5px;border-bottom:1px solid #ddd">
     		<h4><b>Specimens/Products</b></h4>
			</div>
		</div>    
		<g:each in="${productList}" var="p">
			<g:if test="${p.product.type == specimenType}">
		    <div class="row">
		     	<div class="small-8 columns">
						<h5><b>${p.product.name}</b></h5>
						<p>${p.product.description}</p>
		     	</div>
		     		<div class="small-3 end columns" style="text-align:right">
						<h5><b><g:formatNumber number="${p.basePrice}" type="currency" currencyCode="USD" /></b></h5>
		     	</div>
		    </div>
		  </g:if>
	  </g:each>    
    <div class="row">
     	<div class="small-11 columns" style="padding-bottom:5px;margin-bottom:5px;border-bottom:1px solid #ddd">
	     	<h4><b>Services</b></h4>
			</div>
		</div>    
		<g:each in="${productList}" var="p">
			<g:if test="${p.product.type == serviceType}">
		    <div class="row">
		     	<div class="small-8 columns">
						<h5><b>${p.product.name}</b></h5>
						<p>${p.product.description}</p>
		     	</div>
		     	<div class="small-3 end columns" style="text-align:right">
						<h5><b><g:formatNumber number="${p.basePrice}" type="currency" currencyCode="USD" /></b></h5>
		     	</div>
		    </div>
		  </g:if>
	  </g:each>    
	  <br/>
    <div class="row">
     	<div class="small-11 columns" style="padding-bottom:5px;margin-bottom:5px;border-top:1px solid #ddd">
	     	<h5>Disclaimers</h5>
	     	<g:each in="${obj.disclaimers}" var="d" status="i">
	     		<div class="disclaimer"><g:link controller="disclaimer" action="delete" id="${d.id}" class="ctl tip-top" data-options="disable_for_touch:true" data-tooltip="" title="click to remove this disclaimer" onclick="return confirm('Are you sure you want to delete this disclaimer?');"><i class="fa ctl remove fa-times"></i></g:link> ${i+1}. ${d.description}</div>	
	     	</g:each>
	     	<g:link action="create" controller="disclaimer" params="[projectFeeSchedule: obj.id]" class="button bemtbutton radius" title="click to add disclaimer" data-tooltip aria-haspopup="true" data-options="disable_for_touch:true">Add Disclaimer</g:link>
			</div>
		</div>    

	</body>
</html>	