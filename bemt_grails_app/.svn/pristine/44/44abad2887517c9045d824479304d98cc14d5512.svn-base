import com.provia.bemt.domain.*
import cr.co.arquetipos.password.*

println 'Loading Template Biobanks'
//UI isn't set up for an user to have more than one ORG, but that doesn't matter in the datamodel (one ORG = one BIOBANK though)
def password = PasswordTools.saltPasswordBase64("GJ31i9HIQbK2")
//person
def person = new Bemtuser( nameFirst: 'Bemt', nameLast: "User", password: password, email: "noone@bemt.org").save(flush:true, failOnError:true)

//biobank
//def person = Bemtuser.findByNameLast("User")
def biobank = new Organization(description: "This is a template Biobank", deleted: false, name: "Template 1 Biobank", owner: person, template: true).save(flush:true, failOnError:true)

//def query = Organization.where {
//  name == "Template 1 Biobank" && template
//}
//Organization biobank = query.find()

def proforma = new Proforma(name: "Template 1 Biobank", organization: biobank).save(flush:true, failOnError:true)

//labor
def labor = new Labor(organization: biobank, name: "Director", category: LaborType.findByName("Facility Director"), annualSalary:180000, benefitPercent:35).save(flush:true, failOnError:true)
labor = new Labor(organization: biobank, name: "Technical/Executive Director", category: LaborType.findByName("Technical/Executive Director"), annualSalary:95000, benefitPercent:35).save(flush:true, failOnError:true)
labor = new Labor(organization: biobank, name: "Head Lab Technician", category: LaborType.findByName("Lab Technician"), annualSalary:42000, benefitPercent:35).save(flush:true, failOnError:true)
labor = new Labor(organization: biobank, name: "Lab Technician", category: LaborType.findByName("Lab Technician"), annualSalary:25000, benefitPercent:35).save(flush:true, failOnError:true)
labor = new Labor(organization: biobank, name: "Pathologist", category: LaborType.findByName("Pathologist"), annualSalary:150000, benefitPercent:35).save(flush:true, failOnError:true)

//equipment
def equip = new Equipment(organization: biobank, name: "Cryostat", equip: EquipmentType.findByName("Cryostat"), cost:25000, usableLife:10, annualBillableHours:2000, annualServiceContract:2500, type:"purchased").save(flush:true, failOnError:true)
equip = new Equipment(organization: biobank, name: "Freezer, -80°C, vertical, manual", equip: EquipmentType.findByName("Freezer, -80°C, vertical, manual"), cost:15000, usableLife:10, annualBillableHours:2000, annualServiceContract:1500, type:"purchased").save(flush:true, failOnError:true)
equip = new Equipment(organization: biobank, name: "Cryotank, -149°C to -190°C LN²", equip: EquipmentType.findByName("Cryotank, -149°C to -190°C LN²"), cost:20000, usableLife:10, annualBillableHours:2000, annualServiceContract:2000, type:"purchased").save(flush:true, failOnError:true)
equip = new Equipment(organization: biobank, name: "Bulk label printer, bench-top", equip: EquipmentType.findByName("Bulk label printer, bench-top"), cost:5000, usableLife:10, annualBillableHours:2000, annualServiceContract:500, type:"purchased").save(flush:true, failOnError:true)
equip = new Equipment(organization: biobank, name: "Laminar flow cabinet/hood", equip: EquipmentType.findByName("Laminar flow cabinet/hood"), cost:10000, usableLife:10, annualBillableHours:2000, annualServiceContract:1000, type:"purchased").save(flush:true, failOnError:true)
equip = new Equipment(organization: biobank, name: "Safety cabinet", equip: EquipmentType.findByName("Safety cabinet"), cost:7500, usableLife:10, annualBillableHours:2000, annualServiceContract:0, type:"purchased").save(flush:true, failOnError:true)
equip = new Equipment(organization: biobank, name: "Tissue embedding station", equip: EquipmentType.findByName("Tissue embedding station"), cost:5000, usableLife:10, annualBillableHours:2000, annualServiceContract:500, type:"purchased").save(flush:true, failOnError:true)
equip = new Equipment(organization: biobank, name: "Tissue processor, walk-away", equip: EquipmentType.findByName("Tissue processor, walk-away"), cost:30000, usableLife:10, annualBillableHours:2000, annualServiceContract:3000, type:"purchased").save(flush:true, failOnError:true)
equip = new Equipment(organization: biobank, name: "Refrigerator, -20°C to -40°C", equip: EquipmentType.findByName("Refrigerator, -20°C to -40°C"), cost:2500, usableLife:10, annualBillableHours:2000, annualServiceContract:250, type:"purchased").save(flush:true, failOnError:true)
equip = new Equipment(organization: biobank, name: "Microtome", equip: EquipmentType.findByName("Microtome"), cost:2500, usableLife:10, annualBillableHours:2000, annualServiceContract:250, type:"purchased").save(flush:true, failOnError:true)
equip = new Equipment(organization: biobank, name: "Microscope camera", equip: EquipmentType.findByName("Microscope camera"), cost:5000, usableLife:10, annualBillableHours:2000, annualServiceContract:500, type:"purchased").save(flush:true, failOnError:true)
equip = new Equipment(organization: biobank, name: "Cryo-cart", equip: EquipmentType.findByName("Cryo-cart"), cost:12000, usableLife:10, annualBillableHours:2000, annualServiceContract:1200, type:"purchased").save(flush:true, failOnError:true)
equip = new Equipment(organization: biobank, name: "Slide autostainer", equip: EquipmentType.findByName("Slide autostainer"), cost:10000, usableLife:10, annualBillableHours:2000, annualServiceContract:1000, type:"purchased").save(flush:true, failOnError:true)

