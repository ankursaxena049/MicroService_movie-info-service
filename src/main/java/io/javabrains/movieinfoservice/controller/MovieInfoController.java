package io.javabrains.movieinfoservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.javabrains.movieinfoservice.models.MovieDBResource;
import io.javabrains.movieinfoservice.models.MovieInfoResource;

@RestController
@RequestMapping("/movieInfo")
public class MovieInfoController {

	@LoadBalanced
	private RestTemplate restTemplate = new RestTemplate();

	@Value("${api.key}")
	String key;

	@RequestMapping("/{movieId}")
	public MovieInfoResource getMovieInfo(@PathVariable("movieId") String movieId) {
		
		System.out.println("Key is ---->"+key);

		MovieDBResource resource = restTemplate
				.getForObject("https://api.themoviedb.org/3/movie/" + movieId + "?api_key=" + key, MovieDBResource.class);
		
		System.out.println("Movie Resource--->"+resource.toString());
		
		//int a = 2/0;

		return new MovieInfoResource(movieId, resource.getTitle(), resource.getOverview());
	}
}