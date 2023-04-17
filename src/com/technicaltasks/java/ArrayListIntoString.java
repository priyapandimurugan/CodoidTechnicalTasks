package com.technicaltasks.java;

import java.util.ArrayList;

public class ArrayListIntoString {

	public static void main(String[] args) {
		
		ArrayList<String> languages = new ArrayList<>();

		languages.add("Java");
		
		languages.add("Python");
		
		languages.add("javaScript");
		
		System.out.println("ArrayList: " + languages);

		String arraylist = languages.toString();
		
		System.out.println("String: " + arraylist);

	}

}
