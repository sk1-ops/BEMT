<html>
    <head>
        <meta name="layout" content="../layouts/public"/>
        <title>Login</title>
    </head>
    <body>
        <br/>
        <div class="row">
            <div class="small-12 columns">
                <h3><i class="fa fa-bar-chart-o"></i> Biobank Economic Modeling Tool</h3>
            </div>			
        </div>
        <div class="row">
            <div class="small-8 columns">
                <g:render template="../components/flashmessage" model="[flash: flash]"/>
                <g:render template="../components/validationerrormessage" model="[bean: proforma]"/>
            </div>
        </div>			
        <br/>
    <browser:choice>
        <browser:isMsie versionLower="9">
            <div class="staticmessage error">
                <p>
<%-- The BEMT requires the use of Firefox, Chrome, Safari, or Internet Explorer 9 or higher.  If you are not using one of these browsers, please try a different browser.   If you are getting this message and using Internet Explorer 9 or higher, it is possible your browser’s compatibility settings are restricting access to the BEMT site.  Please check with your system administrator about correcting this. --%>
The BEMT requires the use of Firefox, Chrome, or Safari. If you are not using one of these browsers, please try a different browser. 
                </p>
            </div>
        </browser:isMsie>
        <browser:otherwise>
            <browser:isMsie>
                <div class="row">
                    <div class="small-12 columns">
                        <div class="staticmessage error">
                            <p>You are currently using Internet Explorer (IE).  Certain configurations of IE may cause issues while performing certain functions on this site.  We recommend using Firefox, Chrome or Safari if possible.  Thank you.</p>
                        </div>
                    </div>
                </div>
            </browser:isMsie>
            <div class="row">
                <div class="small-3 columns">&#160;</div>
                <div class="small-5 columns end">
                    <h3>Login</h3>
                    <p>Not a BEMT user?  Go to the <g:link controller="public" view="index">home page</g:link> to sign up.</p>
                    <g:form controller="public" action="validate">
                        <fieldset>
                            <legend>Existing Users</legend>
                            <g:if test="${flash.object == 'login'}">
                                <g:render template="../components/flashmessage" model="['flash':flash]"/>
                            </g:if>
                            <p>Login with your email and password</p>
                            <label>Email Address</label>
                            <input id="username" name="email" type="text" placeholder="Your email address…">
                            <label>Password</label>
                            <input id="password" name="password" type="password" placeholder="Your password…" autocomplete="off">
                            <button type="submit" class="button bemtbutton radius">Login</button>
                            <button type="reset" class="button bemtbutton secondary radius">Reset</button><br/>
                            <i class="fa fa-question-circle"></i> Forgot your password? <g:link controller="public" action="passwordresetrequest">Click here to reset.</g:link>
                            </fieldset>
                    </g:form>		
                </div>
            </div>
            <div class="row">
                <div class="small-8 small-offset-2 columns">
                    <p style="font-size:0.85em;line-height:1.2em">
                        <b><i class="fa fa-info-circle"></i> Privacy Notice:</b> Thank you for using the Biobank Economic Modeling Tool (BEMT) provided by the National Cancer Institute's Biorepository and Biospecimen Research Branch (BBRB). Using the BEMT involves recording information about your biobank. This information may or may not be considered sensitive information by you. The BBRB will not use or access this information except for the following: a) User specific information as part of system maintenance or end user support; b) Usage information such as commonly used features to assist in improving the BEMT.
                    </p>
                </div>
            </div>
            <div class="row">
                <div class="small-8 small-offset-2 columns">
                    <p style="font-size:0.85em;line-height:1.2em">
                        <b><i class="fa fa-info-circle"></i> Government Notice:</b><br/>
                        <ul>
                          <li style="font-size:0.85em;line-height:1.2em">This warning banner provides privacy and security notices consistent with applicable federal laws, directives, and other federal guidance for accessing this Government system, which includes (1) this computer network, (2) all computers connected to this network, and (3) all devices and storage media attached to this network or to a computer on this network. </li>
                          <li style="font-size:0.85em;line-height:1.2em">This system is provided for Government-authorized use only.</li>
                          <li style="font-size:0.85em;line-height:1.2em">Unauthorized or improper use of this system is prohibited and may result in disciplinary action and/or civil and criminal penalties.</li>
                          <li style="font-size:0.85em;line-height:1.2em">Personal use of social media and networking sites on this system is limited as to not interfere with official work duties and is subject to monitoring. </li>
                          <li style="font-size:0.85em;line-height:1.2em">By using this system, you understand and consent to the following: </li>
                          <li style="font-size:0.85em;line-height:1.2em">The Government may monitor, record, and audit your system usage, including usage of personal devices and email systems for official duties or to conduct HHS business. Therefore, you have no reasonable expectation of privacy regarding any communication or data transiting or stored on this system. At any time, and for any lawful Government purpose, the government may monitor, intercept, and search and seize any communication or data transiting or stored on this system. </li>
                          <li style="font-size:0.85em;line-height:1.2em">Any communication or data transiting or stored on this system may be disclosed or used for any lawful Government purpose. </li>
                          <li style="font-size:0.85em;line-height:1.2em">By logging in to this system, you acknowledge that you understand and accept these conditions. </li>
                        </ul>
                    </p>
                </div>
            </div>
        </browser:otherwise>
    </browser:choice>
</body>
</html>