package com.vm.training.java.oops;

public class EmployeDetails extends Employe {
	String email;
	String address;

	/*
	 * public EmployeDetails(int empid, String name,String dep,String email, String
	 * address) { super(empid,name,dep); this.email = email; this.address = address;
	 */
	
	public String toString()
	{
		return empid+name+dep+email+address;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeDetails emp3=new EmployeDetails();
		System.out.println(emp3);
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
