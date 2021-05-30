package com.vm.training.java.collection;

import java.util.*;
public class Addtwoarraylist {
 public static void main(String args [])
 {
	 ArrayList<String> l1=new  ArrayList<String>();
	 l1.add("mani");
	 ArrayList<String>l2=new ArrayList<String>();
	 l2.add("teja");
	 l1.addAll(l2);
	 System.out.println(l1);
 }

}