def sup = new Supply(name: "Slides", type: SupplyType.findByName("Slides/Coverslips (examples: Microscope, Microarray, etc)"), unitPrice:1.00, units: "Slide" , organization: biobank).save(flush:true, failOnError:true)
sup = new Supply(name: "Cutting Board Paper", type: SupplyType.findByName("Cutting Board Paper"), unitPrice:0.25, units: "Sheet" , organization: biobank).save(flush:true, failOnError:true)
sup = new Supply(name: "Cryostat Blades", type: SupplyType.findByName("Microtome blades"), unitPrice:0.50, units: "Blade" , organization: biobank).save(flush:true, failOnError:true)
sup = new Supply(name: "Scalpel Blades", type: SupplyType.findByName("Dissecting blades"), unitPrice:0.40, units: "Blade" , organization: biobank).save(flush:true, failOnError:true)
sup = new Supply(name: "Aliquot Container", type: SupplyType.findByName("Cryovial tube/cap (examples: .5ml, 2.0ml, etc.)"), unitPrice:0.25, units: "Vial" , organization: biobank).save(flush:true, failOnError:true)
sup = new Supply(name: "Microtome Blade", type: SupplyType.findByName("Microtome blades"), unitPrice:0.50, units: "Blade" , organization: biobank).save(flush:true, failOnError:true)
sup = new Supply(name: "Coverslips", type: SupplyType.findByName("Slides/Coverslips (examples: Microscope, Microarray, etc)"), unitPrice:0.10, units: "Coverslip" , organization: biobank).save(flush:true, failOnError:true)
sup = new Supply(name: "Box with Divider", type: SupplyType.findByName("Storage Supplies (examples: Box, Dividers, Labels, etc)"), unitPrice:2.50, units: "Box" , organization: biobank).save(flush:true, failOnError:true)
sup = new Supply(name: "Thermal Labels", type: SupplyType.findByName("Storage Supplies (examples: Box, Dividers, Labels, etc)"), unitPrice:0.10, units: "Label" , organization: biobank).save(flush:true, failOnError:true)
sup = new Supply(name: "Plastic Biohazard Bags", type: SupplyType.findByName("Plastic biohazard bags"), unitPrice:0.25, units: "Bag" , organization: biobank).save(flush:true, failOnError:true)
sup = new Supply(name: "Slide Shipping Box", type: SupplyType.findByName("Shipping Containers (examples: Slide Box)"), unitPrice:5.00, units: "Box" , organization: biobank).save(flush:true, failOnError:true)
sup = new Supply(name: "Glove", type: SupplyType.findByName("Gloves"), unitPrice:2.00, units: "Pair" , organization: biobank).save(flush:true, failOnError:true)
sup = new Supply(name: "Wide Mouth Collection Cups", type: SupplyType.findByName("Specimen Collection Containers/Kits (examples: Swab, Vials, Wide Mouth, Cups, etc)"), unitPrice:0.10, units: "Aliquot" , organization: biobank).save(flush:true, failOnError:true)
sup = new Supply(name: "Tissue Cassette", type: SupplyType.findByName("Storage Containers (examples: FFPE Tissue Cassettes, Clamshell, Plastic Cassettes, Aluminum Vials)"), unitPrice:0.30, units: "Cassette" , organization: biobank).save(flush:true, failOnError:true)
sup = new Supply(name: "Standard Shipping Container w Packaging", type: SupplyType.findByName("Shipping Containers (examples: Slide Box)"), unitPrice:10.00, units: "Shipment" , organization: biobank).save(flush:true, failOnError:true)

