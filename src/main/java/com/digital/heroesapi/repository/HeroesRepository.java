package com.digital.heroesapi.repository;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import com.digital.heroesapi.document.Heroes;

@EnableScan
public interface HeroesRepository  extends CrudRepository<Heroes, String>{
	
	
	
}

	
	
	
	



