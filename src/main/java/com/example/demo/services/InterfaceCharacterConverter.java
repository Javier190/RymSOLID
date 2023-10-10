package com.example.demo.services;

import com.example.demo.models.OriginResponse;
import com.example.demo.models.RickAndMortyCharacterResponse;
import com.example.demo.models.dtos.RickAndMortyCharacterDTO;

public interface InterfaceCharacterConverter {
	
	RickAndMortyCharacterDTO convertToDTO(RickAndMortyCharacterResponse rickAndMortyCharacterResponse, OriginResponse originResponse);
	        
}
