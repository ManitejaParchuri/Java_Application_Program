package com.vm.java.features;


import java.util.*;
public class StreamDemo1 {

	public static void main(String[] args) {
		
	ArrayList<Integer> num =new ArrayList<Integer>();
	num.add(1);
	num.add(2);
	num.add(3);
	num.add(4);
	
	num.add(5);
	num.add(6);
	num.forEach(s->System.out.println(s));
	long count=num.stream().count();
	System.out.println("count of num using stream"+count);
	
	num.stream().filter(s1->s1>2).forEach(s->System.out.println(s));
	}

}
