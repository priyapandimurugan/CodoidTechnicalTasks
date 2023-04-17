package com.technicaltasks.java;

interface Animaleat {
	void createaccout();
}

interface Animaltraval {
	void payment();
}

class Animal implements Animaleat ,Animaltraval  {
	public void createaccout() {
		System.out.println("Create Accout Is Succuessfully...");
	}

	public void payment() {
		System.out.println("Payment is Succuessfully...");
	}

	
}

public class InheritanceUsingInterface {

	public static void main(String[] args) {

		Animal a = new Animal();
		a.createaccout();
		a.payment();
	}

}
