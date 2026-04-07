package com.abhilasha.oops;

//Abstraction is the process of hiding implementation details and showing only essential functionality to the user.
//Abstraction can be achieved using 2 ways: 1. Abstract class(Partial Abstraction), 2. Interface(100% Abstraction)

//Abstract class is declared using abstract keyword, it contains both abstract methods and concrete methods.
//Abstract class can have constructor, static methods, data members, concrete methods.
//Abstract class cannot be instantiated.
// We can have final methods also, that will force the subclass to not change the body of the method.
//Abstract methods are the methods with no implementation (method body) whose implementation must be provided by subclass that extends the abstract class.

                                        
abstract class Vehicle {
	
	int distance;
	abstract void speed();	// abstract method
	void travel() {
		System.out.println("This Vehicle is travelling from east to west!");
	}
	final void carDetails()
	{
		System.out.println("This car was purchased in year 2002");
	}
}

class Bicycle extends Vehicle
{
	void speed() {
	 int s = 67;
	 System.out.println("Speed of Vehicle is:" + s);
	}

}

public class Main
{
	public static void main(String[] args) {
		 Bicycle b = new Bicycle();
		 b.speed();
		 b.travel();
		 b.carDetails();
		 
	}
}
