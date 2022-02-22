package com.bridgelab.userregistration;

import java.util.*;

public class LastNameRegex {
	
	public boolean lastName(String name) {
		String pattern = "^[A-Z][a-z]{2,}$";
		boolean result = name.matches(pattern);
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Last Name");
		String lastName = sc.next();
		
		LastNameRegex fn = new LastNameRegex();
		boolean result = fn.lastName(lastName);
		System.out.println(result);
		sc.close();
	}
}
