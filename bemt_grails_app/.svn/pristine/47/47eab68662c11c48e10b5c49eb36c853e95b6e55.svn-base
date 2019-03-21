package com.provia.bemt.service

import grails.transaction.Transactional

import com.provia.bemt.domain.ProformaExpenseType
import com.provia.bemt.domain.ProformaExpense
import com.provia.bemt.domain.Proforma

/**
 * ProformaExpenseService.groovy
 *
 * Service to handle the general expense components of the Pro Forma
 * 
 * Copyright 2014 BEMT, All Rights Reserved
 *
 * written by: dan.reed@wrycan.com for Provia Labs
 */

@Transactional
class ProformaExpenseService {
  def proformaService

  
  public List getExpenses(Proforma proforma) {
    def exps = ProformaExpense.findAllByProforma(proforma)
    return exps
  }
}