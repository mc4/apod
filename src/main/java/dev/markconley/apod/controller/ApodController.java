package dev.markconley.apod.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import dev.markconley.apod.service.DateService;

@Controller
public class ApodController {

	@Value("${nasa.api.key}")
	private static String nasaApiKey;

	private static final Logger log = LoggerFactory.getLogger(ApodApiController.class);

	private static final String NASA_API_URL = "https://api.nasa.gov/planetary/apod?api_key=" + nasaApiKey;

	@GetMapping("/")
	public String currentPictueOfTheDay(Model model) {
		RestTemplate restTemplate = new RestTemplate();
		Map<String, Object> apodResponse = restTemplate.getForObject(NASA_API_URL, Map.class);

		String imageUrl = (String) apodResponse.get("url");
		String title = (String) apodResponse.get("title");

		log.info("title" + title);
		log.info("image url" + imageUrl);

		model.addAttribute("imageUrl", imageUrl);
		model.addAttribute("title", title);

		return "home";
	}

	@GetMapping("/newImage")
	public String newImage(Model model) {
		RestTemplate restTemplate = new RestTemplate();

		String newImage = NASA_API_URL + "&date=" + DateService.getRandomApodDate();
		Map<String, Object> apodResponse = restTemplate.getForObject(newImage, Map.class);

		String imageUrl = (String) apodResponse.get("url");
		String title = (String) apodResponse.get("title");

		log.info("title: " + title);
		log.info("image url: " + imageUrl);

		model.addAttribute("imageUrl", imageUrl);
		model.addAttribute("title", title);

		return "home";
	}

}
