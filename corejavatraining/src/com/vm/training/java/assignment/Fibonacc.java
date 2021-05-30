package com.vm.training.java.assignment;



public class Fibonacc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		int num1=0;
		int num2=1;
		int num3=0;
		
		for(int i=2;i<=n;i++)
		{
			
			num3=num1+num2;
			System.out.println(""+num3);
			num1=num2;
			num2=num3;
		}
		

	}

}
