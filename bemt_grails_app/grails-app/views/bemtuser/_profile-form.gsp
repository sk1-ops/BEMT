				<g:form url="[resource:obj, action:'update']">
					<g:hiddenField name="version" value="${obj?.version}"/>
					<g:hiddenField name="email" value="${obj?.email}"/>
					<br/>
					<h5><b>E-Mail:</b><br/> ${obj?.email}</h5>
					<br/>
					<label>First Name</label>
					<g:textField name="nameFirst" value="${obj?.nameFirst}" maxlength="20"></g:textField>
					<label>Last Name</label>
					<g:textField name="nameLast" value="${obj?.nameLast}" maxlength="20"></g:textField>

					<div class="ctl-btn-group">
						<g:actionSubmit class="save button tiny radius" action="update" value="Update"></g:actionSubmit>			
					</div>
				</g:form>
