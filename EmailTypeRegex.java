package com.bridgelab.userregistration;

import java.util.*;
import java.util.regex.*;

public class EmailTypeRegex {

	public boolean isValidEmail(ArrayList<String> emails) {
		String regex = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*@[0-9A-Za-z]+.[a-zA-Z]{2,4}([.][A-Za-z]{2,3})*$";

		Pattern pattern = Pattern.compile(regex);
		if (emails == null) {
			return false;
		}

		for (String email : emails) {
			Matcher match = pattern.matcher(email);
			System.out.println(email + " : " + match.matches());
		}
		return true;
	}


	public static void main(String[] args) {
		
		EmailTypeRegex fn = new EmailTypeRegex();

		ArrayList<String> emails = new ArrayList<>();
		emails.add("abc@yahoo.com");
		emails.add("abc-100@yahoo.com");
		emails.add("abc.100@yahoo.com");
		emails.add("abc111@abc.com");
		emails.add("abc-100@abc.net");
		emails.add("abc.100@abc.com.au");
		emails.add("abc@1.com");
		emails.add("abc@gmail.com.com");
		emails.add("abc+100@gmail.com");

		emails.add("abc");
		emails.add("abc@.com.my");
		emails.add("abc123@gmail.a");
		emails.add("abc123@.com");
		emails.add("abc123@.com.com");
		emails.add(".abc@abc.com");
		emails.add("abc()*@gmail.com");
		emails.add("abc@%*.com");
		emails.add("abc...2002@gmail.com");
		emails.add("abc.@gmail.com");
		emails.add("abc@abc@gmail.com");
		emails.add("abc@gmail.com.1a");
		fn.isValidEmail(emails);

	}

}
