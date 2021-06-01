package com.vm.java.coding.test.jan1;

public class Employelessthan3 extends Exception{
	
	/**
	 * 
	 */
	
	String message;
	Employelessthan3(String message)
	{
		this.message=message;
	}
	
	public String toString() {
		return message;
	}
	
	

}
