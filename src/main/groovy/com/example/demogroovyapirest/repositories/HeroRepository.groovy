package com.example.demogroovyapirest.repositories

import com.example.demogroovyapirest.models.Hero
import org.springframework.data.repository.PagingAndSortingRepository

interface HeroRepository extends PagingAndSortingRepository<Hero, Long> {}