package com.example.demo.services;

import com.example.demo.models.RickAndMortyCharacterResponse;

public interface InterfaceCharacterRepository {
    RickAndMortyCharacterResponse getCharacterById(int id);
}

