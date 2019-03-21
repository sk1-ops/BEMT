				<g:form url="[resource:obj, action:'change_password']" id="password_form">
					<g:hiddenField name="version" value="${obj?.version}"/>
					<g:hiddenField name="email" value="${obj?.email}"/>
					<label>Current Password</label>
					<g:passwordField id="current_password" name="current_password" value="" autocomplete="off"></g:passwordField>
					<label>New Password</label>
					<g:passwordField id="new_password" name="new_password" value="" autocomplete="off"></g:passwordField>
					<label>Confirm New Password</label>
					<g:passwordField id="new_password_confirm" name="new_password_confirm" value="" autocomplete="off"></g:passwordField>
					<div class="ctl-btn-group">
						<g:actionSubmit class="save button alert tiny radius" action="change_password" value="Change Password"></g:actionSubmit>			
					</div>
				</g:form>