<g:set var="pageInitScript" scope="request">Marketdata.initPage();</g:set>
<html>
	<head>
		<meta name="layout" content="../layouts/default"/>
		<title>Review Data | Market Data</title>
	</head>
	<body>
		<g:render template="../components/flashmessage" model="[flash: flash]"/>
					
		<g:form action="search">
    <div class="row full-width marketdata">
     	<div class="small-12 columns">
     		<div class="search-controls">
     			<div class="row">
     				<div class="columns small-2">
				     	<div class="search-control border">
				     		<label><b>Institution Type</b></label>
				     		<g:select id="surveyform_institutions" size="4" name="institutionType" from="${institutionTypes}" multiple="true" optionKey="id" optionValue="name" required="" value=""></g:select>
				     	</div>
				     </div>
     				<div class="columns small-2">
				     	<div class="search-control border">
				     		<label><b>Country</b></label>
				     		<g:select id="surveyform_country" size="4" name="country" from="${countries}" multiple="true" optionKey="id" optionValue="name" required="" value=""></g:select>
				     	</div>
				    </div>
     				<div class="columns small-2">
				     	<div class="search-control border single-select">
				     		<label><b>Labor</b></label>
				     		<g:select id="surveyform_labor" size="1" name="labor" from="${laborTypes}" optionKey="id" optionValue="name" required="" value=""></g:select>
				     	</div>
				     	<div class="search-control border single-select">
				     		<label><b>Equipment</b></label>
				     		<g:select id="surveyform_equipment" size="1" name="equipment" from="${equipTypes}" optionKey="id" optionValue="name" required="" value=""></g:select>
				     	</div>
				    </div>
     				<div class="columns small-3">
				     	<div class="search-control border single-select">
				     		<label><b>Specimens and Products</b></label>
				     		<g:select id="surveyform_product" size="1" name="product" from="${productTypes}" optionKey="id" optionValue="name" required="" value=""></g:select>
				     	</div>
				     	<div class="search-control border single-select">
				     		<label><b>Services</b></label>
				     		<g:select id="surveyform_service" size="1" name="service" from="${serviceTypes}" optionKey="id" optionValue="name" required="" value=""></g:select>
				     	</div>
				    </div>
     				<div class="columns small-3">
				     	<div class="search-control">
					     	<label><b>Years of Operation (Age)</b></label>
				     		<div class="row collapse">
				     			<div class="small-1 columns">&#160;</div>
				     			<div class="small-3 columns" style="">
				     				<select name="ageMin">
					     				<option selected="selected">0</option>
				     					<g:each in="${1..maxAge}" var="c">
						     				<option>${c}</option>
					     				</g:each>
				     				</select>
				     			</div>
				     			<div class="small-2 columns" style="text-align:center;padding-top:6px;">to</div>
				     			<div class="small-3 columns" style="">
				     				<select name="ageMax">
				     					<g:each in="${0..maxAge-1}" var="c">
						     				<option>${c}</option>
					     				</g:each>
					     				<option selected="selected">${maxAge}</option>
				     				</select>
				     			</div>
				     			<div class="small-3 columns" style="padding-top:6px;">&#160;years</div>
				     		</div>
				     	</div>
				     	<div class="search-control border" style="margin-top:10px">
				     		<label for="checkbox1"><b><span style="font-size:0.9em">Only show biobanks that practice cost recovery?</span></b>&#160;&#160;<input name="practicecr" type="checkbox"></label>
				     	</div>				     	
				    </div>
				  </div>
				  <div class="row full-width">
				    <div class="columns small-6">
				    </div>
				    <div class="columns small-6">
	  		     	<div class="search-buttons">
		  		     	<g:submitToRemote action="search" before="" class="button radius tiny" onSuccess="Marketdata.showResults(data);" onFailure="BEMT.handleAsyncError(XMLHttpRequest,textStatus,errorThrown);" value="Search"/>									
				     		<input type='reset' class="button secondary radius tiny" value='Reset' onclick="$(document).triggerHandler('bemt.resetmarketsearch');"/>
				     	</div>
				    </div>
				  </div>		    
     		</div>
			</div>
		</div>
		</g:form>
		<div class="row row full-width marketdata" style="">
 			<div class="small-12 columns" id="search-results">
			</div>
		</div>
	</body>
</html>