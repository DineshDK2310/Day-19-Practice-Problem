package com.bridgelab.userregistration;

import java.util.*;

public class ValidEmailRegex {
	
	public boolean emailValidate(String email) {
		String pattern = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*@[0-9A-Za-z]+.[a-zA-Z]{1,3}([.][A-Za-z]{1})*$";
		boolean result = email.matches(pattern);
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Email you want to match");
		String email = sc.next();
		
		ValidEmailRegex fn = new ValidEmailRegex();
		boolean result = fn.emailValidate(email);
		System.out.println(result);
		sc.close();
	}
}
