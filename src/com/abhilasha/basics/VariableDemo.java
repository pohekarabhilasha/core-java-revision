package com.abhilasha.basics;

public class VariableDemo {

//	Local Variable are declared inside the body of the method. You can use this variable only within that method.
//
//	1. Local variables can only use final as a modifier.
//	2. They cannot use access modifiers or static.
//	3. Java does NOT give default value to local variables.
	
	public static void messageDisplay()
	{
        final double num1 = 10.00;
        System.out.println("The First Number is: " + num1);
		String msg="Hello, I'm a local variable!!"; //local variable
		System.out.println(msg);
	}
	public static void main(String[] args) {

		int num2=9; //local variable
		System.out.println("The Second Number is:" + num2);
		messageDisplay();
	}
}
