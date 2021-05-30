package com.vm.training.collection;

import java.util.*;

public class RemoveDupliFromList {
	public static void main(String args[])
	{
		ArrayList<Integer>arr= new ArrayList<Integer>();
		arr.add(1);
		arr.add(3);
		arr.add(14);
		arr.add(5);
		arr.add(5);
		arr.add(8);
		System.out.println("Elements of arraylist"+arr);
		
		
		
		LinkedHashSet<Integer> obj1=new LinkedHashSet<Integer>(arr)	;
		
		System.out.println("after removing the duplicate"+obj1);
		}
	

}
