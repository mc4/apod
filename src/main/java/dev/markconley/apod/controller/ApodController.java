package dev.markconley.apod.controller;

import dev.markconley.apod.dto.ApodResponseDto;
import dev.markconley.apod.service.DateService;
import dev.markconley.apod.service.NasaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApodController {

	private static final Logger log = LoggerFactory.getLogger(ApodController.class);
	private final NasaService nasaService;

	public ApodController(NasaService nasaService) {
		this.nasaService = nasaService;
	}

	@GetMapping("/")
	public String currentPictureOfTheDay(Model model) {
		ApodResponseDto apodResponse = nasaService.getTodayImage();
		model.addAttribute("apodResponse", apodResponse);
		return "home";
	}

	@GetMapping("/newImage")
	public String newImage(Model model) {
		ApodResponseDto apodResponse = nasaService.getRandomImage();
		model.addAttribute("apodResponse", apodResponse);
		return "home";
	}
}
