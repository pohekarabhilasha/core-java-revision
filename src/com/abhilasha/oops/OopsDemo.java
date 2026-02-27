package com.abhilasha.oops;

public class OopsDemo {
	
	    //Encapsulation is the process of wrapping data and methods into single unit and restricting direct access to data.
	    //We can achieve encapsulation by making all data members private and providing getter and setters to get and set data into it.
	    //Encapsulation helps to protect sensitive data from being attacked, easier maintainability, controlled data access.

	    // Private data (cannot be accessed directly)
	    private int marks;

	    // Setter method (used to set value)
	    public void setMarks(int m) {
	        if(m >= 0 && m <= 100) {   // validation
	            marks = m;
	        } else {
	            System.out.println("Invalid Marks!");
	        }
	    }

	    // Getter method (used to read value)
	    public int getMarks() {
	        return marks;
	    }
	

	    public static void main(String[] args) {

	    	OopsDemo od = new OopsDemo();
	                
	        od.setMarks(85);  // setting marks using method
		    System.out.println(od.getMarks());
	        od.setMarks(150);         
	    }
}


