import com.provia.bemt.domain.*

class Surveys {

	def load() {
		load1()
		load2()
		load3()
		load4()
		load5()
		load6()
		load7()
		load8()
		load9()
		load10()
		load11()
		load12()
		load13()
		load14()
		load15()
		load16()
		load17()
		load18()
		load19()
		load20()
		load21()
		load22()
		load23()
		load24()
		load25()
		load26()
		load27()
		load28()
		load29()
		load30()
		load31()
		load32()
		load33()
		load34()
		load35()
		load36()
		load37()
		load38()
		load39()
		load40()
		load41()
		load42()
		load43()
		load44()
		load45()
		load46()
		load47()
		load48()
		load49()
		load50()
		load51()
		load52()
		load53()
		load54()
		load55()
		load56()
		load56()
		load57()
		load58()
		load59()
		load60A()
		load61A()
		load62A()
		load63A()
		load64A()
		load65A()
		load66A()
		load67A()
		load68A()
		load69A()
		load70A()
		load71A()
		load72A()
		load73A()
		load74A()
		load75A()
		load76A()
		load77A()
		load78A()
		load79A()
		load80A()
		load81A()
		load82A()
		load83A()
		load84A()
		load85A()
		load86A()
		load87A()
		load88A()
		load89A()
		load90A()
		load91A()
		load92A()
		load93A()
		load94A()
		load95A()
		load96A()
		load97A()
		load98A()
		load99A()
		load100A()
		load101A()
		load102A()
		load103A()
		load104A()
		load105A()
		load106A()
	}

	def load1() {
		println "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
		println "Surveydata.groovy: loading surveys"
    //surveys
		println "Surveydata.groovy: loading survey sourceId = 1"
    def survey = null
    def datapoint = null
    
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 1, inst: SurveyInstitutionType.findByName("Academic Medical Center"),age: 8, country: SurveyCountry.findByName("United Kingdom"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Centralized"),sites: 2, facility: SurveyFacility.findByName("2,001 to 5,000 ft²"),costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("1%-25%"),markupSpecimen: 0, markupService: 0, indirectRate:0, surveyYear: 2014).save(flush:true, failOnError:true)
		
    //labor    
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Clinical Research associate"), range: SurveyLaborSalaryRange.findByName("\$10,000-\$19,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "0.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("General manager"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "1").save(flush:true, failOnError:true)

		//Products1
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Whole blood"), ischemicTime:"0.6-1 hour", stabilization:"Fresh (not stabilized)", preservation: "-80°C Manual freezer", weight:"0.6-1 ml", dataCollected: "Pathology report", price: "\$1-50", collectionVol:"500-1,000", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Serum"), ischemicTime:"0.6-1 hour", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation: "-80°C Manual freezer", weight:"0.6-1 ml", dataCollected: "Pathology report", price: "\$1-50", collectionVol:"500-1,000", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Plasma"), ischemicTime:"0.6-1 hour", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation: "-80°C Manual freezer", weight:"0.6-1 ml", dataCollected: "Pathology report", price: "\$1-50", collectionVol:"500-1,000", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Urine"), ischemicTime:"0-0.5 hours", stabilization:"Fresh (not stabilized)", preservation: "-80°C Manual freezer", weight:"0.6-1 ml", dataCollected: "Pathology report", price: "\$1-50", collectionVol:"500-1,000", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Cerebrospinal fluid (CSF)"), ischemicTime:">2 hours", stabilization:"Fresh (not stabilized)", preservation: "-80°C Manual freezer", weight:"0.6-1 ml", dataCollected: "Pathology report", price: "\$1-50", collectionVol:"500-1,000", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("PBMC's"), ischemicTime:"0.6-1 hour", stabilization:"Controlled rate freezing", preservation:"-20°C to -148°C LN² Cryotank", weight:"0.6-1 ml", dataCollected: "Pathology report", price: "\$1-50", collectionVol:"500-1,000", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("RNA, blood"), ischemicTime:"0.6-1 hour", stabilization:"Controlled rate freezing", preservation: "-80°C Manual freezer", weight:"0.6-1 ml", dataCollected: "Pathology report", price: "\$1-50", collectionVol:"500-1,000", distVol:"1-250").save(flush:true, failOnError:true)

    //equipment
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laminar flow cabinet/hood"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Lease"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$4,000-\$4,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, stand-alone"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$7,000-\$7,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated nucleic acid/protein extraction instrument"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "4", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Large cryogenic aluminum Dewar's"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "3", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C to minus 40°C Refrigerator"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "4", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual chest freezer"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$9,000-\$9,999"), life: "4", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C to minus 148°C LN² Cryotank"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$3,000-\$3,999"), life: "3", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microscope"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$2,000-\$2,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("PCR thermal cycler"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$7,000-\$7,999"), life: "3", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Orbital bath shaker, bench-top"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)

		datapoint = new SurveyService(survey: survey, type: "Specimen collection kit assembly and shipping", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobanking project/protocol consultation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen protocol and/or consent writing", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen protocol regulatory submission", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen procedure/SOP writing", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank technical support, in-or out-sourced", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Return of biospecimen research results to study participants and/or specimen donors", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample storage and monitoring", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank inventory management database quality/best practice review audit", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management quality/best practice review audit", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, transfer and/or relocation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, culling", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, disaster recovery", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen transport", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Annual biospecimen/project collection report", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Study cohort selection", price:"\$0/free").save(flush:true, failOnError:true)
	}

	def load2() {
		println "Surveydata.groovy: loading survey sourceId = 2"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 2, inst: SurveyInstitutionType.findByName("Community Based Hospital"),age: 6, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Centralized"), sites: 1, facility: SurveyFacility.findByName("<2000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("26%-50%"), markupSpecimen: 0, markupService: 0, indirectRate:0, surveyYear: 2014).save(flush:true, failOnError:true)

  	//labor
  	datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Repository manager"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "1").save(flush:true, failOnError:true)

