<html>
	<head>
		<meta name="layout" content="../layouts/default"/>
		<title>My Forecast</title>
	</head>
	<body>

		<!--// header //-->
		<g:render template="header" model="['title':'My Forecast']"/> 	
		
		<!--// instructional content //-->
    <div class="row">
     	<div class="small-10 columns">
				<p>The BEMT provides a mechanism to build a three-year forecast based on the labor, equipment, supplies, specimens, products, services, projects, and prices you have entered into the system.</p>
				<p>Click the "Manage Forecast" button to build/modify your forecast. Your forecast is "live" - meaning that any changes you make in your data (e.g. change in salaries, or equipment costs) will automatically be reflected in your forecast. If you choose to "lock" your forecast, you can take a snapshot and review snapshots in the future. Snapshots are locked versions of your forecast. For example, suppose you make a three-year forecast based on the information you have today. Save a snapshot, and then at a later date, as you have new data (such as updated prices of equipment, salaries, etc), you can compare your old forecast to a current one.</p>
			</div>
		</div>
    <div class="row">
     	<div class="small-6 columns">
     		<br/>
     		<br/>
     		<br/>
     		<br/>
     		<br/>
     		<div class="text-center">
	     		<g:link controller="proforma" action="show" class="button radius">Manage Forecast</g:link>
	     	</div>
			</div>
     	<div class="small-6 columns">
     		<h4>Saved Forecast Snapshots</h4>
     		<hr/>
				<g:if test="${snaps}">
					<g:each in="${snaps}" status="i" var="c">
						<div class="snapshotlisting">
							<div class="right delete-snapshot"><g:link controller="snapshot" action="delete" id="${c.id}" class="ctl has-tip" data-tooltip="" data-options="disable_for_touch:true" title="click to remove this Forecast Snapshot" onclick="return confirm('Are you sure you want to delete this snapshot?');"><i class="fa fa-times remove"></i></g:link></div>
							<h5>Snapshot Name: <b><g:link controller="snapshot" action="show" id="${c.id}">${c.name}</g:link></b></h5>
							<div class="date">created: <b><g:formatDate format="MMMM dd, yyyy" date="${c.created}"/></b> at <b><g:formatDate format="h:mm a" date="${c.created}"/></b></div>
							<p>
								<b>Description: </b>
								${c.description}
							</p>
						</div>
					</g:each>
				</g:if>
				<g:else>
					<div class="row">
				   	<div class="small-8 columns">
							<g:render template="../components/emptylist" model="['message':'You haven\'t saved any Forecasts yet.']"></g:render>
						</div>
					</div>
				</g:else>
			</div>
		</div>
	</body>
</html>	