package com.abhilasha.interfaceDemo;

interface AIB {
 //Interface is a blueprint of class that contains static constants and abstract methods.
// Interface is used to achieve abstraction, loose coupling, support multiple inheritance.
// It provides complete abstraction, which means all methods are public and abstract by default, and all fields are public, static, and final. 
//A class that implements an interface must provide implementations for all the methods declared in the interface.
	float rateOfInterest();
	
	default void bankName() {
		System.out.println("AIB");
	}
}
 public class Bank implements AIB
 {
	public float rateOfInterest()
	 {		 
		 return 0.6f;
	 }
	 public static void main(String[] args) {
		Bank b = new Bank();
		b.bankName();
		System.out.println("Rate of Interest is:" + b.rateOfInterest()); 
	}
 }
 