def specimen = new Product(name:"Tumor and adjacent normal frozen tissue", type: ProductType.findByName("Specimen/Product"), subtype: SpecimanServiceType.findByName("Tumor and adjacent normal tissue"), description: "Stabilization: Snap-Freezing with or without OCT; Ischemic Time: 0.6-1 hour; Weight/Vol.: 0.6-1 gm; Preservation: -20°C to -148°C LN² Cryotank; Path Verification: Yes; Data Collected: Pathology report + clinical data + longitudinal/outcome data",  cost:0, unitCost:74.31, indirect:21.23, indirectPercent:40.00,organization:biobank).save(flush:true, failOnError:true)
//COGS
def cogs = new CostplusCogs(product: specimen, supply: Supply.findByOrganizationAndName(biobank, "Wide Mouth Collection Cups"), quantity:4, cost:0.40, type:"unit", organization: biobank).save(flush:true, failOnError:true)
cogs = new CostplusCogs(product: specimen, supply: Supply.findByOrganizationAndName(biobank, "Cutting Board Paper"), quantity:2, cost:0.50, type:"unit", organization: biobank).save(flush:true, failOnError:true)
cogs = new CostplusCogs(product: specimen, supply: Supply.findByOrganizationAndName(biobank, "Cryostat Blades"), quantity:2, cost:1.00, type:"unit", organization: biobank).save(flush:true, failOnError:true)
cogs = new CostplusCogs(product: specimen, supply: Supply.findByOrganizationAndName(biobank, "Scalpel Blades"), quantity:2, cost:0.80, type:"unit", organization: biobank).save(flush:true, failOnError:true)
cogs = new CostplusCogs(product: specimen, supply: Supply.findByOrganizationAndName(biobank, "Box with Divider"), quantity:1, cost:2.50, type:"unit", organization: biobank).save(flush:true, failOnError:true)
cogs = new CostplusCogs(product: specimen, supply: Supply.findByOrganizationAndName(biobank, "Glove"), quantity:2, cost:4.00, type:"unit", organization: biobank).save(flush:true, failOnError:true)
cogs = new CostplusCogs(product: specimen, supply: Supply.findByOrganizationAndName(biobank, "Plastic Biohazard Bags"), quantity:2, cost:0.50, type:"unit", organization: biobank).save(flush:true, failOnError:true)
cogs = new CostplusCogs(product: specimen, supply: Supply.findByOrganizationAndName(biobank, "Coverslips"), quantity:2, cost:0.20, type:"unit", organization: biobank).save(flush:true, failOnError:true)
cogs = new CostplusCogs(product: specimen, supply: Supply.findByOrganizationAndName(biobank, "Slides"), quantity:2, cost:2.00, type:"unit", organization: biobank).save(flush:true, failOnError:true)
cogs = new CostplusCogs(product: specimen, supply: Supply.findByOrganizationAndName(biobank, "Thermal Labels"), quantity:8, cost:0.80, type:"unit", organization: biobank).save(flush:true, failOnError:true)
cogs = new CostplusCogs(product: specimen, supply: Supply.findByOrganizationAndName(biobank, "Aliquot Container"), quantity:2, cost:0.50, type:"unit", organization: biobank).save(flush:true, failOnError:true)

//ALLOCATED
def allocated = new CostplusAllocated(product: specimen, labor: Labor.findByOrganizationAndName(biobank, "Head Lab Technician"), quantity: 5, cost: 2.36, organization: biobank).save(flush:true, failOnError:true)
allocated = new CostplusAllocated(product: specimen, labor: Labor.findByOrganizationAndName(biobank, "Lab Technician"), quantity: 70, cost: 19.69, organization: biobank).save(flush:true, failOnError:true)
allocated = new CostplusAllocated(product: specimen, labor: Labor.findByOrganizationAndName(biobank, "Pathologist"), quantity: 10, cost: 16.88, organization: biobank).save(flush:true, failOnError:true)

allocated = new CostplusAllocated(product: specimen, equipment: Equipment.findByOrganizationAndName(biobank, "Cryostat"), quantity: 10, cost: 0.42, organization: biobank).save(flush:true, failOnError:true)
allocated = new CostplusAllocated(product: specimen, equipment: Equipment.findByOrganizationAndName(biobank, "Bulk label printer, bench-top"), quantity: 1, cost: 0.01, organization: biobank).save(flush:true, failOnError:true)
allocated = new CostplusAllocated(product: specimen, equipment: Equipment.findByOrganizationAndName(biobank, "Microscope camera"), quantity: 10, cost: 0.08, organization: biobank).save(flush:true, failOnError:true)
allocated = new CostplusAllocated(product: specimen, equipment: Equipment.findByOrganizationAndName(biobank, "Cryo-cart"), quantity: 5, cost: 0.10, organization: biobank).save(flush:true, failOnError:true)
allocated = new CostplusAllocated(product: specimen, equipment: Equipment.findByOrganizationAndName(biobank, "Slide autostainer"), quantity: 20, cost: 0.34, organization: biobank).save(flush:true, failOnError:true)

//OTHER (none)


specimen = new Product(name:"Tumor and adjacent normal tissue FFPE blocks", type: ProductType.findByName("Specimen/Product"), subtype: SpecimanServiceType.findByName("Tumor and adjacent normal tissue FFPE blocks"), description: "Stabilization: Formalin fixation; Ischemic Time: 0.6-1 hour; Preservation: Room temperature; Path Verification: Yes; Data Collected: Pathology report + clinical data + longitudinal/outcome data",  cost:0, unitCost:75.64, indirect:21.61, indirectPercent: 40.00,organization:biobank).save(flush:true, failOnError:true)
//COGS
cogs = new CostplusCogs(product: specimen, supply: Supply.findByOrganizationAndName(biobank, "Cryostat Blades"), quantity:2, cost:1.00, type:"unit", organization: biobank).save(flush:true, failOnError:true)
cogs = new CostplusCogs(product: specimen, supply: Supply.findByOrganizationAndName(biobank, "Wide Mouth Collection Cups"), quantity:4, cost:0.40, type:"unit", organization: biobank).save(flush:true, failOnError:true)
cogs = new CostplusCogs(product: specimen, supply: Supply.findByOrganizationAndName(biobank, "Cutting Board Paper"), quantity:2, cost:0.50, type:"unit", organization: biobank).save(flush:true, failOnError:true)
cogs = new CostplusCogs(product: specimen, supply: Supply.findByOrganizationAndName(biobank, "Scalpel Blades"), quantity:2, cost:0.80, type:"unit", organization: biobank).save(flush:true, failOnError:true)
cogs = new CostplusCogs(product: specimen, supply: Supply.findByOrganizationAndName(biobank, "Box with Divider"), quantity:1, cost:2.50, type:"unit", organization: biobank).save(flush:true, failOnError:true)
cogs = new CostplusCogs(product: specimen, supply: Supply.findByOrganizationAndName(biobank, "Glove"), quantity:2, cost:4.00, type:"unit", organization: biobank).save(flush:true, failOnError:true)
cogs = new CostplusCogs(product: specimen, supply: Supply.findByOrganizationAndName(biobank, "Plastic Biohazard Bags"), quantity:2, cost:0.50, type:"unit", organization: biobank).save(flush:true, failOnError:true)
cogs = new CostplusCogs(product: specimen, supply: Supply.findByOrganizationAndName(biobank, "Coverslips"), quantity:2, cost:0.20, type:"unit", organization: biobank).save(flush:true, failOnError:true)
cogs = new CostplusCogs(product: specimen, supply: Supply.findByOrganizationAndName(biobank, "Slides"), quantity:2, cost:2.00, type:"unit", organization: biobank).save(flush:true, failOnError:true)
cogs = new CostplusCogs(product: specimen, supply: Supply.findByOrganizationAndName(biobank, "Thermal Labels"), quantity:8, cost:0.80, type:"unit", organization: biobank).save(flush:true, failOnError:true)
cogs = new CostplusCogs(product: specimen, supply: Supply.findByOrganizationAndName(biobank, "Tissue Cassette"), quantity:2, cost:0.60, type:"unit", organization: biobank).save(flush:true, failOnError:true)

