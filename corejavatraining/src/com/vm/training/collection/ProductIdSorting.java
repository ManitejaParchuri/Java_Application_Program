package com.vm.training.collection;

import java.util.Comparator;
public class ProductIdSorting implements Comparator< Product > {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		if(o1.getId()==o2.getId())
		{
			return 0;
		}
		else if(o1.getId()>o2.getId())
		{
			return 1;
		}
		else
		return -1;
	}

}