package com.practice.userregistration;

	import java.util.*;
	public class UserReg {
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter First Name");
			String first=sc.nextLine();
			if(validFirst(first))
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
			if(validLast(last))
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
			if(validEmail(email))
				System.out.println("valid email");
			else
			{
				System.out.println("Invalid Email");System.exit(0);
			}
			System.out.println("Enter mobile number");
			String number=sc.nextLine();
			if(validNumber(number))
				System.out.println("Valid phone number");
			else
			{
				System.out.println("Invalid number");System.exit(0);
			}
			System.out.println("Enter password");
			String pass=sc.nextLine();
			if(validPassword(pass))
				System.out.println("Valid password");
			else
			{
				System.out.println("Invalid password");System.exit(0);
			}
		}
		public static boolean validPassword(String pass)
		{
			if(pass.matches("[A-Z]+[a-z][0-9]+{8,}"))
				return true;
			else
				return false;
		}
		public static boolean validNumber(String number)
		{
			if(number.matches("^[0-9]{2}\\s{1}[1-9]{1}[0-9]{9}"))
				return true;
			else
				return false;
		}
		public static boolean validFirst(String first)
		{
			if(first.matches("^[A-Z]{1}[a-z]{2,}"))
			{
				return true;
			}
			else
			{
				return false;
			}

		}
		public static boolean validLast(String last)
		{
			if(last.matches("^[A-Z]{1}[a-z]{2,}"))
			{
				return true;
			}
			else
			{
				return false;
			}

		}
		public static boolean validEmail(String email)
		{
			if(email.matches("^(abc)[_+.-]{0,1}[a-zA-Z]*[@]{1}(bridgelabz|gmail|yahoo)[.]{1}(co|com|net)[.]{0,1}[a-z]{0,2}"))
				return true;			
			else
			{
				return false;
			}
		}

	}