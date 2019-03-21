<html>
	<head>
		<meta name="layout" content="../layouts/default"/>
		<title>Home</title>
	</head>
	<body>
		<br/>
    <div class="row">
     	<div class="small-12 columns">
				<h2>My Biobank Dashboard (Home Page)</h2>
			</div>
		</div>
    <div class="row">
     	<div class="small-12 columns">
				<g:render template="../components/flashmessage" model="['flash':flash]"/>
				<p>
Start by clicking “Create a Biobank.”  When doing so, you are asked whether you want to “Copy the Template Biobank”.  The Template Biobank is a hypothetical 
biobank with economic model data pre-loaded in the BEMT.  We recommend that the first biobank you create should be a copy of this template – use it to 
navigate and get comfortable using the BEMT, and then decide whether you want to start from scratch or build/modify from it.
<br/><br/>
You can create as many biobanks as you want in the BEMT, but only one is “selected” at a time.  The “selected biobank” is the one you can modify.  
Use this page to add biobank profiles and to go through the BEMT economic modeling steps while monitoring your progress along the way.   
For your selected biobank, each step is an indicator of your progress and a link to a page where you can manage your economic model data.

                                </p>
				<p style="font-weight:bold;font-size:1.25em;">
? For Help, click the following links: </p>
<table>
    <tr>
        <td><a href="/bemt/guides/bemt_quickstart.pdf">Quick Start Guide</a></td>
        <td><a href="/bemt/guides/bemt_systempreview.pdf">System Preview (Screenshots)</a></td>
    </tr>
    <tr>
        <td><a href="/bemt/guides/bemt_helpguide.pdf">Complete Help Guide</a></td>
        <td><a href="/bemt/guides/bemt_glossary.pdf">Glossary</a></td>
    </tr>
</table>    



				<g:if test="${objList}">
					<div class="ctl-btn-group">
						<bemt:button type="new" action="create" controller="organization" title="Click to create another Biobank under your account.">Create another Biobank</bemt:button>
					</div>
				</g:if>
				<g:else>
					<div class="ctl-btn-group">
						<bemt:button type="new" action="create" controller="organization" title="Click to create a Biobank under your account.">Create a Biobank</bemt:button>
					</div>
				</g:else>
			</div>
		</div>
		<g:if test="${objList}">
	    <div class="row">
	     	<div class="small-12 columns">
					<g:render template="list"/>
				</div>
			</div>				
		</g:if>
		<g:else>
			<div class="row">
		   	<div class="small-8 columns">
					<g:render template="../components/emptylist" model="['message':'You haven\'t created any Biobanks.  Go ahead and create one!']"></g:render>
				</div>
			</div>
		</g:else>
	</body>
</html>