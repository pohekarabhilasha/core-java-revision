package com.abhilasha.statickeyword;

public class StaticNestedClassDemo {

	  // Static inner classes are defined the another classes and does NOT require an object of the outer class to be created.
	  //Static Inner Class Can Access Only Static Members of Outer Class Directly.
	  // A static inner class:   1. Can have methods
	                          // 2.Can have constructors
                              // 3. Can have static members
	                          // 4. Can be instantiated independently
	
	static int x = 110;  // static member of outer class

    static class Inner {
    	  static void message() {
              System.out.println("Static method inside static inner class");
          }
    	  
        void display() {
            System.out.println("Value of x: " + x);
        }
    }

    public static void main(String[] args) {

        // No need to create Outer object
        StaticNestedClassDemo.Inner obj = new StaticNestedClassDemo.Inner();
    	obj.display();
    	StaticNestedClassDemo.Inner.message();
    	
    }
}
