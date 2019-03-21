package com.provia.bemt.controller

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

import com.provia.bemt.domain.SnapshotLabor


class SnapshotLaborController extends BemtController {

  def show(SnapshotLabor obj) {
  	super.isValid(obj) //check to see if user can act on this obj
    render(view: 'show', model:[obj: obj])
  } 
}