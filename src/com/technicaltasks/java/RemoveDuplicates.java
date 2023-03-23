package com.technicaltasks.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		//// create an arraylist from the array
		//// using asList() method of the Arrays class
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 6, 8, 6, 1, 2));
		System.out.println("Duplicates in Array List: " + numbers);

		//// Convert the arraylist into a Set
		Set<Integer> set = new LinkedHashSet<>();
		set.addAll(numbers);

		//// Remove all elements of Arraylist
		numbers.clear();

		//// Add element from Set to Arraylist
		numbers.addAll(set);
		System.out.println("ArrayList without duplicates: " + numbers);

	}

}
