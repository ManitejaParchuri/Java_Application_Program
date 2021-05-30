package com.vm.training.java.assignment;

public class Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=Integer.parseInt(args[0]);
		int startingNumber=1,cubeOfNumber;
		for(int i=startingNumber;i<=number;i++)
		{
			cubeOfNumber=i*i*i;
			System.out.println("the cube of Number is: "+i+" and cube of "+i+"is: "+cubeOfNumber);

	}

}
}
