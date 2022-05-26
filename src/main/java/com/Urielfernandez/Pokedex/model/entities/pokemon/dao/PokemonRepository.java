package com.Urielfernandez.Pokedex.model.entities.pokemon.dao;

import com.Urielfernandez.Pokedex.model.entities.pokemon.Pokemon;
import org.springframework.data.repository.CrudRepository;

public interface PokemonRepository extends CrudRepository<Pokemon, Long> {
}
