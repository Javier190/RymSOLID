package com.example.demo.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.models.RickAndMortyCharacterResponse;
import com.example.demo.models.dtos.OriginDTO;

@Service
public class RickAndMortyLocationService implements InterfaceRickAndMortyLocation {

	private final String urlLocation;
	private final RestTemplate restTemplate;

	public RickAndMortyLocationService(@Value("${location.api.url}") String urlLocation, RestTemplate restTemplate) {
		this.urlLocation = urlLocation;
		this.restTemplate = restTemplate;
	}

	ResponseEntity<OriginDTO> result = null;

	@Override
	public ResponseEntity<OriginDTO> getLocations(int id) {

		String uri = urlLocation + id;

		try {

			result = restTemplate.getForEntity(uri, OriginDTO.class);

			if (result.hasBody() && result.getStatusCode() == HttpStatus.OK) {

				return ResponseEntity.ok(result.getBody());
			} else {
				System.err.println("Conection failed" + result.getStatusCode());
				return null;
			}

		} catch (Exception e) {
			System.err.println("Request Failed");
		}

		return result;
	}

}
