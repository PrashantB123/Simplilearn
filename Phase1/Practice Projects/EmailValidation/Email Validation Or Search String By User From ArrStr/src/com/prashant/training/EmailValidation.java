package com.prashant.training;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    public static boolean isValidEmail(String email) {
		   String regex = "^(.+)@(.+)$";
		 //initialize the Pattern object
	       Pattern pattern = Pattern.compile(regex);
	       Matcher matcher = pattern.matcher(email);
	       return matcher.matches();

	       
	   }

	   public static void main(String[] args) {
	       List<String> emails = new ArrayList<String>();
	       
	       // Valid Email addresses 
	       emails.add("bhadanep@format.com");
	       emails.add("Prabhuisone@format.com");
	       emails.add("rushi@format.me.org");
	       
	       //invalid email addresses
	       emails.add("hriday.format.com");
	       emails.add("Kapur...%Akhilformat.com");
	       emails.add("ronak.format.com");

	       for (String value : emails) {
	           System.out.println("The Email address " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));
	       }
	       
	       System.out.println("Enter any email address to check");
	       Scanner sc = new Scanner(System.in);
	       String input = sc.nextLine();
	       sc.close();
	       System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));
	       
	   }
	   
}



