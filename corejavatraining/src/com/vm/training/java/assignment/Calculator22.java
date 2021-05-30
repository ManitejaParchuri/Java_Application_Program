package com.vm.training.java.assignment;

public abstract  class Calculator22 implements Calculator2 {

	@Override
	public void name() {
		System.out.println("name is calculator");
		// TODO Auto-generated method stub
		
	}
	int num1;int num2;int sum=0;
	int num3,num4;
	public int add(int num1,int num2)
	{
		sum=num1+num2;
		return sum;
		
	}
	public int add(int num1,int num2 ,int num3)
	{
		sum=num1+num2+num3;
		return sum;
		
	}
	abstract int sub(int num1,int num2 );
	
	

}
