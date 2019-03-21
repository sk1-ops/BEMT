<html>
	<head>
		<meta name="layout" content="../layouts/default"/>
		<title>${obj.name}</title>
	</head>
	<body>

		<g:render template="header" model="['title':obj.type.name + ': ' + obj.name, 'bc':'Details']"/> 

	  <div class="row">
	   	<div class="small-12 columns">
	   		<br/>
				<bemt:button controller="product" action="edit" id="${obj.id}">Edit</bemt:button>
			</div>
		</div>

    <div class="row">
     	<div class="small-4 columns">
				<h5>Name</h5>
				<p>${obj.name}</p>
     	</div>
     	<div class="small-8 columns">
				<h5>${obj.type.name} Type</h5>
				<p>${obj.subtype.name}</p>
     	</div>
    </div>

    <div class="row">
     	<div class="small-10 columns">
				<h5>Description</h5>
				<p>${obj.description ? obj.description : 'none entered'}</p>
     	</div>
    </div>
	</body>
</html>	