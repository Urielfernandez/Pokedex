package com.Urielfernandez.Pokedex.model.services.pokemon;

import com.Urielfernandez.Pokedex.model.services.pokemon.dto.PokemonDTO;

import java.util.List;

public interface PokemonService {
    public List<PokemonDTO> findAll();
}
