package com.vm.java.coding.test.jan1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class WW {
public static void main(String[] args) {
	List<WWE> wwelist = new ArrayList<WWE>();
	wwelist.add(new WWE("John","Cena", 300));
	wwelist.add(new WWE("the", "rock", 265));
	wwelist.add(new WWE("RKO", "Randy", 200));
	wwelist.add(new WWE("BIG", "show", 460));
	wwelist.add(new WWE("EDGE", "ege", 260));
	
	 System.out.println("=======FirstName of all wwe players are:=== ");
	 fn(wwelist).forEach(p->System.out.println(p));
	 System.out.println("====wwe players sorted by firstname===== :");
	 sortbyfn(wwelist).forEach(p->System.out.println(p));
	
	System.out.println("======sum of weights======");
		long  sum = wwelist.stream().filter(p->p.getWeight()>200).map(p->p.getWeight()).reduce(0,(A,B)->A+B);
		 System.out.println("Sum of the wight of wwe players > 200 : "+sum);
	
		 
		 System.out.println("====count====");
	long count = wwelist.stream().count();
	
	System.out.println("No of wwelist :"+count);
	
	 
	 
 
}
private static List<String> fn(List <WWE> list)
{
	 return list.stream().map(p->p.getFirstName()).collect(Collectors.toList());
	
}
private static List<WWE> sortbyfn(List <WWE> list)
{
	 return list.stream().sorted(Comparator.comparing(WWE::getFirstName)).collect(Collectors.toList());
	
}
}
