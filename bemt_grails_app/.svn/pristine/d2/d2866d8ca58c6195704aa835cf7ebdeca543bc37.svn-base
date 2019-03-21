package com.provia.bemt.controller

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

import com.provia.bemt.domain.SnapshotProduct
import com.provia.bemt.domain.SnapshotProductForecast


class SnapshotProductController extends BemtController {

  def show(SnapshotProduct obj) {
  	super.isValid(obj) //check to see if user can act on this obj
    render(view: 'show', model:[obj: obj, forecasts: SnapshotProductForecast.findAllByProduct(obj)])
  } 
}