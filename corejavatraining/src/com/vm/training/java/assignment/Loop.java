package com.vm.training.java.assignment;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1;
		int count=0;
		num1=sc.nextInt();
		while(num1!=0)
		{
			num1=num1/10;
			count++;
		}
		System.out.println(count);
		

	}

}