		//Products2
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Whole blood"), ischemicTime:">2 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation: "-20°C Automated biostore", weight:"<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$100-\$149", collectionVol:"10,000-20,000", distVol:"not reported").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Serum"), ischemicTime:">2 hours", stabilization:"Other: Not specified", preservation: "-20°C Automated biostore", weight:"not reported", dataCollected:"not reported", price: "not reported", collectionVol:"not reported", distVol:"not reported").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Plasma"), ischemicTime:">2 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation: "-20°C Automated biostore", weight:"1.1-2 ml", dataCollected:"Pathology report + clinical data + longitudinal/outcome data", price: "\$100-\$149", collectionVol:"10,000-20,000", distVol:"not reported").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Whole blood"), ischemicTime:">2 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation: "-20°C Automated biostore", weight:"1.1-2 ml", dataCollected:"Pathology report + clinical data + longitudinal/outcome data", price: "\$100-\$149", collectionVol:"10,000-20,000", distVol:"not reported").save(flush:true, failOnError:true)

		//equipment2
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Robotic frozen specimen aliquotter, large"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$250,000-\$499,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$50,000-\$59,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Incubator, automated"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$5,000-\$5,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Sample/tube picking & sorting station, stand-alone"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$250,000-\$499,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$25,000-\$27,499")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated sample capper-de-capper, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Tube puncher and selecting module, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$20,000-\$29,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C Automated biostore"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName(">\$500,000"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$50,000-\$59,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("PCR thermal cycler"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$5,000-\$5,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Safety cabinet"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: ">20", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
	}

	def load3() {
    println "Surveydata.groovy: loading survey sourceId = 3"
    def survey = null
    def datapoint = null
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 3, inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 17, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "Yes", model: SurveyOperatingModel.findByName("Centralized"), sites: 1, facility: SurveyFacility.findByName("2,001 to 5,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("76%-100%"), markupSpecimen: 0, markupService: 0, indirectRate:25, surveyYear: 2014).save(flush:true, failOnError:true)

		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "7").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab manager/supervisor"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Business manager"), range: SurveyLaborSalaryRange.findByName("not reported"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "0.5").save(flush:true, failOnError:true)

		//Services3
		datapoint = new SurveyService(survey: survey, type: "Other: Specimen shipping & handling costs, flat fee (does not include shipping fees)", price:"\$100-\$149").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Annual biospecimen/project collection report", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Education and training", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Other: DNA extraction from 1 to 5 mls whole blood", price:"\$1-\$49").save(flush:true, failOnError:true)

		//Products3
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("DNA, blood"), ischemicTime:"not reported", stabilization:"not reported", preservation: "Other: 4 degrees and minus 20", weight:"not reported", dataCollected: "No data", price: "\$1-50", collectionVol:	"40,000-50,000", distVol:"30,000-40,000").save(flush:true, failOnError:true)

		//equipment3
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$9,000-\$9,999"), life: "12", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated nucleic acid/protein extraction instrument"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$200,000-\$249,999"), life:"12",	contract: SurveyEquipmentAnnual.findByName("\$20,000-\$22,499")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated sample capper-de-capper, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C to minus 40°C Refrigerator"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "9", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$9,000-\$9,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C Automated biostore"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName(">\$500,000"), life: "16", contract: SurveyEquipmentAnnual.findByName("\$40,000-\$49,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated blood fractionation system"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$250,000-\$499,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Real time PCR System"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$40,000-\$49,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$9,000-\$9,999")).save(flush:true, failOnError:true)
	}

	def load4() {
    println "Surveydata.groovy: loading survey sourceId = 4"
    def survey = null
    def datapoint = null
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 4, inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 8, country: SurveyCountry.findByName("Australia"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Federated"), sites: 7, facility: SurveyFacility.findByName("2,001 to 5,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("1%-25%"), markupSpecimen: 0, markupService: 0, indirectRate:10, surveyYear: 2014).save(flush:true, failOnError:true)

		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Histotechnician"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "2").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Data Manager"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "0.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Research assistant"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Clinical Research associate"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Repository manager"), range: SurveyLaborSalaryRange.findByName("\$100,000-\$250,000"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "1.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Administrative/Executive assistant"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "0.5").save(flush:true, failOnError:true)

		//Services4
		datapoint = new SurveyService(survey: survey, type: "Specimen transport", price:"\$100-\$149").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "RNA integrity number (RIN) testing", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Pathology case review for clinical diagnosis and morphological confirmation", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Copy of pathology report", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen biosketch report", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen inventory management database consultation", price:"\$150-\$199").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample storage and monitoring", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Study cohort selection", price:"\$0/free").save(flush:true, failOnError:true)

		//Products4
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor tissue"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation: "-149°C to 190°C LN² Cryotank", weight:"<0.5 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:	"250-500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Normal tissue"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation: "-149°C to 190°C LN² Cryotank", weight:"<0.5 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:	"250-500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor tissue FFPE block"), ischemicTime:"not reported", stabilization:"Formalin fixation", preservation: "Room temperature", weight:">1.1 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:	"500-1,000", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Normal tissue FFPE block"), ischemicTime:"not reported", stabilization:"Formalin fixation", preservation: "Room temperature", weight:">1.1 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:	"500-1,000", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor TMA block"), ischemicTime:"not reported", stabilization:"Formalin fixation", preservation: "Room temperature", weight:"<0.5 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$100-\$149", collectionVol:	"1-250", distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("H&E slide, tumor tissue"), ischemicTime:"not reported", stabilization:"Formalin fixation", preservation: "Room temperature", weight:"not reported", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:	"500-1,000", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Whole blood"), ischemicTime:"0.6-1 hour", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation: "-80°C Manual freezer", weight:"1.1-2 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:	"250-500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Serum"), ischemicTime:"0.6-1 hour", stabilization:"Snap-Freezing with or without OCT", preservation: "-80°C Manual freezer", weight:"1.1-2 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:	"250-500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Buffy coat"), ischemicTime:"0.6-1 hour", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation: "-149°C to 190°C LN² Cryotank", weight:"<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:	"250-500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Plasma"), ischemicTime:"0.6-1 hour", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation: "-80°C Manual freezer", weight:"0.6-1 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:	"250-500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("DNA, tissue"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation: "-80°C Manual freezer", weight:"<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$51-99", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("DNA, blood"), ischemicTime:"0.6-1 hour", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation: "-80°C Manual freezer", weight:"<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"250-500", distVol:"500-1,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("RNA, tissue"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation: "-149°C to 190°C LN² Cryotank", weight:"<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$100-\$149", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: Blood spot card"), ischemicTime:"0.6-1 hour", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation: "Room temperature", weight:"<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)

		//equipment4
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laboratory workbench"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("\$0"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "5", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$6,000-\$6,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Manual tissue microarray (TMA) instrument"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated nucleic acid/protein extraction instrument"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$70,000-\$79,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$3,000-\$3,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Dry vapor shippers, large"), units: "5", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Protective shipping carton, industrial"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "15", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$20,000-\$29,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 149°C to minus 190°C LN² Cryotank"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$40,000-\$49,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microscope"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "20", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
	}

	def load5() {
    println "Surveydata.groovy: loading survey sourceId = 5"
    def survey = null
    def datapoint = null
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 5, inst: SurveyInstitutionType.findByName("Government Program"), age: 11, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "Yes", model: SurveyOperatingModel.findByName("Networked"), sites: 4, facility: SurveyFacility.findByName("15,001 to 50,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("1%-25%"), markupSpecimen: 0, markupService: 0, indirectRate:0, surveyYear: 2014).save(flush:true, failOnError:true)
		
		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("41%-50%"),	fte: "2.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Data Manager"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("41%-50%"),	fte: "0.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab manager/supervisor"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("41%-50%"),	fte: "0.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Repository manager"), range: SurveyLaborSalaryRange.findByName("\$80,000-\$99,999"),	fringe: SurveyLaborFringeRate.findByName("41%-50%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Repository coordinator"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("41%-50%"),	fte: "3.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Head/Group/Team leader"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("41%-50%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Business manager"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("41%-50%"),	fte: "0.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Program/Project manager"), range: SurveyLaborSalaryRange.findByName("\$100,000-\$250,000"),	fringe: SurveyLaborFringeRate.findByName("41%-50%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Quality manager"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("41%-50%"),	fte: "1.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Administrative/Executive assistant"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("41%-50%"),	fte: "1").save(flush:true, failOnError:true)

		//Services5
		datapoint = new SurveyService(survey: survey, type: "Specimen collection kit assembly and shipping", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen transport", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen proficiency testing", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank inventory management database quality/best practice review audit", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management quality/best practice review audit", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, transfer and/or relocation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, culling", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, disaster recovery", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank consumable/supply ordering support", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen collection kit assembly and shipping", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Annual biospecimen/project collection report", price:"\$0/free").save(flush:true, failOnError:true)

		//Products5
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Whole blood"), ischemicTime:"1.1-1.5 hours", stabilization:"not reported", preservation: "-80°C Manual freezer", weight:"1.1-2 ml", dataCollected: "not reported", price: "\$0", collectionVol:"2,500-2,999", distVol:"not reported").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Serum"), ischemicTime:"1.1-1.5 hours", stabilization:"not reported", preservation: "-80°C Manual freezer", weight:"1.1-2 ml", dataCollected: "not reported", price: "\$0", collectionVol:"0,000-29,999", distVol:"not reported").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Buffy coat"), ischemicTime:"1.1-1.5 hours", stabilization:"not reported", preservation: "-80°C Manual freezer", weight:"1.1-2 ml", dataCollected: "not reported", price: "\$0", collectionVol:"8,000-8,499", distVol:"not reported").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Plasma"), ischemicTime:"1.1-1.5 hours", stabilization:"not reported", preservation: "-80°C Manual freezer", weight:"1.1-2 ml", dataCollected: "not reported", price: "\$0", collectionVol:"20,000-29,999", distVol:"not reported").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Urine"), ischemicTime:"1.1-1.5 hours", stabilization:"not reported", preservation: "-80°C Manual freezer", weight:"1.1-2 ml", dataCollected: "not reported", price: "\$0", collectionVol:"90,000-99,999", distVol:"not reported").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Sperm"), ischemicTime:"0.6-1 hour", stabilization:"Fresh (not stabilized)", preservation: "-149°C to 190°C LN² Cryotank", weight:"0.6-1 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$0", collectionVol:"1-250", distVol:"500-1,000").save(flush:true, failOnError:true)
		
		//equipment5
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Cold table/cryogenic workbench"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$2,000-\$2,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bar-code flat scanner, multi-tray"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "3", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Cryo-cart"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$3,000-\$3,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: ">50", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$9,000-\$9,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 149°C to minus 190°C LN² Cryotank"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$30,000-\$39,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Mass spectrometer"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$50,000-\$59,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
	}

	def load6() {
	  println "Surveydata.groovy: loading survey sourceId = 6"
    def survey = null
    def datapoint = null

    //survey
	  survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 6, inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 37, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "Yes", model: SurveyOperatingModel.findByName("Centralized"), sites: 3, facility: SurveyFacility.findByName("5,001 to 15,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("76%-100%"), markupSpecimen: 0, markupService: 0, indirectRate:44, surveyYear: 2014).save(flush:true, failOnError:true)
	
		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Data Manager"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "2").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Research assistant"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "8").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab manager/supervisor"), range: SurveyLaborSalaryRange.findByName("\$80,000-\$99,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Associate/Scientific director"), range: SurveyLaborSalaryRange.findByName("\$100,000-\$250,000"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Program/Project manager"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "2").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Administrative/Executive assistant"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "0.5").save(flush:true, failOnError:true)

		//Services6
		datapoint = new SurveyService(survey: survey, type: "Specimen collection kit assembly and shipping", price:"\$100-\$149").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample storage and monitoring", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobanking project/protocol consultation", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen protocol regulatory submission", price:"\$50-\$99").save(flush:true, failOnError:true)

		//Products6
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Serum"), ischemicTime:">2 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation: "-149°C to 190°C LN² Cryotank", weight:"<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"3,000-3,500", distVol:"5,000-5,500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Buffy coat"), ischemicTime:">2 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation: "-149°C to 190°C LN² Cryotank", weight:"<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"3,000-3,500", distVol:"10,000-20,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Plasma"), ischemicTime:">2 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation: "-149°C to 190°C LN² Cryotank", weight:"<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"3,000-3,500", distVol:"20,000-30,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Urine"), ischemicTime:">2 hours", stabilization:"Fresh (not stabilized)", preservation: "-149°C to 190°C LN² Cryotank", weight:"0.6-1 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"500-1,000", distVol:"5,000-5,500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Saliva"), ischemicTime:">2 hours", stabilization:"Other: RNA later", preservation: "-149°C to 190°C LN² Cryotank", weight:"<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"250-500", distVol:"500-1,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Buccal cells"), ischemicTime:">2 hours", stabilization:"Other: RNA later", preservation: "-80°C Manual freezer", weight:"<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"250-500", distVol:"500-1,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: Stool"), ischemicTime:">2 hours", stabilization:"Other: RNA later/ETOH", preservation: "-80°C Manual freezer", weight:"0.6-1 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"500-1,000", distVol:"500-1,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: Toenails"), ischemicTime:"not reported", stabilization:"not reported",  preservation: "<27°C Humidity controlled environment", weight:"not reported", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"250-500", distVol:"500-1,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: Hair"), ischemicTime:">2 hours", stabilization:"not reported", preservation: "<27°C Humidity controlled environment", weight:"not reported", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"250-500", distVol:"0").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: Blood spot card"), ischemicTime:">2 hours", stabilization:"not reported", preservation: "-20°C to -40°C Refrigerator", weight:"not reported", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"250-500", distVol:"0").save(flush:true, failOnError:true)

		//equipment6
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laminar flow cabinet/hood"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$9,000-\$9,999"), life: "7", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laboratory workbench"), units: "5", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$5,000-\$5,999"), life: "7", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$4,000-\$4,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C to minus 40°C Refrigerator"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$2,000-\$2,999"), life: "7", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "7", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 149°C to minus 190°C LN² Cryotank"), units: ">50", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$30,000-\$39,999"), life: ">20", contract: SurveyEquipmentAnnual.findByName("\$2,000-\$2,999")).save(flush:true, failOnError:true)
	}

	def load7() {
    println "Surveydata.groovy: loading survey sourceId = 7"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 7, inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 13, country: SurveyCountry.findByName("Netherlands"), geo: SurveyGeoArea.findByName("Urban"), international: "Yes", model: SurveyOperatingModel.findByName("Centralized"), sites: 1, facility: SurveyFacility.findByName("2,001 to 5,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("1%-25%"), markupSpecimen: 0, markupService: 40, indirectRate:7, surveyYear: 2014).save(flush:true, failOnError:true)

		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("> 50%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Repository manager"), range: SurveyLaborSalaryRange.findByName("\$80,000-\$99,999"),	fringe: SurveyLaborFringeRate.findByName("> 50%"),	fte: "1").save(flush:true, failOnError:true)

		//Services7
		datapoint = new SurveyService(survey: survey, type: "Specimen collection kit assembly and shipping", price:"\$200-\$249").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Education and training", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Study cohort selection", price:"\$0/free").save(flush:true, failOnError:true)

		//Products7
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor and adjacent normal tissue"), ischemicTime:"1.1-1.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation: "-149°C to 190°C LN² Cryotank", weight:"0.6-1 ml", dataCollected: "Pathology report", price: "\$200-\$249", collectionVol:"5,000-5,500", distVol:"2,000-2,500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor and adjacent normal tissue FFPE blocks"), ischemicTime:"1.1-1.5 hours", stabilization:"Formalin fixation", preservation: "<27°C Humidity controlled environment", weight:"not reported", dataCollected: "Pathology report", price: "not reported", collectionVol:"not reported", distVol:"not reported").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Post mortem tissue"), ischemicTime:"not reported", stabilization:"not reported", preservation: "not reported", weight: "not reported", dataCollected:"not reported", price: "not reported", collectionVol:"not reported", distVol:"not reported").save(flush:true, failOnError:true)

		//equipment7
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Cryostat"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$30,000-\$39,999"), life: "20", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laboratory workbench"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$5,000-\$5,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual chest freezer"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$8,000-\$8,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 149°C to minus 190°C LN² Cryotank"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$30,000-\$39,999"), life: "20", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laser capture microdissection system"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: TMA platform (automated)/virtual microscopy"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)

	}

	def load8() {
    println "Surveydata.groovy: loading survey sourceId = 8"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 8, inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 4, country: SurveyCountry.findByName("United Kingdom"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Centralized"), sites: 1, facility: SurveyFacility.findByName("5,001 to 15,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("51%-75%"), markupSpecimen: 0, markupService: 0, indirectRate:20, surveyYear: 2014).save(flush:true, failOnError:true)
		
		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "2").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Head/Group/Team leader"), range: SurveyLaborSalaryRange.findByName("\$100,000-\$250,000"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "0").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Bioinformatics professional"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("General manager"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "1").save(flush:true, failOnError:true)

		//Services8
		datapoint = new SurveyService(survey: survey, type: "Specimen collection kit assembly and shipping", price:"\$1-49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen transport", price:"\$1-49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "RNA integrity number (RIN) testing", price:"\$1-49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen proficiency testing", price:"\$1-49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Pathology case review for clinical diagnosis and morphological confirmation", price:"\$1-49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen biosketch report", price:"\$1-49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobanking project/protocol consultation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen protocol and/or consent writing", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen protocol regulatory submission", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen procedure/SOP writing", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen inventory management database consultation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank technical support, in-or out-sourced", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management", price:"\$1-49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample storage and monitoring", price:"\$1-49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank inventory management database quality/best practice review audit", price:"\$1-49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management quality/best practice review audit", price:"\$1-49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, transfer and/or relocation", price:"\$1-49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, culling", price:"\$1-49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, disaster recovery", price:"\$1-49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank consumable/supply ordering support", price:"\$1-49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen collection kit assembly and shipping", price:"\$1-49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Annual biospecimen/project collection report", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen proficiency testing (sample set)", price:"\$1-49").save(flush:true, failOnError:true)
		
		//Products8
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor tissue"), ischemicTime:"0.6-1 hour", stabilization:"Snap-Freezing with or without OCT", preservation: "-149°C to 190°C LN² Cryotank", weight:"not reported",dataCollected:"not reported", price: "\$1-50", collectionVol:"1,500-2,000", distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Normal tissue"), ischemicTime:"0.6-1 hour", stabilization:"Snap-Freezing with or without OCT", preservation: "-149°C to 190°C LN² Cryotank", weight:"not reported",dataCollected:"not reported", price: "\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor and adjacent normal tissue"), ischemicTime:"not reported", stabilization:"Snap-Freezing with or without OCT", preservation: "-149°C to 190°C LN² Cryotank", weight:"not reported",dataCollected:"not reported", price: "\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Serum"), ischemicTime:"not reported", stabilization:"not reported", preservation: "-149°C to 190°C LN² Cryotank", weight:"not reported",dataCollected:"not reported", price: "\$1-50", collectionVol:"3,500-4,000", distVol:"500-1,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Buffy coat"), ischemicTime:"not reported", stabilization:"not reported", preservation: "-149°C to 190°C LN² Cryotank", weight:"not reported",dataCollected:"not reported", price: "\$1-50", collectionVol:"500-1,000", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Plasma"), ischemicTime:"not reported", stabilization:"not reported", preservation: "-149°C to 190°C LN² Cryotank", weight:"not reported",dataCollected:"not reported", price: "\$1-50", collectionVol:"3,500-4,000", distVol:"500-1,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Urine"), ischemicTime:"not reported", stabilization:"not reported", preservation: "-149°C to 190°C LN² Cryotank", weight:"not reported",dataCollected:"not reported", price: "\$1-50", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Saliva"), ischemicTime:"not reported", stabilization:"not reported", preservation: "-149°C to 190°C LN² Cryotank", weight:"not reported",dataCollected:"not reported", price: "\$1-50", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Cerebrospinal fluid (CSF)"), ischemicTime:"not reported", stabilization:"not reported", preservation: "-149°C to 190°C LN² Cryotank", weight:"not reported",dataCollected:"not reported", price: "\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("PBMC's"), ischemicTime:"not reported", stabilization:"Controlled rate freezing", preservation: "-149°C to 190°C LN² Cryotank", weight:"not reported",dataCollected:"not reported", price: "\$1-50", collectionVol:"500-1,000", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("DNA, tissue"), ischemicTime:"not reported", stabilization:"not reported", preservation: "-149°C to 190°C LN² Cryotank", weight:"not reported",dataCollected:"not reported", price: "\$1-50", collectionVol:"2,000-2,500", distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("DNA, blood"), ischemicTime:"not reported", stabilization:"not reported", preservation: "-149°C to 190°C LN² Cryotank", weight:"not reported",dataCollected:"not reported", price: "\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("RNA, tissue"), ischemicTime:"not reported", stabilization:"not reported", preservation: "-149°C to 190°C LN² Cryotank", weight:"not reported",dataCollected:"not reported", price: "\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("RNA, blood"), ischemicTime:"not reported", stabilization:"not reported", preservation: "-149°C to 190°C LN² Cryotank", weight:"not reported",dataCollected:"not reported", price: "\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
				
		//equipment8
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laminar flow cabinet/hood"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$60,000-\$69,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, stand-alone"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bar-code flat scanner, multi-tray"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Dry vapor shippers, large"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life:"not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Large cryogenic aluminum Dewar's"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life:"not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: "5", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$9,000-\$9,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual chest freezer"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$8,000-\$8,999"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 149°C to minus 190°C LN² Cryotank"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$60,000-\$69,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microscope"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life:"not reported", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Flow cytometer"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$8,000-\$8,999"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Orbital bath shaker, bench-top"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life:"not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Safety cabinet"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$20,000-\$29,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		}

	def load9() {
    println "Surveydata.groovy: loading survey sourceId = 9"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 9, inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 4, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Centralized"), sites: 1, facility: SurveyFacility.findByName("<2000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("1%-25%"), markupSpecimen: 20, markupService: 0, indirectRate:25, surveyYear: 2014).save(flush:true, failOnError:true)

		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab manager/supervisor"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Technical/Executive director"), range: SurveyLaborSalaryRange.findByName("not reported"),	fringe: SurveyLaborFringeRate.findByName("not reported"),	fte: "0.5").save(flush:true, failOnError:true)

		//Services9
		datapoint = new SurveyService(survey: survey, type: "Specimen collection kit assembly and shipping", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen transport", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Immunohistochemistry (IHC) testing", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Gene expression profiling (DNA, RNA, protein)", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Pathology case review for clinical diagnosis and morphological confirmation", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Pathology external consult, case review", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Copy of pathology report", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobanking project/protocol consultation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen protocol and/or consent writing", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen protocol regulatory submission", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen procedure/SOP writing", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen inventory management database consultation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Evaluating and/or consenting donors for specimen and/or data collection", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample storage and monitoring", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank inventory management database quality/best practice review audit", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management quality/best practice review audit", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, transfer and/or relocation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, culling", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, disaster recovery", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank consumable/supply ordering support", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen collection kit assembly and shipping", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Annual biospecimen/project collection report", price:"\$0/free").save(flush:true, failOnError:true)

		//Products9
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor and adjacent normal tissue"), ischemicTime:"0.6-1 hour", stabilization:"Snap-Freezing with or without OCT", preservation:"-20°C to -148°C LN² Cryotank", weight:"0.6-1 gm",	dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor and adjacent normal tissue FFPE blocks"), ischemicTime:"0.6-1 hour", stabilization:"Formalin fixation", preservation: "Room temperature", weight:"not reported",	dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$51-99", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("H&E slide, tumor and adjacent normal tissue FFPE"), ischemicTime:"0.6-1 hour", stabilization:"not reported", preservation: "Room temperature", weight:"not reported",	dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Whole blood"), ischemicTime:"0.6-1 hour", stabilization:"Controlled rate freezing", preservation: "-80°C Manual freezer", weight:"0.6-1 ml",	dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Serum"), ischemicTime:"0.6-1 hour", stabilization:"Fresh (not stabilized)", preservation: "-80°C Manual freezer", weight:"0.6-1 ml",	dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Buffy coat"), ischemicTime:"0.6-1 hour", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-20°C to -148°C LN² Cryotank", weight:"<0.5 ml",	dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Plasma"), ischemicTime:"0.6-1 hour", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation: "-80°C Manual freezer", weight:"0.6-1 gm",	dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Urine"), ischemicTime:"0.6-1 hour", stabilization:"Other: Not specified", preservation: "-80°C Manual freezer", weight:"1.1-2 ml",	dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		
		//equipment9
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microtome"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$2,000-\$2,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laminar flow cabinet/hood"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laboratory workbench"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$2,000-\$2,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Incubator, automated"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Lease"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Large cryogenic aluminum Dewar's"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C to minus 40°C Refrigerator"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual chest freezer"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$4,000-\$4,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C to minus 148°C LN² Cryotank"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$11,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microscope"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$5,000-\$5,999"), life: ">20", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Gene array scanner workstation"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Flow cytometer"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Real time PCR System"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("PCR thermal cycler"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Mass spectrometer"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("DNA/RNA sequencing system/analyzer"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Autoclave"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Safety cabinet"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laser capture microdissection system"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)

	}

	def load10() {
    println "Surveydata.groovy: loading survey sourceId = 10"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 10, inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 28, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "Yes", model: SurveyOperatingModel.findByName("Centralized"), sites: 7, facility: SurveyFacility.findByName("2,001 to 5,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("26%-50%"), markupSpecimen: 0, markupService: 0, indirectRate:0, surveyYear: 2014).save(flush:true, failOnError:true)

		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "2").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Histotechnician"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Clinical Research Coordinator"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "2").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Research assistant"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Clinical Research associate"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "0.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab manager/supervisor"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Pathologist"), range: SurveyLaborSalaryRange.findByName("\$100,000-\$250,000"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "fte: 0.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Bioinformatics professional"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Program/Project manager"), range: SurveyLaborSalaryRange.findByName("\$80,000-\$99,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "1").save(flush:true, failOnError:true)
		 
		 //Services10
		datapoint = new SurveyService(survey: survey, type: "Copy of pathology report", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobanking project/protocol consultation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen protocol and/or consent writing", price:"\$0/free").save(flush:true, failOnError:true)

		//Products10
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor and adjacent normal tissue"), ischemicTime:"0.6-1 hour", stabilization:"Snap-Freezing with or without OCT", preservation: "-80°C Manual freezer", weight:"0.6-1 gm", dataCollected: "Pathology report + clinical data", price: "\$150-\$199", collectionVol:"10,000-20,000", distVol:"10,000-20,000").save(flush:true, failOnError:true)
	
		//equipment10
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Cryostat"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microtome"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Tissue embedding station"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laboratory workbench"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$6,000-\$6,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated tissue microarray (TMA) instrument"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"),price: SurveyEquipmentPrice.findByName("\$125,000-\$149,999"), life: "7", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated nucleic acid/protein extraction instrument"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"),price: SurveyEquipmentPrice.findByName("\$150,000-\$174,999"), life: "7", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Slide autostainer"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$50,000-\$59,999"), life: "7", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$3,000-\$3,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated tissue cassette labeler, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Dry vapor shippers, large"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "7", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C to minus 40°C Refrigerator"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "7", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "7", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Cold room/walk-in"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microscope"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$30,000-\$39,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Western blot transfer system"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "7", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Orbital bath shaker, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$2,000-\$2,999"), life: "7", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
	}

	def load11() {
    println "Surveydata.groovy: loading survey sourceId = 11"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 11, inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 42, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Centralized"), sites: 3, facility: SurveyFacility.findByName("15,001 to 50,000 ft²"), costRecovery: "No", expRecovery: SurveyExpRecovery.findByName("0%"), markupSpecimen: 0, markupService: 0, indirectRate:0, surveyYear: 2014).save(flush:true, failOnError:true)

		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Technical/Executive director"), range: SurveyLaborSalaryRange.findByName("\$100,000-\$250,000"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Bioinformatics professional"), range: SurveyLaborSalaryRange.findByName("\$80,000-\$99,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "1").save(flush:true, failOnError:true)
	
		//Services11
		datapoint = new SurveyService(survey: survey, type: "Specimen collection kit assembly and shipping", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen transport", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "RNA integrity number (RIN) testing", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Copy of pathology report", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen biosketch report", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobanking project/protocol consultation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen protocol and/or consent writing", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen procedure/SOP writing", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen inventory management database consultation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank technical support, in-or out-sourced", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Evaluating and/or consenting donors for specimen and/or data collection", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample storage and monitoring", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank inventory management database quality/best practice review audit", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management quality/best practice review audit", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, transfer and/or relocation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, culling", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, disaster recovery", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank consumable/supply ordering support", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen collection kit assembly and shipping", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Annual biospecimen/project collection report", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Education and training", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Study cohort selection", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen proficiency testing (sample set)", price:"\$0/free").save(flush:true, failOnError:true)

		//Products11
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor and adjacent normal tissue"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-149°C to 190°C LN² Cryotank", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$150-\$199", collectionVol:"500-1,000", distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor and adjacent normal tissue FFPE blocks"), ischemicTime:"0-0.5 hours", stabilization:"Formalin fixation", preservation:"-80°C Manual freezer", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$150-\$199", collectionVol:"1,500-2,000	", distVol:"500-1,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Bone marrow"), ischemicTime:"1.6-2 hours", stabilization:"Controlled rate freezing", preservation:"-149°C to 190°C LN² Cryotank", weight: "1.1-2 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$150-\$199", collectionVol:"4,000-4,500", distVol:"1,500-2,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Post mortem tissue"), ischemicTime:">2 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-149°C to 190°C LN² Cryotank", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$150-\$199", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("PBMC's"), ischemicTime:">2 hours", stabilization:"Controlled rate freezing", preservation:"-149°C to 190°C LN² Cryotank", weight: "1.1-2 ml",dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$150-\$199", collectionVol:"4,000-4,500	", distVol:"1,500-2,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Serum"), ischemicTime:"0.6-1 hour", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-80°C Manual freezer", weight: "1.1-2 ml",dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$150-\$199", collectionVol:"2,500-3,000	", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Plasma"), ischemicTime:"0.6-1 hour", stabilization:"Other: Slow freeze from room temperature in -80°C freezer ", preservation:"-80°C Manual freezer", weight: "1.1-2 ml",dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$150-\$199", collectionVol:"2,000-2,500	", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Urine"), ischemicTime:"0.6-1 hour", stabilization:"Other: Slow freeze from room temperature in -80°C freezer ", preservation:"-80°C Manual freezer", weight: "1.1-2 ml",dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$150-\$199", collectionVol:"500-1000",  distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Cerebrospinal fluid (CSF)"), ischemicTime: ">2 hours", stabilization: "Other: Slow freeze from room temperature in -80°C freezer", preservation:"-80°C Manual freezer", weight: "1.1-2 ml",dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$150-\$199", collectionVol:"500-1000",  distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Cord blood"), ischemicTime:">2 hours", stabilization:"Controlled rate freezing", preservation:"-149°C to 190°C LN² Cryotank", weight: "not reported", dataCollected: "not reported", price: "\$150-\$199", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("DNA, tissue"), ischemicTime:">2 hours", stabilization:"Other: Slow freeze from room temperature in -80°C freezer", preservation:"Other: 4°C refrigerator", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$150-\$199", collectionVol:"1,500-2,000", distVol:"1,500-2,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("DNA, blood"), ischemicTime:">2 hours", stabilization:"Other: Slow freeze from room temperature in -80°C freezer", preservation:"Other: 4°C refrigerator", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$150-\$199", collectionVol:"1,500-2,000", distVol:"1,500-2,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("RNA, tissue"), ischemicTime:"0.6-1 hour", stabilization:"Other: Slow freeze from room temperature in -80°C freezer ", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$150-\$199", collectionVol:"250-500", distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("RNA, blood"), ischemicTime:"0.6-1 hour", stabilization:"Other: Slow freeze from room temperature in -80°C freezer ", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$150-\$199", collectionVol:"250-500", distVol:"250-500").save(flush:true, failOnError:true)

		//Products11
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor and adjacent normal tissue"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-149°C to 190°C LN² Cryotank", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$150-\$199", collectionVol:"500-1,000", distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor and adjacent normal tissue FFPE blocks"), ischemicTime:"0-0.5 hours", stabilization:"Formalin fixation", preservation:"-80°C Manual freezer", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$150-\$199", collectionVol:"1,500-2,000", distVol:"500-1,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Bone marrow"), ischemicTime:"1.6-2 hours", stabilization:"Controlled rate freezing", preservation:"-149°C to 190°C LN² Cryotank", weight: "1.1-2 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$150-\$199", collectionVol:"4,000-4,500", distVol:"1,500-2,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Post mortem tissue"), ischemicTime:">2 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-149°C to 190°C LN² Cryotank", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$150-\$199", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("PBMC's"), ischemicTime:">2 hours", stabilization:"Controlled rate freezing", preservation:"-149°C to 190°C LN² Cryotank", weight: "1.1-2 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$150-\$199", collectionVol:"4,000-4,500	", distVol:"1,500-2,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Serum"), ischemicTime:"0.6-1 hour", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-80°C Manual freezer", weight: "1.1-2 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$150-\$199", collectionVol:"2,500-3,000", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Plasma"), ischemicTime:"0.6-1 hour", stabilization:"Other: Slow freeze from room temperature in -80°C freezer ", preservation:"-80°C Manual freezer", weight: "1.1-2 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$150-\$199", collectionVol:"2,000-2,500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Urine"), ischemicTime:"0.6-1 hour", stabilization:"Other: Slow freeze from room temperature in -80°C freezer ", preservation:"-80°C Manual freezer", weight: "1.1-2 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$150-\$199", collectionVol:"500-1000",  distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Cerebrospinal fluid (CSF)"), ischemicTime: ">2 hours", stabilization: "Other: Slow freeze from room temperature in -80°C freezer ", preservation:"-80°C Manual freezer", weight: "1.1-2 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$150-\$199", collectionVol:"500-1000",  distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Cord blood"), ischemicTime:">2 hours", stabilization:"Controlled rate freezing", preservation:"-149°C to 190°C LN² Cryotank", weight: "not reported", dataCollected: "not reported", price: "\$150-\$199", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("DNA, tissue"), ischemicTime:">2 hours", stabilization:"Other: Slow freeze from room temperature in -80°C freezer ", preservation:"Other: 4°C refrigerator", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$150-\$199", collectionVol:"1,500-2,000", distVol:"1,500-2,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("DNA, blood"), ischemicTime:">2 hours", stabilization:"Other: Slow freeze from room temperature in -80°C freezer ", preservation:"Other: 4°C refrigerator", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$150-\$199", collectionVol:"1,500-2,000", distVol:"1,500-2,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("RNA, tissue"), ischemicTime:"0.6-1 hour", stabilization:"Other: Slow freeze from room temperature in -80°C freezer", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$150-\$199", collectionVol:"250-500", distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("RNA, blood"), ischemicTime:"0.6-1 hour", stabilization:"Other: Slow freeze from room temperature in -80°C freezer", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$150-\$199", collectionVol:"250-500", distVol:"250-500").save(flush:true, failOnError:true)
	
		//equipment11
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laminar flow cabinet/hood"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$5,000-\$5,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laboratory workbench"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Controlled rate freezer"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$9,000-\$9,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "5", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated nucleic acid/protein extraction instrument"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$40,000-\$49,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Incubator, manual"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$5,000-\$5,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bar-code flat scanner, multi-tray"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$4,000-\$4,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Dry vapor shippers, large"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$3,000-\$3,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Large cryogenic aluminum Dewar's"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: ">20", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: "5", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual chest freezer"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$5,000-\$5,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 149°C to minus 190°C LN² Cryotank"), units: "16 to 20", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: ">20", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microscope"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$3,000-\$3,999"), life: ">20", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("High through-put screening instrument"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$30,000-\$39,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$6,000-\$6,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("PCR thermal cycler"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)

	}

	def load12() {
    println "Surveydata.groovy: loading survey sourceId = 12"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 12, inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 2, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Rural"), international: "No", model: SurveyOperatingModel.findByName("Centralized"), sites: 1, facility: SurveyFacility.findByName("2,001 to 5,000 ft²"), costRecovery: "No", expRecovery: SurveyExpRecovery.findByName("0%"), markupSpecimen: 0, markupService: 0, indirectRate:0, surveyYear: 2014).save(flush:true, failOnError:true)
		
		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Pathology Assistant"), range: SurveyLaborSalaryRange.findByName("\$80,000-\$99,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Data Manager"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Research/Study nurse"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "2.5").save(flush:true, failOnError:true)
		
		//Products12
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor tissue"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "0.6-1 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$150-\$199", collectionVol:"250-500", distVol:"not reported").save(flush:true, failOnError:true)

		//equipment 12
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$7,000-\$7,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bar-code flat scanner, multi-tray"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$50,000-\$59,999"), life: "20", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C to minus 40°C Refrigerator"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$8,000-\$8,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)

	}

	def load13() {
    println "Surveydata.groovy: loading survey sourceId = 13"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 13, inst: SurveyInstitutionType.findByName("Community Based Hospital"), age: 7, country: SurveyCountry.findByName("Australia"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Federated"), sites: 4, facility: SurveyFacility.findByName("<2000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("1%-25%"), markupSpecimen: 15, markupService: 15, indirectRate:10, surveyYear: 2014).save(flush:true, failOnError:true)
		
		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Repository manager"), range: SurveyLaborSalaryRange.findByName("\$80,000-\$99,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Individual researcher/scientist"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "1").save(flush:true, failOnError:true)

		//Services13
		datapoint = new SurveyService(survey: survey, type: "Specimen transport", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Immunohistochemistry (IHC) testing", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Pathology case review for clinical diagnosis and morphological confirmation", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Pathology external consult, case review", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Copy of pathology report", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen biosketch report", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobanking project/protocol consultation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Evaluating and/or consenting donors for specimen and/or data collection", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample storage and monitoring", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, transfer and/or relocation", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, culling", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank consumable/supply ordering support", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Annual biospecimen/project collection report", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Education and training", price:"\$0/free").save(flush:true, failOnError:true)

		//Products13
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor tissue"), ischemicTime:"0.6-1 hour", stabilization:"Snap-Freezing with or without OCT", preservation:"-149°C to 190°C LN² Cryotank", weight: "0.6-1 gm", dataCollected: "Pathology report + clinical data", price: "\$51-99", collectionVol:"500-1000",  distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Normal tissue"), ischemicTime:"0.6-1 hour", stabilization:"Snap-Freezing with or without OCT", preservation:"-149°C to 190°C LN² Cryotank", weight: "0.6-1 gm", dataCollected: "Pathology report + clinical data", price: "\$51-99", collectionVol:"500-1000",  distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor tissue"), ischemicTime:"not reported", stabilization:"Formalin fixation", preservation:"not reported",	weight: "not reported", dataCollected: "Pathology report + clinical data", price: "\$200-\$249", collectionVol:"250-500", distVol:"500-1,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Normal tissue"), ischemicTime:"not reported", stabilization:"Formalin fixation", preservation:"not reported",	weight: "not reported", dataCollected: "Pathology report + clinical data", price: "\$200-\$249", collectionVol:"250-500",  distVol:"500-1,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor TMA block"), ischemicTime:"not reported",	stabilization:"not reported",	preservation:"not reported",	weight: "not reported", dataCollected: "Pathology report + clinical data", price: "\$9,000-\$9,999", collectionVol:"250-500", distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Normal TMA block"), ischemicTime:"not reported", stabilization:"not reported", preservation:"not reported",	weight: "not reported", dataCollected: "Pathology report + clinical data", price: "\$9,000-\$9,999", collectionVol:"250-500", distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("H&E Slide, tumor tissue"), ischemicTime:"not reported", stabilization:"not reported", preservation:"not reported",weight: "not reported", dataCollected: "Pathology report + clinical data", price:"\$1-50", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("H&E Slide, normal tissue"), ischemicTime:"not reported", stabilization:"not reported", preservation:"not reported",weight: "not reported", dataCollected: "Pathology report + clinical data", price:"\$1-50", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Bone marrow"), ischemicTime:"0-0.5 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-80°C Manual freezer", weight: "0.6-1 ml", dataCollected: "Pathology report + clinical data", price: "\$51-99", collectionVol:"3,500-4,000", distVol:"500-1,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Serum"), ischemicTime:"1.6-2 hours", stabilization:"Controlled rate freezing", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data", price: "\$51-99", collectionVol:"3,500-4,000", distVol:"500-1,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Buffy coat"), ischemicTime:">2 hours", stabilization:"Controlled rate freezing", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data", price: "\$51-99", collectionVol: "2,000-2,500", distVol:"500-1,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Plasma"), ischemicTime:"1.1-1.5 hours", stabilization:"Controlled rate freezing", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data", price: "\$51-99", collectionVol: "2,000-2,500", distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("PBMC's"), ischemicTime:"not reported",	stabilization:"Controlled rate freezing", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data", price: "\$51-99", collectionVol: "2,000-2,500", distVol:"250-500").save(flush:true, failOnError:true)

		//equipment 13
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microtome"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$11,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laminar flow cabinet/hood"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$11,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laboratory workbench"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Controlled rate freezer"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "15", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C to minus 40°C Refrigerator"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$7,000-\$7,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Manual tissue microarray (TMA) instrument"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "20", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Incubator, manual"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$5,000-\$5,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Dry vapor shippers, large"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$8,000-\$8,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 149°C to minus 190°C LN² Cryotank"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$30,000-\$39,999"), life: ">20", contract: SurveyEquipmentAnnual.findByName("\$10,000-\$12,499")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Tissue embedding station"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$11,000-\$19,999"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microscope"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: ">20", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)

	}

	def load14() {
    println "Surveydata.groovy: loading survey sourceId = 14"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 14, inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 15, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Federated"), sites: 10, facility: SurveyFacility.findByName("2,001 to 5,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("1%-25%"), markupSpecimen: 54, markupService: 0, indirectRate:54, surveyYear: 2014).save(flush:true, failOnError:true)
		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "2").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Pathology Assistant"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "0.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Clinical Research Coordinator"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "2").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Data Manager"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "fte: 1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab manager/supervisor"), range: SurveyLaborSalaryRange.findByName("\$80,000-\$99,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Repository manager"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Head/Group/Team leader"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Technical/Executive director"), range: SurveyLaborSalaryRange.findByName("\$100,000-\$250,000"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Pathologist"), range: SurveyLaborSalaryRange.findByName("\$80,000-\$99,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Bioinformatics professional"), range: SurveyLaborSalaryRange.findByName("\$100,000-\$250,000"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "3").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Quality manager"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Administrative/Executive assistant"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "0.5").save(flush:true, failOnError:true)
	
		//Services14
		datapoint = new SurveyService(survey: survey, type: "Other: Chart extraction", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample storage and monitoring", price:"\$1-\$49").save(flush:true, failOnError:true)

		//Products14
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor and adjacent normal tissue FFPE blocks"), ischemicTime:"0-0.5 hours", stabilization:"Formalin fixation", preservation:"Room temperature", weight: ">1.1 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$650-\$699", collectionVol: "4,500-5000", distVol:"1,500-2,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor and adjacent normal tissue"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-149°C to 190°C LN² Cryotank", weight: ">1.1 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$100-\$149", collectionVol: "3,500-4,000	", distVol:"250-500").save(flush:true, failOnError:true)
		
		//equipment 14
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Manual tissue microarray (TMA) instrument"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$80,000-\$89,999"), life:"10",contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Digital slide imager"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$100,000-\$124,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$28,000-\$30,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$5,000-\$5,999"), life: "6", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "7", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 149°C to minus 190°C LN² Cryotank"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "7", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microscope"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$4,000-\$4,999"), life: "7", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)

	}

	def load15() {
    println "Surveydata.groovy: loading survey sourceId = 15"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 15, inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 3, country: SurveyCountry.findByName("Portugal"), geo: SurveyGeoArea.findByName("Urban"), international: "Yes", model: SurveyOperatingModel.findByName("Centralized"), sites: 0, facility: SurveyFacility.findByName("<2000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("1%-25%"), markupSpecimen: 5, markupService: 10, indirectRate:0, surveyYear: 2014).save(flush:true, failOnError:true)
		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$5,001-\$9,999"),	fringe: SurveyLaborFringeRate.findByName("not reported"),	fte: "2.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab manager/supervisor"), range: SurveyLaborSalaryRange.findByName("\$5,001-\$9,999"),	fringe: SurveyLaborFringeRate.findByName("not reported"),	fte: "1").save(flush:true, failOnError:true)

		//Services15
		datapoint = new SurveyService(survey: survey, type: "Specimen collection kit assembly and shipping", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "RNA integrity number (RIN) testing", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Genetic testing", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Pathology case review for clinical diagnosis and morphological confirmation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen biosketch report", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobanking project/protocol consultation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen protocol and/or consent writing", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen protocol regulatory submission", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen procedure/SOP writing", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen inventory management database consultation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank technical support, in-or out-sourced", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Evaluating and/or consenting donors for specimen and/or data collection", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Return of biospecimen research results to study participants and/or specimen donors", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample storage and monitoring", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank inventory management database quality/best practice review audit", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management quality/best practice review audit", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, transfer and/or relocation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, culling", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, disaster recovery", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank consumable/supply ordering support", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen collection kit assembly and shipping", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen transport", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Annual biospecimen/project collection report", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Education and training", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Study cohort selection", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen proficiency testing (sample set)", price:"\$0/free").save(flush:true, failOnError:true)

		//Products15
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor tissue"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-149°C to 190°C LN² Cryotank", weight: ">1.1 gm", dataCollected: "Pathology report + clinical data", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor and adjacent normal tissue"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-149°C to 190°C LN² Cryotank", weight: ">1.1 gm", dataCollected: "Pathology report + clinical data", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor and adjacent normal tissue FFPE blocks"), ischemicTime:"0.6-1 hour", stabilization:"not reported", preservation:"Room temperature", weight: ">1.1 gm", dataCollected: "Pathology report + clinical data", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("H&E Slide, tumor and adjacent normal tissue sample FFPE"), ischemicTime:"0.6-1 hour", stabilization:"not reported", preservation:"Room temperature", weight: ">1.1 gm", dataCollected: "Pathology report + clinical data", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Whole blood"), ischemicTime:"0-0.5 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-80°C Manual freezer", weight: "0.6-1 gm", dataCollected: "Pathology report + clinical data", price: "\$1-50", collectionVol: "4,500-5000", distVol:"500-1,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Serum"), ischemicTime:"0-0.5 hours", stabilization:"Fresh (not stabilized)", preservation:"-80°C Manual freezer", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data", price: "\$1-50", collectionVol:"5,000-5,500", distVol:"500-1,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Plasma"), ischemicTime:"0-0.5 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-80°C Manual freezer", weight: "0.6-1 gm", dataCollected: "Pathology report + clinical data", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Saliva"), ischemicTime:"not reported", stabilization:"Fresh (not stabilized)", preservation:"-80°C Manual freezer", weight: "0.6-1 gm", dataCollected: "Pathology report + clinical data", price:"\$1-50", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Synovial fluid"), ischemicTime:"0-0.5 hours", stabilization:"Fresh (not stabilized)", preservation:"-80°C Manual freezer", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Cerebrospinal fluid (CSF)"), ischemicTime:"0-0.5 hours", stabilization:"Fresh (not stabilized)", preservation:"-80°C Manual freezer", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("PBMC's"), ischemicTime:"0.6-1 hour", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-149°C to 190°C LN² Cryotank", weight:"0.6-1 gm", dataCollected: "Pathology report + clinical data", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("DNA, blood"), ischemicTime:"0.6-1 hour", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-80°C Manual freezer", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data", price: "\$1-50", collectionVol:"3,000-3,500", distVol:"500-1,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: Bone"), ischemicTime:"0-0.5 hours", stabilization:"Fresh (not stabilized)", preservation:"-80°C Manual freezer", weight: "not reported", dataCollected: "Pathology report + clinical data", price:"\$1-50", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: Cell lines"), ischemicTime:"1.1-1.5 hours",stabilization: "Other: Not specified", preservation:"-149°C to 190°C LN² Cryotank",	weight: "not reported", dataCollected: "Pathology report + clinical data", price: "\$300-\$349", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)


		//equipment 15
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated nucleic acid/protein extraction instrument"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Incubator, manual"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life:"not reported", contract: SurveyEquipmentAnnual.findByName("\$2,000-\$2,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bar-code flat scanner, multi-tray"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$30,000-\$39,999"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("\$5,000-\$5,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 149°C to minus 190°C LN² Cryotank"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$9,000-\$9,999"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Biosafey cabinet"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "not reported",contract: SurveyEquipmentAnnual.findByName("\$2,000-\$2,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Incubator"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life:"not reported", contract: SurveyEquipmentAnnual.findByName("\$2,000-\$2,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Thermocycler"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$5,000-\$5,999"), life:"not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Refrigerated centrifuge"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Automated DNA extraction station"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microscope"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$5,000-\$5,999"), life:"not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated blood fractionation system"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("\$2,000-\$2,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("PCR thermal cycler"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$5,000-\$5,999"), life:"not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Safety cabinet"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "not reported",contract: SurveyEquipmentAnnual.findByName("\$3,000-\$3,999")).save(flush:true, failOnError:true)

	}

	def load16() {
    println "Surveydata.groovy: loading survey sourceId = 16"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 16, inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 4, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Centralized"), sites: 5, facility: SurveyFacility.findByName("2,001 to 5,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("51%-75%"), markupSpecimen: 15, markupService: 15, indirectRate:30, surveyYear: 2014).save(flush:true, failOnError:true)
		
		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Clinical Research Coordinator"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "3").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab manager/supervisor"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Technical/Executive director"), range: SurveyLaborSalaryRange.findByName("\$100,000-\$250,000"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "0").save(flush:true, failOnError:true)
		
		//Services16
		datapoint = new SurveyService(survey: survey, type: "Specimen collection kit assembly and shipping", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen transport", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Pathology case review for clinical diagnosis and morphological confirmation", price:"\$100-\$149").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Copy of pathology report", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen biosketch report", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobanking project/protocol consultation", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen protocol and/or consent writing", price:"\$200-\$249").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen protocol regulatory submission", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen procedure/SOP writing", price:"\$100-\$149").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Evaluating and/or consenting donors for specimen and/or data collection", price:"\$250-\$299").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample storage and monitoring", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank consumable/supply ordering support", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen collection kit assembly and shipping", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Annual biospecimen/project collection report", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Education and training", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Study cohort selection", price:"\$0/free").save(flush:true, failOnError:true)
	
		//Products16
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Whole blood"), ischemicTime:"1.6-2 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-149°C to 190°C LN² Cryotank", weight: "0.6-1 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"5,500-6,000", distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Serum"), ischemicTime:"1.6-2 hours", stabilization:"Fresh (not stabilized)", preservation:"-149°C to 190°C LN² Cryotank", weight:"<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"7,500-8,000", distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Buffy coat"), ischemicTime:"1.6-2 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-149°C to 190°C LN² Cryotank", weight: "0.6-1 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"10,000-20,000", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Plasma"), ischemicTime:"1.6-2 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-149°C to 190°C LN² Cryotank", weight:"<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"10,000-20,000", distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("DNA, blood"), ischemicTime:"1.6-2 hours", stabilization:"not applicable", preservation:"-20°C to -40°C Refrigerator", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"1,500-2,000	", distVol:"500-1,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: RBC pellet"), ischemicTime:"1.6-2 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-80°C Manual freezer", weight: "0.6-1 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"3,500-4,000", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: Serum, blood clot from tube"), ischemicTime:"1.6-2 hours", stabilization:"Fresh (not stabilized)", preservation:"-80°C Manual freezer", weight: "0.6-1 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"2,000-2,500", distVol:"1-250").save(flush:true, failOnError:true)
		
		//equipment16
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laminar flow cabinet/hood"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$0"), life: "15", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laboratory workbench"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$0"), life: ">20", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$2,000-\$2,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated straw filling station, stand-alone"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$100,000-\$124,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("\$2,000-\$2,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated nucleic acid/protein extraction instrument"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$20,000-\$29,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$2,000-\$2,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Incubator, manual"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Incubator, automated"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$8,000-\$8,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "15", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Dry vapor shippers, large"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Large cryogenic aluminum Dewar's"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "20", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C to minus 40°C Refrigerator"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "20", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$9,000-\$9,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 149°C to minus 190°C LN² Cryotank"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$60,000-\$69,999"), life: "20", contract: SurveyEquipmentAnnual.findByName("\$2,000-\$2,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Cold room/walk-in"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "20", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Real time PCR System"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$30,000-\$39,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$2,000-\$2,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("PCR thermal cycler"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$4,000-\$4,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Orbital bath shaker, bench-top"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$2,000-\$2,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Autoclave"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Safety cabinet"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Clean room"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)

	}

	def load17() {
    println "Surveydata.groovy: loading survey sourceId = 17"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 17, inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 23, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "Yes", model: SurveyOperatingModel.findByName("Centralized"), sites: 1, facility: SurveyFacility.findByName("5,001 to 15,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("1%-25%"), markupSpecimen: 0, markupService: 0, indirectRate:34, surveyYear: 2014).save(flush:true, failOnError:true)
		
		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("41%-50%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Pathology Assistant"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("41%-50%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Clinical Research Coordinator"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("41%-50%"),	fte: "2").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Data Manager"), range: SurveyLaborSalaryRange.findByName("\$80,000-\$99,999"),	fringe: SurveyLaborFringeRate.findByName("41%-50%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Repository manager"), range: SurveyLaborSalaryRange.findByName("\$80,000-\$99,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Head/Group/Team leader"), range: SurveyLaborSalaryRange.findByName("\$100,000-\$250,000"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Individual researcher/scientist"), range: SurveyLaborSalaryRange.findByName("\$100,000-\$250,000"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "0.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Business manager"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("41%-50%"),	fte: "1").save(flush:true, failOnError:true)
	
		//Services17
		datapoint = new SurveyService(survey: survey, type: "Specimen transport", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Other: Post mortem brain tissue retrieval and handling", price:"\$100-\$149").save(flush:true, failOnError:true)

		//Products17
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Post mortem tissue"), ischemicTime:">2 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "not reported", dataCollected: "Pathology report + clinical data", price: "\$100-\$149", collectionVol:"3,000-3,500", distVol:"3,000-3,500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Cerebrospinal fluid (CSF)"), ischemicTime:">2 hours", stabilization:	"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data", price: "\$100-\$149", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Post mortem tissue"), ischemicTime:">2 hours", stabilization:"Formalin fixation", preservation:"Room temperature",	weight: "not reported", dataCollected: "Pathology report + clinical data", price: "\$100-\$149", collectionVol:"3,000-3,500", distVol:"500-1,000").save(flush:true, failOnError:true)

		//equipment17
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laminar flow cabinet/hood"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$8,000-\$8,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated nucleic acid/protein extraction instrument"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$5,000-\$5,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$2,000-\$2,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Incubator, manual"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$5,000-\$5,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$4,000-\$4,999"), life: "10",contract: SurveyEquipmentAnnual.findByName("not applicable")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$3,000-\$3,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual chest freezer"), units: "21 to 25", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$9,000-\$9,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$6,000-\$6,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 149°C to minus 190°C LN² Cryotank"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10",contract: SurveyEquipmentAnnual.findByName("not applicable")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microscope"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$2,000-\$2,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Real time PCR System"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$3,000-\$3,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("PCR thermal cycler"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Western blot transfer system"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("DNA/RNA sequencing system/analyzer"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$8,000-\$8,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$5,000-\$5,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Autoclave"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$20,000-\$29,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Safety cabinet"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("not applicable")).save(flush:true, failOnError:true)

	}

	def load18() {
    println "Surveydata.groovy: loading survey sourceId = 18"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 18, inst: SurveyInstitutionType.findByName("Government Program"), age: 12, country: SurveyCountry.findByName("Japan"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Independent"), sites: 1, facility: SurveyFacility.findByName("2,001 to 5,000 ft²"), costRecovery: "No", expRecovery: SurveyExpRecovery.findByName("0%"), markupSpecimen: 0, markupService: 0, indirectRate:0, surveyYear: 2014).save(flush:true, failOnError:true)
		
		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("<\$5,000"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "1").save(flush:true, failOnError:true)
		
		//Services18
		datapoint = new SurveyService(survey: survey, type: "Specimen collection kit assembly and shipping", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen transport", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "RNA integrity number (RIN) testing", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobanking project/protocol consultation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen protocol and/or consent writing", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen protocol regulatory submission", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen procedure/SOP writing", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen inventory management database consultation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank technical support, in-or out-sourced", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Evaluating and/or consenting donors for specimen and/or data collection", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample storage and monitoring", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank inventory management database quality/best practice review audit", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management quality/best practice review audit", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, transfer and/or relocation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, culling", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, disaster recovery", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank consumable/supply ordering support", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Annual biospecimen/project collection report", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Education and training", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Study cohort selection", price:"\$0/free").save(flush:true, failOnError:true)
		
		//Products18
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Serum"), ischemicTime:">2 hours", stabilization:"Fresh (not stabilized)", preservation:"-20°C to -40°C Refrigerator",	weight: "not reported", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "not reported", collectionVol:"70,000-80,000", distVol:"500-1,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Buffy coat"), ischemicTime:">2 hours", stabilization:"not reported", preservation:"-80°C Manual freezer", weight: "not reported", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "not reported", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Plasma"), ischemicTime:">2 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-20°C to -40°C Refrigerator", weight: "not reported", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "not reported", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("DNA, blood"), ischemicTime:"not reported", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "not reported", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "not reported", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("RNA, blood"), ischemicTime:"not reported", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "not reported", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "not reported", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Protein lysate"), ischemicTime:"not reported", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "not reported", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "not reported", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: Circulating tumor cells (CTC)"), ischemicTime:">2 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"Other: Not specified", weight: "not reported", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "not reported", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: Cell free DNA"), ischemicTime:">2 hours", stabilization:"Other: Not specified", preservation:"Other: Not specified",	weight: "not reported", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "not reported", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)

		//equipment18
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("SPIN tissue processor, microwave"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laboratory workbench"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Controlled rate freezer"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$4,000-\$4,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, stand-alone"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Incubator, manual"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bar-code flat scanner, multi-tray"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$2,000-\$2,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Cryo-cart"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Dry vapor shippers, large"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$4,000-\$4,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Large cryogenic aluminum Dewar's"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C to minus 40°C Refrigerator"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual chest freezer"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C to minus 148°C LN² Cryotank"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$4,000-\$4,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 149°C to minus 190°C LN² Cryotank"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$6,000-\$6,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Cold room/walk-in"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: ">20", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microscope"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Real time PCR System"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$5,000-\$5,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("PCR thermal cycler"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Western blot transfer system"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$2,000-\$2,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Blot hybridization system"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$2,000-\$2,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("DNA/RNA sequencing system/analyzer"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$3,000-\$3,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Orbital bath shaker, bench-top"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$3,000-\$3,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Reagent dispenser"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Autoclave"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Safety cabinet"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)

	}

	def load19() {
    println "Surveydata.groovy: loading survey sourceId = 19"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 19, inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 7, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Centralized"), sites: 2, facility: SurveyFacility.findByName("<2000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("1%-25%"), markupSpecimen: 0, markupService: 0, indirectRate:0, surveyYear: 2014).save(flush:true, failOnError:true)
		
		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"), fringe: SurveyLaborFringeRate.findByName("not reported"),	fte: "2.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Clinical Research Coordinator"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"), fringe: SurveyLaborFringeRate.findByName("not reported"),	fte: "3").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab manager/supervisor"), range: SurveyLaborSalaryRange.findByName("\$80,000-\$99,999"), fringe: SurveyLaborFringeRate.findByName("not reported"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Repository manager"), range: SurveyLaborSalaryRange.findByName("\$80,000-\$99,999"), fringe: SurveyLaborFringeRate.findByName("not reported"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Associate/Scientific director"), range: SurveyLaborSalaryRange.findByName("\$100,000-\$250,000"), fringe: SurveyLaborFringeRate.findByName("not reported"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Bioinformatics professional"), range: SurveyLaborSalaryRange.findByName("\$100,000-\$250,000"), fringe: SurveyLaborFringeRate.findByName("not reported"),	fte: "2").save(flush:true, failOnError:true)

		//Services19
		datapoint = new SurveyService(survey: survey, type: "Specimen collection kit assembly and shipping", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen transport", price:"\$100-\$149").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobanking project/protocol consultation", price:"\$100-\$149").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen protocol and/or consent writing", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen protocol regulatory submission", price:"\$0/free").save(flush:true, failOnError:true)
		
		//Products19
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Plasma"), ischemicTime:">2 hours", stabilization:"not reported", preservation:"-80°C Manual freezer", weight:"<0.5 ml", dataCollected:"Surgical Pathology report + medical history/clinical data", price:"\$1-50", collectionVol: "4,500-5000", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("DNA, blood"), ischemicTime:">2 hours", stabilization: "not reported", preservation:"-80°C Manual freezer", weight:"<0.5 ml", dataCollected:"Surgical Pathology report + medical history/clinical data", price:"\$1-50", collectionVol:"5,000-5,500", distVol:"1-250").save(flush:true, failOnError:true)

		//equipment19
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laboratory workbench"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Controlled rate freezer"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated nucleic acid/protein extraction instrument"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"),price: SurveyEquipmentPrice.findByName("\$125,000-\$149,999"), life:"10",contract: SurveyEquipmentAnnual.findByName("\$31,000-\$39,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "5", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Sample/tube picking & sorting station, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$100,000-\$124,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)

	}

	def load20() {
    println "Surveydata.groovy: loading survey sourceId = 20"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 20, inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 6, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "Yes", model: SurveyOperatingModel.findByName("Centralized"), sites: 1, facility: SurveyFacility.findByName("2,001 to 5,000 ft²"), costRecovery: "No", expRecovery: SurveyExpRecovery.findByName("0%"), markupSpecimen: 0, markupService: 0, indirectRate:0, surveyYear: 2014).save(flush:true, failOnError:true)
		
		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab manager/supervisor"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"), fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "0.5").save(flush:true, failOnError:true)

		//Services20
		datapoint = new SurveyService(survey: survey, type: "Pathology case review for clinical diagnosis and morphological confirmation", price:"\$700-\$799").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Copy of pathology report", price:"\$700-\$799").save(flush:true, failOnError:true)
		
		//Products20
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor tissue"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-149°C to 190°C LN² Cryotank",weight:"0.6-1 gm", dataCollected: "Pathology report + clinical data", price: "\$700-\$799", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Normal tissue"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-149°C to 190°C LN² Cryotank",weight:"0.6-1 gm", dataCollected: "Pathology report + clinical data", price: "\$700-\$799", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor tissue"), ischemicTime:"not reported", stabilization:"Formalin fixation", preservation:"<27°C Humidity controlled environment", weight: "not reported", dataCollected:"Pathology report", price:"\$450-\$499",	collectionVol:"1,500-2,000", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Normal tissue"), ischemicTime:"not reported", stabilization:"Formalin fixation", preservation:"<27°C Humidity controlled environment", weight: "not reported", dataCollected:"Pathology report", price:"\$450-\$499",	collectionVol:"1,500-2,000", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Serum"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-149°C to 190°C LN² Cryotank", weight: "0.6-1 ml", dataCollected: "Pathology report + clinical data", price: "\$51-99", collectionVol:"2,000-2,500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Buffy coat"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-149°C to 190°C LN² Cryotank", weight: "0.6-1 ml", dataCollected: "Pathology report + clinical data", price: "\$51-99",collectionVol:"2,000-2,500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("H&E Slide, tumor tissue"), ischemicTime:"not applicable", stabilization:"not reported", preservation:"<27°C Humidity controlled environment", weight: "not reported", dataCollected: "Pathology report", price: "\$51-99", 	collectionVol:"not reported", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("H&E Slide, normal tissue"), ischemicTime:"not applicable", stabilization:"not reported", preservation:"<27°C Humidity controlled environment", weight: "not reported", dataCollected: "Pathology report", price: "\$51-99",	collectionVol:"not reported", distVol:"1-250").save(flush:true, failOnError:true)

		//equipment20
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Cryostat"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Tissue processor, walk away"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microtome"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Tissue embedding station"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laboratory workbench"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$5,000-\$5,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 149°C to minus 190°C LN² Cryotank"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$20,000-\$29,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microscope"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)

	}

	def load21() {
    println "Surveydata.groovy: loading survey sourceId = 21"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 21, inst: SurveyInstitutionType.findByName("Independent Research Laboratory"), age: 4, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Centralized"), sites: 1, facility: SurveyFacility.findByName("<2000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("51%-75%"), markupSpecimen: 0, markupService: 10, indirectRate:25,  surveyYear: 2014).save(flush:true, failOnError:true)
		
		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Repository manager"), range: SurveyLaborSalaryRange.findByName("\$80,000-\$99,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "0.5").save(flush:true, failOnError:true)

		//Services21
		datapoint = new SurveyService(survey: survey, type: "Specimen collection kit assembly and shipping", price:"\$1-49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Other: Label printing", price:"\$1-49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Other: Specimen aliquotting", price:"\$1-49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Other: Vial relabeling", price:"\$1-49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank project/protocol consultation", price:"\$1-49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen procedure/SOP writing", price:"\$1-49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample storage and monitoring", price:"\$1-49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management", price:"\$1-49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Return of biospecimen research results to study participants and/or specimen donors", price:"\$1-49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank inventory management database quality/best practice review audit", price:"\$1-49").save(flush:true, failOnError:true)
		
		//Products21
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("PBMC's"), ischemicTime:"0-0.5 hours", stabilization:"Controlled rate freezing", preservation:"-149°C to 190°C LN² Cryotank", weight: "1.1-2 ml",dataCollected: "not reported", price: "\$1-50",collectionVol:"5,000-5,500", distVol:"1,500-2,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Buffy coat"), ischemicTime:"0-0.5 hours", stabilization:"Fresh (not stabilized)", preservation:"-80°C Manual freezer", weight: "1.1-2 ml",dataCollected: "not reported",, price: "\$1-50",collectionVol:"1,500-2,000	", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Plasma"), ischemicTime:"0-0.5 hours", stabilization:"Fresh (not stabilized)", preservation:"-80°C Manual freezer", weight: "1.1-2 ml",dataCollected: "not reported",, price: "\$1-50", collectionVol:"1,500-2,000	", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Urine"), ischemicTime:"not reported", stabilization:"Fresh (not stabilized)", preservation:"-80°C Manual freezer", weight:">5.1 ml", dataCollected: "not reported", price: "\$1-50", collectionVol:"500-1000",  distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Saliva"), ischemicTime:">2 hours", stabilization:"Other: Vendor collection kit", preservation:"-80°C Manual freezer", weight: "1.1-2 ml",dataCollected: "not reported", price: "\$1-50", collectionVol:"2,500-3,000	", distVol:"1-250").save(flush:true, failOnError:true)

		//equipment21
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microscope"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laminar flow cabinet/hood"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$8,000-\$8,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laboratory workbench"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$2,000-\$2,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Controlled rate freezer"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$3,000-\$3,999"), life: "4", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Large cryogenic aluminum Dewar's"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$2,000-\$2,999"), life: ">20", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C to minus 40°C Refrigerator"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: "11 to 15", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 149°C to minus 190°C LN² Cryotank"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: ">20", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Safety cabinet"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$8,000-\$8,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Automated cell counter"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$5,000-\$5,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)

	}

	def load22() {    
		println "Surveydata.groovy: loading survey sourceId = 22"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 22, inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 3, country: SurveyCountry.findByName("Argentina"), geo: SurveyGeoArea.findByName("Urban"), international: "Yes", model: SurveyOperatingModel.findByName("Networked"), sites: 2, facility: SurveyFacility.findByName("<2000 ft²"), costRecovery: "No", expRecovery: SurveyExpRecovery.findByName("0%"), markupSpecimen: 0, markupService: 0, indirectRate:0, surveyYear: 2014).save(flush:true, failOnError:true)
		
		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("> 50%"),	fte: "0.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Clinical Research Coordinator"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("> 50%"),	fte: "0.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Clinical Research associate"), range: SurveyLaborSalaryRange.findByName("<\$5,000"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "0").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Clinical resident/fellow"), range: SurveyLaborSalaryRange.findByName("<\$5,000"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "0.2").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Bioinformatics professional"), range: SurveyLaborSalaryRange.findByName("not applicable"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "0.2").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("General manager"), range: SurveyLaborSalaryRange.findByName("not applicable"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "0.3").save(flush:true, failOnError:true)

		//Services22
		datapoint = new SurveyService(survey: survey, type: "Specimen collection kit assembly and shipping", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen transport", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen inventory management database consultation", price:"\$0/free").save(flush:true, failOnError:true)
		
		//Products22
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor tissue"), ischemicTime:"0.6-1 hour", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "0.6-1 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"1-250", distVol:"0").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Normal tissue"), ischemicTime:"0.6-1 hour", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "0.6-1 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"1-250", distVol:"0").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor and adjacent normal tissue"), ischemicTime:"0.6-1 hour", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "0.6-1 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"1-250", distVol:"0").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor tissue"), ischemicTime:"not reported", stabilization:"Formalin fixation", preservation:"Room temperature", weight: "not reported", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"1-250", distVol:"0").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor and adjacent normal tissue FFPE blocks"), ischemicTime:"not reported", stabilization:"Formalin fixation", preservation:"Room temperature", weight: "not reported", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"1-250", distVol:"0").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("H&E Slide, tumor tissue"), ischemicTime:"not reported", stabilization:"Formalin fixation", preservation:"Room temperature", weight: "not reported", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"1-250", distVol:"0").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor tissue"), ischemicTime:"0.6-1 hour", stabilization:"Fresh (not stabilized)", preservation:"-80°C Manual freezer", weight: "0.6-1 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"1-250", distVol:"0").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Normal tissue"), ischemicTime:"0.6-1 hour", stabilization:"Fresh (not stabilized)", preservation:"-80°C Manual freezer", weight: "0.6-1 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"1-250", distVol:"0").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor and adjacent normal tissue"), ischemicTime:"0.6-1 hour", stabilization:"Fresh (not stabilized)", preservation:"-80°C Manual freezer", weight: "0.6-1 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"1-250", distVol:"0").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Whole blood"), ischemicTime:"not reported", stabilization:"Other: EDTA/Li Heparin", preservation:"-80°C Manual freezer", weight: "0.6-1 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"1-250", distVol:"0").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Plasma"), ischemicTime:"not reported", stabilization:"not reported", preservation:"-80°C Manual freezer", weight: "0.6-1 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"1-250", distVol:"0").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Serum"), ischemicTime:"not reported", stabilization:"not reported", preservation:"-80°C Manual freezer", weight: "0.6-1 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"1-250", distVol:"0").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: Buffy coat, clot from tube"), ischemicTime:"not reported", stabilization:"not reported", preservation:"-80°C Manual freezer", weight: "0.6-1 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"1-250", distVol:"0").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: Serum, blood clot from tube"), ischemicTime:"not reported", stabilization:"not reported", preservation:"-80°C Manual freezer", weight: "2.1-5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"1-250", distVol:"0").save(flush:true, failOnError:true)
			
		//equipment22
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Controlled rate freezer"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$50,000-\$59,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("\$10,000-\$12,499")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$20,000-\$29,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk sample labeler, bench-top"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C to minus 40°C Refrigerator"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$5,000-\$5,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$20,000-\$29,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("\$10,000-\$12,499")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Autoclave"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$2,000-\$2,999"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Safety cabinet"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
	}

	def load23() {    
		println "Surveydata.groovy: loading survey sourceId = 23"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 23, inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 2, country: SurveyCountry.findByName("Germany"), geo: SurveyGeoArea.findByName("Urban"), international: "Yes", model: SurveyOperatingModel.findByName("Centralized"), sites: 17, facility: SurveyFacility.findByName("<2000 ft²"), costRecovery: "No", expRecovery: SurveyExpRecovery.findByName("0%"), markupSpecimen: 0, markupService: 0, indirectRate:20,  surveyYear: 2014).save(flush:true, failOnError:true)
		
		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("not reported"),	fte: "2.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Bioinformatics professional"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("not reported"),	fte: "2").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Chief operating officer (COO)"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("not reported"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Chief Technology officer (CTO)"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("not reported"),	fte: "1").save(flush:true, failOnError:true)

		//Services23
		datapoint = new SurveyService(survey: survey, type: "Specimen transport", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Pathology case review for clinical diagnosis and morphological confirmation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Copy of pathology report", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobanking project/protocol consultation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen inventory management database consultation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank technical support, in-or out-sourced", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample storage and monitoring", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank inventory management database quality/best practice review audit", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management quality/best practice review audit", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, transfer and/or relocation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, disaster recovery", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank consumable/supply ordering support", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Annual biospecimen/project collection report", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Education and training", price:"\$0/free").save(flush:true, failOnError:true)
		
		//Products23
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor and adjacent normal tissue"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-149°C to 190°C LN² Cryotank", weight: "not reported", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "not reported", collectionVol:"3,500-4,000", distVol:"not reported").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor and adjacent normal tissue FFPE blocks"), ischemicTime:"not reported", stabilization:"Formalin fixation", preservation:"Room temperature", weight: "not reported", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "not reported", collectionVol:"3,500-4,000	", distVol:"not reported").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Whole blood"), ischemicTime:"0-0.5 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-80°C Manual freezer", weight: "not reported", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "not reported", collectionVol:"7,500-8,000", distVol:"not reported").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Serum"), ischemicTime:"0-0.5 hours", stabilization:"Fresh (not stabilized)", preservation:"-149°C to 190°C LN² Cryotank", weight:"<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$350-\$399", collectionVol:"10,000-20,000", distVol:"not reported").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("DNA, blood"), ischemicTime:"not reported", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "not reported", collectionVol:"7,500-8,000", distVol:"not reported").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("RNA, blood"), ischemicTime:"0-0.5 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "not reported", collectionVol:"1,500-2,000", distVol:"not reported").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Urine"), ischemicTime:"1.6-2 hours", stabilization:"Fresh (not stabilized)", preservation:"-80°C Manual freezer", weight: "0.6-1 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "not reported", collectionVol:"7,000-7,500", distVol:"not reported").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Synovial fluid"), ischemicTime:"not reported", stabilization:"Fresh (not stabilized)", preservation:"-80°C Manual freezer", weight: "not reported", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "not reported", collectionVol:"1-250", distVol:"not reported").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: IPS cells"), ischemicTime:"not reported", stabilization:"Controlled rate freezing", preservation:"-149°C to 190°C LN² Cryotank", weight: "not reported", dataCollected: "Pathology report + clinical data", price: "not reported", collectionVol:"250-500", distVol:"not reported").save(flush:true, failOnError:true)

		//equipment23
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Cold table/cryogenic workbench"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$60,000-\$69,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$3,000-\$3,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laminar flow cabinet/hood"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "8", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, stand-alone"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$20,000-\$29,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated nucleic acid/protein extraction instrument"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$200,000-\$249,999"), life:"15",	contract: SurveyEquipmentAnnual.findByName("\$5,000-\$5,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$2,000-\$2,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bar-code flat scanner, multi-tray"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "7", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated sample capper-de-capper, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$60,000-\$69,999"), life: "7", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Dry vapor shippers, large"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$4,000-\$4,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C to minus 40°C Refrigerator"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$20,000-\$29,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 149°C to minus 190°C LN² Cryotank"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$20,000-\$29,999"), life: "12", contract: SurveyEquipmentAnnual.findByName("\$5,000-\$5,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microscope"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$20,000-\$29,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Real time PCR System"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$30,000-\$39,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("DNA/RNA sequencing system/analyzer"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$6,000-\$6,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Autoclave"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$8,000-\$8,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
	
	}

	def load24() {
    println "Surveydata.groovy: loading survey sourceId = 24"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 24, inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 14, country: SurveyCountry.findByName("Poland"), geo: SurveyGeoArea.findByName("Urban"), international: "Yes", model: SurveyOperatingModel.findByName("Independent"), sites: 1, facility: SurveyFacility.findByName("<2000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("1%-25%"), markupSpecimen: 0, markupService: 0, indirectRate:0, surveyYear: 2014).save(flush:true, failOnError:true)
		
		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$10,000-\$19,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Data Manager"), range: SurveyLaborSalaryRange.findByName("\$10,000-\$19,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "0.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Research/Study nurse"), range: SurveyLaborSalaryRange.findByName("\$10,000-\$19,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Head/Group/Team leader"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "0.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Bioinformatics professional"), range: SurveyLaborSalaryRange.findByName("\$5,001-\$9,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "0.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("General manager"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "0.5").save(flush:true, failOnError:true)

		//Products24
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Plasma"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "0.6-1 ml", dataCollected: "Pathology report + clinical data", price: "\$0", collectionVol:"1,500-2,000	", distVol:"not reported").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Serum"), ischemicTime:"0.6-1 hour", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "0.6-1 ml", dataCollected: "Pathology report + clinical data", price: "\$0", collectionVol:"1,500-2,000	", distVol:"not reported").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Buffy coat"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data", price: "\$0", collectionVol:"250-500", distVol:"not reported").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor tissue"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "not reported", dataCollected: "Pathology report + clinical data", price: "\$0", collectionVol:"2,000-2,500	", distVol:"not reported").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Normal tissue"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-148°C Manual freezer", weight: "not reported", dataCollected: "Pathology report + clinical data", price: "\$0", collectionVol:"250-500", distVol:"not reported").save(flush:true, failOnError:true)

		//equipment24
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$9,000-\$9,999"), life: "7", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated sample/vial filling station, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$50,000-\$59,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$7,000-\$7,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bar-code flat scanner, multi-tray"), units: "5", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Dry vapor shippers, large"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Protective shipping carton, industrial"), units: ">50", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Large cryogenic aluminum Dewar's"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$20,000-\$29,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 149°C to minus 190°C LN² Cryotank"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Real time PCR System"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$50,000-\$59,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)

	}

	def load25() {    
		println "Surveydata.groovy: loading survey sourceId = 25"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 25, inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 9, country: SurveyCountry.findByName("United Kingdom"), geo: SurveyGeoArea.findByName("Urban"), international: "Yes", model: SurveyOperatingModel.findByName("Networked"), sites: 8, facility: SurveyFacility.findByName("2,001 to 5,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("1%-25%"), markupSpecimen: 0, markupService: 10, indirectRate:10,  surveyYear: 2014).save(flush:true, failOnError:true)
		
		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "3.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Histotechnician"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "3").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Research assistant"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Research/Study nurse"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "9").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Repository manager"), range: SurveyLaborSalaryRange.findByName("\$80,000-\$99,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Repository coordinator"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Individual researcher/scientist"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "0.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Administrative/Executive assistant"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "1.5").save(flush:true, failOnError:true)
	
		//Services25
		datapoint = new SurveyService(survey: survey, type: "Specimen transport", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "RNA integrity number (RIN) testing", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Pathology case review for clinical diagnosis and morphological confirmation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Copy of pathology report", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobanking project/protocol consultation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen inventory management database consultation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Evaluating and/or consenting donors for specimen and/or data collection", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management", price:"\$100-149").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample storage and monitoring", price:"\$150-199").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank consumable/supply ordering support", price:"\$1-49").save(flush:true, failOnError:true)

		//Products25
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor and adjacent normal tissue FFPE blocks"), ischemicTime:"0-0.5 hours", stabilization:"Formalin fixation",	preservation:"Room temperature",	weight: "not reported", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$100-\$149", collectionVol:	"1,500-2,000", distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Whole blood"), ischemicTime:"0-0.5 hours", stabilization:"Controlled rate freezing", preservation:"-80°C Manual freezer", weight: "2.1-5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"1,500-2,000", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Serum"), ischemicTime:"0.6-1 hour", stabilization:"Controlled rate freezing", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"2,000-2,500	", distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor and adjacent normal tissue"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$150-\$199", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)

		//equipment25
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Cryostat"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "8", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microtome"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated tissue microarray (TMA) instrument"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$100,000-\$124,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$4,000-\$4,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "11 to 15", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "6", contract: SurveyEquipmentAnnual.findByName("\$8,000-\$8,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laser capture microdissection system"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$250,000-\$499,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$7,000-\$7,999")).save(flush:true, failOnError:true)

	}

	def load26() {
    println "Surveydata.groovy: loading survey sourceId = 26"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 26, inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 38, country: SurveyCountry.findByName("Italy"), geo: SurveyGeoArea.findByName("Urban"), international: "Yes", model: SurveyOperatingModel.findByName("Independent"), sites: 1, facility: SurveyFacility.findByName("<2000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("1%-25%"), markupSpecimen: 0, markupService: 0, indirectRate:0, surveyYear: 2014).save(flush:true, failOnError:true)
		
		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("not reported"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Data Manager"), range: SurveyLaborSalaryRange.findByName("\$10,000-\$19,999"),	fringe: SurveyLaborFringeRate.findByName("not reported"),	fte: "0.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab manager/supervisor"), range: SurveyLaborSalaryRange.findByName("\$80,000-\$99,999"),	fringe: SurveyLaborFringeRate.findByName("not reported"),	fte: "0.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Repository coordinator"), range: SurveyLaborSalaryRange.findByName("\$80,000-\$99,999"),	fringe: SurveyLaborFringeRate.findByName("not reported"),	fte: "0.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Other: Molecular biologist"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("not reported"),	fte: "0.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Other: Molecular biologist"), range: SurveyLaborSalaryRange.findByName("\$80,000-\$99,999"),	fringe: SurveyLaborFringeRate.findByName("not reported"),	fte: "0.5").save(flush:true, failOnError:true)
	
		//Services26
		datapoint = new SurveyService(survey: survey, type: "Other: Extraction of DNA/RNA, each", price:"\$1-49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Other: Serum/plasma processing, each", price:"\$1-49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Other: Establishment of cell lines from skin, each", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Other: Establishment of cell lines from muscle, each", price:"\$150-199").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Other: Distribution, flat fee", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Other: Distribution myoblast cell line, each", price:"\$50-\$99").save(flush:true, failOnError:true)
	
		//Products26
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("DNA, blood"), ischemicTime:">2 hours", stabilization:"Fresh (not stabilized)", preservation:"-20°C to -40°C Refrigerator",	weight: "not reported", dataCollected: "Pathology report + clinical data", price:"\$1-50", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: Skin biopsy for fibroblast culture"), ischemicTime:">2 hours", stabilization:"Other: Not specified", preservation:"-149°C to 190°C LN² Cryotank",	weight: "not reported", dataCollected: "Pathology report + clinical data", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: Whole blood for EBV Lymphoblast culture"), ischemicTime:">2 hours", stabilization:"Other: Not specified", preservation:"-149°C to 190°C LN² Cryotank",	weight: "not reported", dataCollected: "Pathology report + clinical data", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)

		//equipment26
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laminar flow cabinet/hood"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laboratory workbench"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Controlled rate freezer"), units: "11 to 15", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, stand-alone"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Incubator, manual"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C to minus 40°C Refrigerator"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 149°C to minus 190°C LN² Cryotank"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Cold room/walk-in"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microscope"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Real time PCR System"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("PCR thermal cycler"), units: "11 to 15", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Plasmid processing station"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Western blot transfer system"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("DNA/RNA sequencing system/analyzer"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Orbital bath shaker, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Autoclave"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Safety cabinet"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Clean room"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)

	}

	def load27() {
    println "Surveydata.groovy: loading survey sourceId = 27"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 27, inst: SurveyInstitutionType.findByName("Independent Research Laboratory"), age: 12, country: SurveyCountry.findByName("Canada"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Networked"), sites: 5, facility: SurveyFacility.findByName("5,001 to 15,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("1%-25%"), markupSpecimen: 0, markupService: 0, indirectRate:0, surveyYear: 2014).save(flush:true, failOnError:true)

		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Pathology Assistant"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "4").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Clinical Research Coordinator"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "4").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Data Manager"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Program/Project manager"), range: SurveyLaborSalaryRange.findByName("\$80,000-\$99,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Customer product/service representative"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "1").save(flush:true, failOnError:true)
	
		//Services27
		datapoint = new SurveyService(survey: survey, type: "Specimen transport", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "RNA integrity number (RIN) testing", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Pathology case review for clinical diagnosis and morphological confirmation", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Pathology external consult, case review", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Copy of pathology report", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen biosketch report", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobanking project/protocol consultation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen inventory management database consultation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Return of biospecimen research results to study participants and/or specimen donors", price:"\$0/free").save(flush:true, failOnError:true)

		//Products27
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor and adjacent normal tissue"), ischemicTime:"0-0.5 hours", stabilization:"Fresh (not stabilized)", preservation:"-149°C to 190°C LN² Cryotank", weight:"<0.5 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:	"2,500-3,000", distVol:"500-1,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor and adjacent normal TMA blocks"), ischemicTime:"not reported", stabilization:"Formalin fixation", preservation:"Room temperature", weight:"<0.5 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:	"2,000-2,500	", distVol:"500-1,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Plasma"), ischemicTime:">2 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-149°C to 190°C LN² Cryotank", weight:"<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"3,000-3,500", distVol:"500-1,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Buffy coat"), ischemicTime:">2 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-149°C to 190°C LN² Cryotank", weight:"<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"500-1000",  distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("DNA, tissue"), ischemicTime:"not reported", stabilization:"not reported", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("DNA, blood"), ischemicTime:"not reported", stabilization:"not reported", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("RNA, tissue"), ischemicTime:"not reported", stabilization:"not reported", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("RNA, blood"), ischemicTime:"not reported", stabilization:"not reported", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("H&E Slide, tumor and adjacent normal tissue sample FFPE"), ischemicTime:"not reported", stabilization:"not reported", preservation:"Room temperature", weight: "not reported", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "not reported", collectionVol:"1,500-2,000", distVol:"not reported").save(flush:true, failOnError:true)

		//equipment27
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Cryostat"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: ">20", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microtome"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: ">20", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Tissue embedding station"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: ">20", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laboratory workbench"), units: "5", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: ">20", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "5", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$5,000-\$5,999"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Manual tissue microarray (TMA) instrument"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: ">20", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Incubator, manual"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Biosafey cabinet Level II"), units: "5", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$7,000-\$7,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Weighing scale"), units: "5", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "15", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "5", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Cryocart"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Dry vapor shippers, large"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 149°C to minus 190°C LN² Cryotank"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$20,000-\$29,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Large block and slide storage firesafe"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$5,000-\$5,999"), life: ">20", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microscope"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Safety cabinet"), units: "5", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$7,000-\$7,999"), life:"not reported",contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laser capture microdissection system"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)

	}

	def load28() {
    println "Surveydata.groovy: loading survey sourceId = 28"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 28, inst: SurveyInstitutionType.findByName("Community Based Hospital"), age: 4, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Centralized"), sites: 2, facility: SurveyFacility.findByName("2,001 to 5,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("1%-25%"), markupSpecimen: 0, markupService: 0, indirectRate:20, surveyYear: 2014).save(flush:true, failOnError:true)
		
		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Research assistant"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "1").save(flush:true, failOnError:true)
	
