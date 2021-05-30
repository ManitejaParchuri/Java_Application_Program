package com.vm.java.io;

import java.io.*;

public class FileDemo {

	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub
	File f= new File("maniteja.txt");
	
	if(f.exists())
	{
		System.out.println("file is present");
	}
	else
	{
		System.out.println("file is not present we arwe creating ");
		f.createNewFile();
		System.out.println("file Created");
	}
		

	}

}
