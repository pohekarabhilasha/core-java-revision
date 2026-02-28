package com.abhilasha.oops;

public class accessSpecifiers {

	// Access modifiers are keywords that define the visibility or accessibility of classes, methods, constructors, and variables.
	// private, default, protected, public are the access specifiers.

	//private access specifiers are accessible only within same class.
	
	private int studentId;  // private access specifier

	public static void main(String[] args) {
		accessSpecifiers as = new accessSpecifiers();
		as.studentId = 108;

		System.out.println(as.studentId);
	}

}

