<g:set var="pageInitScript" scope="request">
	Marketdata.initPage();
	Marketdata.initCharts();
</g:set>
<html>
	<head>
		<meta name="layout" content="../layouts/default"/>
		<title>About Survey | Summary Data</title>
	</head>
	<body>
		<div class="row full-width marketdata">	
 			<div class="small-12 columns">
 				<h2>Summary Data</h2>
 				<p>This is some information about the survey and what was captured and shown.  Select from the categories below to see visuals of survey data.  To Search Market Data, <g:link action="index">click here.</g:link></p>
				<dl class="sub-nav" id="chart_nav">
				  <dt>Categories:</dt>
				  <dd class="active" id="chart_nav1"><a href="#" onclick="Marketdata.showChartList(1); return false;">Profile of Survey Biobanks</a></dd>
				  <dd id="chart_nav2"><a href="#" onclick="Marketdata.showChartList(2); return false;">Biobank Spending</a></dd>
				  <dd id="chart_nav3"><a href="#" onclick="Marketdata.showChartList(3); return false;">Cost Recovery</a></dd>
				</dl>	     				
 			</div>
		</div>
 		<g:render template="charts/chart_list1"/>
 		<g:render template="charts/chart_list2"/>
 		<g:render template="charts/chart_list3"/>

	</body>
</html>