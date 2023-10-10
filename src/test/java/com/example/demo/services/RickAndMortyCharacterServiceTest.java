package com.example.demo.services;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.demo.models.RickAndMortyCharacterResponse;
import com.example.demo.models.dtos.RickAndMortyCharacterDTO;

public class RickAndMortyCharacterServiceTest {

	private RickAndMortyCharacterService rickAndMortyCharacterService;

	@Mock
	private CharacterService characterService;

	@Mock
	private RickAndMortyOriginDataProvider characterDataProvider;

	@BeforeEach
	public void setUp() {
		characterService = mock(CharacterService.class);
		characterDataProvider = mock(RickAndMortyOriginDataProvider.class);
		rickAndMortyCharacterService = new RickAndMortyCharacterService(characterDataProvider, characterService);
	}

	@Test
	public void testGetCharacterById_WithValidCharacter() {

		int characterId = 1;
		RickAndMortyCharacterResponse characterResponse = new RickAndMortyCharacterResponse();
		characterResponse.setId(characterId);
		RickAndMortyCharacterDTO characterDTO = new RickAndMortyCharacterDTO();

		when(characterService.getCharacterById(characterId)).thenReturn(characterResponse);
		when(characterDataProvider.enrichCharacterData(characterResponse)).thenReturn(characterDTO);

		ResponseEntity<RickAndMortyCharacterDTO> responseEntity = rickAndMortyCharacterService
				.getCharacterbyId(characterId);

		assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
		assertEquals(characterDTO, responseEntity.getBody());
		verify(characterService, times(1)).getCharacterById(characterId);
		verify(characterDataProvider, times(1)).enrichCharacterData(characterResponse);
	}

}
