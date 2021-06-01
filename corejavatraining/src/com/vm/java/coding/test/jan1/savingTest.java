package com.vm.java.coding.test.jan1;

public class savingTest {

	public static void main(String[] args) {
		SavingsAccount savings=new SavingsAccount(5000,0.06);
		savings.withdraw(1000);
		savings.deposit(2200);
		System.out.println(" Balance in Saving Account :"+savings.getBalance());
		
	}

}

