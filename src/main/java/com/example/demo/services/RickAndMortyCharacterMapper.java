package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.models.OriginResponse;
import com.example.demo.models.RickAndMortyCharacterResponse;
import com.example.demo.models.dtos.OriginDTO;
import com.example.demo.models.dtos.RickAndMortyCharacterDTO;

@Service
public class RickAndMortyCharacterMapper implements InterfaceCharacterConverter{

	public RickAndMortyCharacterDTO convertToDTO(RickAndMortyCharacterResponse rickAndMortyCharacterResponse, OriginResponse originResponse) {
		
	    RickAndMortyCharacterDTO rickAndMortyCharacterDTO = new RickAndMortyCharacterDTO();
	    rickAndMortyCharacterDTO.setId(rickAndMortyCharacterResponse.getId());
	    rickAndMortyCharacterDTO.setName(rickAndMortyCharacterResponse.getName());
	    rickAndMortyCharacterDTO.setStatus(rickAndMortyCharacterResponse.getStatus());
	    rickAndMortyCharacterDTO.setSpecies(rickAndMortyCharacterResponse.getSpecies());
	    rickAndMortyCharacterDTO.setType(rickAndMortyCharacterResponse.getType());
	    rickAndMortyCharacterDTO.setEpisode_count(rickAndMortyCharacterResponse.getEpisode().size());

	    if (rickAndMortyCharacterResponse.getOrigin() != null) {
	        OriginDTO originDTO = new OriginDTO();
	        originDTO.setName(rickAndMortyCharacterResponse.getOrigin().getName());
	        originDTO.setUrl(rickAndMortyCharacterResponse.getOrigin().getUrl());
	        originDTO.setDimension(originResponse.getDimension());
	        originDTO.setResidents(originResponse.getResidents());	        
	        rickAndMortyCharacterDTO.setOrigin(originDTO);
	    }
	    
	    return rickAndMortyCharacterDTO;
	}

}
