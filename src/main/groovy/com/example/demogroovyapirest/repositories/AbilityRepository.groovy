package com.example.demogroovyapirest.repositories

import com.example.demogroovyapirest.models.Ability
import org.springframework.data.jpa.repository.JpaRepository

// we only need CRUD for Ability because it won't have its own endpoints
interface AbilityRepository extends JpaRepository<Ability, Long> {}