//ALLOCATED
allocated = new CostplusAllocated(product: specimen, labor: Labor.findByOrganizationAndName(biobank, "Pathologist"), quantity: 10, cost: 16.88, organization: biobank).save(flush:true, failOnError:true)
allocated = new CostplusAllocated(product: specimen, labor: Labor.findByOrganizationAndName(biobank, "Head Lab Technician"), quantity: 5, cost: 2.36, organization: biobank).save(flush:true, failOnError:true)
allocated = new CostplusAllocated(product: specimen, labor: Labor.findByOrganizationAndName(biobank, "Lab Technician"), quantity: 70, cost: 19.69, organization: biobank).save(flush:true, failOnError:true)

allocated = new CostplusAllocated(product: specimen, equipment: Equipment.findByOrganizationAndName(biobank, "Bulk label printer, bench-top"), quantity: 1, cost: 0.01, organization: biobank).save(flush:true, failOnError:true)
allocated = new CostplusAllocated(product: specimen, equipment: Equipment.findByOrganizationAndName(biobank, "Microscope camera"), quantity: 10, cost: 0.08, organization: biobank).save(flush:true, failOnError:true)
allocated = new CostplusAllocated(product: specimen, equipment: Equipment.findByOrganizationAndName(biobank, "Slide autostainer"), quantity: 20, cost: 0.34, organization: biobank).save(flush:true, failOnError:true)
allocated = new CostplusAllocated(product: specimen, equipment: Equipment.findByOrganizationAndName(biobank, "Tissue processor, walk-away"), quantity: 25, cost: 1.25, organization: biobank).save(flush:true, failOnError:true)
allocated = new CostplusAllocated(product: specimen, equipment: Equipment.findByOrganizationAndName(biobank, "Tissue embedding station"), quantity: 10, cost: 0.08, organization: biobank).save(flush:true, failOnError:true)
allocated = new CostplusAllocated(product: specimen, equipment: Equipment.findByOrganizationAndName(biobank, "Microtome"), quantity: 10, cost: 0.04, organization: biobank).save(flush:true, failOnError:true)


//OTHER (none)





def service = new Product(name:"Outbound Shipping", type: ProductType.findByName("Service"), subtype: SpecimanServiceType.findByName("Packaging specimen shipments"), description: "Labor (Pick, Pack), Shipping Materials. (does not include postage or freight)",  cost:0, unitCost:25.84, indirect:7.38, indirectPercent:40.00,organization:biobank).save(flush:true, failOnError:true)
//COGS
cogs = new CostplusCogs(product: service, supply: Supply.findByOrganizationAndName(biobank, "Standard Shipping Container w Packaging"), quantity:1, cost:10.00, type:"unit", organization: biobank).save(flush:true, failOnError:true)

//ALLOCATED
allocated = new CostplusAllocated(product: specimen, labor: Labor.findByOrganizationAndName(biobank, "Standard Shipping Container w Packaging"), quantity: 1, cost: 10.00, organization: biobank).save(flush:true, failOnError:true)


//OTHER (none)

service = new Product(name:"H&E Slide Set", type: ProductType.findByName("Service"), subtype: SpecimanServiceType.findByName("Other"), description: "1 stained and 10 unstained H&E slides",  cost:0, unitCost:67.70, indirect:19.34, indirectPercent:40.00,organization:biobank).save(flush:true, failOnError:true)
//COGS
cogs = new CostplusCogs(product: service, supply: Supply.findByOrganizationAndName(biobank, "Slide Shipping Box"), quantity:1, cost:5.00, type:"unit", organization: biobank).save(flush:true, failOnError:true)
cogs = new CostplusCogs(product: service, supply: Supply.findByOrganizationAndName(biobank, "Slides"), quantity:11, cost:11.00, type:"unit", organization: biobank).save(flush:true, failOnError:true)
cogs = new CostplusCogs(product: service, supply: Supply.findByOrganizationAndName(biobank, "Coverslips"), quantity:11, cost:1.10, type:"unit", organization: biobank).save(flush:true, failOnError:true)
cogs = new CostplusCogs(product: service, supply: Supply.findByOrganizationAndName(biobank, "Thermal Labels"), quantity:12, cost:5.00, type:"unit", organization: biobank).save(flush:true, failOnError:true)

