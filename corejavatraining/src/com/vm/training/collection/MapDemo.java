package com.vm.training.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();
		hm.put("f", "a");
		hm.put("s", "b");
		hm.put("a", "c");
		System.out.println("elements of map "+hm);
		LinkedHashMap lhm=new LinkedHashMap();
		lhm.put("f", "a");
		lhm.put("s", "b");
		lhm.put("a", "c");
		
		System.out.println("elements of LinkedHashmap "+lhm);
		
		TreeMap tm =new TreeMap();
		tm.put("f", "a");
		tm.put("s", "b");
		tm.put("a", "c");
		System.out.println("elements of Tree map "+tm);
		
		
		}

}
