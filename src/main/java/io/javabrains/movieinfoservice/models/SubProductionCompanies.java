package io.javabrains.movieinfoservice.models;

public class SubProductionCompanies {

	private String id;
	private String logo_path;
	private String name;
	private String origin_country;

	public SubProductionCompanies() {
	}
	
	public SubProductionCompanies(String id, String logo_path, String name, String origin_country) {
		super();
		this.id = id;
		this.logo_path = logo_path;
		this.name = name;
		this.origin_country = origin_country;
	}

	public String getId() {
		return id;
	}

	public String getLogo_path() {
		return logo_path;
	}

	public String getName() {
		return name;
	}

	public String getOrigin_country() {
		return origin_country;
	}

}
