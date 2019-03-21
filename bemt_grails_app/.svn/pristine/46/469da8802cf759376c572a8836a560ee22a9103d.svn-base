import com.provia.bemt.domain.*
import cr.co.arquetipos.password.*

class TemplateBiobanks {
	//set up some sample data to make dev easier
	public void run() {
		//
    //UI isn't set up for an user to have more than one ORG, but that doesn't matter in the datamodel (one ORG = one BIOBANK though)
		def password = PasswordTools.saltPasswordBase64("GJ31i9HIQbK2")
    //person
    def person = new Bemtuser( nameFirst: 'Bemt', nameLast: "User", password: password, email: "noone@bemt.org").save(flush:true, failOnError:true)

    //biobank
    def biobank = new Organization(name: "Template 1 Biobank", owner: person).save(flush:true, failOnError:true)
    def proforma = new Proforma(name: "Template 1 Biobank", organization: biobank).save(flush:true, failOnError:true)
    
    //set up expenses
    def objs = ProformaExpenseType.all
    objs.each {
        def pe = new ProformaExpense(proforma: proforma, expense: it, year1: 0, year2: 0, year3: 0).save(flush:true, failOnError:true)
    }
	}
}