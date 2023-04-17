package com.technicaltasks.java;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MaximumRepeatedCharcterCount {

	public static void main(String[] args) {

		maximumRepeatedCharacterCount("Java");

	}

	public static void maximumRepeatedCharacterCount(String stringValue) {

		HashMap<Character, Integer> charCountMap = new HashMap<>();

		char[] charArray = stringValue.replaceAll("\\s+", "").toCharArray();

		for (char c : charArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}

		Set<Entry<Character, Integer>> entrySet = charCountMap.entrySet();

		int maxCount = 0;
		char maxChar = 0;

		for (Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > maxCount) {
				maxCount = entry.getValue();

				maxChar = entry.getKey();
			}
		}

		System.out.println("Input data is: " + stringValue);
		System.out.println("Maximum occurring char is '" + maxChar + "' and it's count is: " + maxCount);

	}

}
