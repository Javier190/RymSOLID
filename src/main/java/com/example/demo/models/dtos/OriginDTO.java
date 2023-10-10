package com.example.demo.models.dtos;

import java.util.List;

public class OriginDTO {

	String name;
	String url;
	String dimension;
	List<String> residents;
	
	public OriginDTO() {
	}
	
	
	public OriginDTO(String name, String url, String dimension, List<String> residents) {
		super();
		this.name = name;
		this.url = url;
		this.dimension = dimension;
		this.residents = residents;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDimension() {
		return dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
	public List<String> getResidents() {
		return residents;
	}
	public void setResidents(List<String> residents) {
		this.residents = residents;
	}

	

}
