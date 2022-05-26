package com.Urielfernandez.Pokedex.model.services.pokemon.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class PokemonDTO {
    @NotEmpty
    private Long id;
    @NotEmpty
    private String name;
}
