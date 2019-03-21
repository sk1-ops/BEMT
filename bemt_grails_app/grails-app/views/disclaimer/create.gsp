<g:set var="pageInitScript" scope="request">Project.initPage();</g:set>
<html>
	<head>
		<meta name="layout" content="../layouts/default"/>
		<title>Disclaimers</title>
	</head>
	<body>
		<!--// header //-->
		<g:render template="header" model="['title':'Fee Schedule Disclaimers', 'bc':'Create']"/>   


		<!--// instructional content //-->
		<div class="row">
     	<div class="small-10 columns">
				<h5>Copy/Paste Example, or Add Your Own</h5>
			</div>
		</div>
    <div class="row">
     	<div class="small-12 columns">
				<g:form url="[resource:obj, action:'save']">
					<div class="ctl-btn-group">
						<g:hiddenField name="version" value="${obj?.version}"/>
						<g:hiddenField name="fee" value="${fee.id}"/>
						<div class="row">
					    <div class="small-8 columns">
				        <label>Disclaimer <i class="fa fa-asterisk required_mark"></i></label>
								<g:textArea id="description" name="description" value="${obj?.description}" rows="4"></g:textArea>
							</div>
						</div>						
						<g:actionSubmit class="save button tiny radius" value="Save"></g:actionSubmit>			
						<bemt:button controller="projectFeeSchedule" action="show" id="${obj.id}" function="return confirm('Are you sure you want to cancel without saving your changes?');">Cancel</bemt:button>
					</div>
				</g:form>
			</div>
		</div>
    <div class="row">
     	<div class="small-12 columns">
     		<h5>Examples Disclaimers to Copy (click <i class="fa fa-copy"></i> to copy)</h5>
     		<ul>
     			<li><a href="#" onclick="$(document).trigger('bemt.copydisclaimer', ['A specimen/product and service request form will need to be submitted for consideration.']);"><i class="fa fa-copy"></i></a> A specimen/product and service request form will need to be submitted for consideration.</li>
					<li><a href="#" onclick="$(document).trigger('bemt.copydisclaimer', ['Costs are exclusive of any shipping and handling, freight, GST, taxes, licensing, etc.']);"><i class="fa fa-copy"></i></a> Costs are exclusive of any shipping and handling, freight, GST, taxes, licensing, etc.</li>
					<li><a href="#" onclick="$(document).trigger('bemt.copydisclaimer', ['End users may need to sign a collaboration agreement, provide proof of funding/payment, sign a material transfer agreement and/or agree to acknowledge the biobank\'s contribution of specimens/products and services in in any future publications.']);"><i class="fa fa-copy"></i></a> End users may need to sign a collaboration agreement, provide proof of funding/payment, sign a material transfer agreement and/or agree to acknowledge the biobank's contribution of specimens/products and services in in any future publications.</li>
					<li><a href="#" onclick="$(document).trigger('bemt.copydisclaimer', ['Fees for specimens/products and services include minimal data sets. Additional fees may apply for custom data sets.']);"><i class="fa fa-copy"></i></a> Fees for specimens/products and services include minimal data sets. Additional fees may apply for custom data sets.</li>
					<li><a href="#" onclick="$(document).trigger('bemt.copydisclaimer', ['Hourly labor rates may vary based on level of experience of the person providing services.']);"><i class="fa fa-copy"></i></a> Hourly labor rates may vary based on level of experience of the person providing services.</li>
					<li><a href="#" onclick="$(document).trigger('bemt.copydisclaimer', ['Pricing is provided in USD.']);"><i class="fa fa-copy"></i></a> Pricing is provided in USD.</li>
					<li><a href="#" onclick="$(document).trigger('bemt.copydisclaimer', ['Requests for rushed or expedited services may incur additional service fees.']);"><i class="fa fa-copy"></i></a> Requests for rushed or expedited services may incur additional service fees.</li>
					<li><a href="#" onclick="$(document).trigger('bemt.copydisclaimer', ['Please inquire about discounts that are available for the following types of customers/end users: (XYZ)']);"><i class="fa fa-copy"></i></a> Please inquire about discounts that are available for the following types of customers/end users: (XYZ)</li>
					<li><a href="#" onclick="$(document).trigger('bemt.copydisclaimer', ['Additional specimens/products and services may be available upon request. Please inquire.']);"><i class="fa fa-copy"></i></a> Additional specimens/products and services may be available upon request. Please inquire.</li>	
					<li><a href="#" onclick="$(document).trigger('bemt.copydisclaimer', ['Pricing is subject to change based on changes in costs, organizational type/market sector, amount, requirements and/or customization of order.']);"><i class="fa fa-copy"></i></a> Pricing is subject to change based on changes in costs, organizational type/market sector, amount, requirements and/or customization of order.</li>
					<li><a href="#" onclick="$(document).trigger('bemt.copydisclaimer', ['Requests for rushed or expedited services may incur additional service fees.']);"><i class="fa fa-copy"></i></a> Requests for rushed or expedited services may incur additional service fees.</li>
					<li><a href="#" onclick="$(document).trigger('bemt.copydisclaimer', ['Specimens/products and services are available for all Researchers with active IRB approval.']);"><i class="fa fa-copy"></i></a> Specimens/products and services are available for all Researchers with active IRB approval.</li>
     		</ul>
     	</div>
     </div>
	</body>
</html>	