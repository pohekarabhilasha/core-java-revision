package com.abhilasha.statickeyword;

public class StaticBlock {

	//Static Block is used to initialize the static data members.
	// static block is execute only once when the class is loaded into memory, before any object is created and before main() runs.
	
    static String url;
    static String username;

    static {
        url = "jdbc:mysql://localhost:3306/mydb";
        username = "admin";
        System.out.println("Database configuration loaded");
    }

    public static void main(String[] args) {
        System.out.println("URL: " + url);
        System.out.println("User: " + username);
    }
}
