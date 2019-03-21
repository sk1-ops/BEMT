See server-setup.txt

See BEMT Code Documenatation.pdf

To Load Data:

grails <env> -Dtomcat=false run-script ./userScripts/loadAppSeed.groovy
grails <env> -Dtomcat=false run-script ./userScripts/loadSurveyEnumdata.groovy
grails <env> -Dtomcat=false run-script ./userScripts/loadSurveys.groovy
grails <env> -Dtomcat=false run-script ./userScripts/loadTemplateBiobanks.groovy