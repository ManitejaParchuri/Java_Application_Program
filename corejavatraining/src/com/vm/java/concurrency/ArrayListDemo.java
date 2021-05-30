package com.vm.java.concurrency;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>  obj=new ArrayList<Integer>();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		System.out.println("elements are"+obj);
		
		
		for(Object i:obj)
		{
			System.out.println(i);
			obj.add(20);
		}

	}

}
