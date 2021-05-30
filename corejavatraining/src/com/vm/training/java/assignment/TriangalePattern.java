package com.vm.training.java.assignment;

import java.util.Scanner;

public class TriangalePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    Scanner sc= new Scanner(System.in);
    int num=sc.nextInt();
		int firstNumber=1,nextNumber,i;
		for(int k =firstNumber;k<=num;k++)
		{
			for(nextNumber=1;nextNumber<=k;nextNumber++)
				System.out.print(nextNumber);
			System.out.println("");
		}
	}

	

}