//ALLOCATED
allocated = new CostplusAllocated(product: service, labor: Labor.findByOrganizationAndName(biobank, "Pathologist"), quantity: 10, cost: 16.88, organization: biobank).save(flush:true, failOnError:true)
allocated = new CostplusAllocated(product: service, labor: Labor.findByOrganizationAndName(biobank, "Lab Technician"), quantity: 45, cost: 12.66, organization: biobank).save(flush:true, failOnError:true)
allocated = new CostplusAllocated(product: service, equipment: Equipment.findByOrganizationAndName(biobank, "Bulk label printer, bench-top"), quantity: 1, cost: 0.01, organization: biobank).save(flush:true, failOnError:true)
allocated = new CostplusAllocated(product: service, equipment: Equipment.findByOrganizationAndName(biobank, "Slide autostainer"), quantity: 25, cost: 0.43, organization: biobank).save(flush:true, failOnError:true)
allocated = new CostplusAllocated(product: service, equipment: Equipment.findByOrganizationAndName(biobank, "Microscope camera"), quantity: 5, cost: 0.04, organization: biobank).save(flush:true, failOnError:true)
allocated = new CostplusAllocated(product: service, equipment: Equipment.findByOrganizationAndName(biobank, "Microtome"), quantity: 10, cost: 0.04, organization: biobank).save(flush:true, failOnError:true)

//OTHER (none)

def fee = new ProjectFeeSchedule(name:"Fee Schedule for Cancer Collections and Research", description:"Please review the following specimen product and biobank services.").save(flush:true, failOnError:true);
def project = new Project(name:"Internal Funded Research Projects", fee: fee, description: "Provision of Specimens and Data to internal researchers.", organization: biobank).save(flush:true, failOnError:true)

//all four products
def p1 = Product.findByNameAndOrganization("Tumor and adjacent normal frozen tissue", biobank)
def p2 = Product.findByNameAndOrganization("Tumor and adjacent normal tissue FFPE blocks", biobank)
def p3 = Product.findByNameAndOrganization("Outbound Shipping", biobank)
def p4 = Product.findByNameAndOrganization("H&E Slide Set", biobank)

def pp = new ProjectProduct(product:p1, project:project, basePrice: 90.00, recoveryPercent:127.30).save(flush:true, failOnError:true)
pp = new ProjectProduct(product:p2, project:project, basePrice: 90.00, recoveryPercent:124.95).save(flush:true, failOnError:true)
pp = new ProjectProduct(product:p3, project:project, basePrice: 25.00, recoveryPercent:101.92).save(flush:true, failOnError:true)
pp = new ProjectProduct(product:p4, project:project, basePrice: 67.70, recoveryPercent:101.69).save(flush:true, failOnError:true)
	

fee = new ProjectFeeSchedule(name:"Fee Schedule for Commercial Collaborations", description:"Please review the following specimen product and biobank services.").save(flush:true, failOnError:true);
project = new Project(name:"Commercial Collaborations", fee: fee, description: "Collaborations with Pharma/Biotech Companies where Biobank provides products and services for research use.", organization: biobank).save(flush:true, failOnError:true)
pp = new ProjectProduct(product:p1, project:project, basePrice: 250.00, recoveryPercent:353.61).save(flush:true, failOnError:true)
pp = new ProjectProduct(product:p2, project:project, basePrice: 250.00, recoveryPercent:347.08).save(flush:true, failOnError:true)
pp = new ProjectProduct(product:p3, project:project, basePrice: 75.00, recoveryPercent:295.28).save(flush:true, failOnError:true)
pp = new ProjectProduct(product:p4, project:project, basePrice: 90.00, recoveryPercent:136.03).save(flush:true, failOnError:true)


fee = new ProjectFeeSchedule(name:"Fee Schedule for Inventory Buildout", description:"Please review the following specimen product and biobank services.").save(flush:true, failOnError:true);
project = new Project(name:"Inventory Buildout", fee: fee, description: "Effort to collect specimens and data for future potential use.", organization: biobank).save(flush:true, failOnError:true)
pp = new ProjectProduct(product:p1, project:project, basePrice: 0.00, recoveryPercent:0).save(flush:true, failOnError:true)
pp = new ProjectProduct(product:p2, project:project, basePrice: 0.00, recoveryPercent:0).save(flush:true, failOnError:true)



//PROFORMA STUFF


//labor
def exp = ""

(1..36).each {
	exp = new Proformalaborforecast(period: it, quantity: 0.05, proforma: proforma, labor: Labor.findByNameAndOrganization("Director",biobank)).save(flush:true, failOnError:true)
}

