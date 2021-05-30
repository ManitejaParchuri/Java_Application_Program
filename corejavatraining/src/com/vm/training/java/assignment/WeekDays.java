package com.vm.training.java.assignment;

public class WeekDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberDay=Integer.parseInt(args[0]);
		String day = null;
		
		switch (numberDay) {
		case 1:
			day = "Monday";
			break;
		case 2:
			day = "Tuesday";
			break;
		case 3:
			day = "Wednesday";
			break;
		case 4:
			day = "Thursday";
			break;
		case 5:
			day = "Friday";
			break;
		case 6:
			day = "Saturday";
			break;
		case 7:
			day = "Sunday";
		}
		System.out.println(day);

	}



	}


