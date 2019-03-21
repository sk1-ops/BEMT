<div class="bemt-topnav">
	<nav class="top-bar" data-topbar>
	  <ul class="title-area">
	    <li class="name">
	      <h1><i class="fa ${pageProperty(name:'page.navicon')}"></i></h1>
	    </li>
	    <li class="toggle-topbar menu-icon"><a href="#">Menu</a></li>
	  </ul>

	  <section class="top-bar-section">
	    <!-- Right Nav Section -->
		    <ul class="right">
			     <g:if test="${userOrganization == null}">
			  		<li class="divider"></li>
			      <li class="has-dropdown">
			        <a href="#"><i class="fa fa-question-circle"></i></a>
			        <ul class="dropdown">
		  	        <li><a target="_blank" href="/bemt/guides/bemt_helpguide.pdf">Help Guide</a></li>
			          <li><a href="/bemt/guides/bemt_glossary.pdf" target="_blank">Glossary</a></li>
			          <li class="divider"></li>
			          <li><g:link controller="public" action="about">About BEMT</g:link></li>
			        </ul>
			      </li>
						<li class="divider"></li>
		     </g:if>
			    <g:if test="${loggedInUser}">
				    <li class="divider"></li>
			      <li class="has-dropdown">
			        <a href="#"><i class="fa fa-user"></i>&#160;&#160;${loggedInUser}</a>
			        <ul class="dropdown">
			          <li><g:link controller="bemtuser" action="show" id="${loggedInUser.id}">Your Profile</g:link></li>
			          <li><g:link elementId="ctl-signout" controller="bemtuser" action="logout" onclick="return confirm('Are you sure you want to logout of BEMT?');">Logout</g:link></li>
			        </ul>
			      </li>
			     </g:if>
		    </ul>
    <!-- Left Nav Section -->
		    <ul class="left">
		      <li><g:link controller="home" action="index"><i class="fa header-icon fa-home"></i></g:link></li>
		  		<li class="divider"></li>
		    	<g:if test="${userOrganization != null}">
		      <li class="has-dropdown">
		        <a href="#">${userOrganization.name}</a>
		        <ul class="dropdown">
							<g:each in="${userOrganizations}" status="i" var="obj">
			        	<li><g:link controller="organization" action="changeorg" params="[org: obj.id]"><i class="fa fa-d fa-fw"></i>&#160;&#160;${obj.name}</g:link></li>
			        </g:each>
		          <li><g:link controller="organization" action="create"><i class="fa fa-plus fa-fw"></i>&#160;&#160;Create a New Biobank</g:link></li>
		        </ul>
		      </li>	      
		  		<li class="divider"></li>
		      <li class="has-dropdown">
		        <a href="#">My Biobank</a>
		        <ul class="dropdown">
		          <!--<li><g:link controller="organization" action="questionnaire" id="${userOrganization.id}"><i class="fa fa-briefcase"></i>&#160;&#160;My Biobank</g:link></li>-->
		          <li><g:link controller="labor" action="index"><i class="fa fa-users"></i>&#160;&#160;My Labor</g:link>
		          <li><g:link controller="equipment" action="index"><i class="fa fa-cogs"></i>&#160;&#160;My Equipment</g:link>
		          <li><g:link controller="supply" action="index"><i class="fa fa-flask"></i>&#160;&#160;My Lab Supplies</g:link></li>
		        </ul>
		      </li>	      
		  		<li class="divider"></li>
		      <li><g:link controller="product" action="index">My Specimen Products &amp; Services</g:link></li>
		  		<li class="divider"></li>
		      <li><g:link controller="project" action="index">My Projects</g:link></li>
		  		<li class="divider"></li>
		      <li><g:link controller="proforma" action="index">My Forecast</g:link></li>
		  		<li class="divider"></li>
		      <li class="has-dropdown">
		        <a href="#">Market Data</a>
		        <ul class="dropdown">
		        	<li><g:link controller="marketdata" action="index">Search Market Data</g:link></li>
				  		<li class="divider"></li>
		          <li><g:link controller="marketdata" action="about">Summary Data</g:link></li>
		          <li><g:link controller="marketdata" action="disclaimer">About the Survey</g:link></li>
		        </ul>
		      </li>	   
		  		<li class="divider"></li>
		      <li class="has-dropdown">
		        <a href="#"><i class="fa fa-question-circle"></i></a>
		        <ul class="dropdown">
	  	        <li><a target="_blank" href="/bemt/guides/bemt_helpguide.pdf">Help Guide</a></li>
		          <li><a href="/bemt/guides/bemt_glossary.pdf" target="_blank">Glossary</a></li>
		          <li class="divider"></li>
		          <li><g:link controller="public" action="about">About BEMT</g:link></li>
		        </ul>
		      </li>
					<li class="divider"></li>
	      </g:if>
	    </ul>
	  </section>
	</nav>
</div>