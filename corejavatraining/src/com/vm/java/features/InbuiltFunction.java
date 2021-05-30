package com.vm.java.features;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class InbuiltFunction {

	public static void main(String[] args) {
        
		
		Predicate<Integer> p=(var1)->var1>2;
		System.out.println(p.test(3));
		Predicate<String> p2=(v1)->v1.startsWith("a");
		System.out.println(p2.test("apple"));

		
		Function<String, Integer> f1=(va1)->va1.length();
		System.out.println(f1.apply("mani"));
		
		

	}

}
