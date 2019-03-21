		<div class="row">
			<div class="small-8 columns end">
				<p>The following Equipment fields have been populated from the selected Market Data, please review and modify them if necessary before clicking "Save".</p>
			</div>
		</div>

    <div class="row">
     	<div class="small-7 columns">
				<g:if test="${obj.type.toLowerCase() == 'leased'}">
					<ol>
						<li>"Annual Billable Hours" is meant to help determine the true costs of using equipment.  For example, a piece of equipment that has a lease cost of $10,000 per year and 2000 Annual Billable Hours costs $5 per hour to use ($10,000 divided by 2000 hours).  </li>
						<li><b>Annual Billable Hours:</b> represents how many hours per year you believe the equipment can be used to support the biobank.  For example, if your biobank operates only business hours (40 hours per week) than the annual Billable Hours would be 2080 (52 weeks * 40 hours per week).  If your biobank runs 24 hours per day, 7 days per week, than your Annual Billable Hours should be 8736 (52 weeks * 7 days per week * 24 hours per day).</li>
						<li><b>Annual Service Contract:</b> is meant to complete the total cost of ownership of this equipment (added to the annual lease costs).  This could include Maintenance Agreements, expected costs of fixing the equipment to maintain its usable per year – this is your expected annual maintenance expense for this type of equipment.</li>
					</ol>
				</g:if>
				<g:elseif test="${obj.type.toLowerCase() == 'purchased'}">
					<ol>
						<li>“Usable Life” and “Annual Billable Hours” are meant to work together to help determine the true costs of using equipment.  For example, a $100,000 piece of equipment that has a usable life of 10 years, and annual billable hours of 2000, costs $5 per hour to use ($100,000 divided by 10 years divided by 2000 hours).</li>
						<li><b>Usable Life:</b> is an estimate of how long the equipment is expected to be used in production. </li>
						<li><b>Annual Billable Hours:</b> represents how many hours per year you believe the equipment can be used to support the biobank.  For example, if your biobank operates only business hours (40 hours per week) than the annual Billable Hours would be 2080 (52 weeks * 40 hours per week).  If your biobank runs 24 hours per day, 7 days per week, than your Annual Billable Hours should be 8736 (52 weeks * 7 days per week * 24 hours per day).</li>
						<li><b>Annual service contract:</b> is meant to complete the total cost of ownership of this equipment (this is added to the calculated annual cost of the equipment, over its useful life). Your expected annual maintenance expense may include maintenance agreements, and the costs of fixing equipment to maintain its use per year. If the equipment does not have a service contract, enter "0" in the service contract amount field.</li>
					</ol>
				</g:elseif>
     	</div>
     	<div class="small-5 columns">
				<g:formRemote name="equipment_copy" url="[resource:obj, action:'savecopy']" onSuccess="BEMT.handleAsyncSuccess(data); \$(document).trigger('bemt.copydone');" onFailure="BEMT.handleAsyncError(XMLHttpRequest,textStatus,errorThrown);" id="equip_form">				
	     		<div class="form_required"><i class="fa fa-asterisk required_mark"></i> denotes required field</div>
					<g:if test="${obj.type.toLowerCase() == 'leased'}">
						<g:render template="copyform_lease"/>
					</g:if>
					<g:elseif test="${obj.type.toLowerCase() == 'purchased'}">
						<g:render template="copyform_purchase"/>
					</g:elseif>
					<div class="ctl-btn-group">
						<g:actionSubmit class="save button tiny radius" value="Save"></g:actionSubmit>
						<bemt:button function="if(confirm('Are you sure you want to cancel without saving your new Labor Category?')) {\$(document).trigger('bemt.copydone');};">Cancel</bemt:button>
					</div>
				</g:formRemote>
			</div>
		</div>