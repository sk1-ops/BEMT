					<g:hiddenField name="version" value="${obj?.version}"/>
					<g:hiddenField id="organization.id" name="organization.id" value="${userOrganization.id}"></g:hiddenField>

					<div class="row">
						<div class="small-4 columns">
							<label>Project Name <i class="fa fa-asterisk required_mark"></i></label>
							<g:textField name="name" value="${obj.name}" maxlength="50"></g:textField>
						</div>
					</div>
					<div class="row">
				    <div class="small-6 columns">
			        <label>Description <i class="fa fa-asterisk required_mark"></i></label>
			        <!--<p class="example">example: "This would be a good example of a description so that the user knows what he/she should be entering"</p>-->
							<g:textArea id="description" name="description" value="${obj.description}" rows="4"></g:textArea>
						</div>
					</div>
					<div class="row">
						<div class="small-6 columns">
							<h5><b>Specimen Products</b></h5>
							<p>Select any that are part of this Project</p>
							<g:if test="${specimenList}">
								<g:each in="${specimenList}" var="p">
									<g:checkBox name="includedproducts" value="${p.id}" checked="${p in obj?.products?.product}"/>&#160;<%= p.name%><br/>
								</g:each>		
							</g:if>
							<g:else>
								<g:render template="../components/emptylist" model="['message':'You haven\'t created any Specimen Products yet.']"></g:render>							
							</g:else>									
					
						</div>
				    <div class="small-6 columns">
							<h5><b>Service Offerings</b></h5>
							<p>Select any that are part of this Project</p>
							<g:if test="${serviceList}">
								<g:each in="${serviceList}" var="p">
									<g:checkBox name="includedproducts" value="${p.id}" checked="${p in obj?.products?.product}"/>&#160;<%= p.name%><br/>
								</g:each>	
							</g:if>
							<g:else>
								<g:render template="../components/emptylist" model="['message':'You haven\'t created any Service Offerings yet.']"></g:render>							
							</g:else>						    							
						</div>
					</div>
					<br/>				
