package com.vm.training.java.exception;

public class ProductDamaged extends Exception {
	String message;
	ProductDamaged(String message)
	{
		this.message=message;
	}
	
	public String toString() {
		return message;
	}

}
