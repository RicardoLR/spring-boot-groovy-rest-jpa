package com.example.demogroovyapirest.repositories

import com.example.demogroovyapirest.models.Disaster
import org.springframework.data.repository.PagingAndSortingRepository

// we may need paging and sorting
interface DisasterRepository extends PagingAndSortingRepository<Disaster, Long> {}