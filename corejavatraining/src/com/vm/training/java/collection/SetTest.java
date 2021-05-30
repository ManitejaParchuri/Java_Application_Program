package com.vm.training.java.collection;

import java.util.*;
class employee{
	int id;
	String name;
	public employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + "]";
	}
	
}
class employeedetails extends employee{
	int phno;

	public employeedetails(int id, String name, int phno) {
		super(id, name);
		this.phno = phno;
	}

	@Override
	public String toString() {
		return "employeedetails [phno=" + phno + "]";
	}


		
	}

	
		
	

	
	

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<employee> arraylist=new ArrayList();
		arraylist.add(new employee(100,"mani"));
		System.out.println(arraylist);
		arraylist.add(new employeedetails(100, "mmani", 987654567));
		System.out.println(arraylist);
	}

}
