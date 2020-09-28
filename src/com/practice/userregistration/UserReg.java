package com.practice.userregistration;

	import java.util.*;
	public class UserReg {
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter First Name");
			String first=sc.nextLine();
			if(first.matches("^[A-Z]{1}[a-z]{2,}"))
			{
				System.out.println("Valid Name");
			}
			else
			{
				System.out.println("Invalid first name");
				System.exit(0);
			}
			System.out.println("Enter Last Name");
			String last=sc.nextLine();
			if(last.matches("^[A-Z]{1}[a-z]{2,}"))
			{
				System.out.println("Valid Name");
			}
			else
			{
				System.out.println("Invalid last name");
				System.exit(0);
			}
			System.out.println("Enter email address");
			String email=sc.nextLine();
			if(email.matches("^(abc)[_+.-]{0,1}[a-zA-Z]*[@]{1}(bridgelabz|gmail|yahoo)[.]{1}(co|com|net)[.]{0,1}[a-z]{0,2}"))
				System.out.println("valid email");
			else
			{
				System.out.println("Invalid Email");System.exit(0);
			}
		}

	}