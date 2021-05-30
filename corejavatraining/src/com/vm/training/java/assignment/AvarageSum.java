package com.vm.training.java.assignment;

import java.util.Scanner;

public class AvarageSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int num4=sc.nextInt();
		int num5=sc.nextInt();
		int sum=0;
		sum=num1+num2+num3+num4+num5;
		int avg=sum/5;
		System.out.println(avg);
		
		

	}

}
