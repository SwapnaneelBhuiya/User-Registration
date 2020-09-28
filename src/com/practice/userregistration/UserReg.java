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
	}

}
