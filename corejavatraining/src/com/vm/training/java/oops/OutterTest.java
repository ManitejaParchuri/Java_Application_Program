package com.vm.training.java.oops;

public class OutterTest {

	  public static void main(String[] args) {
	    // TODO Auto-generated method stub
	    Outer outer=new Outer();
	    outer.show();
	    //to call the inner class we need to have the reference of outer class .outer
	    Outer.Inner inner= outer.new Inner(); 
	    inner.display();
	  }  

}