//Products28
datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Buffy coat"), ischemicTime:"0.6-1 hour", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "0.6-1 ml", dataCollected: "not reported", price:"\$100-\$149", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)
datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Plasma"), ischemicTime:"0.6-1 hour", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "0.6-1 ml", dataCollected: "not reported", price:"\$100-\$149", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)
datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Urine"), ischemicTime:"0.6-1 hour", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "0.6-1 ml", dataCollected: "not reported", price:"\$100-\$149", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)

	}

	def load29() {
    println "Surveydata.groovy: loading survey sourceId = 29"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 29, inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 10, country: SurveyCountry.findByName("Singapore"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Centralized"), sites: 3, facility: SurveyFacility.findByName("5,001 to 15,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("1%-25%"), markupSpecimen: 0, markupService: 10, indirectRate:50, surveyYear: 2014).save(flush:true, failOnError:true)

		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "3").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Histotechnician"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "2").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Pathology Assistant"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "2").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Data Manager"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Clinical Research associate"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "4").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Research/Study nurse"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "2").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab manager/supervisor"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Head/Group/Team leader"), range: SurveyLaborSalaryRange.findByName("\$100,000-\$250,000"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Pathologist"), range: SurveyLaborSalaryRange.findByName("\$80,000-\$99,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Bioinformatics professional"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("General manager"), range: SurveyLaborSalaryRange.findByName("\$100,000-\$250,000"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Program/Project manager"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "0.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Quality manager"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "0.5").save(flush:true, failOnError:true)
	
		//Services29
		datapoint = new SurveyService(survey: survey, type: "Specimen collection kit assembly and shipping", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "RNA integrity number (RIN) testing", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Gene expression profiling (DNA, RNA, protein)", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Pathology case review for clinical diagnosis and morphological confirmation", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Pathology external consult, case review", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Copy of pathology report", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobanking project/protocol consultation", price:"\$200-\$249").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen protocol and/or consent writing", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen protocol regulatory submission", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen procedure/SOP writing", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen inventory management database consultation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank technical support, in-or out-sourced", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Evaluating and/or consenting donors for specimen and/or data collection", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample storage and monitoring", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank inventory management database quality/best practice review audit", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management quality/best practice review audit", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, transfer and/or relocation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, disaster recovery", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank consumable/supply ordering support", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen collection kit assembly and shipping", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Annual biospecimen/project collection report", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Education and training", price:"\$0/free").save(flush:true, failOnError:true)

		//Products29
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor and adjacent normal tissue"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-149°C to 190°C LN² Cryotank", weight:"<0.5 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$51-99", collectionVol:"500-1000",  distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("H&E Slide, tumor tissue"), ischemicTime:"0-0.5 hours", stabilization:"Formalin fixation", preservation:"Room temperature", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"500-1000",  distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("H&E Slide, normal tissue"), ischemicTime:"0-0.5 hours", stabilization:"Formalin fixation", preservation:"Room temperature", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"500-1000",  distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Whole blood"), ischemicTime:"1.1-1.5 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data", price: "\$1-50", collectionVol:"2,000-2,500	", distVol:"500-1,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Serum"), ischemicTime:"1.1-1.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data", price: "\$1-50", collectionVol:"2,500-3,000	", distVol:"500-1,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Plasma"), ischemicTime:"1.1-1.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data", price: "\$1-50", collectionVol:"2,500-3,000	", distVol:"500-1,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Urine"), ischemicTime:"0.6-1 hour", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight:"1.1-2 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"500-1000",  distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("DNA, tissue"), ischemicTime:"0-0.5 hours", stabilization:"Fresh (not stabilized)", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"500-1000",  distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("DNA, blood"), ischemicTime:"0-0.5 hours", stabilization:"Fresh (not stabilized)", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data", price: "\$1-50", collectionVol:"2,500-3,000	", distVol:"500-1,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("RNA, tissue"), ischemicTime:"0-0.5 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-149°C to 190°C LN² Cryotank", weight:"<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"500-1000",  distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("RNA, blood"), ischemicTime:"0-0.5 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-149°C to 190°C LN² Cryotank", weight:"<0.5 ml", dataCollected: "Pathology report + clinical data", price: "\$1-50", collectionVol:"2,500-3,000	", distVol:"500-1,000").save(flush:true, failOnError:true)

		//equipment29
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Cryostat"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"),price: SurveyEquipmentPrice.findByName("\$80,000-\$89,999"), life:"8" , contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microtome"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$20,000-\$29,999"), life: "8", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laminar flow cabinet/hood"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$20,000-\$29,999"), life: "8", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laboratory workbench"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$5,000-\$5,999"), life: "8", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Controlled rate freezer"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$30,000-\$39,999"), life: "8", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "8", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, stand-alone"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$30,000-\$39,999"), life: "8", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated sample/vial filling station, stand-alone"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$100,000-\$124,999"), life: "8", contract: SurveyEquipmentAnnual.findByName("\$2,000-\$2,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated nucleic acid/protein extraction instrument"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$50,000-\$59,999"), life: "8", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Incubator, manual"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$20,000-\$29,999"), life: "8", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$4,000-\$4,999"), life: "8", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bar-code flat scanner, multi-tray"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$2,000-\$2,999"), life: "8", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Protective shipping carton, industrial"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "8", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Large cryogenic aluminum Dewar's"), units: "5", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "8", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C to minus 40°C Refrigerator"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$9,000-\$9,999"), life: "8", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: "36 to 40", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "8", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 149°C to minus 190°C LN² Cryotank"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$30,000-\$39,999"), life: "8", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microscope"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$9,000-\$9,999"), life: "8", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("PCR thermal cycler"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$30,000-\$39,999"), life: "8", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("DNA/RNA sequencing system/analyzer"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$50,000-\$59,999"), life: "8", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Orbital bath shaker, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "8", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Autoclave"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "8", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Safety cabinet"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$9,000-\$9,999"), life: "12", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)

	}

	def load30() {
    println "Surveydata.groovy: loading survey sourceId = 30"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 30, inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 3, country: SurveyCountry.findByName("Finland"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Centralized"), sites: 2, facility: SurveyFacility.findByName("2,001 to 5,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("51%-75%"), markupSpecimen: 30, markupService: 30, indirectRate:55, surveyYear: 2014).save(flush:true, failOnError:true)
		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("> 50%"),	fte: "1.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Data Manager"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("> 50%"),	fte: "0.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Chief operating officer (COO)"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("> 50%"),	fte: "0.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("General manager"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("> 50%"),	fte: "0.5").save(flush:true, failOnError:true)
	
		//Services30
		datapoint = new SurveyService(survey: survey, type: "Specimen transport", price:"\$50-\$99").save(flush:true, failOnError:true)
	
		//Products30
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Bone marrow"), ischemicTime:">2 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-149°C to 190°C LN² Cryotank", weight:"<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price:"\$1-50", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Whole blood"), ischemicTime:">2 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-20°C to -40°C Refrigerator", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price:"\$1-50", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Serum"), ischemicTime:">2 hours", stabilization:"Fresh (not stabilized)", preservation:"-149°C to 190°C LN² Cryotank", weight:"<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price:"\$1-50", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Plasma"), ischemicTime:">2 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-149°C to 190°C LN² Cryotank", weight:"<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price:"\$1-50", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Skin"), ischemicTime:">2 hours", stabilization:"not reported", preservation:" -20°C to -40°C Refrigerator", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: Tissue for DNA"), ischemicTime:">2 hours", stabilization:"not reported", preservation:"-20°C to -40°C Refrigerator", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price:"\$1-50", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)

		//equipment30
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laminar flow cabinet/hood"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$7,000-\$7,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$7,000-\$7,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated nucleic acid/protein extraction instrument"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"),price: SurveyEquipmentPrice.findByName("\$125,000-\$149,999"),	life:"5",	contract: SurveyEquipmentAnnual.findByName("\$12,500-\$14,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual chest freezer"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 149°C to minus 190°C LN² Cryotank"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$60,000-\$69,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Clean room"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Lease"), price: SurveyEquipmentPrice.findByName("\$5,000-\$5,999"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
	}

	def load31() {
    println "Surveydata.groovy: loading survey sourceId = 31"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 31, inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 13, country: SurveyCountry.findByName("Belgium"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Centralized"), sites: 1, facility: SurveyFacility.findByName("<2000 ft²"), costRecovery: "No", expRecovery: SurveyExpRecovery.findByName("0%"), markupSpecimen: 0, markupService: 0, indirectRate:15, surveyYear: 2014).save(flush:true, failOnError:true)
		
		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$100,000-\$250,000"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "2").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab manager/supervisor"), range: SurveyLaborSalaryRange.findByName("\$100,000-\$250,000"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "1").save(flush:true, failOnError:true)
	
		//Services31
		datapoint = new SurveyService(survey: survey, type: "Specimen collection kit assembly and shipping", price:"\$100-\$149").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Copy of pathology report", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobanking project/protocol consultation", price:"\$250-\$299").save(flush:true, failOnError:true)

		//Products31
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("H&E Slide, tumor tissue"), ischemicTime:"0.6-1 hour", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "not reported", dataCollected: "Pathology report + clinical data", price: "not reported", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("H&E Slide, normal tissue"), ischemicTime:"0.6-1 hour", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "not reported", dataCollected: "Pathology report + clinical data", price: "not reported", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("H&E Slide, tumor and adjacent normal tissue sample FFPE"), ischemicTime:"0.6-1 hour", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "not reported", dataCollected: "Pathology report + clinical data", price: "not reported", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("H&E Slide, tumor tissue"), ischemicTime:"0.6-1 hour", stabilization:"Formalin fixation", preservation:"Room temperature",	weight: "not reported", dataCollected: "Pathology report + clinical data", price: "\$100-\$149", collectionVol:"250-500", distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("H&E Slide, normal tissue"), ischemicTime:"0.6-1 hour", stabilization:"Formalin fixation", preservation:"Room temperature",weight: "not reported", dataCollected: "Pathology report + clinical data", price: "\$100-\$149", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("H&E Slide, tumor and adjacent normal tissue sample FFPE"), ischemicTime:"0.6-1 hour", stabilization:"Formalin fixation", preservation:"Room temperature",	weight: "not reported", dataCollected: "Pathology report + clinical data", price: "\$100-\$149", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)

		//equipment31
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Cold table/cryogenic workbench"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$20,000-\$29,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laminar flow cabinet/hood"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "6", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laboratory workbench"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$6,000-\$6,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$2,000-\$2,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 149°C to minus 190°C LN² Cryotank"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$20,000-\$29,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Basic electrophoresis equipment"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "6", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)

	}

	def load32() {
    println "Surveydata.groovy: loading survey sourceId = 32"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 32, inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 9, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Independent"), sites: 5, facility: SurveyFacility.findByName("2,001 to 5,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("51%-75%"), markupSpecimen: 0, markupService: 50, indirectRate:52,  surveyYear: 2014).save(flush:true, failOnError:true)

		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "2").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Research assistant"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "1.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab manager/supervisor"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Other: Facility director"), range: SurveyLaborSalaryRange.findByName("\$80,000-\$99,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "1").save(flush:true, failOnError:true)
	
		//Services32
		datapoint = new SurveyService(survey: survey, type: "Specimen collection kit assembly and shipping", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Other: Packaging specimen shipments (flat fee, does not include additional shipping fees)", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "RNA integrity number (RIN) testing", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen proficiency testing", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobanking project/protocol consultation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen protocol and/or consent writing", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen protocol regulatory submission", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen procedure/SOP writing", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen inventory management database consultation", price:"\$500-\$599").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank technical support, in-or out-sourced", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Return of biospecimen research results to study participants and/or specimen donors", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample storage and monitoring", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management quality/best practice review audit", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, transfer and/or relocation", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, culling", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, disaster recovery", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank consumable/supply ordering support", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Annual biospecimen/project collection report", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Education and training", price:"\$0/free").save(flush:true, failOnError:true)
	
		//Products32
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("DNA, blood"), ischemicTime:"0.6-1 hour", stabilization:"Fresh (not stabilized)", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "not reported",, price: "\$1-50", collectionVol:"5,500-6,000",	distVol:"3,000-3,500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Serum"), ischemicTime:"0-0.5 hours", stabilization:"Fresh (not stabilized)", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "not reported", price: "\$1-50", collectionVol:"3,500-4,000	", distVol:"500-1,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Plasma"), ischemicTime:"0-0.5 hours", stabilization:"Fresh (not stabilized)", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "not reported", price: "\$1-50", collectionVol:"3,500-4,000	", distVol:"500-1,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: DNA, saliva"), ischemicTime:">2 hours", stabilization:"Other: Vendor collection kit", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "not reported", price: "\$1-50", collectionVol:"3,000-3,500", distVol:"1,500-2,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("RNA, blood"), ischemicTime:">2 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "not reported", price:"\$1-50", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)

		//equipment32
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laminar flow cabinet/hood"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "12", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laboratory workbench"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$5,000-\$5,999"), life: "12", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated sample/vial filling station, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$100,000-\$124,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("\$12,500-\$14,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated nucleic acid/protein extraction instrument"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$250,000-\$499,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("\$40,000-\$49,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "8", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk sample labeler, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$50,000-\$59,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$5,000-\$5,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C to minus 40°C Refrigerator"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$9,000-\$9,999"), life: "8", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"),units: "16-20",	buy: SurveyEquipmentBuyLease.findByName("Buy"),, price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life:"8",	contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Cold room/walk-in"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("High through-put screening instrument"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$30,000-\$39,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$3,000-\$3,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("DNA/RNA sequencing system/analyzer"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Autoclave"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Molecular device plate spectrophotometer/luminometer"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$50,000-\$59,999"), life: "12", contract: SurveyEquipmentAnnual.findByName("\$6,000-\$6,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Nanodrop"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$9,000-\$9,999"), life: "12", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Real time PCR machine"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$30,000-\$39,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$3,000-\$3,999")).save(flush:true, failOnError:true)
}

	def load33() {
    println "Surveydata.groovy: loading survey sourceId = 33"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 33, inst: SurveyInstitutionType.findByName("Community Based Hospital"), age: 11, country: SurveyCountry.findByName("Belgium"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Federated"), sites: 3, facility: SurveyFacility.findByName("5,001 to 15,000 ft²"), costRecovery: "No", expRecovery: SurveyExpRecovery.findByName("0%"), markupSpecimen: 0, markupService: 0, indirectRate:2, surveyYear: 2014).save(flush:true, failOnError:true)

		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "2").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Data Manager"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "0.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Research assistant"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "0.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Business manager"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("General manager"), range: SurveyLaborSalaryRange.findByName("\$80,000-\$99,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "0.5").save(flush:true, failOnError:true)
	
		//Services33
		datapoint = new SurveyService(survey: survey, type: "Specimen collection kit assembly and shipping", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen transport", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "RNA integrity number (RIN) testing", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobanking project/protocol consultation", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen protocol and/or consent writing", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen protocol regulatory submission", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen procedure/SOP writing", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen inventory management database consultation", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank technical support, in-or out-sourced", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample storage and monitoring", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank inventory management database quality/best practice review audit", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management quality/best practice review audit", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, transfer and/or relocation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, culling", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, disaster recovery", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank consumable/supply ordering support", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen collection kit assembly and shipping", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Annual biospecimen/project collection report", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Education and training", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Other: DNA/RNA concentration/purity testing by spectrophotometry", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Other: Automated DNA/RNA extraction from batch samples", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Other: DNA Integrity testing", price:"\$0/free").save(flush:true, failOnError:true)
	
		//Products33
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Plasma"), ischemicTime:"1.1-1.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight:"1.1-2 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$0", collectionVol: "2,500-3,000", distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Serum"), ischemicTime:"1.1-1.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight:"1.1-2 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$0", collectionVol: "2,500-3,000", distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("DNA, tissue"), ischemicTime:"0.6-1 hour", stabilization:"Snap-Freezing with or without OCT", preservation:"-149°C to 190°C LN² Cryotank", weight:"<0.5 gm", dataCollected:"Pathology report", price: "\$0", collectionVol:"500-1000",  distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("DNA, blood"), ischemicTime:"1.1-1.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$0", collectionVol:"1,500-2,000", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("RNA, tissue"), ischemicTime:"0.6-1 hour", stabilization:"Snap-Freezing with or without OCT", preservation:"-149°C to 190°C LN² Cryotank", weight:"<0.5 gm", dataCollected:"Pathology report", price: "\$0", collectionVol:"500-1000",  distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("RNA, blood"), ischemicTime:"1.1-1.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$0", collectionVol:"1,500-2,000", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Buccal cells"), ischemicTime:"0-0.5 hours", stabilization:"not reported", preservation:"-20°C to -40°C Refrigerator",	weight:"not reported", dataCollected:	"not reported", price: "\$0", collectionVol:"500-1000",  distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: WBC from peripheral blood/bone marrow"), ischemicTime:"1.1-1.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$0", collectionVol:"1,500-2,000", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: Erythrocytes"), ischemicTime:"1.1-1.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "0.6-1 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$0", collectionVol:"500-1000",  distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Buffy coat"), ischemicTime:"0.6-1 hour", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "0.6-1 ml",	dataCollected:"not reported", price: "\$0", collectionVol:"500-1000",  distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Normal tissue"), ischemicTime:"0-0.5 hours", stabilization:"Formalin fixation", preservation:"Room temperature", weight:"<0.5 gm", dataCollected:"not reported", price: "\$0", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: Blood clot"), ischemicTime:"0.6-1 hour", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight:"1.1-2 ml", dataCollected:"not reported", price: "\$0", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Urine"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight:"<0.5 ml", dataCollected:"not reported", price: "\$0", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: Feces"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight:"<0.5 gm", dataCollected:"not reported", price: "\$0", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: Maygrunwald giemsa stained bone marrow smears"), ischemicTime:"0.6-1 hour", stabilization:"Other: methanol", preservation:"Room temperature",	weight: "not reported", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$0", collectionVol:"1,500-2,000", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("PBMC's"), ischemicTime:"1.1-1.5 hours", stabilization:"Controlled rate freezing", preservation:"-149°C to 190°C LN² Cryotank", weight: "0.6-1 ml", dataCollected: "Pathology report + clinical data", price: "\$0", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Normal tissue"), ischemicTime:"0.6-1 hour", stabilization:"Snap-Freezing with or without OCT", preservation:"-149°C to 190°C LN² Cryotank", weight:"<0.5 gm", dataCollected:"Pathology report", price:"\$0", collectionVol:"1,500-2,000", distVol:"1-250").save(flush:true, failOnError:true)

		//equipment33
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laminar flow cabinet/hood"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laboratory workbench"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: ">20", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "5", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$4,000-\$4,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Cell counter"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Vortex"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "15", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "5", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Large cryogenic aluminum Dewar's"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: ">20", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C to minus 40°C Refrigerator"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$4,000-\$4,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: "5", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 149°C to minus 190°C LN² Cryotank"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$30,000-\$39,999"), life: ">20", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Real time PCR System"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$50,000-\$59,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("PCR thermal cycler"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$5,000-\$5,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Spectrophotometer"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$20,000-\$29,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Bioanalyzer"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)

	}

	def load34() {
    println "Surveydata.groovy: loading survey sourceId = 34"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 34, inst: SurveyInstitutionType.findByName("Government Program"), age: 14, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "Yes", model: SurveyOperatingModel.findByName("Centralized"), sites: 1, facility: SurveyFacility.findByName("<2000 ft²"), costRecovery: "No", expRecovery: SurveyExpRecovery.findByName("0%"), markupSpecimen: 0, markupService: 0, indirectRate:0, surveyYear: 2014).save(flush:true, failOnError:true)

		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Histotechnician"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Head/Group/Team leader"), range: SurveyLaborSalaryRange.findByName("\$100,000-\$250,000"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Pathologist"), range: SurveyLaborSalaryRange.findByName("> \$250,000"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "1").save(flush:true, failOnError:true)
	
		//equipment34
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Cryostat"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$30,000-\$39,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Tissue processor, walk away"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$40,000-\$49,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microtome"), units: "5", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Tissue embedding station"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$3,000-\$3,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laboratory workbench"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$5,000-\$5,999"), life: "7", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Manual tissue microarray (TMA) instrument"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated tissue microarray (TMA) instrument"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$150,000-\$174,999"), life:"5",contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Slide autostainer"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$7,000-\$7,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$2,000-\$2,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated tissue cassette labeler, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$2,000-\$2,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated microplate washer, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$5,000-\$5,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C to minus 40°C Refrigerator"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$5,000-\$5,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$7,000-\$7,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microscope"), units: "5", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$5,000-\$5,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("High through-put screening instrument"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$250,000-\$499,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$20,000-\$22,499")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Real time PCR System"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("PCR thermal cycler"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$5,000-\$5,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Western blot transfer system"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$2,000-\$2,999"), life: "7", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Orbital bath shaker, bench-top"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Safety cabinet"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laser capture microdissection system"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"),price: SurveyEquipmentPrice.findByName("\$125,000-\$149,999"),life:"10",	contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)

	}

	def load35() {
    println "Surveydata.groovy: loading survey sourceId = 35"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 35, inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 16, country: SurveyCountry.findByName("Canada"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Centralized"), sites: 1, facility: SurveyFacility.findByName("2,001 to 5,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("76%-100%"), markupSpecimen: 30, markupService: 10, indirectRate:30, surveyYear: 2014).save(flush:true, failOnError:true)

		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "3").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab manager/supervisor"), range: SurveyLaborSalaryRange.findByName("\$80,000-\$99,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Other: Assistant technician"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "2").save(flush:true, failOnError:true)
	
		//Services35
		datapoint = new SurveyService(survey: survey, type: "Specimen transport", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobanking project/protocol consultation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Other: Biospecimen protocol and/or consent writing, including SOPs", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen procedure/SOP writing", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen inventory management database consultation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank technical support, in-or out-sourced", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample storage and monitoring", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank inventory management database quality/best practice review audit", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, transfer and/or relocation", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, culling", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank consumable/supply ordering support", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Annual biospecimen/project collection report", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Education and training", price:"\$0/free").save(flush:true, failOnError:true)
	
		//Products35
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor and adjacent normal tissue"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-149°C to 190°C LN² Cryotank", weight:"<0.5 gm", dataCollected: "not reported", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor and adjacent normal tissue FFPE blocks"), ischemicTime:"0.6-1 hour", stabilization:"Formalin fixation", preservation:"Room temperature", weight: "<0.5 gm", dataCollected: "not reported", 	price:"not reported", collectionVol:"1-250", distVol:"0").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor and adjacent normal TMA blocks"), ischemicTime:"0.6-1 hour", stabilization:"Formalin fixation",	preservation:"Room temperature", weight: "<0.5 gm", dataCollected: "not reported", 	price:"\$200-\$249", collectionVol:"1-250", distVol:"0").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: Image of H&E Slide, tumor and adjacent normal tissue sample FFPE"), ischemicTime:"0.6-1 hour", stabilization:"not applicable", preservation:"Room temperature", weight: "<0.5 gm", dataCollected: "not reported", price: "\$1-50", collectionVol:"500-1000",  distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Whole blood"), ischemicTime:"not reported", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"Room temperature", weight: "0.6-1 ml", dataCollected: "not reported", price: "\$1-50", collectionVol: "1,500-2,000", distVol:"0").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Serum"), ischemicTime:">2 hours", stabilization:"not reported", preservation:"-149°C to 190°C LN² Cryotank", weight:"<0.5 ml", dataCollected: "not reported",, price: "\$1-50", collectionVol:"6,500-7,000	", distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Buffy coat"), ischemicTime:">2 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-149°C to 190°C LN² Cryotank", weight: "1.1-2 ml",dataCollected: "not reported", price:"not reported",collectionVol:"3,500-4,000", distVol:"0").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Plasma"), ischemicTime:">2 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-149°C to 190°C LN² Cryotank", weight: "1.1-2 ml",dataCollected: "not reported", price: "\$1-50", collectionVol: "4,500-5000", distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Urine"), ischemicTime:">2 hours", stabilization:"not reported", preservation:"-149°C to 190°C LN² Cryotank", weight: "1.1-2 ml",dataCollected: "not reported",, price: "\$1-50", collectionVol:"3,500-4,000", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Saliva"), ischemicTime:"not reported", 	stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"Room temperature", weight: "1.1-2 ml",dataCollected: "not reported", 	price:"not reported",	collectionVol:"250-500", distVol:"0").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("PBMC's"), ischemicTime:"0-0.5 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-149°C to 190°C LN² Cryotank", weight:"not reported", dataCollected: "not reported", price:	"not reported", collectionVol:"2,500-3,000", distVol:"0").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("DNA, tissue"), ischemicTime:"not reported", stabilization:"Other: Not specified", preservation:"Other: Variable: 4°C or 80°C", weight: "0.6-1 ml", dataCollected: "not reported", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("DNA, blood"), ischemicTime:"not reported", stabilization:"Other: Not specified", preservation:"Other: Variable: 4°C or 80°C", weight: "0.6-1 ml", dataCollected: "not reported", price: "\$1-50", collectionVol:"500-1000",  distVol:"1,500-2,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("RNA, blood"), ischemicTime:"0.6-1 hour", stabilization:"Snap-Freezing with or without OCT", preservation:"-149°C to 190°C LN² Cryotank", weight:"<0.5 ml", dataCollected: "not reported", price: "\$1-50", collectionVol:"1-250", distVol:"0").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: Lymphblast cell lines"), ischemicTime:"0.6-1 hour", stabilization:"Controlled rate freezing", preservation:"-149°C to 190°C LN² Cryotank", weight: "0.6-1 ml", dataCollected: "not reported", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: Lymphocytes"), ischemicTime:"0-0.5 hours", stabilization:"Controlled rate freezing", preservation:"-149°C to 190°C LN² Cryotank", weight: "0.6-1 ml", dataCollected: "not reported", 	price:"not reported", collectionVol:"2,500-3,000", distVol:"0").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: DNA, saliva"), ischemicTime:"not reported", stabilization: "Other: Not specified", preservation:"-80°C Manual freezer", weight: "0.6-1 ml", dataCollected: "not reported", price:"\$1-50", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)
		
		//equipment35
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laminar flow cabinet/hood"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$40,000-\$49,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Controlled rate freezer"), units: "5", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated sample/vial filling station, stand-alone"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName(">\$500,000"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$25,000-\$27,499")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated nucleic acid/protein extraction instrument"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName(">\$500,000"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$25,000-\$27,499")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Pipettors"), units: "11 to 15", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Pipette aids"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: RiOs water filtration system"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$4,000-\$4,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Balance"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Water bath"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$2,000-\$2,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated sample capper-de-capper, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$30,000-\$39,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Cryo-cart"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C to minus 40°C Refrigerator"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$2,000-\$2,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 149°C to minus 190°C LN² Cryotank"), units: "16 to 20", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$30,000-\$39,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Mobile Cryo-tank rack lift system"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$30,000-\$39,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Refrigerator"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$4,000-\$4,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Cart"), units:"2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "15", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Slide drawer filing system"), units: "41 to 45", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: ">20", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Safety cabinet"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Nanodrop"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$20,000-\$29,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Agarose gel electrophoresis system"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Gel documentation system"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)


	}

	def load36() {
    println "Surveydata.groovy: loading survey sourceId = 36"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 36, inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 5, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Centralized"), sites: 1, facility: SurveyFacility.findByName("5,001 to 15,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("26%-50%"), markupSpecimen: 0, markupService: 0, indirectRate:10,  surveyYear: 2014).save(flush:true, failOnError:true)

		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("not reported"),	fte: "2").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Research/Study nurse"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab manager/supervisor"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Repository manager"), range: SurveyLaborSalaryRange.findByName("\$80,000-\$99,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Customer product/service representative"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("not reported"),	fte: "1").save(flush:true, failOnError:true)

		//Services36
		datapoint = new SurveyService(survey: survey, type: "Specimen collection kit assembly and shipping", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "RNA integrity number (RIN) testing", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Pathology case review for clinical diagnosis and morphological confirmation", price:"\$150-\$199").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Pathology external consult, case review", price:"\$150-\$199").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Copy of pathology report", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen biosketch report", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobanking project/protocol consultation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Evaluating and/or consenting donors for specimen and/or data collection", price:"\$50-\$99").save(flush:true, failOnError:true)
	
		//Products36
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor tissue"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data", price: "\$400-\$449", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Normal tissue"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data", price: "not reported", collectionVol: "not reported", distVol:"not reported").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor and adjacent normal tissue"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data", price: "\$400-\$449", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor and adjacent normal tissue FFPE blocks"), ischemicTime:"0-0.5 hours", stabilization:"Formalin fixation", preservation:"Room temperature", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data", price: "\$100-\$149", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("H&E Slide, tumor and adjacent normal tissue sample FFPE"), ischemicTime:">2 hours", stabilization:"Formalin fixation", preservation:"-80°C Manual freezer", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data", price: "\$100-\$149", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Skin"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data", price: "\$400-\$449", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Whole blood"), ischemicTime:"0.6-1 hour", stabilization:"Controlled rate freezing", preservation:"-80°C Manual freezer", weight: "0.6-1 ml", dataCollected: "Pathology report + clinical data", price:"\$51-99", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Serum"), ischemicTime:"0.6-1 hour", stabilization:"Controlled rate freezing", preservation:"-80°C Manual freezer", weight: "0.6-1 ml", dataCollected: "Pathology report + clinical data", price:"\$51-99", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Buffy coat"), ischemicTime:"0.6-1 hour", stabilization:"Controlled rate freezing", preservation:"-80°C Manual freezer", weight: "0.6-1 ml", dataCollected: "Pathology report + clinical data", price:"\$51-99", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Plasma"), ischemicTime:"0.6-1 hour", stabilization:"Controlled rate freezing", preservation:"-80°C Manual freezer", weight: "0.6-1 ml", dataCollected: "Pathology report + clinical data", price:"\$51-99", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Urine"), ischemicTime:"0.6-1 hour", stabilization:"Controlled rate freezing", preservation:"-80°C Manual freezer", weight: "0.6-1 ml", dataCollected: "Pathology report + clinical data", price:"\$51-99", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)

		//equipment36
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laminar flow cabinet/hood"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "13", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laboratory workbench"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"),price: SurveyEquipmentPrice.findByName("not reported"), life:"not reported",	contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$6,000-\$6,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated nucleic acid/protein extraction instrument"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$30,000-\$39,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$6,000-\$6,999"), life: "17", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated tissue cassette labeler, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$5,000-\$5,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C to minus 40°C Refrigerator"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$2,000-\$2,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"),price: SurveyEquipmentPrice.findByName("\$125,000-\$149,999"), life:"15",contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
	
	}

	def load37() {
    println "Surveydata.groovy: loading survey sourceId = 37"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 37, inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 9, country: SurveyCountry.findByName("Australia"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Federated"), sites: 4, facility: SurveyFacility.findByName("5,001 to 15,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("1%-25%"), markupSpecimen: 0, markupService: 0, indirectRate:0, surveyYear: 2014).save(flush:true, failOnError:true)

		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Research assistant"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "2").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Repository manager"), range: SurveyLaborSalaryRange.findByName("\$80,000-\$99,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Repository coordinator"), range: SurveyLaborSalaryRange.findByName("\$80,000-\$99,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "5").save(flush:true, failOnError:true)
	
		//Services37
		datapoint = new SurveyService(survey: survey, type: "Specimen transport", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobanking project/protocol consultation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen protocol and/or consent writing", price:"\$0/free").save(flush:true, failOnError:true)

		//Products37
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor tissue"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$200-\$249", collectionVol:"500-1000",  distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Normal tissue"), ischemicTime:"not reported", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$200-\$249", collectionVol:"500-1000",  distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor tissue"), ischemicTime:"0.6-1 hour", stabilization:"Formalin fixation", preservation:"Room temperature", weight: ">1.1 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"500-1000",  distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor and adjacent normal tissue"), ischemicTime:"0.6-1 hour", stabilization:"Formalin fixation", preservation:"Room temperature", weight: ">1.1 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"500-1000",  distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("H&E Slide, tumor tissue"), ischemicTime:"not reported", stabilization:"not reported", preservation:"Room temperature", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"500-1000",  distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Serum"), ischemicTime:">2 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-80°C Manual freezer", weight: "0.6-1 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$51-99", collectionVol:"3,500-4,000", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Buffy coat"), ischemicTime:">2 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-80°C Manual freezer", weight: "0.6-1 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$51-99", collectionVol:"3,500-4,000", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Plasma"), ischemicTime:">2 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-80°C Manual freezer", weight: "0.6-1 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$51-99", collectionVol:"3,500-4,000", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Post mortem tissue"), ischemicTime:">2 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: ">1.1 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$51-99", collectionVol:"3,500-4,000", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("DNA, blood"), ischemicTime:">2 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-80°C Manual freezer", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price:"\$51-99", collectionVol:"1-250", distVol:"500-1,000").save(flush:true, failOnError:true)
			
		//equipment37
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laminar flow cabinet/hood"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laboratory workbench"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"),price: SurveyEquipmentPrice.findByName("not applicable"), life:	"not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Controlled rate freezer"), units: "11 to 15", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$4,000-\$4,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"),price: SurveyEquipmentPrice.findByName("not applicable"), life:	"not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, stand-alone"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"),price: SurveyEquipmentPrice.findByName("not applicable"), life:	"not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("\$3,000-\$3,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microscope"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$4,000-\$4,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("PCR thermal cycler"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$4,000-\$4,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)

	}

	def load38() {
    println "Surveydata.groovy: loading survey sourceId = 38"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 38, inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 1, country: SurveyCountry.findByName("Canada"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Centralized"), sites: 5, facility: SurveyFacility.findByName("<2000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("26%-50%"), markupSpecimen: 0, markupService: 0, indirectRate:5, surveyYear: 2014).save(flush:true, failOnError:true)

		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab manager/supervisor"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "0.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Repository manager"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Administrative/Executive assistant"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "0.5").save(flush:true, failOnError:true)

		//Services38
		datapoint = new SurveyService(survey: survey, type: "Pathology case review for clinical diagnosis and morphological confirmation", price:"\$1-49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobanking project/protocol consultation", price:"\$1-49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen protocol and/or consent writing", price:"\$1-49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen protocol regulatory submission", price:"\$1-49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen procedure/SOP writing", price:"\$1-49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen inventory management database consultation", price:"\$1-49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank technical support, in-or out-sourced", price:"\$1-49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Evaluating and/or consenting donors for specimen and/or data collection", price:"\$1-49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management", price:"\$1-49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Other: Sample storage and monitoring, annually per shelf", price:"\$1,000-\$1,999").save(flush:true, failOnError:true)

		//Products38
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Bone marrow"), ischemicTime:"0.6-1 hour", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-149°C to 190°C LN² Cryotank", weight: "0.6-1 ml", dataCollected: "Pathology report + clinical data", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("DNA, blood"), ischemicTime:">2 hours", stabilization: "Additive (e.g. heparin, citrate, EDTA)", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data", price: "\$51-99", collectionVol: "3,000-3,499", distVol: "1,000-1,499").save(flush:true, failOnError:true)
			
		//equipment38
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laminar flow cabinet/hood"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$7,000-\$7,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laboratory workbench"), units: "5", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bar-code flat scanner, multi-tray"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 148°C Manual vertical freezer"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 149°C to minus 190°C LN² Cryotank"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$20,000-\$29,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microscope"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$5,000-\$5,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)

	}

	def load39() {
    println "Surveydata.groovy: loading survey sourceId = 39"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 39, inst: SurveyInstitutionType.findByName("Commercial entity"), age: 4, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "Yes", model: SurveyOperatingModel.findByName("Centralized"), sites: 1, facility: SurveyFacility.findByName("5,001 to 15,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("> 100%"), markupSpecimen: 30, markupService: 30, indirectRate:0, surveyYear: 2014).save(flush:true, failOnError:true)
		
		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Data Manager"), range: SurveyLaborSalaryRange.findByName("\$80,000-\$99,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "0.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Chief operating officer (COO)"), range: SurveyLaborSalaryRange.findByName("\$100,000-\$250,000"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "0").save(flush:true, failOnError:true)

		//Services39
		datapoint = new SurveyService(survey: survey, type: "Specimen collection kit assembly and shipping", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "RNA integrity number (RIN) testing", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen proficiency testing", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Genetic testing", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "SNP genotyping", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "DNA sequencing", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Gene expression profiling (DNA, RNA, protein)", price:"\$200-\$249").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobanking project/protocol consultation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen procedure/SOP writing", price:"\$1,000-\$1,999").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank technical support, in-or out-sourced", price:"\$100-\$149").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample storage and monitoring", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank inventory management database quality/best practice review audit", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management quality/best practice review audit", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, transfer and/or relocation", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, culling", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, disaster recovery", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank consumable/supply ordering support", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen collection kit assembly and shipping", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Annual biospecimen/project collection report", price:"\$1-\$49").save(flush:true, failOnError:true)

