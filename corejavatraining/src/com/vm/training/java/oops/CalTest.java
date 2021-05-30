package com.vm.training.java.oops;

public class CalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Calculator cal=new Calculator();
	/*
	 * System.out.println(cal.add(100,100));
	 * System.out.println(cal.add(100,100,100));
	 * System.out.println(cal.add(100,100,100,100));
	 */
	cal.add(100, 200);
	System.out.println(cal.add(10,10.5));
	System.out.println(cal.add(10,10,10));
	System.out.println(cal.add(10,10,10,10));
	}

}
