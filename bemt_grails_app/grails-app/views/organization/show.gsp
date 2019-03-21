<html>
	<head>
		<meta name="layout" content="../layouts/default"/>
		<title>${obj.name}'s Biobank Profile</title>
	</head>
	<body>
    <div class="row">
     	<div class="small-12 columns">
	     	<br/>
     		<div class="right"><h2><i class="fa fa-briefcase"></i></h2></div>
				<h2>My Biobank Profile </h2>
				<h5><strong>for: </strong> ${obj.name}</h5>
				<g:render template="../components/flashmessage" model="['flash':flash]"/>
			</div>
		</div>
    <div class="row">
     	<div class="small-6 columns">
				<p>
					Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Nam cursus. Morbi ut mi. Nullam enim leo, egestas id, condimentum at, laoreet mattis, massa. Sed eleifend nonummy diam. Praesent mauris ante, elementum et, bibendum at, posuere sit amet, nibh. Duis tincidunt lectus quis dui viverra vestibulum.
				</p>
				<p>
					Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Nam cursus. Morbi ut mi. Nullam enim leo, egestas id, condimentum at, laoreet mattis, massa. Sed eleifend nonummy diam. Praesent mauris ante, elementum et, bibendum at, posuere sit amet, nibh. Duis tincidunt lectus quis dui viverra vestibulum.
				</p>
				<p>
					Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Nam cursus. Morbi ut mi. Nullam enim leo, egestas id, condimentum at, laoreet mattis, massa. Sed eleifend nonummy diam. Praesent mauris ante, elementum et, bibendum at, posuere sit amet, nibh. Duis tincidunt lectus quis
				</p>
			</div>
			<div class="small-6 columns">
				<table width="100%" class="listing">
					<thead>
						<tr>
							<th colspan="3">Overall Completion <g:formatNumber number="${(rTotal/qTotal)*100}" maxFractionDigits="2" roundingModel="HALF_UP"/>%</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td width="50" class="text-center">
								<g:if test="${rTotal == qTotal}">
									<i class="fa fa-check green font125"></i>
								</g:if>
								<g:else>
									<i class="fa fa-times red font125"></i>
								</g:else>								 
							</td>
							<td class="text-center">${rTotal}/${qTotal} questions answered</td>
							<td class="text-center">
								<g:link controller="questionnaire" action="edit" id="${obj.biobankprofile.id}">
									<g:if test="${rTotal == qTotal}">
										Review/Change Answers
									</g:if>
									<g:else>
										Answer All Questions
									</g:else>			
								</g:link>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>

	</body>
</html>