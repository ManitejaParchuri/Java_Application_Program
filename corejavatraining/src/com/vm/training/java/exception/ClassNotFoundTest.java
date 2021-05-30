package com.vm.training.java.exception;

public class ClassNotFoundTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("HW");
			System.out.println("class found");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
