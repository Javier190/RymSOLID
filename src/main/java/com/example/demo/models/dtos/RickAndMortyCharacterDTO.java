package com.example.demo.models.dtos;

public class RickAndMortyCharacterDTO {

	int id;
	String name;
	String status;
	String species;
	String type;
	int episode_count;
	OriginDTO origin;

	public RickAndMortyCharacterDTO() {

	}

	public RickAndMortyCharacterDTO(int id, String name, String status, String species, String type, int episode_count,
			OriginDTO origin) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.species = species;
		this.type = type;
		this.episode_count = episode_count;
		this.origin = origin;
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

	public int getEpisode_count() {
		return episode_count;
	}

	public void setEpisode_count(int episode_count) {
		this.episode_count = episode_count;
	}

	public OriginDTO getOrigin() {
		return origin;
	}

	public void setOrigin(OriginDTO origin) {
		this.origin = origin;
	}

}
