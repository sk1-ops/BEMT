import org.codehaus.groovy.grails.commons.ConfigurationHolder as CH
 
class RefererFilters {
    // referer must match serverURL, optionally https
    static validRefererPrefix = "^${CH.config.grails.serverURL}".replace("http", "https?")
    def filters = {
        checkReferer(controller: '*', action: '*') {
            before = {
                if (request.method.toUpperCase() == "POST") {
                    def referer = request.getHeader('Referer')
                    return referer && referer =~ validRefererPrefix
                }
            }
        }
    }
}