(1..36).each {
	exp = new Proformalaborforecast(period: it, quantity: 1, proforma: proforma, labor: Labor.findByNameAndOrganization("Technical/Executive Director",biobank)).save(flush:true, failOnError:true)
}
(1..36).each {
	exp = new Proformalaborforecast(period: it, quantity: 1, proforma: proforma, labor: Labor.findByNameAndOrganization("Head Lab Technician",biobank)).save(flush:true, failOnError:true)
}
(1..36).each {
	exp = new Proformalaborforecast(period: it, quantity: 3, proforma: proforma, labor: Labor.findByNameAndOrganization("Lab Technician",biobank)).save(flush:true, failOnError:true)
}
(1..36).each {
	exp = new Proformalaborforecast(period: it, quantity: 0.5, proforma: proforma, labor: Labor.findByNameAndOrganization("Pathologist",biobank)).save(flush:true, failOnError:true)
}

//equipment
exp = new Proformaequipmentforecast(period: 1, added: 1, quantity: 0, proforma: proforma, equipment: Equipment.findByNameAndOrganization("Cryostat",biobank)).save(flush:true, failOnError:true)
(2..36).each {
	exp = new Proformaequipmentforecast(period: it, added: 0, quantity: 1, proforma: proforma, equipment: Equipment.findByNameAndOrganization("Cryostat",biobank)).save(flush:true, failOnError:true)
}

exp = new Proformaequipmentforecast(period: 1, added: 2, quantity: 0, proforma: proforma, equipment: Equipment.findByNameAndOrganization("Freezer, -80°C, vertical, manual",biobank)).save(flush:true, failOnError:true)
(2..36).each {
	exp = new Proformaequipmentforecast(period: it, added: 0, quantity: 2, proforma: proforma, equipment: Equipment.findByNameAndOrganization("Freezer, -80°C, vertical, manual",biobank)).save(flush:true, failOnError:true)
}

exp = new Proformaequipmentforecast(period: 1, added: 1, quantity: 0, proforma: proforma, equipment: Equipment.findByNameAndOrganization("Cryotank, -149°C to -190°C LN²",biobank)).save(flush:true, failOnError:true)
(2..36).each {
	exp = new Proformaequipmentforecast(period: it, added: 0, quantity: 1, proforma: proforma, equipment: Equipment.findByNameAndOrganization("Cryotank, -149°C to -190°C LN²",biobank)).save(flush:true, failOnError:true)
}

exp = new Proformaequipmentforecast(period: 1, added: 1, quantity: 0, proforma: proforma, equipment: Equipment.findByNameAndOrganization("Bulk label printer, bench-top",biobank)).save(flush:true, failOnError:true)
(2..36).each {
	exp = new Proformaequipmentforecast(period: it, added: 0, quantity: 1, proforma: proforma, equipment: Equipment.findByNameAndOrganization("Bulk label printer, bench-top",biobank)).save(flush:true, failOnError:true)
}

exp = new Proformaequipmentforecast(period: 1, added: 1, quantity: 0, proforma: proforma, equipment: Equipment.findByNameAndOrganization("Laminar flow cabinet/hood",biobank)).save(flush:true, failOnError:true)
(2..36).each {
	exp = new Proformaequipmentforecast(period: it, added: 0, quantity: 1, proforma: proforma, equipment: Equipment.findByNameAndOrganization("Laminar flow cabinet/hood",biobank)).save(flush:true, failOnError:true)
}

exp = new Proformaequipmentforecast(period: 1, added: 1, quantity: 0, proforma: proforma, equipment: Equipment.findByNameAndOrganization("Safety cabinet",biobank)).save(flush:true, failOnError:true)
(2..36).each {
	exp = new Proformaequipmentforecast(period: it, added: 0, quantity: 1, proforma: proforma, equipment: Equipment.findByNameAndOrganization("Safety cabinet",biobank)).save(flush:true, failOnError:true)
}

exp = new Proformaequipmentforecast(period: 1, added: 1, quantity: 0, proforma: proforma, equipment: Equipment.findByNameAndOrganization("Tissue embedding station",biobank)).save(flush:true, failOnError:true)
(2..36).each {
	exp = new Proformaequipmentforecast(period: it, added: 0, quantity: 1, proforma: proforma, equipment: Equipment.findByNameAndOrganization("Tissue embedding station",biobank)).save(flush:true, failOnError:true)
}

exp = new Proformaequipmentforecast(period: 1, added: 1, quantity: 0, proforma: proforma, equipment: Equipment.findByNameAndOrganization("Tissue processor, walk-away",biobank)).save(flush:true, failOnError:true)
(2..36).each {
	exp = new Proformaequipmentforecast(period: it, added: 0, quantity: 1, proforma: proforma, equipment: Equipment.findByNameAndOrganization("Tissue processor, walk-away",biobank)).save(flush:true, failOnError:true)
}

exp = new Proformaequipmentforecast(period: 1, added: 1, quantity: 0, proforma: proforma, equipment: Equipment.findByNameAndOrganization("Refrigerator, -20°C to -40°C",biobank)).save(flush:true, failOnError:true)
(2..36).each {
	exp = new Proformaequipmentforecast(period: it, added: 0, quantity: 1, proforma: proforma, equipment: Equipment.findByNameAndOrganization("Refrigerator, -20°C to -40°C",biobank)).save(flush:true, failOnError:true)
}

exp = new Proformaequipmentforecast(period: 1, added: 1, quantity: 0, proforma: proforma, equipment: Equipment.findByNameAndOrganization("Microtome",biobank)).save(flush:true, failOnError:true)
(2..36).each {
	exp = new Proformaequipmentforecast(period: it, added: 0, quantity: 1, proforma: proforma, equipment: Equipment.findByNameAndOrganization("Microtome",biobank)).save(flush:true, failOnError:true)
}

