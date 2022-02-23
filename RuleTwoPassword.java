package com.bridgelab.userregistration;

import java.util.Scanner;

public class RuleTwoPassword {

	public boolean mobileNumberValidate(String password) {
		String pattern = "(?=.*[A-Z])[a-zA-Z0-9]{8,}$";
		boolean result = password.matches(pattern);
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Password you want to match");
		String number = sc.next();

		RuleOnePassword fn = new RuleOnePassword();
		boolean result = fn.mobileNumberValidate(number);
		System.out.println(result);
		sc.close();
	}

}
