package com.vm.training.java.oops;

public class Grandfather {
	int age;
	public Grandfather(int age)
	{
		this.age=age;
	}
	void walk()
	{
		System.out.println("i cant walk"+age);
	}
}
class Father extends Grandfather{
	int myage;
	public Father(int age,int myage)
	{
		super(age);
		this.myage=myage;
	}
	void walk()
	{
		System.out.println("father"+age+myage);
	}
	void sleep()
	{
		System.out.println("sleep father");
	}
	
}
class Son extends Father{
	int teenage;
	public Son(int age,int myage,int teenage)
	{
		super(age,myage);
		
		this.teenage=teenage;
	}
	void walk()
	{
		System.out.println("son"+age+myage+teenage);
	}
	void sleep()
	{
		System.out.append("sleep father");
	}
	
}


	
	


