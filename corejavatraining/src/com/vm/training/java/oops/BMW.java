package com.vm.training.java.oops;

public class BMW extends Car {

	BMW(String model) {
		super(model);
		// TODO Auto-generated constructor stub
		System.out.println(model);
	}

	@Override
	void ac() {
		// TODO Auto-generated method stub
		System.out.println("BMW ac");
		
	}

	@Override
	void indicators() {
		// TODO Auto-generated method stub
		System.out.println("BMW indecator");
		
	}

}
