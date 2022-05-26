package com.Urielfernandez.Pokedex.model.entities.pokemon;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="pokemon")
@Getter
@Setter
public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
}
