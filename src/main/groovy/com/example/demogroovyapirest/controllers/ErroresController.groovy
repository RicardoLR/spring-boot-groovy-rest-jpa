package com.example.demogroovyapirest.controllers

import com.example.demogroovyapirest.models.Hero
import com.example.demogroovyapirest.services.ErrorsService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
@RequestMapping('errores')
class ErroresController {

	Logger logger = LoggerFactory.getLogger(ErroresController.class);
	
	@Autowired
	ErrorsService errorsService

	@GetMapping('')
	Map pruebaMap() {

		Map myMap = errorsService.findAllErrors()

		myMap.eachWithIndex { item , i ->

			if(i==0) {
				item.value = [1,2]
			}else if( item.key.equals("erroresList") ){

				item.value[0] = "Box"
				item.value.set(1,90)

				int valorFueraClojure = 67
				item.value = item.value.collect { new Hero(id: 1, name: it) }.collect { elem ->
					elem.id=valorFueraClojure
					elem  // Return user object so new list contains user objects!
				}
				
				logger.info("Tipo lista: ${item}")
			}

			logger.info("${i}. ${item.key} - ${item.value}")
		};

		return myMap
	}

}