exp = new Proformaequipmentforecast(period: 1, added: 1, quantity: 0, proforma: proforma, equipment: Equipment.findByNameAndOrganization("Microscope camera",biobank)).save(flush:true, failOnError:true)
(2..36).each {
	exp = new Proformaequipmentforecast(period: it, added: 0, quantity: 1, proforma: proforma, equipment: Equipment.findByNameAndOrganization("Microscope camera",biobank)).save(flush:true, failOnError:true)
}

exp = new Proformaequipmentforecast(period: 1, added: 1, quantity: 0, proforma: proforma, equipment: Equipment.findByNameAndOrganization("Cryo-cart",biobank)).save(flush:true, failOnError:true)
(2..36).each {
	exp = new Proformaequipmentforecast(period: it, added: 0, quantity: 1, proforma: proforma, equipment: Equipment.findByNameAndOrganization("Cryo-cart",biobank)).save(flush:true, failOnError:true)
}

exp = new Proformaequipmentforecast(period: 1, added: 1, quantity: 0, proforma: proforma, equipment: Equipment.findByNameAndOrganization("Slide autostainer",biobank)).save(flush:true, failOnError:true)
(2..36).each {
	exp = new Proformaequipmentforecast(period: it, added: 0, quantity: 1, proforma: proforma, equipment: Equipment.findByNameAndOrganization("Slide autostainer",biobank)).save(flush:true, failOnError:true)
}

//other expenses
exp = new ProformaExpense(proforma: proforma, expense: ProformaExpenseType.findByName("Other"), year1:15000, year2:10000, year3:10000).save(flush:true, failOnError:true)

//Ongoing Lab Supply Expense expenses
exp = new ProformaExpense(proforma: proforma, expense: ProformaExpenseType.findByName("Ongoing Lab Supply Expense"), year1:25000, year2:15000, year3:15000).save(flush:true, failOnError:true)

//Facilities
exp = new ProformaExpense(proforma: proforma, expense: ProformaExpenseType.findByName("Facilities"), year1:40000, year2:20000, year3:20000).save(flush:true, failOnError:true)

//Professional Services
exp = new ProformaExpense(proforma: proforma, expense: ProformaExpenseType.findByName("Professional Services"), year1:10000, year2:10000, year3:10000).save(flush:true, failOnError:true)

//Informatics Computers and Electronics
exp = new ProformaExpense(proforma: proforma, expense: ProformaExpenseType.findByName("Informatics Computers and Electronics"), year1:15000, year2:10000, year3:10000).save(flush:true, failOnError:true)

//Marketing and Sales
exp = new ProformaExpense(proforma: proforma, expense: ProformaExpenseType.findByName("Marketing and Sales"), year1:25000, year2:10000, year3:10000).save(flush:true, failOnError:true)


//proforma projects

//Internal Funded Research Projects
def pproj = new Proformaproject(rev1:103500, rev2:207000, rev3:207000, cost1:16440.00, cost2:32880, cost3:32880, proforma: proforma, project: Project.findByName("Internal Funded Research Projects")).save(flush:true, failOnError:true)
//add product forecasts.

def pprod = new Proformaproduct(project: pproj, price1:90, price2:90, price3:90, cost1:18.3, cost2:18.3, cost3:18.3,priceChange2:0.00,priceChange3:0.00,costChange2:0.00,costChange3:0.00, product: Product.findByOrganizationAndName(biobank, "H&E Slide Set")).save(flush:true, failOnError:true)
(1..6).each {
	def pprodf = new Proformaproductforecast(product:pprod, quantity:0, period: it).save(flush:true, failOnError:true)
}
(7..36).each {
	def pprodf = new Proformaproductforecast(product:pprod, quantity:50, period: it).save(flush:true, failOnError:true)
}

pprod = new Proformaproduct(project: pproj, price1:75, price2:75, price3:75, cost1:10, cost2:10, cost3:10,priceChange2:0.00,priceChange3:0.00,costChange2:0.00,costChange3:0.00, product: Product.findByOrganizationAndName(biobank, "Outbound Shipping")).save(flush:true, failOnError:true)
(1..6).each {
	def pprodf = new Proformaproductforecast(product:pprod, quantity:0, period: it).save(flush:true, failOnError:true)
}
(7..36).each {
	def pprodf = new Proformaproductforecast(product:pprod, quantity:50, period: it).save(flush:true, failOnError:true)
}

pprod = new Proformaproduct(project: pproj, price1:90, price2:90, price3:90, cost1:13.2, cost2:13.2, cost3:13.2,priceChange2:0.00,priceChange3:0.00,costChange2:0.00,costChange3:0.00, product: Product.findByOrganizationAndName(biobank, "Tumor and adjacent normal frozen tissue")).save(flush:true, failOnError:true)
(1..6).each {
	def pprodf = new Proformaproductforecast(product:pprod, quantity:0, period: it).save(flush:true, failOnError:true)
}
(7..36).each {
	def pprodf = new Proformaproductforecast(product:pprod, quantity:50, period: it).save(flush:true, failOnError:true)
}
pprod = new Proformaproduct(project: pproj, price1:90, price2:90, price3:90, cost1:13.3, cost2:13.3, cost3:13.3,priceChange2:0.00,priceChange3:0.00,costChange2:0.00,costChange3:0.00, product: Product.findByOrganizationAndName(biobank, "Tumor and adjacent normal tissue FFPE blocks")).save(flush:true, failOnError:true)
(1..6).each {
	def pprodf = new Proformaproductforecast(product:pprod, quantity:0, period: it).save(flush:true, failOnError:true)
}
(7..36).each {
	def pprodf = new Proformaproductforecast(product:pprod, quantity:50, period: it).save(flush:true, failOnError:true)
}


