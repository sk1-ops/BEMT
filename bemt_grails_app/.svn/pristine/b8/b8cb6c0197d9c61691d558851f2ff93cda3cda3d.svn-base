<html>
    <head>
        <meta name="layout" content="../layouts/default"/>
        <title>Create New Biobank</title>
    </head>
    <body>		
            <!--// header //-->
        <g:render template="header" model="['title':'Create New Biobank', 'bc':'Add New']"/>    

                <!--// form //-->
        <div class="row">
            <div class="small-8 columns end">
                <p></p>
            </div>
        </div>

                <!--// form //-->
        <div class="row">
            <div class="small-6 columns end">
                <g:form url="[resource:obj, action:'save']" id="organization_form">
                    <div class="form_required"><i class="fa fa-asterisk required_mark"></i> denotes required field</div>
                    <g:render template="form"/>
                    <div class="row">
                        <div class="small-12 columns">
                            <input type="checkbox" name="template" value="true"/>
                            <label>Create a Biobank Profile Using Sample Data.</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="small-12 columns">
                            The Template Biobank is a hypothetical biobank with economic model data pre-loaded in the BEMT.  The “template” biobank has the following example properties:<br/><br/>
                            <ul>
                                <li>Small, US-based, Academic Medical Center Biobank
                                <li>	Brand new – planning its launch with limited infrastructure, small team, limited set of services
                            </ul>    
                            If you choose to “Copy the Template Biobank”, your biobank will have a complete economic model (Labor Categories, Equipment, Supplies, Specimen, 
                            Products, and Services that you offer, costing for each, projects, and a 3 year forecast).  You can then modify the data to fit your own biobank – 
                            or you can delete it all, and start from scratch.

                        </div>
                    </div>
                    <br/>
                    <div class="ctl-btn-group">
                        <g:actionSubmit class="save button bemtbutton radius" action="save" value="Create"></g:actionSubmit>			
                            <bemt:button controller="home" action="index" function="return confirm('Are you sure you want to cancel without creating your new Biobank?');">Cancel</bemt:button>
                        </div>
                </g:form>
            </div>
        </div>		

    </body>
</html>	