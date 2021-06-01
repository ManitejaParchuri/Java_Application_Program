package com.vm.java.coding.test.jan1;

import java.util.*;


public class String_word_char_count {
	public static void main(String args[])
	{
	@SuppressWarnings("resource")
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the string of words with spaces  ");
	String s= sc.nextLine();
	String words[]=s.split(" ");
	
	int no_words=words.length;
	System.out.println("string numbers of words "+no_words);
	int no_char=s.length();
	System.out.println("string numbers of  "+no_char);
	
	
	}
}
//OUTPUT
//enter the string of words with spaces  
//i am king 
//string numbers of words 3
//string numbers of  10 ( even the spaces will be counted

 