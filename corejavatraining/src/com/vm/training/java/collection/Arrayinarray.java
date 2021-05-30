package com.vm.training.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
public class Arrayinarray {
	public static void main(String[] args) {
		ArrayList<ArrayList> arraybig = new ArrayList<ArrayList>();
		ArrayList array = new ArrayList();
		array.add("Bhargawa");
		array.add("Nitesh");
		array.add("20");
		array.add("1.25");
		array.add("Mamaaaa");
		
		arraybig.add(array);
		ArrayList array2 = new ArrayList();
		array2.add("Hari");
		array2.add("Water boy");
		array2.add("Rasgull");
		array2.add("Kaju Barfi");
		arraybig.add(array2);
		System.out.println(arraybig);
	}
}