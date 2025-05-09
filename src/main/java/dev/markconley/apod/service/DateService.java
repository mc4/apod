package dev.markconley.apod.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class DateService {

	public static String getRandomApodDate() {
		// APOD started on June 16, 1995
		LocalDate startDate = LocalDate.of(1995, 6, 16);
		LocalDate endDate = LocalDate.now();

		long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
		long randomDays = new Random().nextLong(daysBetween + 1); // inclusive
		LocalDate randomDate = startDate.plusDays(randomDays);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		return randomDate.format(formatter);
	}

}
