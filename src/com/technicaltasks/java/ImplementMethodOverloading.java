package com.technicaltasks.java;

public class ImplementMethodOverloading {
	
	public void SBIBank() {
		System.out.println("Hi SBI Users...");
	}
	public void ICICIBank(int a) {
		System.out.println("Hi ICICI Users...");
	}

	public static void main(String[] args) {
		
		ImplementMethodOverloading loading=new ImplementMethodOverloading();
		loading.ICICIBank(10);
		loading.SBIBank();
	}

}
