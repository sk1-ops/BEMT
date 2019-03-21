					<!--// hidden fields //-->
					<g:hiddenField id="organization.id" name="organization.id" value="${userOrganization.id}"></g:hiddenField>

					<div class="row">
						<div class="small-8 columns">
							<label>Supply Type <i class="fa fa-asterisk required_mark"></i></label>
							<select id="form-supplyType" name="type" onchange="Labor.changeCategory(this);">
								<option value="">Select a Supply Type</option>
							    <g:each in="${supplyTypes}" var="data">
							    	<g:if test="${data.parent == null}">
							    		<optgroup label="${data.name}">
							    			<g:each in="${supplyTypes}" var="opt">
							    				<g:if test="${opt.parent?.id == data.id}">
							    					<g:if test="${obj?.type?.id == opt.id}">
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
						<div class="small-4 columns">
							<label>Name <i class="fa fa-asterisk required_mark"></i> </label>
							<g:textField name="name" value="${obj.name}" maxlength="50"></g:textField>
						</div>
					</div>

				  <!-- useable life -->
					<div class="row">
						<div class="small-2 columns">
							<label>Units <i class="fa fa-asterisk required_mark"></i> </label>
							<input type="text" name="units" value="${obj.units ? obj.units : 'ounce'}" maxlength="20" placeholder="" />
						</div>
						<div class="small-3 columns">
				      <div class="row collapse">
				        <label>Cost Per Unit <i class="fa fa-asterisk required_mark"></i> </label>
				        <div class="small-2 columns">
				          <span class="prefix">$</span>
				        </div>
				        <div class="small-5 columns">
				          <input type="text" name="unitPrice" value="${obj.unitPrice ? obj.unitPrice : 1.50}" maxlength="6" placeholder="1.50" />
				        </div>
				        <div class="small-5 columns">
				        	&#160;
				       	</div>
				      </div>	
						</div>
						<div class="small-7 columns">
						</div>
					</div>					
					