package com.technicaltasks.java;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class SetStream {

	public static void main(String[] args) {
		 Set<String> set = new HashSet<String>();

	      set.add("a");
	      set.add("b");
	      set.add("c");
	      set.add("d");
	      set.add("e");
	      set.add("f");

	      Stream<String> stream = set.stream();
	      stream.forEach(data->System.out.print(data+" "));

	}

}
