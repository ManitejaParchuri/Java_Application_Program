package com.vm.java.threadcommunication;

public class Interthreadcommunication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer =new Customer();
		Thread t1= new Thread()
		{
			public void run()
			{
				System.out.println(customer.withdraw(7000));
			}
		};
		
		
		
		Thread t2= new Thread()
		{
		public void run()
			{
				System.out.println(customer.deposit(4000));
			}
		};
		t1.setName("withdraw");
		t2.setName("diposit");
		t1.run();
		t2.run();

	}

}
