package com.digital.heroesapi.service;



import org.springframework.stereotype.Service;

import com.digital.heroesapi.document.Heroes;
import com.digital.heroesapi.repository.HeroesRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class HeroesService {
	
	private final HeroesRepository heroesRepository;
	
	//construtor
	  public HeroesService(HeroesRepository heroesRepository) {
		    this.heroesRepository = heroesRepository;
		  }
	
// metodo da service
	  // flux ( retorna conjunto de dados...traz todos os herois

	  public Flux<Heroes> findAll(){

		    return Flux.fromIterable(this.heroesRepository.findAll());
		  }

	//Mono...vai trazer da lista um unico dado
	//busca 1 heroi com um determinado id
		  
		  public  Mono<Heroes> findByIdHero(String id){

		    return  Mono.justOrEmpty(this.heroesRepository.findById(id));
		  }

//Mono pq vai ser so um heroi
		  //save pq vamos salvar novos herois na api
		  //o retorno sera um mono just or empty do repositorio com metodo save
		  public Mono<Heroes> save(Heroes heroes){
		    return  Mono.justOrEmpty(this.heroesRepository.save(heroes));
		  }


		  public Mono<Boolean> deletebyIDHero(String id) {
		    heroesRepository.deleteById(id);
		    return Mono.just(true);

		  }

		}



	  





