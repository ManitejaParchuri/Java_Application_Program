package com.vm.training.java.oops;

public class  Bus implements Ivehicle {

	 @Override
	  public void Steering() {
	    // TODO Auto-generated method stub
	    System.out.println("Power Steering");
	  }

	  @Override
	  public void Breakes() {
	    // TODO Auto-generated method stub
	    System.out.println("volvo Breaks");
	    
	  }

	  @Override
	  public void Accelerator() {
	    // TODO Auto-generated method stub
	    System.out.println("based on weight idea");
	    
	  }

	  @Override
	  public void Clutches() {
	    // TODO Auto-generated method stub
	    System.out.println("Based on gears");
	  }

	  @Override
	  public int Gears() {
	    // TODO Auto-generated method stub
	    return 6;
	  
	}

}
