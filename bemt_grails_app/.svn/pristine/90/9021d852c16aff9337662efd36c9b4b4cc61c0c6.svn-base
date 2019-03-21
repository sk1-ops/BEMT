import com.provia.bemt.domain.*
import cr.co.arquetipos.password.*

class Testseed {
	//set up some sample data to make dev easier
	def load() {
		//
		def password = PasswordTools.saltPasswordBase64("pwordpword")
    //person
    def person = new Bemtuser( nameFirst: 'Daniel',
                               nameLast: "Reed",
                               password: password,
                               email: "dan.reed@wrycan.com").save(flush:true, failOnError:true)
    //biobank
    def biobank = new Organization(name: "Daniel's Biobank", owner: person).save(flush:true, failOnError:true)
    def proforma = new Proforma(name: "Daniel's Biobank Proforma", organization: biobank).save(flush:true, failOnError:true)
    
    //set up expenses
    def objs = ProformaExpenseType.all
    objs.each {
        def pe = new ProformaExpense(proforma: proforma, expense: it, year1: 0, year2: 0, year3: 0).save(flush:true, failOnError:true)
    }
	}
}