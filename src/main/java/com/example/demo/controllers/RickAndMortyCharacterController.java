package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.RickAndMortyCharacterResponse;
import com.example.demo.models.dtos.RickAndMortyCharacterDTO;
import com.example.demo.services.InterfaceRickAndMortyCharacter;

@RestController
@RequestMapping("/api/characters")
public class RickAndMortyCharacterController {

	@Autowired
	private InterfaceRickAndMortyCharacter interfaceRickAndMortyCharacter;

	@GetMapping("/characterById/{id}")
	public ResponseEntity<RickAndMortyCharacterDTO> getCharacterbyId(@PathVariable int id) {
		return interfaceRickAndMortyCharacter.getCharacterbyId(id);
	}
}
