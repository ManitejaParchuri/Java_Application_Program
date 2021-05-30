package com.vm.training.java.exception;

public class ProductRefund extends Exception {
	String message;
	ProductRefund(String message)
	{
		this.message=message;
	}
	
	public String toString() {
		return message;
	}
}
