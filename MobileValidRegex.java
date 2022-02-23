package com.bridgelab.userregistration;

import java.util.*;

public class MobileValidRegex {

	public boolean mobileNumberValidate(String number) {
		String pattern = "^[9][1]{0,1}\\s[1-9]{1}[0-9]{9}";
		boolean result = number.matches(pattern);
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Mobile number you want to match");
		String number = sc.nextLine();
		
		MobileValidRegex fn = new MobileValidRegex();
		boolean result = fn.mobileNumberValidate(number);
		System.out.println(result);
		sc.close();
	}
}
