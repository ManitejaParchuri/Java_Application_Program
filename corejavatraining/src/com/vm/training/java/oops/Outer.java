package com.vm.training.java.oops;

public class Outer
{

  int i=100;
  void show()
  {
    System.out.println(i);
  }
  //class inner inside a outer class
  class Inner
  {
    int a=200;
    void display()
    {
      //show() method we can access outer class method inside inner clas
      show();
      System.out.println(i+a);
    }
  }
}