package dev.markconley.apod.service;

import dev.markconley.apod.dto.ApodResponseDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NasaService {

	private final RestTemplate restTemplate;
	private final String nasaApiKey;
	private final String baseUrl;

	public NasaService(@Value("${nasa.api.base.url}") String baseUrl, @Value("${nasa.api.key}") String nasaApiKey) {
		this.restTemplate = new RestTemplate();
		this.nasaApiKey = nasaApiKey;
		this.baseUrl = baseUrl;
	}

	public ApodResponseDto getTodayImage() {
		try {
			String url = baseUrl + "?api_key=" + nasaApiKey;
			return restTemplate.getForObject(url, ApodResponseDto.class);
		} catch (Exception e) {
			throw new RuntimeException("Error while calling NASA API", e);
		}
	}

	public ApodResponseDto getRandomImage() {
		try {
			String url = baseUrl + "?api_key=" + nasaApiKey + "&date=" + DateService.getRandomApodDate();
			return restTemplate.getForObject(url, ApodResponseDto.class);
		} catch (Exception e) {
			throw new RuntimeException("Error while calling NASA API", e);
		}

	}
}
