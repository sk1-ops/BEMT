<html>
	<head>
		<meta name="layout" content="../layouts/default"/>
		<title>Project | ${obj.name}</title>
	</head>
	<body>

		<g:render template="header" model="['title':'Project: ' + obj.name, 'bc':'Details']"/> 

		<!--// instructional content //-->
	  <div class="row">
	   	<div class="small-12 columns">
	   		<br/>
				<bemt:button controller="project" action="edit" id="${obj.id}">Edit</bemt:button>
			</div>
		</div>

    <div class="row">
     	<div class="small-6 columns">
				<h5>Description</h5>
				<p>${obj.description}</p>
     	</div>
    </div>
    <div class="row">
     	<div class="small-6 columns">
				<h5>Specimen Products</h5>
				<g:each in="${specimenList}" status="i" var="p">
					<p><i class="fa fa-archive"></i> ${p.name}</p>
				</g:each>
     	</div>
     	<div class="small-6 columns">
				<h5>Service Products</h5>
				<g:each in="${serviceList}" status="i" var="p">
					<p><i class="fa fa-archive"></i> ${p.name}</p>
				</g:each>
     	</div>
    </div>
	</body>
</html>	