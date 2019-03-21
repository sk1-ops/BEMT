
<g:formRemote name="labor_copy" url="[resource:obj, action:'savecopy']" onSuccess="BEMT.handleAsyncSuccess(data); \$(document).trigger('bemt.copydone');" onFailure="BEMT.handleAsyncError(XMLHttpRequest,textStatus,errorThrown);" id="labor_form">
		<div class="row">
			<div class="small-offset-3 small-6 columns end">
				<p>The following Labor Category fields have been populated from the selected Market Data, please review and modify them if necessary before clicking "Save".</p>
				<div class="form_required"><i class="fa fa-asterisk required_mark"></i> denotes required field</div>
				<g:hiddenField name="version" value="${obj?.version}"/>
				<g:hiddenField id="organization.id" name="organization.id" value="${session.org.id}"/>
			</div>
		</div>
		<div class="row">
			<div class="small-offset-3 small-6 columns end">
				<label>Category Name <i class="fa fa-asterisk required_mark"></i></label>
				<select id="form-laborCategory" name="category.id" onchange="">
					<option value="">Select a Labor Category</option>
				    <g:each in="${laborTypes}" var="data">
				    	<g:if test="${data.parent == null}">
				    		<optgroup label="${data.name}">
				    			<g:each in="${laborTypes}" var="opt">
				    				<g:if test="${opt.parent?.id == data.id}">
				    					<g:if test="${obj?.category?.id == opt.id}">
								        <option selected="selected" value="${opt.id}">${opt.name}</option>
								      </g:if>
							       	<g:else>
												<option value="${opt.id}">${opt.name}</option>
								      </g:else>
										</g:if>
									</g:each>
					    	</optgroup>
					    </g:if>
				    </g:each>
				</select>
				<label>Title (e.g. "Senior Lab Tech") <i class="fa fa-asterisk required_mark"></i></label>
        <input type="text" name="name" value="${obj.name}" id="form-laborName" maxlength="50"/>
			</div>
		</div>
		<div class="row">
	    <div class="small-offset-3 small-3 columns">
	      <div class="row collapse">
	        <label>Annualized Salary ($) <i class="fa fa-asterisk required_mark"></i></label>
	        <div class="small-2 columns">
	          <span class="prefix">$</span>
	        </div>
	        <div class="small-8 columns">
	          <input type="text" name="annualSalary" value="${obj.annualSalary ? obj.annualSalary : 48000}" maxlength="7" />
	        </div>
	        <div class="small-2 columns">
	          <span class="postfix">.00</span>
	        </div>
	      </div>
	    </div>
	    <div class="small-3 columns end">
	      <div class="row collapse">
	        <label>Fringe Benefit (%) <i class="fa fa-asterisk required_mark"></i></label>
	        <div class="small-5 columns">
	          <input type="text" name="benefitPercent" value="${obj.benefitPercent ? obj.benefitPercent : 10}" maxlength="3" />
	        </div>
	        <div class="small-2 columns">
	          <span class="postfix">%</span>
	        </div>
	        <div class="small-5 columns"></div>
	      </div>
	    </div>
	    <div class="small-5 columns"></div>			    
	  </div>
		<div class="row">
			<div class="small-offset-3 small-6 columns end">
				<div class="ctl-btn-group">
					<g:actionSubmit class="save button tiny radius"  value="Save"></g:actionSubmit>
					<bemt:button function="if(confirm('Are you sure you want to cancel without saving your new Labor Category?')) {\$(document).trigger('bemt.copydone');};">Cancel</bemt:button>
				</div>
			</div>
		</div>
</g:formRemote>
