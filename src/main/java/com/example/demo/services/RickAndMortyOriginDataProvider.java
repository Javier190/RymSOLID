package com.example.demo.services;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.demo.models.OriginResponse;
import com.example.demo.models.RickAndMortyCharacterResponse;
import com.example.demo.models.dtos.RickAndMortyCharacterDTO;

@Component
public class RickAndMortyOriginDataProvider implements InterfaceCharacterData {

	private final RestTemplate restTemplate;
	private final InterfaceCharacterConverter interfaceCharacterConverter;

	public RickAndMortyOriginDataProvider(RestTemplate restTemplate,
			InterfaceCharacterConverter interfaceCharacterConverter) {
		this.restTemplate = restTemplate;
		this.interfaceCharacterConverter = interfaceCharacterConverter;
	}

	@Override
	public RickAndMortyCharacterDTO enrichCharacterData(RickAndMortyCharacterResponse character) {

		RickAndMortyCharacterDTO rickAndMortyCharacterDTO = new RickAndMortyCharacterDTO();
		if (character != null) {

			String urlLocation = null;

			String fromOriginUrl = character.getOrigin().getUrl();
			String fromLocationUrl = character.getLocation().getUrl();

			if (fromOriginUrl.isEmpty()) {
				urlLocation = fromLocationUrl;
			} else {
				urlLocation = fromOriginUrl;
			}

			OriginResponse originResponse = restTemplate.getForObject(urlLocation, OriginResponse.class);

			if (originResponse != null) {

				rickAndMortyCharacterDTO = interfaceCharacterConverter.convertToDTO(character, originResponse);

			} else {
				System.err.println("Second request failed.");
			}
		}
		return rickAndMortyCharacterDTO;

	}

}
