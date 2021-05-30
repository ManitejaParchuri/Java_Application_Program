package com.vm.training.java.assignment;

public class MyClaculator implements IAdvancedArithmetic {

	@Override
	public int divisor(int n) {
		// TODO Auto-generated method stub
		int sum=n;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}

}
