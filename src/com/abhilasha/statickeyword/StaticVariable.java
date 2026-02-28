package com.abhilasha.statickeyword;

public class StaticVariable {
	
	//static keyword in java is used for memory management mainly.
	//static keyword can be applied to variable,method,block and nested classes.
	//Static members belongs to class not to objects.
	// Since static members belong to the class, you can access them directly using the class name (ClassName.methodName()). No need to create an object.
	
	// The static variable can be used to refer to the common property of all objects.
	//The static variable gets memory only once in the class area at the time of class loading.
	//Static variables are shared among all instances of the class, meaning if the value of a static variable is changed in one instance, it will reflect the change in all other instances as well.
	//Static method cannot directly access non-static (instance) variables or methods.
	
	
	int rollNo;
    String name;
    static String college = "NCI College"; // static variable

    StaticVariable(int r, String n) {
        rollNo = r;
        name = n;
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }

	 public static void main(String[] args)
	{
	        StaticVariable s1 = new StaticVariable(101, "ABC");
	        StaticVariable s2 = new StaticVariable(102, "XYZ");

	        s1.display();
	        s2.display();
	}
}
