package com.Session2.Assignment1;

import java.util.Scanner;

public class Session2Assignment1 {
	
	public static void main(String[] args) {
		/*
		 * A person who is eligible to vote must be older than or equal to 18 years.
		 */
			System.out.println("Enter your Age: ");
			Scanner keyooardInput =  new Scanner(System.in);
			int age = keyooardInput.nextInt();
			if(age>=18)
			{
				System.out.println("You are eligible to vote.");
			}
			else
			{
				System.out.println("You are not eligible to vote.");
			}
	}
	

}
