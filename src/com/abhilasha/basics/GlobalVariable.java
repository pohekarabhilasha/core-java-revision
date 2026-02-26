package com.abhilasha.basics;

public class GlobalVariable {
	
//	In Java, there is no direct concept called “global variable” like in C/C++.
//	Instead, we create global-like variables using static variables inside a class, because Java is fully object-oriented and everything must belong to a class.
//	A variable that is:
//	1. declared inside a class
//	2. but outside all methods
//	3. and marked as static
//	can be accessed from anywhere in the program → this behaves like a global variable.
//  we can use access modifiers 
	
public static int rollno=27; //global Variable
private static String studName="XYZ";
	
public static void main(String[] args)
{
	System.out.println(rollno);
	System.out.println(studName);
}

}
