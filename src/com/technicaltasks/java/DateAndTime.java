package com.technicaltasks.java;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {

	public static void main(String[] args) {

		getDateAndTime();
	}

	public static void getDateAndTime() {

		LocalDateTime currentDateTime = LocalDateTime.now();

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
		String finalCurrentDateTime = currentDateTime.format(dateTimeFormatter);

		System.out.println("Now, Current Date and Time: " + finalCurrentDateTime);
	}
}
