package com.provia.bemt.taglib

class BemtTagLib {
		static namespace = "bemt"

    def button = { attrs, body ->
    	def labelHtml = body()
      out << render(template: "/tagLibTemplates/button", model: [attrs: attrs, labelHtml: labelHtml, params:params ])
    }

 		def pluralize = { attrs, body ->
        def plural = attrs['plural'] ?: attrs['singular'] + "s"
        out << attrs['count'] + " " + ( attrs['count'] > 1 ? plural : attrs['singular'] )
    }

}