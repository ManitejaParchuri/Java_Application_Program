package com.vm.training.java.exception;

public class AverageMonthlyCharges extends Exception 
{
 String s;

public AverageMonthlyCharges(String s) {
  super();
  this.s = s;
}

@Override
public String toString() {
  return "AverageMonthlyCharges [s=" + s + "]";
}
 
}