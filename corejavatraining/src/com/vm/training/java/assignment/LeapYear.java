package com.vm.training.java.assignment;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {

  Scanner sc=new Scanner(System.in);
     int year=sc.nextInt();
		int leapYear = 1;

		
		if (year % 4 == 0) 
		{

			
			if (year % 100 == 0) {

				
				if (year % 400 == 0)
					leapYear = 0;
				else
					leapYear = 1;
			}

			
			else
				leapYear = 0;
		}

		else
			leapYear = 1;

		if (leapYear==0)
			System.out.println(year + " is a leap year.");
		else
			System.out.println(year + " is not a leap year.");
	}
}
