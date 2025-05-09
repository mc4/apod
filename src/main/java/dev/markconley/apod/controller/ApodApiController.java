package dev.markconley.apod.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/apod")
public class ApodApiController {

	private static final Logger log = LoggerFactory.getLogger(ApodApiController.class);

	@GetMapping("")
	public ResponseEntity<?> getCurrentPod() {
		log.info("");
		return ResponseEntity.status(HttpStatus.OK).build();
	}
}
