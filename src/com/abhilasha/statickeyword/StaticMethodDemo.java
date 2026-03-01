package com.abhilasha.statickeyword;

public class StaticMethodDemo {

	//Static method can access only static data members and can change their value of it.
	//Static members belongs to class, so we can directly access them using class name.
	
	int empId;
	static String companyName="Tech"; // static variable
	
	static void empDetails() // static method
	{
		companyName="Info Tech";
		System.out.println("The company of the emp is:" + companyName);
	}
	
	public static void main(String[] args)
	{
		StaticMethodDemo.empDetails();
	}
}
