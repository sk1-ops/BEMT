					<g:hiddenField name="version" value="${obj?.version}"/>
					<g:hiddenField id="organization.id" name="organization.id" value="${session.org.id}"></g:hiddenField>

					<div class="row">
						<div class="small-12 columns">
							<label>Category Name <i class="fa fa-asterisk required_mark"></i></label>
							<select id="form-laborCategory" name="category.id" onchange="Labor.changeCategory(this);">
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
				    <div class="small-6 columns">
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
				    <div class="small-4 columns">
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
