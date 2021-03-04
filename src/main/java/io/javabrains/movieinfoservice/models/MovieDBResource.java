package io.javabrains.movieinfoservice.models;

import java.util.List;

public class MovieDBResource {

	private String title;
	private String overview;
	
	public MovieDBResource(String title, String overview) {
		super();
		this.title = title;
		this.overview = overview;
	}
	
	public MovieDBResource() {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	@Override
	public String toString() {
		return "MovieDBResource [title=" + title + ", overview=" + overview + "]";
	}

	
	/*
	 * private String adult; private String backdrop_path; private String
	 * belongs_to_collection; private String budget; private List<SubGenres> genres;
	 * private String homepage; private String id; private String imdb_id; private
	 * String original_language; private String original_title; private float
	 * popularity; private String poster_path; private List<SubProductionCompanies>
	 * production_companies; private List<SubProductionCountries>
	 * production_countries; private String release_date; private String revenue;
	 * private String runtime; private List<SubSpokenLanguages> spoken_languages;
	 * private String status; private String tagline; private String video; private
	 * String vote_average; private String vote_count;
	 * 
	 * public MovieDBResource(String title, String overview, String adult, String
	 * backdrop_path, String belongs_to_collection, String budget, List<SubGenres>
	 * genres, String homepage, String id, String imdb_id, String original_language,
	 * String original_title, float popularity, String poster_path,
	 * List<SubProductionCompanies> production_companies,
	 * List<SubProductionCountries> production_countries, String release_date,
	 * String revenue, String runtime, List<SubSpokenLanguages> spoken_languages,
	 * String status, String tagline, String video, String vote_average, String
	 * vote_count) { super(); this.title = title; this.overview = overview;
	 * this.adult = adult; this.backdrop_path = backdrop_path;
	 * this.belongs_to_collection = belongs_to_collection; this.budget = budget;
	 * this.genres = genres; this.homepage = homepage; this.id = id; this.imdb_id =
	 * imdb_id; this.original_language = original_language; this.original_title =
	 * original_title; this.popularity = popularity; this.poster_path = poster_path;
	 * this.production_companies = production_companies; this.production_countries =
	 * production_countries; this.release_date = release_date; this.revenue =
	 * revenue; this.runtime = runtime; this.spoken_languages = spoken_languages;
	 * this.status = status; this.tagline = tagline; this.video = video;
	 * this.vote_average = vote_average; this.vote_count = vote_count; }
	 * 
	 * public String getTitle() { return title; }
	 * 
	 * public void setTitle(String title) { this.title = title; }
	 * 
	 * public String getOverview() { return overview; }
	 * 
	 * public void setOverview(String overview) { this.overview = overview; }
	 * 
	 * public String getAdult() { return adult; }
	 * 
	 * public void setAdult(String adult) { this.adult = adult; }
	 * 
	 * public String getBackdrop_path() { return backdrop_path; }
	 * 
	 * public void setBackdrop_path(String backdrop_path) { this.backdrop_path =
	 * backdrop_path; }
	 * 
	 * public String getBelongs_to_collection() { return belongs_to_collection; }
	 * 
	 * public void setBelongs_to_collection(String belongs_to_collection) {
	 * this.belongs_to_collection = belongs_to_collection; }
	 * 
	 * public String getBudget() { return budget; }
	 * 
	 * public void setBudget(String budget) { this.budget = budget; }
	 * 
	 * public List<SubGenres> getGenres() { return genres; }
	 * 
	 * public void setGenres(List<SubGenres> genres) { this.genres = genres; }
	 * 
	 * public String getHomepage() { return homepage; }
	 * 
	 * public void setHomepage(String homepage) { this.homepage = homepage; }
	 * 
	 * public String getId() { return id; }
	 * 
	 * public void setId(String id) { this.id = id; }
	 * 
	 * public String getImdb_id() { return imdb_id; }
	 * 
	 * public void setImdb_id(String imdb_id) { this.imdb_id = imdb_id; }
	 * 
	 * public String getOriginal_language() { return original_language; }
	 * 
	 * public void setOriginal_language(String original_language) {
	 * this.original_language = original_language; }
	 * 
	 * public String getOriginal_title() { return original_title; }
	 * 
	 * public void setOriginal_title(String original_title) { this.original_title =
	 * original_title; }
	 * 
	 * public float getPopularity() { return popularity; }
	 * 
	 * public void setPopularity(float popularity) { this.popularity = popularity; }
	 * 
	 * public String getPoster_path() { return poster_path; }
	 * 
	 * public void setPoster_path(String poster_path) { this.poster_path =
	 * poster_path; }
	 * 
	 * public List<SubProductionCompanies> getProduction_companies() { return
	 * production_companies; }
	 * 
	 * public void setProduction_companies(List<SubProductionCompanies>
	 * production_companies) { this.production_companies = production_companies; }
	 * 
	 * public List<SubProductionCountries> getProduction_countries() { return
	 * production_countries; }
	 * 
	 * public void setProduction_countries(List<SubProductionCountries>
	 * production_countries) { this.production_countries = production_countries; }
	 * 
	 * public String getRelease_date() { return release_date; }
	 * 
	 * public void setRelease_date(String release_date) { this.release_date =
	 * release_date; }
	 * 
	 * public String getRevenue() { return revenue; }
	 * 
	 * public void setRevenue(String revenue) { this.revenue = revenue; }
	 * 
	 * public String getRuntime() { return runtime; }
	 * 
	 * public void setRuntime(String runtime) { this.runtime = runtime; }
	 * 
	 * public List<SubSpokenLanguages> getSpoken_languages() { return
	 * spoken_languages; }
	 * 
	 * public void setSpoken_languages(List<SubSpokenLanguages> spoken_languages) {
	 * this.spoken_languages = spoken_languages; }
	 * 
	 * public String getStatus() { return status; }
	 * 
	 * public void setStatus(String status) { this.status = status; }
	 * 
	 * public String getTagline() { return tagline; }
	 * 
	 * public void setTagline(String tagline) { this.tagline = tagline; }
	 * 
	 * public String getVideo() { return video; }
	 * 
	 * public void setVideo(String video) { this.video = video; }
	 * 
	 * public String getVote_average() { return vote_average; }
	 * 
	 * public void setVote_average(String vote_average) { this.vote_average =
	 * vote_average; }
	 * 
	 * public String getVote_count() { return vote_count; }
	 * 
	 * public void setVote_count(String vote_count) { this.vote_count = vote_count;
	 * }
	 * 
	 * public MovieDBResource() { }
	 * 
	 * @Override public String toString() { return "MovieDBResource [title=" + title
	 * + ", overview=" + overview + ", adult=" + adult + ", backdrop_path=" +
	 * backdrop_path + ", belongs_to_collection=" + belongs_to_collection +
	 * ", budget=" + budget + ", genres=" + genres + ", homepage=" + homepage +
	 * ", id=" + id + ", imdb_id=" + imdb_id + ", original_language=" +
	 * original_language + ", original_title=" + original_title + ", popularity=" +
	 * popularity + ", poster_path=" + poster_path + ", production_companies=" +
	 * production_companies + ", production_countries=" + production_countries +
	 * ", release_date=" + release_date + ", revenue=" + revenue + ", runtime=" +
	 * runtime + ", spoken_languages=" + spoken_languages + ", status=" + status +
	 * ", tagline=" + tagline + ", video=" + video + ", vote_average=" +
	 * vote_average + ", vote_count=" + vote_count + "]"; }
	 */
}