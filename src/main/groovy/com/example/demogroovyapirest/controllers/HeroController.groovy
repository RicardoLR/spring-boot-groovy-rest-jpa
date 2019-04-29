package com.example.demogroovyapirest.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import com.example.demogroovyapirest.models.Hero
import com.example.demogroovyapirest.services.HeroService
import javax.transaction.Transactional

@RestController
@RequestMapping('hero')
@Transactional
class HeroController {
	
	@Autowired HeroService heroService

	@GetMapping('')
	List findAll() {
		heroService.findAll()
	}

	@GetMapping('{id}')
	Hero findOne(@PathVariable long id) {
		heroService.findById(id)
	}

	@PostMapping('')
	Hero save(@RequestBody Hero hero) {
		heroService.save(hero)
	}

	@PutMapping('{id}')
	Hero update(@RequestBody Hero hero, @PathVariable long id) {
		heroService.update(hero, id)
	}

	@DeleteMapping('{id}')
	Hero deleteById(@PathVariable long id) {
		heroService.deleteById(id)
	}
}
