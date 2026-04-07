package com.abhilasha.oops;

public class Employee {
	
	
	// Encapsulation is a process of wrapping data and code into single unit.
	// Encapsulation helps to protect sensitive data from being attacked, easier maintainability, controlled data access.
	// We can create fully encapsulated class by making all data members private and providing public getter and setter methods to set and get data into it.
	
	private int empId;
	private double salary;
	
	
	public int getempId() // Getter method (used to read value)
	{
		return empId;
	}
	 public double getsalary()
	 {
		 return salary;
	 }
	 
	 public void setempId(int empId)  // Setter method (used to set value)
	 {
		 this.empId = empId;
	 }
	 public double setsalary(double salary)
	 {
		 if(salary > 0)
		 {
		 this.salary = salary;
		 }
		 else 
		 {
			 System.out.println("Invalid Amount for Salary!!");
		 }
		 return salary;
	 }
	 public static void main(String[] args) {
		 Employee e = new Employee();
		 e.setempId(25);
		 e.setsalary(0);
		 
		 System.out.println("Employee Id:" + e.getempId());
		 System.out.println("Salary of the employee:" + e.getsalary());		 
		 
	}
	
}
