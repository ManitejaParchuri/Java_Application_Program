package com.vm.training.java.oops;

public class TestInterface {
	  public static void main(String[] args)
	  {
	    Ivehicle Vehicle = new Bus();
	    Vehicle.Steering();
	    Vehicle.Breakes();
	    Vehicle.Accelerator();
	    Vehicle.Clutches();
	    Vehicle.Gears();
	    
	    Car car=new BMW("acaaaaa");
	    
	    
	    car.ac();
	    car.indicators();
	    car.Accelerator();
	    car.Breakes();
	    car.Gears();
	    
	  }
}