package com.vm.training.java.oops;

public class Calculator {
	int n1,n2,n3,n4;
	 double sum=0;
	double f;
	long l;
	
//	public Calculator(int n1, int n2, int sum) {
//		super();
//		this.n1 = n1;
//		this.n2 = n2;
//		this.sum = sum;
//	}


	 void  add(int n1,int n2)
	{
		l=n1+n2;
		System.out.println(l);
	}
	double  add(int n1,double n2)
	{
		sum=n1+n2;
		return sum;
	}
	long add(int n1,int n2,int n3)
	{
		sum=n1+n2+n3;
		return l;
	}
	 long add(int n1,int n2,int n3,int n4)
	{
		sum=n1+n2+n3+n4;
		return l;
	}
	

}
