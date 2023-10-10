package com.example.demo.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RickAndMortyCharacterResponse {

	int id;
	String name;
	String status;
	String species;
	String type;
	String gender;
	OriginResponse origin;
	LocationResponse location;
	String image;
	List<String> episode;
	
	public RickAndMortyCharacterResponse() {
	}
	
	public RickAndMortyCharacterResponse(int id, String name, String status, String species, String type, String gender,
			OriginResponse origin, LocationResponse location, String image, List<String> episode) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.species = species;
		this.type = type;
		this.gender = gender;
		this.origin = origin;
		this.location = location;
		this.image = image;
		this.episode = episode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public OriginResponse getOrigin() {
		return origin;
	}

	public void setOrigin(OriginResponse origin) {
		this.origin = origin;
	}

	public LocationResponse getLocation() {
		return location;
	}

	public void setLocation(LocationResponse location) {
		this.location = location;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public List<String> getEpisode() {
		return episode;
	}

	public void setEpisode(List<String> episode) {
		this.episode = episode;
	}

}
