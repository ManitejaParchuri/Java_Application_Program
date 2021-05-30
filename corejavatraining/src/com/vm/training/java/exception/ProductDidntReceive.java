package com.vm.training.java.exception;

public class ProductDidntReceive extends Exception {
	String message;
	ProductDidntReceive(String message)
	{
		this.message=message;
	}
	
	public String toString() {
		return message;
	}

}
