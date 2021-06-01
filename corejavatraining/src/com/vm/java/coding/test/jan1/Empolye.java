package com.vm.java.coding.test.jan1;

public class Empolye {
	
	
	private String firstname;
	private String lastname;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	@Override
	public String toString() {
		return "Empolye [firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	

}
