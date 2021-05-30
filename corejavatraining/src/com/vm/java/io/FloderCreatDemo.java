package com.vm.java.io;

import java.io.*;

public class FloderCreatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("movies");
		System.out.println(f.exists());
		f.mkdir();
		System.out.println(f.exists());
		

	}

}
