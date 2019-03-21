<html>
	<head>
		<meta name="layout" content="../layouts/default"/>
		<title>My Forecast</title>
	</head>
	<body>

		<!--// header //-->
		<g:render template="header" model="['title':'Create Forecast Snapshot', 'bc':'Create Snapshot']"/> 	
		
		<!--// instructional content //-->
    <div class="row">
     	<div class="small-10 columns">
				<p>Create this snapshot to save a static forecast that cannot be changed. Snapshot data is read only. This is worth doing to lock a forecast for future reference. As you modify your primary forecast, this snapshot will not change.</p>
	    </div>
	 	</div>
		
	 	<!--// form //-->
    <div class="row">
     	<div class="small-12 columns">	 	
				<g:form url="[resource:obj, action:'save']">
	     		<div class="form_required"><i class="fa fa-asterisk required_mark"></i> denotes required field</div>
					<g:render template="form"/>
					<div class="ctl-btn-group">
						<g:actionSubmit class="save button bemtbutton radius" action="save" value="Save"></g:actionSubmit>			
						<bemt:button controller="proforma" action="show" function="return confirm('Are you sure you want to cancel without saving a snapshot?');">Cancel</bemt:button>
					</div>
				</g:form>
			</div>
		</div>
	</body>
</html>	