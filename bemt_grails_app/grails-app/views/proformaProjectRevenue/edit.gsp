<html>
	<head>
		<meta name="layout" content="../layouts/default"/>
		<title>Other Project Revenue</title>
	</head>
	<body>

		<!--// header //-->
		<g:render template="header" model="['page':'proforma', 'title':'Other Project Revenue', 'bc':'Project', 'bcId':obj.proformaproject.id]"/> 	

		<!--// instructional content //-->
    <div class="row">
     	<div class="small-10 columns">
				<p>
					
				</p>				
			</div>
		</div>

		<div class="row">
			<div class="small-7 columns">
				<g:form url="[resource:obj, action:'update']">
					<g:render template="form"/>
					<g:actionSubmit class="save button bemtbutton radius" action="update" id="{$obj.id}" value="Save Project Revenue"></g:actionSubmit>			
					<bemt:button controller="proforma" action="show" function="return confirm('Are you sure you want to cancel without updating the forecast?');">Cancel</bemt:button>
			    </g:form>
				</div>
			</div>
     	<div class="small-5 columns">
			</div>
		</div>			
	</body>
</html>	