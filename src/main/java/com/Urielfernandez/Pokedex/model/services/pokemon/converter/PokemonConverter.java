package com.Urielfernandez.Pokedex.model.services.pokemon.converter;

import com.Urielfernandez.Pokedex.model.entities.pokemon.Pokemon;
import com.Urielfernandez.Pokedex.model.services.pokemon.dto.PokemonDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
public class PokemonConverter {

    public PokemonDTO toDTO(Pokemon pokemon){
        PokemonDTO result = new PokemonDTO();

        result.setId(pokemon.getId());
        result.setName(pokemon.getName());

        return result;
    }

    public List<PokemonDTO> toDTO(Iterable<Pokemon> pokemons){
        return StreamSupport.stream(pokemons.spliterator(), false).map(this::toDTO).collect(Collectors.toList());
    }
}
