package com.vm.training.java.collection;

import java.util.ArrayList;
class cus
{
	String name;

	public cus(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "cus [name=" + name + "]";
	}

}

public class ArraylistString {
	public static void main(String args[])
	{
		cus c= new cus("name");
		ArrayList<cus> arraylist=new ArrayList<cus>();
		arraylist.add(c);
		for( cus c1:arraylist)
		{
			System.out.println(c1);
		}
		/*
		 * arraylist.add("abc"); arraylist.add("cdef"); String s=arraylist.get(0);
		 */
		//System.out.println(c);
	}

}
