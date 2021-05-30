package com.vm.training.java.collection;



import java.util.*;
public class ArrayListTest {
public static void main(String[] args) {
	ArrayList arraylist=new ArrayList();
	arraylist.add( (20));
	arraylist.add("Mani");
	arraylist.add("Teja");
	arraylist.add((20.38));
	System.out.println(arraylist);
	arraylist.remove(2);
	System.out.println(arraylist);
	arraylist.add(2, "Teja");
	System.out.println(arraylist);
	System.out.println(arraylist.contains("Mani"));
	System.out.println(arraylist.get(2));
	System.out.println(arraylist.size());
	
}
}