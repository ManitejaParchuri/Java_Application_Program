package com.vm.java.features;

@FunctionalInterface
interface Calculate
{
	//method without return type
	void addition(int a,int b);
}

interface Calculate2
{
	//method with return type
	int multiply(int a, int b);
}

interface Large
{
	int FindLargest(int a,int b);
}
interface StringL
{
	public int  stringl(String a);
	
}
interface StringReverse
{
	String reverseString(String s);
}

public class LamdaExpresionWithPrameters {

	public static void main(String[] args) {
	Calculate c=	(a,b)->System.out.println("addition :"+a+b);
	c.addition(20, 30);
	
	Calculate2 c2=(a,b)->a*b;
	System.out.println("multiply : "+c2.multiply(20,30));
	
	
	Large large=(a,b)->
	{
		if(a>b)
			return a;
		else
			return b;
		
	};
	
	System.out.println("Largest number is "+large.FindLargest(2, 8));

	
	StringL sl=(b)->
	{
		return  b.length();
	
	
		
	};
	
	
	System.out.println(sl.stringl("mani"));
	StringReverse sr=(a)->
	{
		StringBuffer bf=new StringBuffer(a);
	
			String ss=	bf.reverse().toString();
		return ss;
	
	};
	System.out.println(sr.reverseString("mani"));
	
	
	
	}	
	
	

}
