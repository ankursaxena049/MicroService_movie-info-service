package io.javabrains.movieinfoservice.models;

public class SubSpokenLanguages {

	private String iso_639_1;
	private String name;

	public SubSpokenLanguages() {
	}
	
	public SubSpokenLanguages(String iso_639_1, String name) {
		super();
		this.iso_639_1 = iso_639_1;
		this.name = name;
	}

	public String getIso_639_1() {
		return iso_639_1;
	}

	public void setIso_639_1(String iso_639_1) {
		this.iso_639_1 = iso_639_1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
