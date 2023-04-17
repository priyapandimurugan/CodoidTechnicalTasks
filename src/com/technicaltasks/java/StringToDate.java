package com.technicaltasks.java;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {

	public static void main(String[] args) {

		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
		String dateInString = "03-Mar-2023";
		System.out.println("Date in String: " + dateInString);

		try {

			Date date = formatter.parse(dateInString);
			System.out.println("Date in Date format: " + formatter.format(date));

		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
