package com.packt.s2wad.ch08.services;

import java.util.Collection;

import com.packt.s2wad.ch08.models.Recipe;

public interface RecipeService {

    Collection<Recipe> findAll();

    Recipe findById(Integer id);

}
