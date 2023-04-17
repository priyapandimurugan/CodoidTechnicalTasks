package com.technicaltasks.java;

public class Encapsulation {

	public static void main(String[] args) {

		Area area = new Area(5, 4);
		area.getArea();
	}
}

class Area {

	int length;
	int breadth;

	// Constructor to initialize values
	Area(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	// To calculate area
	public void getArea() {
		int area = length * breadth;
		System.out.println("Area: " + area);
	}
}
