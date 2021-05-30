package com.vm.java.threadcommunication;

public class Customer {
	int balance=50000;
	public int withdraw(int amount)
	{
		if(balance<amount)
		{
			try
			
			
			{
				wait();
				
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+"is going to withdraw");
		balance-=amount;
		return balance;
	}
	synchronized public int deposit(int amount)
	{
		balance+=amount;
		System.out.println(Thread.currentThread().getName()+"is deposit");
		notifyAll();
		return balance;
	}

}
