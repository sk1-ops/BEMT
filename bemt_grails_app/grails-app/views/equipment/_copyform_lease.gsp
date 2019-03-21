					<g:hiddenField name="version" value="${obj?.version}"/>
					<g:hiddenField id="organization.id" name="organization.id" value="${session.org.id}"></g:hiddenField>
					<g:hiddenField id="type" name="type" value="${obj.type}"></g:hiddenField>
					
					<div class="row">
						<div class="small-12 columns">
							<label>Equipment Type</label>
							<select name="equip.id" id="form-equipCategory">
								<option value="">Select Equipment Type</option>
							    <g:each in="${objTypes}" var="data">
							    	<g:if test="${data.parent == null}">
							    		<optgroup label="${data.name}">
							    			<g:each in="${objTypes}" var="opt">
							    				<g:if test="${opt.parent?.id == data.id}">
							    					<g:if test="${obj?.equip?.id == opt.id}">
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
							<label>Name of Leased Equipment <i class="fa fa-asterisk required_mark"></i></label>
		          <input type="text" name="name" value="${obj.name}" id="form-equipName" maxlength="50"/>						
						</div>
					</div>
					<!-- purchase price -->
					<div class="row">
				    <div class="small-6 columns">
			        <label>Annual Lease Cost ($) <i class="fa fa-asterisk required_mark"></i></label>
				      <div class="row collapse">
				        <div class="small-2 columns">
				          <span class="prefix">$</span>
				        </div>
				        <div class="small-5 columns">
				          <input type="text" id="cost" name="cost" value="${obj.cost ? obj.cost : 12000}" maxlength="7" placeholder="" />
				        </div>
				        <div class="small-2 columns">
				          <span class="postfix">.00</span>
				        </div>
		        		<div class="small-3 columns">
				          &#160;
				        </div>					        
				      </div>
				    </div>
						<div class="small-6 columns">
							<label>Lease Duration (yrs) <i class="fa fa-asterisk required_mark"></i></label>
							<div class="row">
				    		<div class="small-5 columns">								
									<g:select id="usableLife" name="usableLife" from="${1..25}" optionKey="value" required="" value="${obj?.usableLife}" class="one-to-one"></g:select>
								</div>
							</div>
						</div>
						<div class="small-6 columns">&#160;</div>				    
				  </div>


					<div class="row">
				    <div class="small-6 columns">
			        <label>Annual Service Contract <i class="fa fa-asterisk required_mark"></i></label>
				      <div class="row collapse">
				        <div class="small-2 columns">
				          <span class="prefix">$</span>
				        </div>
				        <div class="small-5 columns">
				          <input type="text" name="annualServiceContract" value="${obj.annualServiceContract ? obj.annualServiceContract : 0 }" maxlength="6" placeholder="" />
				        </div>
				        <div class="small-2 columns">
				          <span class="postfix">.00</span>
				        </div>
		        		<div class="small-3 columns">
				          &#160;
				        </div>				        
				      </div>	
				    </div>
						<div class="small-6 columns">
							<label>Annual Billable Hours <i class="fa fa-asterisk required_mark"></i></label>
							<div class="row">
				    		<div class="small-5 columns">
				    			<input type="text" name="annualBillableHours" value="${obj.annualBillableHours ? obj.annualBillableHours : 2000}" maxlength="4" placeholder="2000" />
				    		</div>
				    	</div>
						</div>
						<div class="small-6 columns">&#160;</div>				    
				  </div>	
