package com.vm.java.assignment;



import java.util.*;
public class StreamProduct {
	public static void main(String[] args) {
		ArrayList<Product> arr=new ArrayList<Product>();
		arr.add(new Product(16,"LLyod","AC",45000,5));
		arr.add(new Product(15,"Lenovo","Laptop",60000,8));
        arr.add(new Product(17,"LLyod","AC",45000,5));
		arr.add(new Product(20,"Mac","Laptop",45000,5));
		arr.add(new Product(26,"samsung","AC",45000,5));
		
		ProductMethod pm=new ProductMethod();
		
		System.out.println("======product counr==========");
		System.out.println(pm.productcount(arr));
		System.out.println("============");
	
		System.out.println("======product by category   ac======");
		List l=pm.productlist(arr);
		l.stream().forEach(f->System.out.println(f));
		

		System.out.println("============");
		
		System.out.println("======product by min and max  pize======");
		
		List l1=pm.productlist(arr);
		l1.stream().forEach(f->System.out.println(f));
		

		System.out.println("============");
		
		System.out.println("======product byLower======");
		
		List l2=pm.productUpperCase(arr);
		l2.stream().forEach(f->System.out.println(f));
		
		
		
		System.out.println("============");
		
		System.out.println("======product byLower======");
		
		List l3=pm.productlowerCase(arr);
		l3.stream().forEach(f->System.out.println(f));
		
		
	
		System.out.println("============");
		
		System.out.println("======product quantity ======");
		
		List l4=pm.productQuantity(arr);
		l4.stream().forEach(f->System.out.println(f));
		
		
		
		
		
	}

}