package com.Urielfernandez.Pokedex.controller.pokemon;

import com.Urielfernandez.Pokedex.exceptions.ErrorMessage;
import com.Urielfernandez.Pokedex.model.services.pokemon.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.print.attribute.standard.Media;

@RestController
@RequestMapping("/pokemons")
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    @RequestMapping(method = RequestMethod.GET, name= "Catch them'll!", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getPokemons() {
        try {
            return new ResponseEntity<>(this.pokemonService.findAll(), HttpStatus.OK);
        } catch(Exception e) {
            return new ResponseEntity<>(new ErrorMessage(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
