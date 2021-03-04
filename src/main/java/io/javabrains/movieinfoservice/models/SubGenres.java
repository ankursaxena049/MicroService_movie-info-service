package io.javabrains.movieinfoservice.models;

public class SubGenres {

	private String id;
	private String name;
	
	public SubGenres() {
	}

	public SubGenres(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
