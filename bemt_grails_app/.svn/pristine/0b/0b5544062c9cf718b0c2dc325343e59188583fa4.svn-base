<html>
	<head>
		<meta name="layout" content="../layouts/default"/>
		<title>${obj.name}</title>
	</head>
	<body>
    <div class="row">
     	<div class="small-10 columns">
				<h2>Cost+ Pricing for: ${obj.name} <i class="fa fa-dollar price"></i></h2>
				<g:render template="../components/flashmessage" model="['flash':flash]"/>
			</div>
		</div>

    <div class="row">
     	<div class="small-6 columns">
				<h2>Cost+ Pricing for: ${obj.name} <i class="fa fa-dollar price"></i></h2>
				<g:render template="../components/flashmessage" model="['flash':flash]"/>
			</div>
     	<div class="small-6 columns">
				<h2>Cost+ Pricing for: ${obj.name} <i class="fa fa-dollar price"></i></h2>
				<g:render template="../components/flashmessage" model="['flash':flash]"/>
			</div>
		</div>


    <div class="row">
     	<div class="small-6 columns">
				<h3>Market Estimate Price</h3>
				<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Nam cursus. Morbi ut mi. Nullam enim leo, egestas id, condimentum at, laoreet mattis, massa. Sed eleifend nonummy diam.</p>
				<h4><b>Market Price:</b> <span id="priceMarket"><g:formatNumber number="${obj.price}" type="currency" currencyCode="USD" /></span></h3>
				<g:form url="[resource:obj]">
					<div class="row collapse">
		        <div class="small-1 columns">
		          <span class="prefix">$</span>
		        </div>
		        <div class="small-2 columns">
		          <input type="text" id="price" name="price" value="${obj.price}" maxlength="6" placeholder="" />
		        </div>
		        <div class="small-1 columns">
		       	</div>
		        <div class="small-8 columns">
		        	<g:actionSubmit class="save button tiny radius" action="setmarketprice" value="Set Market Price"></g:actionSubmit>		
		       	</div>
		      </div>					
		    </g:form>
     	</div>
     	<div class="small-6 columns">
				<h3>Cost+ Price</h3>
				<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Nam cursus. Morbi ut mi. Nullam enim leo, egestas id, condimentum at, laoreet mattis, massa. Sed eleifend nonummy diam.</p>
				<h4><b>Cost+ Price:</b> <span id="costPlusMarket"><g:formatNumber number="${obj.costPlusPrice}" type="currency" currencyCode="USD" /></span></h3>
				<div><bemt:button controller="product" id="${obj.id}" action="costplus">Set Cost+ Price</bemt:button></div>
     	</div>
    </div>
    <br/><br/>
    <div class="row">
     	<div class="small-10 columns">
     		<bemt:button type="back" controller="product" action="index">Return to Product List</bemt:button>
			</div>
		</div>

	</body>
</html>	