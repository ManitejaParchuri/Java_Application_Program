package com.vm.training.collection;

import java.util.*;

public class ProcductCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product> productlist =new ArrayList<Product>();
		productlist.add(new Product(3, "pen", 2) );
		productlist.add(new Product(2, "ball", 30) );
		productlist.add(new Product(1, "can", 40) );
		System.out.println("Productlist");
		System.out.println(productlist);
		System.out.println("product list one by one");
		for(Product product :productlist)
		{
			System.out.println(product);
		}
		System.out.println("product list pize grater then 20");
		for(Product product1 :productlist)
		{
			if(product1.getPrize()>20)
			{
				System.out.println(product1.getName());
			}
		}
		System.out.println(".........after sorting........");
		Collections.sort(productlist, new ProductPrizesorting());
		for(Product product2:productlist) 
	      { 
	       System.out.println(product2); 
	      }
		System.out.println("..........after sorting id..........");
		Collections.sort(productlist, new ProductIdSorting());
		for(Product product3:productlist) 
	      { 
	       System.out.println(product3); 
	      }
		System.out.println("..............after sorting Name............");
		Collections.sort(productlist, new ProductNameSorting());
		for(Product product4:productlist) 
	      { 
	       System.out.println(product4); 
	      }
		
	}

}
