package com.example.demogroovyapirest.services

import org.springframework.stereotype.Service

@Service
class ErrorsService {

	Map findAllErrors() {
		def myList = []
		myList << "error uno"
		myList << "error dos"
		def myMap = [:]
		myMap.put("error1", 'fgdgd')
		myMap.put("error2", 'fgdgd') // si es el mismo key, lo sobreescribe
		myMap.put("erroresList", myList)
		
		return myMap
	}

}
