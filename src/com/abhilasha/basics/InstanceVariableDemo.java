package com.abhilasha.basics;

public class InstanceVariableDemo {
	
//	Instance variable are the variable that are declared outside the body of the method but inside the class.
//	We can use access specifiers for Instance variables
//	to access an instance variable, an object must be created
//	Belongs to an object (instance) of the class.
	
	public float empId; //instance Variable
	
	public static void main(String[] args)
	{
		InstanceVariableDemo instanceVariableDemo = new InstanceVariableDemo();
		System.out.println(instanceVariableDemo.empId); // accessing instance variable by creating object of the class.
	}

}
