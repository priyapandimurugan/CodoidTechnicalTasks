package com.technicaltasks.java;

public class MethodOverloading {

	public static void main(String[] args) {
		Python python = new Python();
		python.displayInformation();
	}
}

class Java {
	public void displayInformation() {
		System.out.println("I am Java Programmer");
	}
}

class Python extends Java {
	@Override
	public void displayInformation() {
		System.out.println("I am Python Programmer");
	}
}
