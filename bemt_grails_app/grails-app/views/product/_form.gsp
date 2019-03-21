<g:hiddenField id="type.id" name="type.id" value="${productType.id}"></g:hiddenField>
<g:hiddenField id="organization.id" name="organization.id" value="${userOrganization.id}"></g:hiddenField>
<div class="row">
<g:if test="${productType.name == 'Specimen/Product'}">
	<div class="small-8 columns">
		<label>${productType.name.capitalize()} Name  (e.g. 5x5x5 OCT Embedded Tumor Specimen) <i class="fa fa-asterisk required_mark"></i></label>
		<div class="row">
			<div class="small-6 columns">
				<g:textField name="name" value="${obj.name}" maxlength="50"></g:textField>
			</div>
		</div>
	</div>
</div>
</g:if>
<g:else>
	<div class="small-4 columns">
		<label>${productType.name.capitalize()} Name <i class="fa fa-asterisk required_mark"></i></label>
		<g:textField name="name" value="${obj.name}" maxlength="50"></g:textField>
	</div>
</g:else>
<div class="row">
	<div class="small-8 columns">
		<h4>${productType.name.capitalize()} Details</h4>
		<div class="form_detail_container">
			<div class="row">
				<div class="small-12 columns">
					<label>${productType.name.capitalize()} Type <i class="fa fa-asterisk required_mark"></i></label>
					<select id="form-laborCategory" name="subtype.id">
						<option value="">Select a Category</option>
				    <g:each in="${subTypes}" var="data">
				    	<g:if test="${data.parent == null}">
				    		<optgroup label="${data.name}">
				    			<g:each in="${subTypes}" var="opt">
				    				<g:if test="${opt.parent?.id == data.id}">
				    					<g:if test="${obj?.subtype?.id == opt.id}">
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
				</div>
			</div>
			<div class="row">
				<div class="small-12 columns">
					<label>Description <i class="fa fa-asterisk required_mark"></i></label>
					<g:textArea id="description" name="description" value="${obj.description}" rows="5"></g:textArea>
				</div>
			</div>
		</div>
	</div>
</div>