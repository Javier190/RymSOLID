package com.example.demo.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.models.RickAndMortyCharacterResponse;

@Service
public class CharacterService implements InterfaceCharacterRepository {

	private final String urlCharacter;
	private final RestTemplate restTemplate;

	public CharacterService(@Value("${characters.api.url}") String urlCharacter, RestTemplate restTemplate) {
		this.urlCharacter = urlCharacter;
		this.restTemplate = restTemplate;
	}

	public RickAndMortyCharacterResponse getCharacterById(int id) {
		String uri = urlCharacter + id;
		return restTemplate.getForObject(uri, RickAndMortyCharacterResponse.class);
	}

}
