package com.vm.training.java.oops;

public class CustomerGetterSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer=new Customer();
		customer.setId(10);
		customer.setFirstname("mani");
		customer.setLastname("teja");
		customer.setAccount("saving");
		
		System.out.println(customer.getId());
		System.out.println(customer.getFirstname());
		System.out.println(customer.getLastname());
		System.out.println(customer.getAccount());


	}

}
