package com.vm.training.collection;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList javabatch =new ArrayList();
	javabatch.add("ravi");
	javabatch.add("john");
	javabatch.add("anil");
	javabatch.add("kumar");
	
	ArrayList sqlbatch =new ArrayList();
	sqlbatch.add("sourab");
	sqlbatch.add("ankita");
	sqlbatch.add("john");
	sqlbatch.add("kumar");
	sqlbatch.add("manoj");
	
	javabatch.removeAll(sqlbatch);
	System.out.println(javabatch);

	javabatch.addAll(sqlbatch);
	System.out.println(javabatch);
	Collections.sort(javabatch);
	System.out.println(javabatch);

	

	}

}
