package com.vm.training.java.exception;

public class LowBalanceExceptions extends Exception {
	  String msg;

	  public LowBalanceExceptions(String msg) {
	    super();
	    this.msg = msg;
	  }

	  @Override
	  public String toString() {
	    return "LowBalanceException [msg=" + msg + "]";
	  }
	  
	}