//pprod = new Proformaproduct(price1:, price2:, price3:, cost1:, cost2:, cost3:,priceChange2:0.00,priceChange3:0.00,costChange2:0.00,costChange3:0.00, product: Product.findByOrganizationAndName(biobank, "Marketing and Sales")).save(flush:true, failOnError:true)


//Commercial Collaborations
pproj = new Proformaproject(rev1:199500, rev2:399000, rev3:399000, cost1:16440, cost2:32880, cost3:32880, proforma: proforma, project: Project.findByName("Commercial Collaborations")).save(flush:true, failOnError:true)
pprod = new Proformaproduct(project: pproj, price1:90, price2:90, price3:90, cost1:18.3, cost2:18.3, cost3:18.3,priceChange2:0.00,priceChange3:0.00,costChange2:0.00,costChange3:0.00, product: Product.findByOrganizationAndName(biobank, "H&E Slide Set")).save(flush:true, failOnError:true)
(1..6).each {
	def pprodf = new Proformaproductforecast(product:pprod, quantity:0, period: it).save(flush:true, failOnError:true)
}
(7..36).each {
	def pprodf = new Proformaproductforecast(product:pprod, quantity:50, period: it).save(flush:true, failOnError:true)
}

pprod = new Proformaproduct(project: pproj, price1:75, price2:75, price3:75, cost1:10, cost2:10, cost3:10,priceChange2:0.00,priceChange3:0.00,costChange2:0.00,costChange3:0.00, product: Product.findByOrganizationAndName(biobank, "Outbound Shipping")).save(flush:true, failOnError:true)
(1..6).each {
	def pprodf = new Proformaproductforecast(product:pprod, quantity:0, period: it).save(flush:true, failOnError:true)
}
(7..36).each {
	def pprodf = new Proformaproductforecast(product:pprod, quantity:50, period: it).save(flush:true, failOnError:true)
}

pprod = new Proformaproduct(project: pproj, price1:250, price2:250, price3:250, cost1:13.2, cost2:13.2, cost3:13.2,priceChange2:0.00,priceChange3:0.00,costChange2:0.00,costChange3:0.00, product: Product.findByOrganizationAndName(biobank, "Tumor and adjacent normal frozen tissue")).save(flush:true, failOnError:true)
(1..6).each {
	def pprodf = new Proformaproductforecast(product:pprod, quantity:0, period: it).save(flush:true, failOnError:true)
}
(7..36).each {
	def pprodf = new Proformaproductforecast(product:pprod, quantity:50, period: it).save(flush:true, failOnError:true)
}
pprod = new Proformaproduct(project: pproj, price1:250, price2:250, price3:250, cost1:13.3, cost2:13.3, cost3:13.3,priceChange2:0.00,priceChange3:0.00,costChange2:0.00,costChange3:0.00, product: Product.findByOrganizationAndName(biobank, "Tumor and adjacent normal tissue FFPE blocks")).save(flush:true, failOnError:true)
(1..6).each {
	def pprodf = new Proformaproductforecast(product:pprod, quantity:0, period: it).save(flush:true, failOnError:true)
}
(7..36).each {
	def pprodf = new Proformaproductforecast(product:pprod, quantity:50, period: it).save(flush:true, failOnError:true)
}


//Inventory Buildout
pproj = new Proformaproject(rev1:0, rev2:0, rev3:0, cost1:15900, cost2:31800, cost3:31800, proforma: proforma, project: Project.findByName("Inventory Buildout")).save(flush:true, failOnError:true)

pprod = new Proformaproduct(project: pproj, price1:0, price2:0, price3:0, cost1:13.2, cost2:13.2, cost3:13.2,priceChange2:0.00,priceChange3:0.00,costChange2:0.00,costChange3:0.00, product: Product.findByOrganizationAndName(biobank, "Tumor and adjacent normal frozen tissue")).save(flush:true, failOnError:true)
(1..6).each {
	def pprodf = new Proformaproductforecast(product:pprod, quantity:0, period: it).save(flush:true, failOnError:true)
}
(7..36).each {
	def pprodf = new Proformaproductforecast(product:pprod, quantity:100, period: it).save(flush:true, failOnError:true)
}
pprod = new Proformaproduct(project: pproj, price1:0, price2:0, price3:0, cost1:13.3, cost2:13.3, cost3:13.3,priceChange2:0.00,priceChange3:0.00,costChange2:0.00,costChange3:0.00, product: Product.findByOrganizationAndName(biobank, "Tumor and adjacent normal tissue FFPE blocks")).save(flush:true, failOnError:true)
(1..6).each {
	def pprodf = new Proformaproductforecast(product:pprod, quantity:0, period: it).save(flush:true, failOnError:true)
}
(7..36).each {
	def pprodf = new Proformaproductforecast(product:pprod, quantity:100, period: it).save(flush:true, failOnError:true)
}

println 'Done!'
 