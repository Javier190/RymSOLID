package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.dtos.OriginDTO;
import com.example.demo.services.InterfaceRickAndMortyLocation;

@RestController
@RequestMapping("/api/locations")
public class RickAndMortyLocationController {
	
	@Autowired
	private InterfaceRickAndMortyLocation interfaceRickAndMortyLocation;
	
	@GetMapping("/locationById/{id}")
	public ResponseEntity<OriginDTO> getLocationbyId(@PathVariable int id) {
		return interfaceRickAndMortyLocation.getLocations(id);
	}
}
