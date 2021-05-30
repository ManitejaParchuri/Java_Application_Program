package com.vm.training.java.oops;

public class Emp {
	int id;
	String firstname;
	String lastname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	Address address;
	@Override
	public String toString() {
		return "Emp [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", address=" + address + "]";
	}

}
