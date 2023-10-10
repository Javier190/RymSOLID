package com.example.demo.services;

import org.springframework.http.ResponseEntity;

import com.example.demo.models.dtos.OriginDTO;

public interface InterfaceRickAndMortyLocation {

	public ResponseEntity<OriginDTO> getLocations(int id);
}
