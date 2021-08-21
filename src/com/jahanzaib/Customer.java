package com.jahanzaib;

import java.time.LocalDate;

public class Customer {
    LocalDate date = LocalDate.now();
	
	String name;
    public static final String COMPANY = "JayStore.com";
    
    public void customerDetails() {
		System.out.println("\n------------------ Bill Details------------------\n ");
    	System.out.println("Customer Name : "+name);
    	System.out.println("Company Name : " +COMPANY);
    	System.out.println("Date : "+ this.date);
    }
}
