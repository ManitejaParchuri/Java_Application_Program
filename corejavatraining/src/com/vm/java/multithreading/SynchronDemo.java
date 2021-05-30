package com.vm.java.multithreading;

class Account
{
  synchronized public void balance(int time)
  {
    for(int i=1;i<=time;i++)
      System.out.println(Thread.currentThread().getName()+" is :"+i);
  }
}

class Transaction implements Runnable
{
  Account ac=new Account();
  @Override
  public void run() {
    // TODO Auto-generated method stub
	  ac.balance(5);
  }
  
}






public class SynchronDemo {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
   Transaction tc =new Transaction();
    Thread withdrawal=new Thread(tc);
    Thread diposit=new Thread(tc);
    
    
    withdrawal.setName("Sasi");
    diposit.setName("Shashank");
    
    
    diposit.start();
    withdrawal.start();
  }

}