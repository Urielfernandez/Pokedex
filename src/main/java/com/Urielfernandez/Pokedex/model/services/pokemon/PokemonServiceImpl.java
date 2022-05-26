package com.Urielfernandez.Pokedex.model.services.pokemon;

import com.Urielfernandez.Pokedex.exceptions.NoRecordsException;
import com.Urielfernandez.Pokedex.model.entities.pokemon.dao.PokemonRepository;
import com.Urielfernandez.Pokedex.model.services.pokemon.converter.PokemonConverter;
import com.Urielfernandez.Pokedex.model.services.pokemon.dto.PokemonDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class PokemonServiceImpl implements PokemonService{

    @Autowired
    private PokemonRepository pokemonRepository;

    @Autowired
    private PokemonConverter pokemonConverter;

    public List<PokemonDTO> findAll() throws NoRecordsException{
        List<PokemonDTO> result = this.pokemonConverter.toDTO(this.pokemonRepository.findAll());

        if(result.isEmpty()){
            throw new NoRecordsException("There are no pokemons!");
        }
        return result;
    }
}