//Products39
datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("DNA, tissue"), ischemicTime:">2 hours", stabilization: "not reported", preservation:"-80°C Manual freezer", weight: "<0.5 gm", dataCollected: "not reported",, price: "\$1-50", collectionVol: "5,000-5,500", distVol: "4,500-5,000").save(flush:true, failOnError:true)
datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("DNA, blood"), ischemicTime:">2 hours", stabilization: "not reported", preservation:"-80°C Manual freezer", weight: "<0.5 gm", dataCollected: "not reported", price: "\$1-50", collectionVol: "10,000-20,000", distVol: "10,000-20,000").save(flush:true, failOnError:true)
datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("RNA, blood"), ischemicTime:">2 hours", stabilization: "not reported", preservation:"-80°C Manual freezer", weight: "<0.5 gm", dataCollected: "not reported", price:"\$51-99", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
//equipment39
datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Controlled rate freezer"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$9,000-\$9,999"), life: "20", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bar-code flat scanner, multi-tray"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$7,000-\$7,999"), life: ">20", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated sample capper-de-capper, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C to minus 40°C Refrigerator"), units: "11 to 15", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: "5", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$9,000-\$9,999"), life: "20", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Gene array scanner workstation"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$50,000-\$59,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Real time PCR System"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$40,000-\$49,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("\$3,000-\$3,999")).save(flush:true, failOnError:true)
datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("PCR thermal cycler"), units: "5", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$2,000-\$2,999"), life: "20", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)

	}

	def load40() {
    println "Surveydata.groovy: loading survey sourceId = 40"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 40, inst: SurveyInstitutionType.findByName("Community Based Hospital"), age: 4, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Centralized"), sites: 4, facility: SurveyFacility.findByName("<2000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("26%-50%"), markupSpecimen: 0, markupService: 0, indirectRate:0, surveyYear: 2014).save(flush:true, failOnError:true)

		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "2").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Clinical Research Coordinator"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Data Manager"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Clinical Research associate"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab manager/supervisor"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Repository manager"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Other: Chief scientific officer (CSO)/Site PI's"), range: SurveyLaborSalaryRange.findByName("\$100,000-\$250,000"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "0.5").save(flush:true, failOnError:true)
	
		//Services40
		datapoint = new SurveyService(survey: survey, type: "Specimen collection kit assembly and shipping", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen transport", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Immunohistochemistry (IHC) testing", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "RNA integrity number (RIN) testing", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Pathology case review for clinical diagnosis and morphological confirmation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Pathology external consult, case review", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Copy of pathology report", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen biosketch report", price:"\$0/free").save(flush:true, failOnError:true)

		//Products40
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Whole blood"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "0.6-1 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$150-\$199", collectionVol: "1,500-2,000	", distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Serum"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "0.6-1 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$150-\$199", collectionVol: "1,500-2,000	", distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Buffy coat"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "0.6-1 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$150-\$199", collectionVol:"500-1000",  distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Plasma"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "0.6-1 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$150-\$199", collectionVol: "1,500-2,000	", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Urine"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "2.1-5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$150-\$199", collectionVol: "4,000-4,500	", distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Cord blood"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "0.6-1 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$200-\$249", collectionVol: "2,000-2,500	", distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("PBMC's"), ischemicTime:"1.1-1.5 hours", stabilization: "Controlled rate freezing", preservation:"-149°C to 190°C LN² Cryotank", weight: "0.6-1 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$200-\$249", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Buccal cells"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$150-\$199", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: Formalin fixed placental tissue"), ischemicTime: "0-0.5 hours", stabilization:"Formalin fixation", preservation:	"<27°C Humidity controlled environment", weight: ">1.1 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$150-\$199", collectionVol:"500-1000",  distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: RNA later preserved placental punches"), ischemicTime:"0-0.5 hours", stabilization: "Other: Not specified", preservation:"-20°C to -40°C Refrigerator", weight: "0.6-1 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$200-\$249", collectionVol:"500-1000",  distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: Snap frozen placental tissue"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "0.6-1 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$200-\$249", collectionVol:"500-1000",  distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: Cervical/Vaginal/Rectal swabs (multiomics)"), ischemicTime:"0-0.5 hours", stabilization: "Other: Not specified", preservation:"-80°C Manual freezer", weight: "0.6-1 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$200-\$249", collectionVol:"500-1000",  distVol:"500-1,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: CBMC's"), ischemicTime:"0-0.5 hours", stabilization:"Controlled rate freezing", preservation:"-149°C to 190°C LN² Cryotank", weight: "0.6-1 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$200-\$249", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)

		//equipment40
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Cold table/cryogenic workbench"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "20", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Cryostat"), units: "1", buy: SurveyEquipmentBuyLease.findByName("not reported"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Tissue processor, walk away"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microtome"), units: "1", buy: SurveyEquipmentBuyLease.findByName("not reported"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Tissue embedding station"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laminar flow cabinet/hood"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laboratory workbench"), units: "2", buy: SurveyEquipmentBuyLease.findByName("not reported"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$5,000-\$5,999"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Incubator, manual"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Slide autostainer"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$30,000-\$39,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C to minus 40°C Refrigerator"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 149°C to minus 190°C LN² Cryotank"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$20,000-\$29,999"),  life: "not reported",contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microscope"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Real time PCR System"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"),  life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("PCR thermal cycler"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Reagent dispenser"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Autoclave"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Safety cabinet"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Spectrophotomer"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$9,000-\$9,999"), life: "not reported",contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Analytical balance"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$4,000-\$4,999"), life: "not reported",contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
	}

	def load41() {
    println "Surveydata.groovy: loading survey sourceId = 41"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 41, inst: SurveyInstitutionType.findByName("Independent Research Laboratory"), age: 5, country: SurveyCountry.findByName("Italy"), geo: SurveyGeoArea.findByName("Urban"), international: "Yes", model: SurveyOperatingModel.findByName("Networked"), sites: 1, facility: SurveyFacility.findByName("<2000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("1%-25%"), markupSpecimen: 0, markupService: 0, indirectRate:0, surveyYear: 2014).save(flush:true, failOnError:true)

		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Data Manager"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Other: Sample manager"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Technical/Executive director"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Other: Bioethics consultant"), range: SurveyLaborSalaryRange.findByName("\$5,001-\$9,999"),	fringe: SurveyLaborFringeRate.findByName("not reported"),	fte: "0.5").save(flush:true, failOnError:true)
	
		//Services41
		datapoint = new SurveyService(survey: survey, type: "Specimen transport", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobanking project/protocol consultation", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen protocol and/or consent writing", price:"\$50-\$99").save(flush:true, failOnError:true)

		//Products41
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Serum"), ischemicTime:"1.6-2 hours", stabilization:"not reported", preservation:"-80°C Manual freezer", weight: "0.6-1 ml", dataCollected: "Pathology report + clinical data", price: "\$1-50", collectionVol:"500-1000",  distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Plasma"), ischemicTime:"1.6-2 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-80°C Manual freezer", weight: "1.1-2 ml", dataCollected: "Pathology report + clinical data", price:	"\$1-50", collectionVol:"500-1000",  distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Urine"), ischemicTime:">2 hours", stabilization:"not reported", preservation:"-80°C Manual freezer", weight: "1.1-2 ml", dataCollected: "Pathology report + clinical data", price: "\$1-50",	collectionVol:"1,500-2,000", distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("DNA, blood"), ischemicTime:"not reported", stabilization:" not reported", preservation:"-80°C Manual freezer", weight: "<0.5 gm", dataCollected: "Pathology report", price:"\$1-50", collectionVol: "1-250", distVol:"0").save(flush:true, failOnError:true)

		//equipment41
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bar-code flat scanner, multi-tray"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$2,000-\$2,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Dry vapor shippers, large"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$6,000-\$6,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Protective shipping carton, industrial"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: "5", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$20,000-\$29,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 149°C to minus 190°C LN² Cryotank"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$30,000-\$39,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Spectrophotometer"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)

	}

	def load42() {
    println "Surveydata.groovy: loading survey sourceId = 42"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 42, inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 9, country: SurveyCountry.findByName("Malaysia"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Centralized"), sites: 7, facility: SurveyFacility.findByName("2,001 to 5,000 ft²"), costRecovery: "No", expRecovery: SurveyExpRecovery.findByName("0%"), markupSpecimen: 0, markupService: 0, indirectRate:0, surveyYear: 2014).save(flush:true, failOnError:true)

		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$5,001-\$9,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "0").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Histotechnician"), range: SurveyLaborSalaryRange.findByName("\$5,001-\$9,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "0").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Clinical Research Coordinator"), range: SurveyLaborSalaryRange.findByName("\$5,001-\$9,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "0").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Data Manager"), range: SurveyLaborSalaryRange.findByName("\$10,000-\$19,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "0").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Research assistant"), range: SurveyLaborSalaryRange.findByName("\$5,001-\$9,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "0").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Research/Study nurse"), range: SurveyLaborSalaryRange.findByName("\$5,001-\$9,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "0").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab manager/supervisor"), range: SurveyLaborSalaryRange.findByName("\$10,000-\$19,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "0").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Repository manager"), range: SurveyLaborSalaryRange.findByName("\$10,000-\$19,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "0").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Repository coordinator"), range: SurveyLaborSalaryRange.findByName("\$5,001-\$9,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "0").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Head/Group/Team leader"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "0").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Technical/Executive director"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "0").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Pathologist"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "0").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Individual researcher/scientist"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "0").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Clinical resident/fellow"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "0").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Bioinformatics professional"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "0").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Biostatistician"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "0").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("General manager"), range: SurveyLaborSalaryRange.findByName("\$10,000-\$19,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "0").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Program/Project manager"), range: SurveyLaborSalaryRange.findByName("\$10,000-\$19,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "0").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Administrative/Executive assistant"), range: SurveyLaborSalaryRange.findByName("\$5,001-\$9,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "0").save(flush:true, failOnError:true)

		//Services42
		datapoint = new SurveyService(survey: survey, type: "RNA integrity number (RIN) testing", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobanking project/protocol consultation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen protocol and/or consent writing", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen procedure/SOP writing", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen inventory management database consultation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank consumable/supply ordering support", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen transport", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Education and training", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Study cohort selection", price:"\$0/free").save(flush:true, failOnError:true)

		//Products42
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor tissue"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-149°C to 190°C LN² Cryotank", weight: ">1.1 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$0", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Normal tissue"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-149°C to 190°C LN² Cryotank", weight: ">1.1 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$0", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor and adjacent normal tissue"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-149°C to 190°C LN² Cryotank", weight: ">1.1 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$0", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor tissue"), ischemicTime:"not reported", stabilization:"Formalin fixation", preservation:"Room temperature", weight: "not reported", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$0", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Normal tissue"), ischemicTime:"not reported", stabilization:"Formalin fixation", preservation:"Room temperature", weight: "not reported", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$0", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor and adjacent normal tissue FFPE blocks"), ischemicTime:"not reported", stabilization:"Formalin fixation", preservation:"Room temperature", weight: "not reported", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$0", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor TMA block"), ischemicTime:"not reported",	stabilization: "not reported",	preservation: "Room temperature",	weight: "not reported", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$0", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Normal TMA block"), ischemicTime:"not reported", stabilization:"not reported", preservation:"Room temperature", weight: "not reported", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$0", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor and adjacent normal TMA blocks"), ischemicTime:"not reported", stabilization:"not reported", preservation:"Room temperature", weight: "not reported", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$0", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("H&E Slide, tumor tissue"), ischemicTime:"not reported", stabilization:"not reported", preservation:"Room temperature", weight: "not reported", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$0", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("H&E Slide, normal tissue"), ischemicTime:"not reported", stabilization:"not reported", preservation:"Room temperature", weight: "not reported", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$0", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("H&E Slide, tumor and adjacent normal tissue sample FFPE"), ischemicTime:"not reported", stabilization:"not reported", preservation:"Room temperature", weight: "not reported", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$0", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Serum"), ischemicTime:"not reported", stabilization:"Controlled rate freezing", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$0", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Buffy coat"), ischemicTime:"not reported", stabilization: "Controlled rate freezing", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$0", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Plasma"), ischemicTime:"not reported", stabilization: "Controlled rate freezing", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$0", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Saliva"), ischemicTime:"not reported", stabilization: "Controlled rate freezing", preservation:"-20°C to -40°C Refrigerator", weight:"0.6-1 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$0", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Buccal cells"), ischemicTime:"not reported", stabilization: "Controlled rate freezing", preservation: 	"-20°C to -40°C Refrigerator",	weight: "not reported", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$0", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("DNA, tissue"), ischemicTime:"not reported", stabilization: "Controlled rate freezing", preservation:"-20°C to -40°C Refrigerator", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$0", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("DNA, blood"), ischemicTime:"not reported", stabilization: "Controlled rate freezing", preservation:"-20°C to -40°C Refrigerator", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$0", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("RNA, tissue"), ischemicTime:"not reported", stabilization: "Controlled rate freezing", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$0", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)

		//equipment42
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Cryostat"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microtome"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Tissue embedding station"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laminar flow cabinet/hood"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laboratory workbench"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "20", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Controlled rate freezer"), units: "5", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated tissue microarray (TMA) instrument"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated nucleic acid/protein extraction instrument"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Incubator, manual"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated tissue cassette labeler, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk sample labeler, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("RFID Flat scanner, multi-tray"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bar-code flat scanner, multi-tray"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Dry vapor shippers, large"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C to minus 40°C Refrigerator"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 149°C to minus 190°C LN² Cryotank"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Cold room/walk-in"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microscope"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Real time PCR System"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("PCR thermal cycler"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Plasmid processing station"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Western blot transfer system"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Orbital bath shaker, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Autoclave"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Safety cabinet"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Clean room"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laser capture microdissection system"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)

	}

	def load43() {
    println "Surveydata.groovy: loading survey sourceId = 43"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 43, inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 8, country: SurveyCountry.findByName("Iran, Islamic Republic of"), geo: SurveyGeoArea.findByName("Urban"), international: "Yes", model: SurveyOperatingModel.findByName("Centralized"), sites: 3, facility: SurveyFacility.findByName("5,001 to 15,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("26%-50%"), markupSpecimen: 0, markupService: 0, indirectRate:0, surveyYear: 2014).save(flush:true, failOnError:true)
		
		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("<\$5,000"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "2").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Histotechnician"), range: SurveyLaborSalaryRange.findByName("<\$5,000"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Pathology Assistant"), range: SurveyLaborSalaryRange.findByName("\$5,001-\$9,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Clinical Research Coordinator"), range: SurveyLaborSalaryRange.findByName("<\$5,000"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Data Manager"), range: SurveyLaborSalaryRange.findByName("\$5,001-\$9,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Research assistant"), range: SurveyLaborSalaryRange.findByName("<\$5,000"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Clinical Research associate"), range: SurveyLaborSalaryRange.findByName("\$5,001-\$9,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "0").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Research/Study nurse"), range: SurveyLaborSalaryRange.findByName("\$5,001-\$9,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "2").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab manager/supervisor"), range: SurveyLaborSalaryRange.findByName("\$5,001-\$9,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Head/Group/Team leader"), range: SurveyLaborSalaryRange.findByName("\$5,001-\$9,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Associate/Scientific director"), range: SurveyLaborSalaryRange.findByName("\$5,001-\$9,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "0").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Pathologist"), range: SurveyLaborSalaryRange.findByName("\$10,000-\$19,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "0").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Individual researcher/scientist"), range: SurveyLaborSalaryRange.findByName("\$5,001-\$9,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "0").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Clinical resident/fellow"), range: SurveyLaborSalaryRange.findByName("\$5,001-\$9,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "0").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Bioinformatics professional"), range: SurveyLaborSalaryRange.findByName("\$10,000-\$19,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Biostatistician"), range: SurveyLaborSalaryRange.findByName("\$5,001-\$9,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "0").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("General manager"), range: SurveyLaborSalaryRange.findByName("\$5,001-\$9,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "1").save(flush:true, failOnError:true)
	
		//Services43
		datapoint = new SurveyService(survey: survey, type: "Specimen collection kit assembly and shipping", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen transport", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Immunohistochemistry (IHC) testing", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "In-situ hybridization (ISH) testing", price:"\$100-\$149").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "RNA integrity number (RIN) testing", price:"\$100-\$149").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen proficiency testing", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Genetic testing", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "SNP genotyping", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "DNA sequencing", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "RNA sequencing", price:"\$100-\$149").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Gene expression profiling (DNA, RNA, protein)", price:"\$100-\$149").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Mass spectrometry 2-D protein profiling", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Mass spectrometry protein profiling, isotope tagging method", price:"\$100-\$149").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Protein microarrays (\"Protein chip\")", price:"\$200-\$249").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Pathology case review for clinical diagnosis and morphological confirmation", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Pathology external consult, case review", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Copy of pathology report", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen biosketch report", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobanking project/protocol consultation", price:"\$0/free").save(flush:true, failOnError:true)

		//Products43
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor tissue"), ischemicTime:"0-0.5 hours", stabilization:"Other: Not specified", preservation:"Room temperature", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Normal tissue"), ischemicTime:"0-0.5 hours", stabilization:"Other: Not specified", preservation:"Room temperature", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor and adjacent normal tissue"), ischemicTime:"0-0.5 hours", stabilization:"Other: Not specified", preservation:"Room temperature", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Whole blood"), ischemicTime:"1.1-1.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "2.1-5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price:"\$1-50", collectionVol:"250-500", distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Serum"), ischemicTime:"1.1-1.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "2.1-5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price:"\$1-50", collectionVol:"250-500", distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Buffy coat"), ischemicTime:"1.1-1.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "2.1-5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price:"\$1-50", collectionVol:"250-500", distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Plasma"), ischemicTime:"1.1-1.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "2.1-5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price:"\$1-50", collectionVol:"250-500", distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Urine"), ischemicTime:"1.1-1.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "2.1-5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price:"\$1-50", collectionVol:"250-500", distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("DNA, blood"), ischemicTime:"0.6-1 hour", stabilization:"Snap-Freezing with or without OCT	-20°C", preservation: "Automated biostore", weight:	"2.1-5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price:"\$1-50", collectionVol:"250-500", distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: Hair"), ischemicTime:"1.1-1.5 hours", stabilization:"Fresh (not stabilized)", preservation:"Room temperature", weight: "0.6-1 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: Nail"), ischemicTime:"1.1-1.5 hours", stabilization:"Fresh (not stabilized)", preservation:"Room temperature", weight: "0.6-1 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
	

		//equipment43
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Tissue processor, walk away"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "3", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microtome"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "4", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Tissue embedding station"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "3", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laminar flow cabinet/hood"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "2", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laboratory workbench"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "3", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Controlled rate freezer"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "4", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$3,000-\$3,999"), life: "4", contract: SurveyEquipmentAnnual.findByName("\$2,000-\$2,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated straw filling station, stand-alone"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "3", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Incubator, manual"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "1", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("RFID Flat scanner, multi-tray"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "2", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bar-code flat scanner, multi-tray"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "4", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Sample/tube picking & sorting station, bench-top"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "4", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Sample/tube picking & sorting station, stand-alone"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$2,000-\$2,999"), life: "4", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Sample volume, tube/plate auditor checking station, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$2,000-\$2,999"), life: "3", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Sample volume, tube/plate auditor checking station, stand-alone"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$2,000-\$2,999"), life: "3", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Protective shipping carton, industrial"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$2,000-\$2,999"), life: "1", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C to minus 40°C Refrigerator"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("\$2,000-\$2,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: "16 to 20", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$250,000-\$499,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("\$10,000-\$12,499")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual chest freezer"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$30,000-\$39,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("\$3,000-\$3,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C to minus 148°C LN² Cryotank"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$3,000-\$3,999"), life: "2", contract: SurveyEquipmentAnnual.findByName("\$4,000-\$4,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microscope"), units: "5", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$8,000-\$8,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Real time PCR System"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$40,000-\$49,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("\$8,000-\$8,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("PCR thermal cycler"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$30,000-\$39,999"), life: "7", contract: SurveyEquipmentAnnual.findByName("\$2,000-\$2,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Plasmid processing station"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$5,000-\$5,999"), life: "3", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Western blot transfer system"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$7,000-\$7,999"), life: "1", contract: SurveyEquipmentAnnual.findByName("\$3,000-\$3,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Blot hybridization system"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$5,000-\$5,999"), life: "2", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Orbital bath shaker, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$4,000-\$4,999"), life: "2", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Reagent dispenser"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "4", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Autoclave"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$3,000-\$3,999"), life: "6", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Safety cabinet"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$2,000-\$2,999"), life: "2", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Clean room"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$20,000-\$29,999"), life: "4", contract: SurveyEquipmentAnnual.findByName("\$3,000-\$3,999")).save(flush:true, failOnError:true)

	}

	def load44() {
    println "Surveydata.groovy: loading survey sourceId = 44"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 44, inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 6, country: SurveyCountry.findByName("Ireland"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Networked"), sites: 1, facility: SurveyFacility.findByName("2,001 to 5,000 ft²"), costRecovery: "No", expRecovery: SurveyExpRecovery.findByName("0%"), markupSpecimen: 0, markupService: 0, indirectRate: 0, surveyYear: 2014).save(flush:true, failOnError:true)

		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$0"), fringe: SurveyLaborFringeRate.findByName("not reported"),	fte: "0").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Repository manager"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("not reported"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Clinical resident/fellow"), range: SurveyLaborSalaryRange.findByName("\$0"), fringe: SurveyLaborFringeRate.findByName("not reported"),	fte: "0").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Pathologist"), range: SurveyLaborSalaryRange.findByName("\$0"), fringe: SurveyLaborFringeRate.findByName("not reported"),	fte: "0").save(flush:true, failOnError:true)
	
		//Services44
		datapoint = new SurveyService(survey: survey, type: "RNA integrity number (RIN) testing", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Pathology case review for clinical diagnosis and morphological confirmation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Pathology external consult, case review", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen procedure/SOP writing", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Evaluating and/or consenting donors for specimen and/or data collection", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Return of biospecimen research results to study participants and/or specimen donors", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample storage and monitoring", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank consumable/supply ordering support", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Education and training", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Study cohort selection", price:"\$0/free").save(flush:true, failOnError:true)

		//Products44
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor tissue"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$0", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("H&E Slide, tumor and adjacent normal tissue sample FFPE"), ischemicTime:"not reported", stabilization:"Formalin fixation", preservation:"Room temperature", weight: "not reported", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$0", collectionVol:"500-1000",  distVol:"500-1,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Normal tissue"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$0", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		
		//equipment44
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Cold table/cryogenic workbench"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Cryostat"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Tissue processor, walk away"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microtome"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Tissue embedding station"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laminar flow cabinet/hood"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laboratory workbench"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Controlled rate freezer"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$20,000-\$29,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("\$2,000-\$2,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Manual tissue microarray (TMA) instrument"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated nucleic acid/protein extraction instrument"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Slide autostainer"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated tissue cassette labeler, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$2,000-\$2,999"), life: "7", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Large cryogenic aluminum Dewar's"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$9,000-\$9,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("\$2,000-\$2,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Cold room/walk-in"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microscope"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$8,000-\$8,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Real time PCR System"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "7", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("PCR thermal cycler"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$4,000-\$4,999"), life: "7", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("DNA/RNA sequencing system/analyzer"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$3,000-\$3,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Orbital bath shaker, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Safety cabinet"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)	
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Clean room"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laser capture microdissection system"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)

	}

	def load45() {
    println "Surveydata.groovy: loading survey sourceId = 45"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 45, inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 9, country: SurveyCountry.findByName("Hungary"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Networked"), sites: 1, facility: SurveyFacility.findByName("<2000 ft²"), costRecovery: "No", expRecovery: SurveyExpRecovery.findByName("0%"), markupSpecimen: 0, markupService: 0, indirectRate: 0, surveyYear: 2014).save(flush:true, failOnError:true)

		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("<\$5,000"),	fringe: SurveyLaborFringeRate.findByName("not reported"),	fte: "0.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Histotechnician"), range: SurveyLaborSalaryRange.findByName("<\$5,000"),	fringe: SurveyLaborFringeRate.findByName("not reported"),	fte: "0.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Clinical Research Coordinator"), range: SurveyLaborSalaryRange.findByName("<\$5,000"),	fringe: SurveyLaborFringeRate.findByName("not reported"),	fte: "0.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Research assistant"), range: SurveyLaborSalaryRange.findByName("<\$5,000"),	fringe: SurveyLaborFringeRate.findByName("not reported"),	fte: "0.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Research/Study nurse"), range: SurveyLaborSalaryRange.findByName("<\$5,000"),	fringe: SurveyLaborFringeRate.findByName("not reported"),	fte: "0.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Clinical resident/fellow"), range: SurveyLaborSalaryRange.findByName("<\$5,000"),	fringe: SurveyLaborFringeRate.findByName("not reported"),	fte: "0.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Bioinformatics professional"), range: SurveyLaborSalaryRange.findByName("<\$5,000"),	fringe: SurveyLaborFringeRate.findByName("not reported"),	fte: "0.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Program/Project manager"), range: SurveyLaborSalaryRange.findByName("<\$5,000"),	fringe: SurveyLaborFringeRate.findByName("not reported"),	fte: "0").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Quality manager"), range: SurveyLaborSalaryRange.findByName("<\$5,000"),	fringe: SurveyLaborFringeRate.findByName("not reported"),	fte: "0.5").save(flush:true, failOnError:true)
	
		//Services45
		datapoint = new SurveyService(survey: survey, type: "Specimen collection kit assembly and shipping", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Immunohistochemistry (IHC) testing", price:"\$100-\$149").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "In-situ hybridization (ISH) testing", price:"\$250-\$299").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Other: Genetic testing, flat fee", price:"\$5,000-\$5,999").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "SNP genotyping", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "DNA sequencing", price:"\$250-\$299").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Pathology case review for clinical diagnosis and morphological confirmation", price:"\$300-\$399").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Pathology external consult, case review", price:"\$100-\$149").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Copy of pathology report", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen biosketch report", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobanking project/protocol consultation", price:"\$150-\$199").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen protocol and/or consent writing", price:"\$100-\$149").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen protocol regulatory submission", price:"\$100-\$149").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen procedure/SOP writing", price:"\$200-\$249").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen inventory management database consultation", price:"\$250-\$299").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank technical support, in-or out-sourced", price:"\$100-\$149").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Evaluating and/or consenting donors for specimen and/or data collection", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Return of biospecimen research results to study participants and/or specimen donors", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample storage and monitoring", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank inventory management database quality/best practice review audit", price:"\$100-\$149").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management quality/best practice review audit", price:"\$100-\$149").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, transfer and/or relocation", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, culling", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen collection kit assembly and shipping", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen transport", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Other: Education and training, flat fee", price:"\$400-\$499").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen proficiency testing (sample set)", price:"\$1-\$49").save(flush:true, failOnError:true)

		//Products45
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("DNA, tissue"), ischemicTime:">2 hours", stabilization:"Controlled rate freezing", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data", price:"\$1-50", collectionVol:"1,500-2,000", distVol:"500-1,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("DNA, blood"), ischemicTime:">2 hours", stabilization:"Controlled rate freezing", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data", price:"\$1-50", collectionVol:"1,500-2,000", distVol:"500-1,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("RNA, tissue"), ischemicTime:">2 hours", stabilization:"Controlled rate freezing", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data", price:"\$1-50", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("RNA, blood"), ischemicTime:">2 hours", stabilization:"Controlled rate freezing", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data", price:"\$1-50", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Plasma"), ischemicTime:"1.6-2 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-80°C Manual freezer", weight:"1.1-2 ml", dataCollected: "Pathology report + clinical data", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Serum"), ischemicTime:"0.6-1 hour", stabilization:"Controlled rate freezing", preservation:"-80°C Manual freezer", weight:"1.1-2 ml", dataCollected: "Pathology report + clinical data", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Whole blood"), ischemicTime:">2 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-80°C Manual freezer", weight:"1.1-2 ml", dataCollected: "Pathology report + clinical data", price: "\$1-50", collectionVol:"1,500-2,000	", distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Urine"), ischemicTime:"0.6-1 hour", stabilization:"Controlled rate freezing", preservation: "-20°C to -40°C Refrigerator", weight:"1.1-2 ml", dataCollected: "Pathology report + clinical data", price:"\$1-50", collectionVol:"1-250", distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Cerebrospinal fluid (CSF)"), ischemicTime:"0-0.5 hours", stabilization: "Controlled rate freezing", preservation:"-80°C Manual freezer", weight:"1.1-2 ml", dataCollected: "Pathology report + clinical data", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Skin"), ischemicTime:">2 hours", stabilization:"Controlled rate freezing", preservation: "-20°C to -148°C LN² Cryotank", weight:"<0.5 gm", dataCollected: "Pathology report + clinical data", price: "\$150-\$199", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: Nerve"), ischemicTime:"0-0.5 hours", stabilization:"Controlled rate freezing", preservation:"-80°C Manual freezer", weight:">1.1 gm", dataCollected: "Pathology report + clinical data", price: "\$100-\$149", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: Muscle"), ischemicTime:"0-0.5 hours", stabilization:"Controlled rate freezing", preservation:"-80°C Manual freezer", weight:">1.1 gm", dataCollected: "Pathology report + clinical data", price: "\$100-\$149", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("H&E Slide, normal tissue"), ischemicTime:"not reported", stabilization:"Controlled rate freezing", preservation:"-80°C Manual freezer", weight:"not reported", dataCollected: "Pathology report + clinical data", price: "not reported", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Normal tissue"), ischemicTime:"0-0.5 hours", stabilization:"Controlled rate freezing", preservation:"-80°C Manual freezer", weight:">1.1 gm", dataCollected: "Pathology report + clinical data", price: "\$100-\$149", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)

		//equipment45
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Cryostat"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$11,000-\$19,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laminar flow cabinet/hood"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$8,000-\$8,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laboratory workbench"), units: "5", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "5", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Controlled rate freezer"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$11,000-\$19,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$2,000-\$2,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated nucleic acid/protein extraction instrument"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$11,000-\$19,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Incubator, automated"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$9,000-\$9,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "5", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bar-code flat scanner, multi-tray"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "5", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Sample/tube picking & sorting station, stand-alone"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$40,000-\$49,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Dry vapor shippers, large"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$2,000-\$2,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Large cryogenic aluminum Dewar's"), units: "5", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "5", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C to minus 40°C Refrigerator"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "5", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$11,000-\$19,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C to minus 148°C LN² Cryotank"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "5", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microscope"), units: "5", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$3,000-\$3,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Transmission electron microscope"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$40,000-\$49,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Real time PCR System"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$11,000-\$19,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("PCR thermal cycler"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$6,000-\$6,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Western blot transfer system"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$2,000-\$2,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Blot hybridization system"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$2,000-\$2,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("DNA/RNA sequencing system/analyzer"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"),price: SurveyEquipmentPrice.findByName("\$175,000-\$199,999"), life:"5", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Orbital bath shaker, bench-top"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$2,000-\$2,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Reagent dispenser"), units: "5", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "5", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Safety cabinet"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$8,000-\$8,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Clean room"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$11,000-\$19,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)

	}

	def load46() {
    println "Surveydata.groovy: loading survey sourceId = 46"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 46, inst: SurveyInstitutionType.findByName("Independent Research Laboratory"), age: 61, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Centralized"), sites: 4, facility: SurveyFacility.findByName("50,001 to 100,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("1%-25%"), markupSpecimen: 25, markupService: 25, indirectRate:57, surveyYear: 2014).save(flush:true, failOnError:true)

		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "21-25").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Data Manager"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "8").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Research assistant"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab manager/supervisor"), range: SurveyLaborSalaryRange.findByName("\$80,000-\$99,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Head/Group/Team leader"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "4").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Technical/Executive director"), range: SurveyLaborSalaryRange.findByName("\$100,000-\$250,000"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Individual researcher/scientist"), range: SurveyLaborSalaryRange.findByName("\$100,000-\$250,000"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "3").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Biostatistician"), range: SurveyLaborSalaryRange.findByName("\$80,000-\$99,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Program/Project manager"), range: SurveyLaborSalaryRange.findByName("\$80,000-\$99,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "7").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Quality manager"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Other-Lab assistant"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "3").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "10").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Other: Genetic counselor, Sr."), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "1").save(flush:true, failOnError:true)
		
		//Services46
		datapoint = new SurveyService(survey: survey, type: "Specimen collection kit assembly and shipping", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "RNA integrity number (RIN) testing", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Evaluating and/or consenting donors for specimen and/or data collection", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample storage and monitoring", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, transfer and/or relocation", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, culling", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, disaster recovery", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank consumable/supply ordering support", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen collection kit assembly and shipping", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Annual biospecimen/project collection report", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Education and training", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Other: Microsatellite fingerprinting", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Other: Karyotyping", price:"\$500-\$599").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Other: dsDNA quantity determination", price:"\$1-\$49").save(flush:true, failOnError:true)

		//Products46
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("DNA, blood"), ischemicTime:"not reported", stabilization:"not reported", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$51-99", collectionVol:"3,000-3,500", distVol: "10,000-20,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Serum"), ischemicTime:"not reported", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price:"\$1-50", collectionVol:"3,000-3,500", distVol:"1,500-2,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Plasma"), ischemicTime:"not reported", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price:"\$1-50", collectionVol:"3,000-3,500", distVol:"1,500-2,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Buffy coat"), ischemicTime:"not reported", stabilization:"Controlled rate freezing", preservation:"-149°C to 190°C LN² Cryotank", weight: "not reported", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price:"\$1-50", collectionVol:"2,000-2,500	", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Cerebrospinal fluid (CSF)"), ischemicTime:"not reported", stabilization:"not reported", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price:"\$1-50", collectionVol:"3,000-3,500", distVol:"1,500-2,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Stem cells"), ischemicTime:"not reported", stabilization:"Controlled rate freezing", preservation:"-20°C to -148°C LN² Cryotank", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price:"\$700-\$799", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("RNA, blood"), ischemicTime:"not reported", stabilization:"not reported", preservation:"-80°C Manual freezer", weight: "not reported", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$100-\$149", collectionVol:"3,000-3,500", distVol:"1,500-2,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("DNA, tissue"), ischemicTime:"not reported", stabilization:"not reported", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price:"\$51-99", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: Lymphoblastic cell lines"), ischemicTime:"not reported", stabilization:"Controlled rate freezing", preservation:"-149°C to 190°C LN² Cryotank", weight: "not reported", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$51-99", collectionVol:"500-1,000", distVol:"7,000-7,500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: Fibroblast cell lines"), ischemicTime:"not reported", stabilization:"Controlled rate freezing", preservation:"-149°C to 190°C LN² Cryotank", weight: "not reported", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$51-99", collectionVol:"500-1,000", distVol:"3,000-3,500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Whole blood"), ischemicTime:"1.6-2 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-80°C Manual freezer", weight: "0.6-1 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"3,000-3,500", distVol:"1-250").save(flush:true, failOnError:true)

		//equipment46
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laminar flow cabinet/hood"), units: "16 to 20", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$4,000-\$4,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laboratory workbench"), units: ">50", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Controlled rate freezer"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$5,000-\$5,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$8,000-\$8,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, stand-alone"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated nucleic acid/protein extraction instrument"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$40,000-\$49,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$2,000-\$2,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Incubator, manual"), units: "11 to 15", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$7,000-\$7,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "21 to 25", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$4,000-\$4,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated sample capper-de-capper, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$20,000-\$29,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Dry vapor shippers, large"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$3,000-\$3,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C to minus 40°C Refrigerator"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$7,000-\$7,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: ">50", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual chest freezer"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C to minus 148°C LN² Cryotank"), units: "5", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$20,000-\$29,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 149°C to minus 190°C LN² Cryotank"), units: ">50", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$20,000-\$29,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Cold room/walk-in"), units: "5", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microscope"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Flow cytometer"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$200,000-\$249,999"), life:"10", contract: SurveyEquipmentAnnual.findByName("\$10,000-\$12,499")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Real time PCR System"), units: "5", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$6,000-\$6,999"), life: "8", contract: SurveyEquipmentAnnual.findByName("\$12,500-\$14,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("PCR thermal cycler"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$30,000-\$39,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("DNA/RNA sequencing system/analyzer"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$150,000-\$174,999"), life:"10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Safety cabinet"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$6,000-\$6,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Clean room"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Spectrophotometer"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$30,000-\$39,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$7,000-\$7,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Nucleic acid integrity analyzer"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$20,000-\$29,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$3,000-\$3,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Automated cell counter"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$30,000-\$39,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$15,000-\$17,499")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Liquid handler"), units: "5", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$100,000-\$124,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$25,000-\$27,499")).save(flush:true, failOnError:true)

	}

	def load47() {
    println "Surveydata.groovy: loading survey sourceId = 47"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 47, inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 10, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Networked"), sites: 3, facility: SurveyFacility.findByName("50,001 to 100,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("1%-25%"), markupSpecimen: 0, markupService: 0, indirectRate:0, surveyYear: 2014).save(flush:true, failOnError:true)

		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Clinical Research Coordinator"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Repository manager"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Repository coordinator"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "3").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Associate/Scientific director"), range: SurveyLaborSalaryRange.findByName("\$5,001-\$9,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Program/Project manager"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "1").save(flush:true, failOnError:true)

		//Services47
		datapoint = new SurveyService(survey: survey, type: "Biobank project/protocol consultation", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen inventory management database consultation", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Evaluating and/or consenting donors for specimen and/or data collection", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample storage and monitoring", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, transfer and/or relocation", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen transport", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Annual biospecimen/project collection report", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Education and training", price:"\$0/free").save(flush:true, failOnError:true)


		//Products47
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor tissue"), 																ischemicTime:"0.6-1 hour", stabilization:"Snap-Freezing with or without OCT", preservation:"-149°C to 190°C LN² Cryotank", weight: "<0.5 gm", dataCollected: "Pathology report", price:"\$1-50", collectionVol: "4,500-5000", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Normal tissue"), 																ischemicTime:"0.6-1 hour", stabilization:"Snap-Freezing with or without OCT", preservation:"-149°C to 190°C LN² Cryotank", weight: "<0.5 gm", dataCollected: "Pathology report", price:"\$1-50", collectionVol: "4,500-5000", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor and adjacent normal tissue"), 						ischemicTime:"0.6-1 hour", stabilization:"Snap-Freezing with or without OCT", preservation:"-149°C to 190°C LN² Cryotank", weight: "<0.5 gm", dataCollected: "Pathology report", price:"\$1-50", collectionVol: "4,500-5000", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor tissue"), 																ischemicTime:"not reported", stabilization:"Formalin fixation", preservation:"Room temperature", weight: "not reported", dataCollected: "Pathology report", price: "\$1-50", collectionVol: "4,500-5000", distVol:"500-1,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Normal tissue"), 																ischemicTime:"not reported", stabilization:"Formalin fixation", preservation:"Room temperature", weight: "not reported", dataCollected: "Pathology report", price: "\$1-50", collectionVol: "4,500-5000", distVol:"500-1,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor and adjacent normal tissue FFPE blocks"), ischemicTime:"not reported", stabilization:"Formalin fixation", preservation:"Room temperature", weight: "not reported", dataCollected: "Pathology report", price: "\$1-50", collectionVol: "4,500-5000", distVol:"500-1,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("H&E Slide, tumor tissue"), 											ischemicTime:"not reported", stabilization:"not reported", preservation:"Room temperature", weight: "not reported", dataCollected: "Pathology report", price: "\$1-50", collectionVol: "4,500-5000", distVol:"not reported").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("H&E Slide, normal tissue"), 										ischemicTime:"not reported", stabilization:"not reported", preservation:"Room temperature", weight: "not reported", dataCollected: "Pathology report", price: "\$1-50", collectionVol: "4,500-5000", distVol:"not reported").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("H&E Slide, tumor and adjacent normal tissue sample FFPE"), ischemicTime:"not reported", stabilization:"not reported", preservation:"Room temperature", weight: "not reported", dataCollected: "Pathology report", price: "\$1-50", collectionVol: "4,500-5000", distVol:"not reported").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Skin"), 																				ischemicTime:"0.6-1 hour", stabilization:"Snap-Freezing with or without OCT", preservation:"-149°C to 190°C LN² Cryotank", weight: "0.6-1 gm", dataCollected: "Pathology report", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Cerebrospinal fluid (CSF)"), ischemicTime:"not reported", stabilization: "not reported", preservation:"Room temperature", weight: "not reported", dataCollected: "Pathology report", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Whole blood"), ischemicTime:"not reported", stabilization:"not reported", preservation:"Room temperature", weight: "not reported", dataCollected: "Pathology report", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Urine"), ischemicTime:"not reported", stabilization:"not reported", preservation:"Room temperature", weight: "not reported", dataCollected: "Pathology report", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Saliva"), ischemicTime:"0.6-1 hour", stabilization:"not reported", preservation:"-80°C Manual freezer",weight:"not reported", dataCollected:"Pathology report", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
	
		//equipment47
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Tissue processor, walk away"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$175,000-\$199,999"), life:"3", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$5,000-\$5,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated tissue cassette labeler, bench-top"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bar-code flat scanner, multi-tray"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C to minus 40°C Refrigerator"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 149°C to minus 190°C LN² Cryotank"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)


	}

	def load48() {
    println "Surveydata.groovy: loading survey sourceId = 48"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 48, inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 16, country: SurveyCountry.findByName("Brazil"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Centralized"), sites: 2, facility: SurveyFacility.findByName("<2000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("51%-75%"), markupSpecimen: 0, markupService: 0, indirectRate:0, surveyYear: 2014).save(flush:true, failOnError:true)

		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Histotechnician"), range: SurveyLaborSalaryRange.findByName("\$10,000-\$19,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Pathology Assistant"), range: SurveyLaborSalaryRange.findByName("\$100,000-\$250,000"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "0.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Data Manager"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "0.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Research/Study nurse"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "0.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Technical/Executive director"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "0.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Pathologist"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "0.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Bioinformatics professional"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "1").save(flush:true, failOnError:true)

		//Services48
		datapoint = new SurveyService(survey: survey, type: "Specimen biosketch report", price:"\$0/free").save(flush:true, failOnError:true)

		//Products48
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("RNA, tissue"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-148°C Manual freezer", weight: "<0.5 gm", dataCollected: "Pathology report", price: "\$51-99", collectionVol:"3,000-3,500", distVol:"1,500-2,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("RNA, blood"), ischemicTime:"1.6-2 hours", stabilization:"Other: Not specified", preservation:"-148°C Manual freezer", weight: "<0.5 gm", dataCollected: "Pathology report", price: "\$51-99", collectionVol:"3,000-3,500", distVol:"1,500-2,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("DNA, tissue"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "<0.5 gm", dataCollected: "Pathology report", price: "\$51-99", collectionVol:"3,000-3,500", distVol:"1,500-2,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("DNA, blood"), ischemicTime:"1.6-2 hours", stabilization:"Other: Not specified", preservation:"80°C Manual freezer", weight: "<0.5 gm", dataCollected: "Pathology report", price: "\$51-99", collectionVol:"3,000-3,500", distVol:"1,500-2,000").save(flush:true, failOnError:true)

		//equipment48
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Cryostat"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$20,000-\$29,999"), life: "8", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laboratory workbench"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$4,000-\$4,999"), life: "8", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated nucleic acid/protein extraction instrument"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "8", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "7", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bar-code flat scanner, multi-tray"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Large cryogenic aluminum Dewar's"), units: "5", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "15", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C to minus 40°C Refrigerator"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "8", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: "5", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$20,000-\$29,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 148°C Manual chest freezer"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$60,000-\$69,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 149°C to minus 190°C LN² Cryotank"), units: "5", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "15", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microscope"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("DNA/RNA sequencing system/analyzer"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "7", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)


	}

	def load49() {
    println "Surveydata.groovy: loading survey sourceId = 49"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 49, inst: SurveyInstitutionType.findByName("Community Based Hospital"), age: 5, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Centralized"), sites: 1, facility: SurveyFacility.findByName("<2000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("1%-25%"), markupSpecimen: 0, markupService: 0, indirectRate:0, surveyYear: 2014).save(flush:true, failOnError:true)

		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Repository coordinator"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Pathologist"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "0.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Bioinformatics professional"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Other: Quality program coordinator"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("not reported"),	fte: "0").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Other: Research lab assistant"), range: SurveyLaborSalaryRange.findByName("\$10,000-\$19,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "1.5").save(flush:true, failOnError:true)
		
		//Services49
		datapoint = new SurveyService(survey: survey, type: "Pathology case review for clinical diagnosis and morphological confirmation", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Copy of pathology report", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobanking project/protocol consultation", price:"\$100-\$149").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Evaluating and/or consenting donors for specimen and/or data collection", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management", price:"\$100-\$149").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample storage and monitoring", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, culling", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank consumable/supply ordering support", price:"\$100-\$149").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Education and training", price:"\$200-\$249").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Other: Document management (E.g. CDA/contracts, MTA/IRB)", price:"\$200-\$249").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Other: Invoicing and packing", price:"\$100-\$149").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Other: Equipment/Supply use", price:"\$100-\$149").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Other: Auxiliary staff support", price:"\$100-\$149").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Other: Laboratory use", price:"\$1,000-\$1,999").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Other: Equipment use", price:"\$500-\$599").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Other: Supply use", price:"\$300-\$399").save(flush:true, failOnError:true)
	
		//Products49
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor tissue"), ischemicTime:"0.6-1 hour", stabilization:"Snap-Freezing with or without OCT", preservation:"-149°C to 190°C LN² Cryotank", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor tissue"), ischemicTime:"0.6-1 hour", stabilization:"Formalin fixation", preservation:"Room temperature", weight: "not reported", dataCollected: "Pathology report + clinical data", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Bone marrow"), ischemicTime:"0.6-1 hour", stabilization:"Snap-Freezing with or without OCT", preservation:"-149°C to 190°C LN² Cryotank", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Whole blood"), ischemicTime:"0.6-1 hour", stabilization:"Snap-Freezing with or without OCT", preservation:"-149°C to 190°C LN² Cryotank", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Serum"), ischemicTime:"0.6-1 hour", stabilization:"Snap-Freezing with or without OCT", preservation:"-149°C to 190°C LN² Cryotank", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Buffy coat"), ischemicTime:"0.6-1 hour", stabilization:"Snap-Freezing with or without OCT", preservation:"-149°C to 190°C LN² Cryotank", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Plasma"), ischemicTime:"0.6-1 hour", stabilization:"Snap-Freezing with or without OCT", preservation:"-149°C to 190°C LN² Cryotank", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Cerebrospinal fluid (CSF)"), ischemicTime:"0.6-1 hour", stabilization:"Snap-Freezing with or without OCT", preservation:"-149°C to 190°C LN² Cryotank", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data", price:"\$1-50", collectionVol:"1,500-2,000	", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Urine"), ischemicTime:"0.6-1 hour", stabilization:"Snap-Freezing with or without OCT", preservation:"-149°C to 190°C LN² Cryotank", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("PBMC's"), ischemicTime:"0.6-1 hour", stabilization:"Snap-Freezing with or without OCT", preservation:"-149°C to 190°C LN² Cryotank", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("DNA, blood"), ischemicTime:"0.6-1 hour", stabilization:"Snap-Freezing with or without OCT", preservation:"-149°C to 190°C LN² Cryotank", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data", price:"\$100-\$149", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("RNA, blood"), ischemicTime:"0.6-1 hour", stabilization:"Snap-Freezing with or without OCT", preservation:"-149°C to 190°C LN² Cryotank", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data", price:"\$100-\$149", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: microRNA, CSF"), ischemicTime:"0.6-1 hour", stabilization:"Snap-Freezing with or without OCT", preservation:"-149°C to 190°C LN² Cryotank", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data", price:"\$100-\$149", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: unstained BM smears"), ischemicTime:"0.6-1 hour", stabilization:"Snap-Freezing with or without OCT", preservation:"-149°C to 190°C LN² Cryotank", weight: "not reported", dataCollected: "Pathology report + clinical data", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)

		//equipment49
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Cold table/cryogenic workbench"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$6,000-\$6,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microtome"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laminar flow cabinet/hood"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "20", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laboratory workbench"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: ">20", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Controlled rate freezer"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$6,000-\$6,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Incubator, manual"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Scale"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$2,000-\$2,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Waterbath/Coldbath"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "20", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C to minus 40°C Refrigerator"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "15", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 149°C to minus 190°C LN² Cryotank"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$5,000-\$5,999"), life: ">20", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Refrigerator minus 0°C to minus 9°C"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Linear bar-code scanner"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "15", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microscope"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "15", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: 2200 TapeStation"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$30,000-\$39,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Temperature monitor probes"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "15", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: PCR Workstation"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$3,000-\$3,999"), life: "20", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Cytospin"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Cool cell"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: ">20", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)


	}

	def load50() {
    println "Surveydata.groovy: loading survey sourceId = 50"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 50, inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 3, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Rural"), international: "No", model: SurveyOperatingModel.findByName("Centralized"), sites: 1, facility: SurveyFacility.findByName("<2000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("1%-25%"), markupSpecimen: 0, markupService: 0, indirectRate:40, surveyYear: 2014).save(flush:true, failOnError:true)
	
		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "2").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Pathology Assistant"), range: SurveyLaborSalaryRange.findByName("\$80,000-\$99,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "0.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Clinical Research associate"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "2").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Pathologist"), range: SurveyLaborSalaryRange.findByName("\$100,000-\$250,000"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "0.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Chief operating officer (COO)"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "1").save(flush:true, failOnError:true)
	
		//Services50
		datapoint = new SurveyService(survey: survey, type: "Specimen collection kit assembly and shipping", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen transport", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Pathology case review for clinical diagnosis and morphological confirmation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Pathology external consult, case review", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Copy of pathology report", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen biosketch report", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobanking project/protocol consultation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen protocol and/or consent writing", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen protocol regulatory submission", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen procedure/SOP writing", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen inventory management database consultation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Evaluating and/or consenting donors for specimen and/or data collection", price:"\$100-\$149").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample storage and monitoring", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank inventory management database quality/best practice review audit", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management quality/best practice review audit", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, transfer and/or relocation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, culling", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen collection kit assembly and shipping", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Annual biospecimen/project collection report", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Education and training", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Study cohort selection", price:"\$0/free").save(flush:true, failOnError:true)

		//Products50
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor tissue"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "0.6-1 gm", dataCollected: "Pathology report + clinical data", price: "not reported", collectionVol:"1,500-2,000", distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Normal tissue"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "0.6-1 gm", dataCollected: "Pathology report + clinical data", price: "not reported", collectionVol:"1,500-2,000", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor tissue"), ischemicTime:"not reported",stabilization:"Formalin fixation", preservation:"Room temperature", weight: "0.6-1 gm", dataCollected: "Pathology report + clinical data", price: "not reported", collectionVol:"500-1000",  distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Normal tissue"), ischemicTime:"not reported",stabilization:"Formalin fixation", preservation:"Room temperature", weight: "0.6-1 gm", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "not reported", collectionVol:"500-1000",  distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Serum"), ischemicTime:"1.6-2 hours", stabilization:"Fresh (not stabilized)", preservation:"-80°C Manual freezer", weight: "1.1-2 ml", dataCollected: "Pathology report + clinical data", price: "not reported", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Plasma"), ischemicTime:"1.6-2 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-80°C Manual freezer", weight: "1.1-2 ml", dataCollected: "Pathology report + clinical data", price: "not reported", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("DNA, blood"), ischemicTime:"not reported", stabilization:"not reported", preservation:"-80°C Manual freezer", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data", price: "not reported", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("RNA, blood"), ischemicTime:"not reported", stabilization:"not reported", preservation:"-80°C Manual freezer", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data", price: "not reported", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("DNA, tissue"), ischemicTime:"not reported", stabilization:"not reported", preservation:"-80°C Manual freezer", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data", price: "not reported", collectionVol:"500-1000",  distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("RNA, tissue"), ischemicTime:"not reported", stabilization:"not reported", preservation:"-80°C Manual freezer", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data", price: "not reported", collectionVol:"500-1000",  distVol:"1-250").save(flush:true, failOnError:true)

		//equipment50
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Cold table/cryogenic workbench"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Tissue processor, walk away"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "5", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Tissue embedding station"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laboratory workbench"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "15", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Incubator, manual"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "2", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bar-code flat scanner, multi-tray"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "2", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Large cryogenic aluminum Dewar's"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Lease"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C to minus 40°C Refrigerator"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$20,000-\$29,999"), life: "8", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 149°C to minus 190°C LN² Cryotank"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microscope"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Autoclave"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "8", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Safety cabinet"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)

	}

	def load51() {
    println "Surveydata.groovy: loading survey sourceId = 51"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 51, inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 8, country: SurveyCountry.findByName("Australia"), geo: SurveyGeoArea.findByName("Urban"), international: "Yes", model: SurveyOperatingModel.findByName("Centralized"), sites: 1, facility: SurveyFacility.findByName("2,001 to 5,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("76%-100%"), markupSpecimen: 25, markupService: 25, indirectRate:0, surveyYear: 2014).save(flush:true, failOnError:true)

		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "2").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Research assistant"), range: SurveyLaborSalaryRange.findByName("\$80,000-\$99,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Repository manager"), range: SurveyLaborSalaryRange.findByName("\$100,000-\$250,000"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "1").save(flush:true, failOnError:true)

		//Services51
		datapoint = new SurveyService(survey: survey, type: "Specimen collection kit assembly and shipping", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen transport", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobanking project/protocol consultation", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen protocol and/or consent writing", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen procedure/SOP writing", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen inventory management database consultation", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank technical support, in-or out-sourced", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample storage and monitoring", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank inventory management database quality/best practice review audit", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management quality/best practice review audit", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, transfer and/or relocation", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, culling", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank consumable/supply ordering support", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen collection kit assembly and shipping", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Annual biospecimen/project collection report", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Study cohort selection", price:"\$50-\$99").save(flush:true, failOnError:true)

		//Products51
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Whole blood"), ischemicTime:">2 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-80°C Manual freezer", weight: "1.1-2 ml",dataCollected: "not reported", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Serum"), ischemicTime:">2 hours", stabilization:"Fresh (not stabilized)", preservation:"-80°C Manual freezer", weight: "1.1-2 ml",dataCollected: "not reported", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Buffy coat"), ischemicTime:">2 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-80°C Manual freezer", weight: "0.6-1 ml", dataCollected: "not reported", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Plasma"), ischemicTime:">2 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-80°C Manual freezer", weight: "1.1-2 ml",dataCollected: "not reported", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Saliva"), ischemicTime:">2 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"Room temperature", weight: "1.1-2 ml",dataCollected: "not reported", 	price: "\$51-99", collectionVol:"500-1,000", distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Cerebrospinal fluid (CSF)"), ischemicTime:"0.6-1 hour", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "1.1-2 ml",dataCollected: "not reported", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("PBMC's"), ischemicTime:">2 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-149°C to 190°C LN² Cryotank", weight: "1.1-2 ml",dataCollected: "not reported", price: "\$150-\$199", collectionVol:"250-500", distVol:"not reported").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("DNA, blood"), ischemicTime:">2 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-80°C Manual freezer", weight: "1.1-2 ml",dataCollected: "not reported", price:"\$51-99", collectionVol:"250-500", distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("RNA, blood"), ischemicTime:"1.1-1.5 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-80°C Manual freezer", weight: "1.1-2 ml",dataCollected: "not reported", price:"\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: DNA, saliva"), ischemicTime:">2 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-80°C Manual freezer", weight: "1.1-2 ml",dataCollected: "not reported", price:"\$51-99", collectionVol:"250-500", distVol:"250-500").save(flush:true, failOnError:true)

		//equipment51
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laminar flow cabinet/hood"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laboratory workbench"), units: "11 to 15", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated nucleic acid/protein extraction instrument"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$250,000-\$499,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$20,000-\$22,499")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Incubator, automated"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$2,000-\$2,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Dry vapor shippers, large"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$6,000-\$6,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Protective shipping carton, industrial"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C to minus 40°C Refrigerator"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$7,000-\$7,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 149°C to minus 190°C LN² Cryotank"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$60,000-\$69,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microscope"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$4,000-\$4,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("PCR thermal cycler"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$7,000-\$7,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Orbital bath shaker, bench-top"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$4,000-\$4,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Safety cabinet"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)

	}

	def load52() {
    println "Surveydata.groovy: loading survey sourceId = 52"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 52, inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 6, country: SurveyCountry.findByName("Canada"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Centralized"), sites: 3, facility: SurveyFacility.findByName("15,001 to 50,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("1%-25%"), markupSpecimen: 0, markupService: 0, indirectRate:30, surveyYear: 2014).save(flush:true, failOnError:true)
		
		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Clinical Research Coordinator"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "2").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Data Manager"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Research assistant"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "3").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab manager/supervisor"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "1").save(flush:true, failOnError:true)
		
		//Services52
		datapoint = new SurveyService(survey: survey, type: "Specimen collection kit assembly and shipping", price:"\$100-\$149").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen transport", price:"\$100-\$149").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Pathology case review for clinical diagnosis and morphological confirmation", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Copy of pathology report", price:"\$1-\$49").save(flush:true, failOnError:true)

		//Products52
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Normal tissue"), ischemicTime:"0-0.5 hours", stabilization:"Other: Not specified", preservation:"-80°C Manual freezer", weight: "not reported", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"not reported", distVol:"not reported").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Serum"), ischemicTime:"1.6-2 hours", stabilization:"Controlled rate freezing", preservation:"-80°C Manual freezer", weight: "1.1-2 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"250-500", distVol:"250-500").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Urine"), ischemicTime:"0-0.5 hours", stabilization:"Controlled rate freezing", preservation:"-80°C Manual freezer", weight: "1.1-2 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: Not specified"), ischemicTime:">2 hours", stabilization:"Controlled rate freezing", preservation:"-80°C Manual freezer", weight: "not reported", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Plasma"), ischemicTime:"1.6-2 hours", stabilization:"Controlled rate freezing", preservation:"-80°C Manual freezer", weight: "1.1-2 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Buffy coat"), ischemicTime:"1.6-2 hours", stabilization:"Controlled rate freezing", preservation:"-80°C Manual freezer", weight: "1.1-2 ml", dataCollected: "Pathology report + clinical data + longitudinal/outcome data", price: "\$1-50", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)

		//equipment52
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Controlled rate freezer"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$6,000-\$6,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Safety cabinet"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$5,000-\$5,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)

	}

	def load53() {
    println "Surveydata.groovy: loading survey sourceId = 53"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 53, inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 7, country: SurveyCountry.findByName("Spain"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Networked"), sites: 1, facility: SurveyFacility.findByName("<2000 ft²"), costRecovery: "No", expRecovery: SurveyExpRecovery.findByName("0%"), markupSpecimen: 0, markupService: 0, indirectRate:15, surveyYear: 2014).save(flush:true, failOnError:true)

		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$10,000-\$19,999"),	fringe: SurveyLaborFringeRate.findByName("not reported"),	fte: "36-40").save(flush:true, failOnError:true)
		
		//Services53
		datapoint = new SurveyService(survey: survey, type: "Specimen collection kit assembly and shipping", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen transport", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Immunohistochemistry (IHC) testing", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "In-situ hybridization (ISH) testing", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen proficiency testing", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobanking project/protocol consultation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen protocol and/or consent writing", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen protocol regulatory submission", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen procedure/SOP writing", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen inventory management database consultation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank technical support, in-or out-sourced", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Evaluating and/or consenting donors for specimen and/or data collection", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Return of biospecimen research results to study participants and/or specimen donors", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample storage and monitoring", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank inventory management database quality/best practice review audit", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management quality/best practice review audit", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, transfer and/or relocation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, culling", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management, disaster recovery", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobank consumable/supply ordering support", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen collection kit assembly and shipping", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Annual biospecimen/project collection report", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Education and training", price:"\$1,000-\$1,999").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Study cohort selection", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen proficiency testing (sample set)", price:"\$0/free").save(flush:true, failOnError:true)

		//Products53
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Whole blood"), ischemicTime:">2 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "not reported", price: "not reported", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Serum"), ischemicTime:">2 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "not reported", price: "not reported", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Urine"), ischemicTime:">2 hours", stabilization:"Fresh (not stabilized)", preservation:"-149°C to 190°C LN² Cryotank", weight: ">5.1 ml", dataCollected: "not reported", price: "not reported", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("PBMC's"), ischemicTime:">2 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-80°C Manual freezer", weight: "2.1-5 ml", dataCollected: "not reported", price: "not reported", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("DNA, blood"), ischemicTime:">2 hours", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "not reported", price: "not reported", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("RNA, blood"), ischemicTime:">2 hours", stabilization:"Other: Not specified", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "not reported", price: "not reported", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)

		//equipment53
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laminar flow cabinet/hood"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laboratory workbench"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Controlled rate freezer"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, stand-alone"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated nucleic acid/protein extraction instrument"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("RFID Flat scanner, multi-tray"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bar-code flat scanner, multi-tray"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C to minus 40°C Refrigerator"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 149°C to minus 190°C LN² Cryotank"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microscope"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("PCR thermal cycler"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Western blot transfer system"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Blot hybridization system"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Safety cabinet"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)

	}
	def load54() {
    println "Surveydata.groovy: loading survey sourceId = 54"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 54, inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 25, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Independent"), sites: 1, facility: SurveyFacility.findByName("5,001 to 15,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("76%-100%"), markupSpecimen: 0, markupService: 0, indirectRate:16, surveyYear: 2014).save(flush:true, failOnError:true)

		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "2").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab manager/supervisor"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Repository coordinator"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Head/Group/Team leader"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "1").save(flush:true, failOnError:true)

		//Products54
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Whole blood"), ischemicTime:"0-0.5 hours", stabilization:"Controlled rate freezing", preservation:"-149°C to 190°C LN² Cryotank", weight: "0.6-1 ml", dataCollected: "not reported", price: "not reported", collectionVol:"1,500-2,000", distVol:"not reported").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Plasma"), ischemicTime:"0.6-1 hour", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-80°C Manual freezer", weight: "0.6-1 ml", dataCollected: "not reported", price: "not reported", collectionVol:"1,500-2,000", distVol:"not reported").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Serum"), ischemicTime:"0.6-1 hour", stabilization:"Additive (e.g. heparin, citrate, EDTA)", preservation:"-80°C Manual freezer", weight: "0.6-1 ml", dataCollected: "not reported", price: "not reported", collectionVol:"1,500-2,000", distVol:"not reported").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Buffy coat"), ischemicTime:"0.6-1 hour", stabilization:"Controlled rate freezing", preservation:"-149°C to 190°C LN² Cryotank", weight: "0.6-1 ml", dataCollected: "not reported", price: "not reported", collectionVol:"500-1,000", distVol:"not reported").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("PBMC's"), ischemicTime:"0.6-1 hour", stabilization:"Controlled rate freezing", preservation:"-149°C to 190°C LN² Cryotank", weight: "0.6-1 ml", dataCollected: "not reported", price: "not reported", collectionVol:"500-1,000", distVol:"not reported").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: LCL generated cell lines from PMBC's"), ischemicTime:">2 hours", stabilization:"Controlled rate freezing", preservation:"-149°C to 190°C LN² Cryotank", weight: "0.6-1 ml", dataCollected: "not reported", price: "not reported", collectionVol:"1-250", distVol:"not reported").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: Established cell lines, custom"), ischemicTime:">2 hours", stabilization:"Controlled rate freezing", preservation:"-149°C to 190°C LN² Cryotank", weight: "0.6-1 ml", dataCollected: "not reported", price: "\$150-\$199", collectionVol:"1-250", distVol:"250-500").save(flush:true, failOnError:true)
		
		//equipment54
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Incubator, automated"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("\$2,000-\$2,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Automated cell counter"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$20,000-\$29,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$4,000-\$4,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Cryo-cart"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual chest freezer"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$2,000-\$2,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 149°C to minus 190°C LN² Cryotank"), units: "11 to 15", buy: SurveyEquipmentBuyLease.findByName("Lease"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("\$4,000-\$4,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Freezer monitoring system"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$20,000-\$29,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("\$3,000-\$3,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Inventory database"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$40,000-\$49,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$7,000-\$7,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microscope"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$2,000-\$2,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Safety cabinet"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Lease"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("\$2,000-\$2,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Clean room"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Lease"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("\$2,000-\$2,999")).save(flush:true, failOnError:true)


	}

	def load55() {
    println "Surveydata.groovy: loading survey sourceId = 55"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 55, inst: SurveyInstitutionType.findByName("Community Based Hospital"), age: 2, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Independent"), sites: 1, facility: SurveyFacility.findByName("<2000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("1%-25%"), markupSpecimen: 0, markupService: 30, indirectRate:0, surveyYear: 2014).save(flush:true, failOnError:true)

		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Repository manager"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("not reported"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Repository coordinator"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("not reported"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Technical/Executive director"), range: SurveyLaborSalaryRange.findByName("\$100,000-\$250,000"),	fringe: SurveyLaborFringeRate.findByName("not reported"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Associate/Scientific director"), range: SurveyLaborSalaryRange.findByName("\$100,000-\$250,000"),	fringe: SurveyLaborFringeRate.findByName("not reported"),	fte: "1").save(flush:true, failOnError:true)

		//Services55
		datapoint = new SurveyService(survey: survey, type: "Specimen collection kit assembly and shipping", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen transport", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Pathology case review for clinical diagnosis and morphological confirmation", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Copy of pathology report", price:"\$100-\$149").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobanking project/protocol consultation", price:"\$150-\$199").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Evaluating and/or consenting donors for specimen and/or data collection", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample collection inventory management", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample storage and monitoring", price:"\$0/free").save(flush:true, failOnError:true)

		//Products55
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor tissue"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data", price: "\$100-\$149", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Normal tissue"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data", price: "\$100-\$149", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor and adjacent normal tissue"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data", price: "\$100-\$149", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor tissue"), ischemicTime:"0-0.5 hours", stabilization:"Formalin fixation", preservation:"Room temperature", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data", price: "\$100-\$149", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Normal tissue"), ischemicTime:"0-0.5 hours", stabilization:"Formalin fixation", preservation:"Room temperature", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data", price: "\$100-\$149", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor and adjacent normal tissue FFPE blocks"), ischemicTime:"0-0.5 hours", stabilization:"Formalin fixation", preservation:"Room temperature", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data", price: "\$100-\$149", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("H&E Slide, tumor tissue"), ischemicTime:"not reported", stabilization:"not reported", preservation:"Room temperature", weight: "not reported", dataCollected: "Pathology report + clinical data", price: "\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("H&E Slide, normal tissue"), ischemicTime:"not reported", stabilization:"not reported", preservation:"Room temperature", weight: "not reported", dataCollected: "Pathology report + clinical data", price: "\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("H&E Slide, tumor and adjacent normal tissue sample FFPE"), ischemicTime:"not reported", stabilization:"not reported", preservation:"Room temperature", weight: "not reported", dataCollected: "Pathology report + clinical data", price: "\$1-50", collectionVol:"1-250", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Buffy coat"), ischemicTime:">2 hours", stabilization:"Controlled rate freezing", preservation:"-80°C Manual freezer", weight: "0.6-1 ml", dataCollected: "Pathology report + clinical data", price: "\$150-\$199", collectionVol:"500-1,000", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Plasma"), ischemicTime:">2 hours", stabilization:"Controlled rate freezing", preservation:"-80°C Manual freezer", weight: "<0.5 ml", dataCollected: "Pathology report + clinical data", price: "\$100-\$149", collectionVol:"500-1,000", distVol:"1-250").save(flush:true, failOnError:true)


		//equipment55
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Cryostat"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: ">20", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Tissue processor, walk away"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: ">20", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Tissue processor, rapid conventional"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: ">20", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microtome"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: ">20", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Tissue embedding station"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: ">20", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laminar flow cabinet/hood"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: ">20", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laboratory workbench"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: ">20", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Controlled rate freezer"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: ">20", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Slide autostainer"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$30,000-\$39,999"), life: ">20", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)


	}

	def load56() {
    println "Surveydata.groovy: loading survey sourceId = 56"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 56, inst: SurveyInstitutionType.findByName("Independent Research Laboratory"), age: 4, country: SurveyCountry.findByName("China"), geo: SurveyGeoArea.findByName("Urban"), international: "Yes", model: SurveyOperatingModel.findByName("Networked"), sites: 10, facility: SurveyFacility.findByName(">100,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("51%-75%"), markupSpecimen: 80, markupService: 16, indirectRate:4, surveyYear: 2014).save(flush:true, failOnError:true)

		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$5,001-\$9,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "46-50").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Data Manager"), range: SurveyLaborSalaryRange.findByName("\$10,000-\$19,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "26-30").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Research assistant"), range: SurveyLaborSalaryRange.findByName("\$10,000-\$19,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "16-20").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Bioinformatics professional"), range: SurveyLaborSalaryRange.findByName("\$10,000-\$19,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "56-60").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("General manager"), range: SurveyLaborSalaryRange.findByName("\$10,000-\$19,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "16-20").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Quality manager"), range: SurveyLaborSalaryRange.findByName("\$5,001-\$9,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "16-20").save(flush:true, failOnError:true)
		
		//Services56
		datapoint = new SurveyService(survey: survey, type: "Other: DNA extraction", price:"\$1-49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Sample storage and monitoring", price:"\$1-49").save(flush:true, failOnError:true)

		//Products56
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("DNA, blood"), ischemicTime:"not reported", stabilization:"Fresh (not stabilized)", preservation:"not reported", weight: "<0.5 ml", dataCollected: "not reported", price: "not reported", collectionVol:">250,000", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Whole blood"), ischemicTime:"not reported", stabilization:"Fresh (not stabilized)", preservation:"not reported", weight: "2.1-5 ml", dataCollected: "not reported", price: "not reported", collectionVol:">250,000", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Plasma"), ischemicTime:"not reported", stabilization:"Fresh (not stabilized)", preservation:"-80°C Manual freezer", weight: "1.1-2 ml", dataCollected: "not reported", price: "not reported", collectionVol:">250,000", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: Cervical cell samples"), ischemicTime:"not reported", stabilization:"not reported", preservation:"not reported", weight: "2.1-5 ml", dataCollected: "not reported", price: "not reported", collectionVol:">250,000", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: Library"), ischemicTime:"not reported", stabilization:"not reported ", preservation:"not reported", weight: "<0.5 ml", dataCollected: "not reported", price: "not reported", collectionVol:"150,000-200,000", distVol:"1-250").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Other: Dried blood spots"), ischemicTime:"not reported", stabilization:"not reported", preservation:"not reported", weight: "not reported", dataCollected: "not reported", price: "not reported", collectionVol:"20,000-30,000", distVol:"1-250").save(flush:true, failOnError:true)
		
		//equipment56
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Controlled rate freezer"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$20,000-\$29,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, stand-alone"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$6,000-\$6,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated nucleic acid/protein extraction instrument"), units: "5", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$250,000-\$499,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Incubator, manual"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Incubator, automated"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Not specified"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$20,000-\$29,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Not specified"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$50,000-\$59,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Not specified"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$40,000-\$49,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Not specified"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$20,000-\$29,999"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Sample/tube picking & sorting station, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Sample/tube picking & sorting station, stand-alone"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$200,000-\$249,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Cryo-cart"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C to minus 40°C Refrigerator"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$2,000-\$2,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 148°C Manual vertical freezer"), units: "31 to 35", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$40,000-\$49,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 149°C to minus 190°C LN² Cryotank"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$30,000-\$39,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C Automated biostore"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$250,000-\$499,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Cryogenic cabinet freezer"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Cold room/walk-in"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Real time PCR System"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("PCR thermal cycler"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Not specified"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$30,000-\$39,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Not specified"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)

	}

	def load57() {
    println "Surveydata.groovy: loading survey sourceId = 57"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: 57, inst: SurveyInstitutionType.findByName("Community Based Hospital"), age: 0, country: SurveyCountry.findByName("India"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Independent"), sites: 1, facility: SurveyFacility.findByName("<2000 ft²"), costRecovery: "No", expRecovery: SurveyExpRecovery.findByName("0%"), markupSpecimen: 12, markupService: 12, indirectRate:10, surveyYear: 2014).save(flush:true, failOnError:true)

		//labor
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("<\$5,000"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Histotechnician"), range: SurveyLaborSalaryRange.findByName("\$5,001-\$9,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "0.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Pathology Assistant"), range: SurveyLaborSalaryRange.findByName("\$5,001-\$9,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "10").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Clinical Research Coordinator"), range: SurveyLaborSalaryRange.findByName("\$5,001-\$9,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Data Manager"), range: SurveyLaborSalaryRange.findByName("\$10,000-\$19,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "6").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Research assistant"), range: SurveyLaborSalaryRange.findByName("\$5,001-\$9,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Clinical Research associate"), range: SurveyLaborSalaryRange.findByName("\$10,000-\$19,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Research/Study nurse"), range: SurveyLaborSalaryRange.findByName("\$5,001-\$9,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab manager/supervisor"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Repository manager"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "7").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Repository coordinator"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "7.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Head/Group/Team leader"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "8").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Technical/Executive director"), range: SurveyLaborSalaryRange.findByName("\$80,000-\$99,999"),	fringe: SurveyLaborFringeRate.findByName("> 50%"),	fte: "8").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Associate/Scientific director"), range: SurveyLaborSalaryRange.findByName("\$80,000-\$99,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "8.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Pathologist"), range: SurveyLaborSalaryRange.findByName("\$100,000-\$250,000"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "0").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Individual researcher/scientist"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "6.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Clinical resident/fellow"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "6.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Bioinformatics professional"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "6").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Biostatistician"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Business manager"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "6").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Deputy technical coordinator"), range: SurveyLaborSalaryRange.findByName("not reported"), fringe:	SurveyLaborFringeRate.findByName("11%-20%"),	fte: "6").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Chief operating officer (COO)"), range: SurveyLaborSalaryRange.findByName("\$100,000-\$250,000"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "7").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Chief Technology officer (CTO)"), range: SurveyLaborSalaryRange.findByName("\$80,000-\$99,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "7").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Chief Financial officer (CFO)"), range: SurveyLaborSalaryRange.findByName("\$80,000-\$99,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "8").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Chief Commercial officer (COO)"), range: SurveyLaborSalaryRange.findByName("\$80,000-\$99,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "8").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("General manager"), range: SurveyLaborSalaryRange.findByName("\$100,000-\$250,000"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "10").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Program/Project manager"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "4").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Product manager"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "4").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Customer product/service representative"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("<10%"),	fte: "4").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Quality manager"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "6").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Advisor"), range: SurveyLaborSalaryRange.findByName("> \$250,000"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "8").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Administrative/Executive assistant"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("11%-20%"),	fte: "5").save(flush:true, failOnError:true)	

		//Services57
		datapoint = new SurveyService(survey: survey, type: "Specimen collection kit assembly and shipping", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen transport", price:"\$1-\$49").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Immunohistochemistry (IHC) testing", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "In-situ hybridization (ISH) testing", price:"\$100-\$149").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "RNA integrity number (RIN) testing", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen proficiency testing", price:"\$150-\$199").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Genetic testing", price:"\$100-\$149").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "SNP genotyping", price:"\$200-\$249").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "DNA sequencing", price:"\$500-\$599").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "RNA sequencing", price:"\$700-\$799").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Gene expression profiling (DNA, RNA, protein)", price:"\$500-\$599").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Mass spectrometry 2-D protein profiling", price:"\$200-\$249").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Mass spectrometry protein profiling, isotope tagging method", price:"\$250-\$299").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Protein microarrays (\"Protein chip\")", price:"\$250-\$299").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Pathology case review for clinical diagnosis and morphological confirmation", price:"\$100-\$149").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Pathology external consult, case review", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Copy of pathology report", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Specimen biosketch report", price:"\$50-\$99").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biobanking project/protocol consultation", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen protocol and/or consent writing", price:"\$0/free").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen protocol regulatory submission", price:"\$250-\$299").save(flush:true, failOnError:true)
		datapoint = new SurveyService(survey: survey, type: "Biospecimen procedure/SOP writing", price:"\$100-\$1-49").save(flush:true, failOnError:true)

		//Products57
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Normal tissue"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data", price: "\$1-50", collectionVol:"2,000-2,500", distVol:"500-1,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor tissue"), ischemicTime:"0-0.5 hours", stabilization:"Snap-Freezing with or without OCT", preservation:"-80°C Manual freezer", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data", price: "\$1-50", collectionVol:"1,500-2,000", distVol:"500-1,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor tissue"), ischemicTime:"0-0.5 hours", stabilization:"Formalin fixation", preservation:"Room temperature", weight: "0.6-1 gm", dataCollected: "Pathology report + clinical data", price: "\$1-50", collectionVol:"1,500-2,000", distVol:"500-1,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Normal tissue"), ischemicTime:">2 hours", stabilization:"Formalin fixation", preservation:"Room temperature", weight: "0.6-1 gm", dataCollected: "Pathology report + clinical data", price: "\$1-50", collectionVol:"1,500-2,000", distVol:"500-1,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("H&E slide, tumor tissue"), ischemicTime:">2 hours", stabilization:"Formalin fixation", preservation:"Room temperature", weight: "0.6-1 gm", dataCollected: "Pathology report + clinical data", price: "\$1-50", collectionVol:"1,500-2,000", distVol:"500-1,000").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor and adjacent normal tissue"), ischemicTime:"0-0.5 hours", stabilization:"Controlled rate freezing", preservation:"-80°C Manual freezer", weight: "not reported", dataCollected: "not reported", price: "not reported", collectionVol:"not reported", distVol:"not reported").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor and adjacent normal tissue"), ischemicTime:"0-0.5 hours", stabilization:"Controlled rate freezing", preservation:"-80°C Manual freezer", weight: "not reported", dataCollected: "not reported", price: "not reported", collectionVol:"not reported", distVol:"not reported").save(flush:true, failOnError:true)
		datapoint = new SurveyProduct(survey: survey, type: SurveyProductType.findByName("Tumor TMA block"), ischemicTime:"0-0.5 hours", stabilization:"Controlled rate freezing", preservation:"-80°C Manual freezer", weight: "<0.5 gm", dataCollected: "Pathology report + clinical data", price: "\$100-\$149", collectionVol:"250-500", distVol:"1-250").save(flush:true, failOnError:true)


		//equipment57
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Cold table/cryogenic workbench"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "8", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Cryostat"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Tissue processor, rapid conventional"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("SPIN tissue processor, microwave"), units: "not reported", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$8,000-\$8,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microtome"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$5,000-\$5,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Tissue embedding station"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$8,000-\$8,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laminar flow cabinet/hood"), units: "5", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$8,000-\$8,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laboratory workbench"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$2,000-\$2,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, stand-alone"), units: "not reported", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$8,000-\$8,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated stem cell culture instrument"), units: "not reported", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$30,000-\$39,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Incubator, manual"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Incubator, automated"), units: "not reported", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$3,000-\$3,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "5", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk sample labeler, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$4,000-\$4,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("RFID Flat scanner, multi-tray"), units: "not reported", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bar-code flat scanner, multi-tray"), units: "not reported", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$4,000-\$4,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated microplate dispenser/sample processor, bench-top"), units: "not reported", buy: SurveyEquipmentBuyLease.findByName("Lease"), price: SurveyEquipmentPrice.findByName("\$7,000-\$7,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C to minus 40°C Refrigerator"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$40,000-\$49,999"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microscope"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Flow cytometer"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$100,000-\$124,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("\$3,000-\$3,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated blood fractionation system"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Lease"), price: SurveyEquipmentPrice.findByName("\$80,000-\$89,999"), life:"10", contract: SurveyEquipmentAnnual.findByName("\$3,000-\$3,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Real time PCR System"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$5,000-\$5,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("PCR thermal cycler"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$2,000-\$2,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Orbital bath shaker, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Reagent dispenser"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Autoclave"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$3,000-\$3,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Safety cabinet"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$3,000-\$3,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Clean room"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$5,000-\$5,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)

	}

	def load58() {
    println "Surveydata.groovy: loading survey sourceId = 58A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "58A", inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 15, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Networked"), sites: 4, facility: SurveyFacility.findByName("2,001 to 5,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("1%-25%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
	}

	def load59() {
    println "Surveydata.groovy: loading survey sourceId = 59A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "59A", inst: SurveyInstitutionType.findByName("Commercial entity"), age: 7, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "Yes", model: SurveyOperatingModel.findByName("Networked"), sites: 8, facility: SurveyFacility.findByName(">100,000 ft²"), costRecovery: "No", expRecovery: SurveyExpRecovery.findByName("0%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
	}

	def load60A() {
    println "Surveydata.groovy: loading survey sourceId = 60A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "60A", inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 2, country: SurveyCountry.findByName("Lithuania"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Independent"), sites: 7, facility: SurveyFacility.findByName("2,001 to 5,000 ft²"), costRecovery: "No", expRecovery: SurveyExpRecovery.findByName("0%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
	}

	def load61A() {
    println "Surveydata.groovy: loading survey sourceId = 61A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "61A", inst: SurveyInstitutionType.findByName("Commercial entity"), age: 15, country: SurveyCountry.findByName("Germany"), geo: SurveyGeoArea.findByName("Urban"), international: "Yes", model: SurveyOperatingModel.findByName("Centralized"), sites: 20, facility: SurveyFacility.findByName("50,001 to 100,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("> 100%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
	}

	def load62A() {
    println "Surveydata.groovy: loading survey sourceId = 62A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "62A", inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 6, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Centralized"), sites: 2, facility: SurveyFacility.findByName("2,001 to 5,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("1%-25%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
	}

	def load63A() {
    println "Surveydata.groovy: loading survey sourceId = 63A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "63A", inst: SurveyInstitutionType.findByName("Community Based Hospital"), age: 1, country: SurveyCountry.findByName("Finland"), geo: SurveyGeoArea.findByName("Urban"), international: "Yes", model: SurveyOperatingModel.findByName("Federated"), sites: 3, facility: SurveyFacility.findByName("<2000 ft²"), costRecovery: "No", expRecovery: SurveyExpRecovery.findByName("0%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
	}

	def load64A() {
    println "Surveydata.groovy: loading survey sourceId = 64A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "64A", inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 7, country: SurveyCountry.findByName("Spain"), geo: SurveyGeoArea.findByName("Urban"), international: "Yes", model: SurveyOperatingModel.findByName("Centralized"), sites: 3, facility: SurveyFacility.findByName("2,001 to 5,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("26%-50%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
	}

	def load65A() {
    println "Surveydata.groovy: loading survey sourceId = 65A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "65A", inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 20, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "Yes", model: SurveyOperatingModel.findByName("Networked"), sites: 4, facility: SurveyFacility.findByName("15,001 to 50,000 ft²"), costRecovery: "No", expRecovery: SurveyExpRecovery.findByName("0%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
	}

	def load66A() {
    println "Surveydata.groovy: loading survey sourceId = 66A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "66A", inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 14, country: SurveyCountry.findByName("Canada"), geo: SurveyGeoArea.findByName("Urban"), international: "Yes", model: SurveyOperatingModel.findByName("Centralized"), sites: 3, facility: SurveyFacility.findByName("5,001 to 15,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("76%-100%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)

		//labor 66A
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "3").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Repository manager"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Other: Programmer"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "1").save(flush:true, failOnError:true)
	
		//equipment66A
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laminar flow cabinet/hood"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated sample/vial filling station, stand-alone"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated nucleic acid/protein extraction instrument"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bar-code flat scanner, multi-tray"), units: "6 to 10", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "4", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C to minus 40°C Refrigerator"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1-\$999"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual chest freezer"), units: "21 to 25", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$30,000-\$39,999"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 149°C to minus 190°C LN² Cryotank"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microscope"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated blood fractionation system"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("PCR thermal cycler"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Autoclave"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("not reported"), life: "10", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
	}

	def load67A() {
    println "Surveydata.groovy: loading survey sourceId = 67A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "67A", inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 10, country: SurveyCountry.findByName("Croatia"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Centralized"), sites: 2, facility: SurveyFacility.findByName("5,001 to 15,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("26%-50%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
	}

	def load68A() {
    println "Surveydata.groovy: loading survey sourceId = 68A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "68A", inst: SurveyInstitutionType.findByName("Commercial entity"), age: 11, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "Yes", model: SurveyOperatingModel.findByName("Centralized"), sites: 1, facility: SurveyFacility.findByName("2,001 to 5,000 ft²"), costRecovery: "No", expRecovery: SurveyExpRecovery.findByName("0%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
	}

	def load69A() {
    println "Surveydata.groovy: loading survey sourceId = 69A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "69A", inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 15, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Rural"), international: "No", model: SurveyOperatingModel.findByName("Centralized"), sites: 1, facility: SurveyFacility.findByName("2,001 to 5,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("26%-50%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
	}

	def load70A() {
    println "Surveydata.groovy: loading survey sourceId = 70A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "70A", inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 20, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Centralized"), sites: 1, facility: SurveyFacility.findByName("<2000 ft²"), costRecovery: "No", expRecovery: SurveyExpRecovery.findByName("0%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
	}

	def load71A() {
    println "Surveydata.groovy: loading survey sourceId = 71A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "71A", inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 25, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Centralized"), sites: 1, facility: SurveyFacility.findByName("<2000 ft²"), costRecovery: "No", expRecovery: SurveyExpRecovery.findByName("0%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
	}

	def load72A() {
    println "Surveydata.groovy: loading survey sourceId = 72A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "72A", inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 15, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Centralized"), sites: 1, facility: SurveyFacility.findByName("<2000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("76%-100%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
	}

	def load73A() {
    println "Surveydata.groovy: loading survey sourceId = 73A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "73A", inst: SurveyInstitutionType.findByName("Independent Research Laboratory"), age: 16, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "Yes", model: SurveyOperatingModel.findByName("Centralized"), sites: 1, facility: SurveyFacility.findByName("15,001 to 50,000 ft²"), costRecovery: "No", expRecovery: SurveyExpRecovery.findByName("0%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
	}

	def load74A() {
    println "Surveydata.groovy: loading survey sourceId = 74A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "74A", inst: SurveyInstitutionType.findByName("Government Program"), age: 4, country: SurveyCountry.findByName("Luxembourg"), geo: SurveyGeoArea.findByName("Urban"), international: "Yes", model: SurveyOperatingModel.findByName("Centralized"), sites: 1, facility: SurveyFacility.findByName("5,001 to 15,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("1%-25%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
	}

	def load75A() {
    println "Surveydata.groovy: loading survey sourceId = 75A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "75A", inst: SurveyInstitutionType.findByName("Government Program"), age: 6, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Centralized"), sites: 3, facility: SurveyFacility.findByName("<2000 ft²"), costRecovery: "No", expRecovery: SurveyExpRecovery.findByName("0%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
	}

	def load76A() {
    println "Surveydata.groovy: loading survey sourceId = 76A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "76A", inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 4, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Centralized"), sites: 1, facility: SurveyFacility.findByName("<2000 ft²"), costRecovery: "No", expRecovery: SurveyExpRecovery.findByName("0%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
	}

	def load77A() {
    println "Surveydata.groovy: loading survey sourceId = 77A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "77A", inst: SurveyInstitutionType.findByName("Independent Research Laboratory"), age: 12, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "Yes", model: SurveyOperatingModel.findByName("Independent"), sites: 1, facility: SurveyFacility.findByName("2,001 to 5,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("1%-25%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
	}

	def load78A() {
    println "Surveydata.groovy: loading survey sourceId = 78A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "78A", inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 37, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "Yes", model: SurveyOperatingModel.findByName("Centralized"), sites: 1, facility: SurveyFacility.findByName("2,001 to 5,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("1%-25%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
	}

	def load79A() {
    println "Surveydata.groovy: loading survey sourceId = 79A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "79A", inst: SurveyInstitutionType.findByName("Independent Research Laboratory"), age: 12, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "Yes", model: SurveyOperatingModel.findByName("Independent"), sites: 1, facility: SurveyFacility.findByName("5,001 to 15,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("26%-50%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
	}

	def load80A() {
    println "Surveydata.groovy: loading survey sourceId = 80A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "80A", inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 8, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Centralized"), sites: 1, facility: SurveyFacility.findByName("<2000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("1%-25%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
	}

	def load81A() {
    println "Surveydata.groovy: loading survey sourceId = 81A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "81A", inst: SurveyInstitutionType.findByName("Commercial entity"), age: 5, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Centralized"), sites: 1, facility: SurveyFacility.findByName("15,001 to 50,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("1%-25%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
	}

	def load82A() {
    println "Surveydata.groovy: loading survey sourceId = 82A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "82A", inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 10, country: SurveyCountry.findByName("Norway"), geo: SurveyGeoArea.findByName("Rural"), international: "Yes", model: SurveyOperatingModel.findByName("Networked"), sites: 1, facility: SurveyFacility.findByName("5,001 to 15,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("26%-50%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
	}

	def load83A() {
    println "Surveydata.groovy: loading survey sourceId = 83A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "83A", inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 9, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Federated"), sites: 2, facility: SurveyFacility.findByName("2,001 to 5,000 ft²"), costRecovery: "No", expRecovery: SurveyExpRecovery.findByName("0%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
	}

	def load84A() {
    println "Surveydata.groovy: loading survey sourceId = 84A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "84A", inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 6, country: SurveyCountry.findByName("Saudi Arabia"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Centralized"), sites: 11, facility: SurveyFacility.findByName("5,001 to 15,000 ft²"), costRecovery: "No", expRecovery: SurveyExpRecovery.findByName("0%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
	}

	def load85A() {
    println "Surveydata.groovy: loading survey sourceId = 85A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "85A", inst: SurveyInstitutionType.findByName("Commercial entity"), age: 7, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "Yes", model: SurveyOperatingModel.findByName("Centralized"), sites: 50, facility: SurveyFacility.findByName("5,001 to 15,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("> 100%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
	}

	def load86A() {
    println "Surveydata.groovy: loading survey sourceId = 86A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "86A", inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 2, country: SurveyCountry.findByName("Nigeria"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Independent"), sites: 1, facility: SurveyFacility.findByName("<2000 ft²"), costRecovery: "No", expRecovery: SurveyExpRecovery.findByName("0%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
	}

	def load87A() {
    println "Surveydata.groovy: loading survey sourceId = 87A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "87A", inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 6, country: SurveyCountry.findByName("Israel"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Networked"), sites: 1, facility: SurveyFacility.findByName("<2000 ft²"), costRecovery: "No", expRecovery: SurveyExpRecovery.findByName("0%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
	}

	def load88A() {
    println "Surveydata.groovy: loading survey sourceId = 88A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "88A", inst: SurveyInstitutionType.findByName("Community Based Hospital"), age: 3, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Rural"), international: "No", model: SurveyOperatingModel.findByName("Centralized"), sites: 1, facility: SurveyFacility.findByName("<2000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("1%-25%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
	}

	def load89A() {
    println "Surveydata.groovy: loading survey sourceId = 89A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "89A", inst: SurveyInstitutionType.findByName("Community Based Hospital"), age: 10, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "Yes", model: SurveyOperatingModel.findByName("Centralized"), sites: 20, facility: SurveyFacility.findByName("5,001 to 15,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("1%-25%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
	}

	def load90A() {
    println "Surveydata.groovy: loading survey sourceId = 90A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "90A", inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 4.5, country: SurveyCountry.findByName("Germany"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Centralized"), sites: 1, facility: SurveyFacility.findByName("<2000 ft²"), costRecovery: "No", expRecovery: SurveyExpRecovery.findByName("0%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
	}

	def load91A() {
    println "Surveydata.groovy: loading survey sourceId = 91A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "91A", inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 13, country: SurveyCountry.findByName("France"), geo: SurveyGeoArea.findByName("Urban"), international: "Yes", model: SurveyOperatingModel.findByName("Centralized"), sites: 1, facility: SurveyFacility.findByName("5,001 to 15,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("1%-25%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
	}

	def load92A() {
    println "Surveydata.groovy: loading survey sourceId = 92A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "92A", inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 8, country: SurveyCountry.findByName("Canada"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Federated"), sites: 15, facility: SurveyFacility.findByName("<2000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("1%-25%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
	}

	def load93A() {
    println "Surveydata.groovy: loading survey sourceId = 93A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "93A", inst: SurveyInstitutionType.findByName("Government Program"), age: 34, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Rural"), international: "Yes", model: SurveyOperatingModel.findByName("Centralized"), sites: 1, facility: SurveyFacility.findByName("15,001 to 50,000 ft²"), costRecovery: "No", expRecovery: SurveyExpRecovery.findByName("1%-25%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
	}

	def load94A() {
    println "Surveydata.groovy: loading survey sourceId = 94A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "94A", inst: SurveyInstitutionType.findByName("Community Based Hospital"), age: 6, country: SurveyCountry.findByName("Spain"), geo: SurveyGeoArea.findByName("Urban"), international: "Yes", model: SurveyOperatingModel.findByName("Centralized"), sites: 7, facility: SurveyFacility.findByName("<2000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("1%-25%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
	}

	def load95A() {    
		println "Surveydata.groovy: loading survey sourceId = 95A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "95A", inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 1, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "Yes", model: SurveyOperatingModel.findByName("Centralized"), sites: 4, facility: SurveyFacility.findByName("2,001 to 5,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("1%-25%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
		
		//labor95A
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$40,000-\$59,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab manager/supervisor"), range: SurveyLaborSalaryRange.findByName("\$100,000-\$250,000"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Associate/Scientific director"), range: SurveyLaborSalaryRange.findByName("\$100,000-\$250,000"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Program/Project manager"), range: SurveyLaborSalaryRange.findByName("\$60,000-\$79,999"),	fringe: SurveyLaborFringeRate.findByName("21%-30%"),	fte: "0.5").save(flush:true, failOnError:true)

		//equipment95A
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laminar flow cabinet/hood"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$8,000-\$8,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$9,000-\$9,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Automated nucleic acid/protein extraction instrument"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$100,000-\$124,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$7,000-\$7,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Liquid handler"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$250,000-\$499,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("\$23,000-\$24,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Bulk label printer, bench-top"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Sample/tube picking & sorting station, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$70,000-\$79,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C to minus 40°C Refrigerator"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: "4", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$40,000-\$49,999"), life: "15", contract: SurveyEquipmentAnnual.findByName("\$1,000-\$1,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C to minus 148°C LN² Cryotank"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$9,000-\$9,999"), life: "20", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 149°C to minus 190°C LN² Cryotank"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$60,000-\$69,999"), life: ">20", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C Automated biostore"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName(">\$500,000"), life: ">20", contract: SurveyEquipmentAnnual.findByName("\$200,000-\$249,000")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Cold room/walk-in"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: Flatbed plate scanner"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("PCR thermal cycler"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$9,000-\$9,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Autoclave"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Other: Not specified"), price: SurveyEquipmentPrice.findByName("not reported"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Other: DNA/RNA spectral analyzer"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$20,000-\$29,999"), life: "10", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)

	}

	def load96A() {
    println "Surveydata.groovy: loading survey sourceId = 96A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "96A", inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 7, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Independent"), sites: 1, facility: SurveyFacility.findByName("2,001 to 5,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("1%-25%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
	}

	def load97A() {
    println "Surveydata.groovy: loading survey sourceId = 97A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "97A", inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 10, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Centralized"), sites: 1, facility: SurveyFacility.findByName("5,001 to 15,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("76%-100%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
	}

	def load98A() {
    println "Surveydata.groovy: loading survey sourceId = 98A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "98A", inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 3, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Centralized"), sites: 2, facility: SurveyFacility.findByName("5,001 to 15,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("1%-25%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
	}

	def load99A() {
    println "Surveydata.groovy: loading survey sourceId = 99A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "99A", inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 20, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Rural"), international: "No", model: SurveyOperatingModel.findByName("Centralized"), sites: 3, facility: SurveyFacility.findByName("2,001 to 5,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("26%-50%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
	}

	def load100A() {
    println "Surveydata.groovy: loading survey sourceId = 100A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "100A", inst: SurveyInstitutionType.findByName("Community Based Hospital"), age: 16, country: SurveyCountry.findByName("New Zealand"), geo: SurveyGeoArea.findByName("Urban"), international: "Yes", model: SurveyOperatingModel.findByName("Centralized"), sites: 1, facility: SurveyFacility.findByName("<2000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("1%-25%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
	}

	def load101A() {
    println "Surveydata.groovy: loading survey sourceId = 101A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "101A", inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 31, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "No", model: SurveyOperatingModel.findByName("Independent"), sites: 2, facility: SurveyFacility.findByName("2,001 to 5,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("1%-25%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
	}

	def load102A() {
    println "Surveydata.groovy: loading survey sourceId = 102A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "102A", inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 5, country: SurveyCountry.findByName("Argentina"), geo: SurveyGeoArea.findByName("Urban"), international: "Yes", model: SurveyOperatingModel.findByName("Centralized"), sites: 2, facility: SurveyFacility.findByName("<2000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("26%-50%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
	}

	def load103A() {
    println "Surveydata.groovy: loading survey sourceId = 103A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "103A", inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 1, country: SurveyCountry.findByName("Jordan"), geo: SurveyGeoArea.findByName("Urban"), international: "Yes", model: SurveyOperatingModel.findByName("Centralized"), sites: 1, facility: SurveyFacility.findByName("<2000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("1%-25%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)

		//labor 103A
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Lab technician"), range: SurveyLaborSalaryRange.findByName("\$10,000-\$19,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Histotechnician"), range: SurveyLaborSalaryRange.findByName("\$10,000-\$19,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "1").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Associate/Scientific director"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "0.5").save(flush:true, failOnError:true)
		datapoint = new SurveyLabor(survey: survey, type: SurveyLaborType.findByName("Pathologist"), range: SurveyLaborSalaryRange.findByName("\$20,000-\$39,999"),	fringe: SurveyLaborFringeRate.findByName("31%-40%"),	fte: "0.5").save(flush:true, failOnError:true)


		//equipment103A
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Cryostat"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$20,000-\$29,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Laboratory workbench"), units: "2", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Centrifuge, refrigerated, bench-top"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$5,000-\$5,999"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Incubator, manual"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$1,000-\$1,999"), life: "not reported", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Dry vapor shippers, large"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Large cryogenic aluminum Dewar's"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 20°C to minus 40°C Refrigerator"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$3,000-\$3,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 80°C Manual vertical freezer"), units: "3", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("minus 149°C to minus 190°C LN² Cryotank"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$50,000-\$59,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("\$9,000-\$9,999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Microscope"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$10,000-\$19,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("<\$999")).save(flush:true, failOnError:true)
		datapoint = new SurveyEquipment(survey: survey, type: SurveyEquipmentType.findByName("Safety cabinet"), units: "1", buy: SurveyEquipmentBuyLease.findByName("Buy"), price: SurveyEquipmentPrice.findByName("\$20,000-\$29,999"), life: "5", contract: SurveyEquipmentAnnual.findByName("not reported")).save(flush:true, failOnError:true)
	}

	def load104A() {
    println "Surveydata.groovy: loading survey sourceId = 104A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "104A", inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 15, country: SurveyCountry.findByName("France"), geo: SurveyGeoArea.findByName("Urban"), international: "Yes", model: SurveyOperatingModel.findByName("Centralized"), sites: 1, facility: SurveyFacility.findByName("2,001 to 5,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("1%-25%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
	}

	def load105A() {
    println "Surveydata.groovy: loading survey sourceId = 105A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "105A", inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 15, country: SurveyCountry.findByName("United States"), geo: SurveyGeoArea.findByName("Urban"), international: "Yes", model: SurveyOperatingModel.findByName("Federated"), sites: 1, facility: SurveyFacility.findByName("2,001 to 5,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("1%-25%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)

	}

	def load106A() {
    println "Surveydata.groovy: loading survey sourceId = 106A"
    def survey = null
    def datapoint = null

    //survey
    survey = new Survey(complete: true, operatingBudget: null, startupSpend: null, sourceId: "106A", inst: SurveyInstitutionType.findByName("Academic Medical Center"), age: 3, country: SurveyCountry.findByName("Finland"), geo: SurveyGeoArea.findByName("Urban"), international: "Yes", model: SurveyOperatingModel.findByName("Centralized"), sites: 70, facility: SurveyFacility.findByName("15,001 to 50,000 ft²"), costRecovery: "Yes", expRecovery: SurveyExpRecovery.findByName("26%-50%"), markupSpecimen:-1,markupService:-1,indirectRate:-1, surveyYear: 2014).save(flush:true, failOnError:true)
    }
}