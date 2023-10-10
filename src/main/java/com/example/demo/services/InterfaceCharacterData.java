package com.example.demo.services;

import com.example.demo.models.RickAndMortyCharacterResponse;
import com.example.demo.models.dtos.RickAndMortyCharacterDTO;

public interface InterfaceCharacterData {
	
public RickAndMortyCharacterDTO enrichCharacterData(RickAndMortyCharacterResponse character);

}
