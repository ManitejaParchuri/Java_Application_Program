package com.vm.training.collection;

import java.util.Comparator;

public class ProductNameSorting implements Comparator<Product>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return (o1.getName().compareTo(o2.getName()));
		
	}

}
