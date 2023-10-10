package com.example.demo.services;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.models.RickAndMortyCharacterResponse;
import com.example.demo.models.dtos.RickAndMortyCharacterDTO;


@Service
public class RickAndMortyCharacterService implements InterfaceRickAndMortyCharacter {

	private final RickAndMortyOriginDataProvider characterDataProvider;
	private final CharacterService characterService;

	@Override
	public ResponseEntity<RickAndMortyCharacterDTO> getCharacterbyId(int id) {
		try {
			RickAndMortyCharacterResponse character = characterService.getCharacterById(id);
			RickAndMortyCharacterDTO rickAndMortyCharacterDTO;
			if (character != null) {
				rickAndMortyCharacterDTO = characterDataProvider.enrichCharacterData(character);
				return ResponseEntity.ok(rickAndMortyCharacterDTO);
			} else {
				System.err.println("Character not found.");
				return ResponseEntity.notFound().build();
			}
		} catch (Exception e) {
			System.err.println("Request Failed: " + e.getMessage());
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	public RickAndMortyCharacterService(RickAndMortyOriginDataProvider characterDataProvider,CharacterService characterService) {
		this.characterDataProvider = characterDataProvider;
		this.characterService = characterService;
	}

}
