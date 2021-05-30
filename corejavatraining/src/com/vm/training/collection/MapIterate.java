package com.vm.training.collection;

import java.util.LinkedHashMap;

public class MapIterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap lhm=new LinkedHashMap();
		lhm.put("f", "a");
		lhm.put("s", "b");
		lhm.put("a", "c");
		
		System.out.println("elements of LinkedHashmap "+lhm);
		System.out.println(lhm.get("f"));
		//System.out.println(lhm.remove("f"));
		System.out.println(lhm);
		
		for(Object s:lhm.keySet())
		{
			System.out.println(s);
		}
		for(Object s1:lhm.entrySet())
		{
			System.out.println(s1);
		}
		
		

	}

}
