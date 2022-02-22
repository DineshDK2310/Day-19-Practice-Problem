package com.bridgelab.userregistration;

import java.util.*;

public class FirstNameRegex {
	
	public boolean firstName(String name) {
		String pattern = "^[A-Z][a-z]{2,}$";
		boolean result = name.matches(pattern);
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Name");
		String Name = sc.next();
		
		FirstNameRegex fn = new FirstNameRegex();
		boolean result = fn.firstName(Name);
		System.out.println(result);
		sc.close();
	}

}
