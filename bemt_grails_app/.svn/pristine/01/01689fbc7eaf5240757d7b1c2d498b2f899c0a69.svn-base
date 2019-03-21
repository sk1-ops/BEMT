<html>
	<head>
		<meta name="layout" content="../layouts/default"/>
		<title>My Forecast</title>
	</head>
	<body>
		<!--// header //-->
		<g:render template="header" model="['title':'Add Project to Forecast', 'bc':'Add Project']"/> 	
		
		<!--// instructional content //-->
    <div class="row">
     	<div class="small-10 columns">
				<p>
					
				</p>
			</div>
		</div>
	 	<!--// form //-->
    <div class="row">
     	<div class="small-12 columns">
     		<g:form url="[resource:obj, action:'save']">
     			<g:hiddenField id="proforma.id" name="proforma.id" value="${proforma?.id}"></g:hiddenField>
     			<g:hiddenField id="rev1" name="rev1" value="0.00"></g:hiddenField>
     			<g:hiddenField id="rev2" name="rev2" value="0.00"></g:hiddenField>
     			<g:hiddenField id="rev3" name="rev3" value="0.00"></g:hiddenField>
     			<g:hiddenField id="cost1" name="cost1" value="0.00"></g:hiddenField>
     			<g:hiddenField id="cost2" name="cost2" value="0.00"></g:hiddenField>
     			<g:hiddenField id="cost3" name="cost3" value="0.00"></g:hiddenField>
					<div class="row">
						<div class="small-4 columns">
							<label>Select Project to add to Forecast <i class="fa fa-asterisk required_mark"></i></label>
							<g:select id="project.id" name="project.id" from="${projectList}" optionValue="name" optionKey="id" required="" value="" noSelection="['':'-Choose Project-']"></g:select>
						</div>
					</div>
					<div class="ctl-btn-group">
						<g:actionSubmit class="save button bemtbutton radius" action="save" value="Select Project"></g:actionSubmit>			
						<bemt:button controller="proforma" id="${obj.id}" action="show" function="return confirm('Are you sure you want to cancel without selecting a Project?');">Cancel</bemt:button>
					</div>					
				</g:form>
     	</div>
    </div>
	</body>
</html>	