package com.example.demo.services;


import org.springframework.http.ResponseEntity;

import com.example.demo.models.RickAndMortyCharacterResponse;
import com.example.demo.models.dtos.RickAndMortyCharacterDTO;

public interface InterfaceRickAndMortyCharacter {
	
	public ResponseEntity<RickAndMortyCharacterDTO> getCharacterbyId(int id);
}
