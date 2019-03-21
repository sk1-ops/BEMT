<html>
	<head>
		<meta name="layout" content="../layouts/public"/>
		<title>Password Reset</title>
	</head>
	<body>
		<br/>
		<div class="row">
			<div class="small-12 columns">
				<h3><i class="fa fa-bar-chart-o"></i> Biobank Economic Modeling Tool</h3>
			</div>			
		</div>
    <div class="row">
     	<div class="small-8 columns">
				<g:render template="../components/flashmessage" model="[flash: flash]"/>
				<g:render template="../components/validationerrormessage"/>
			</div>
		</div>			
		
		<div class="row">
			<div class="small-3 columns">&#160;</div>
			<div class="small-5 columns end">
				<h3>Password Reset</h3>
				<g:form controller="public" action="pwreset">
					<g:hiddenField name="token" value="${token}"/>
					<label>New Password</label>
					<input id="password"  name="password" type="password" placeholder="Your password…" autocomplete="off">
					<label>Confirm New Password</label>
					<input id="password_check"  name="password_check" type="password" placeholder="Confirm password…" autocomplete="off">
					<p style="margin-bottom:2px;"><i class="fa fa-question-circle"></i> Password must be least 8 characters in length and contain three of the following:</p>
					<ul>
						<li>uppercase character</li>
						<li>lowercase character</li>
						<li>numeric character</li>
						<li>special character (e.g. !@#$%/)</li>
					</ul>
					<button type="submit" class="button bemtbutton radius">Reset Password</button>
					<button type="reset" class="button secondary bemtbutton radius">Cancel</button><br/>
				</g:form>		
			</div>
		</div>
	</body>
</html>