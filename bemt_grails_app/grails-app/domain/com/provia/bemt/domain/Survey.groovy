package com.provia.bemt.domain

class Survey {

  String sourceId
  Boolean complete
  Double age
  Double markupService
  Double markupSpecimen
  Double indirectRate
  Integer sites
	BigDecimal operatingBudget
	BigDecimal startupSpend
  SurveyInstitutionType inst
  SurveyCountry country
  SurveyGeoArea geo
  String international /* yes/no */
  SurveyOperatingModel model
  SurveyFacility facility
  String costRecovery /* yes/no */
  SurveyExpRecovery expRecovery
  Integer surveyYear

  static constraints = {
  	operatingBudget nullable: true
    startupSpend nullable: true
    sourceId blank: false
  }
}