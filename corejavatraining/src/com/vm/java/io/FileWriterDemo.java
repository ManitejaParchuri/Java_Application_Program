package com.vm.java.io;

import java.io.*;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f= new File("maniteja.txt");
		FileWriter fw= new FileWriter(f,true);
		fw.write("\n");
		fw.write("a");
		fw.write("hello");
		fw.flush();
		fw.close();
		System.out.println("data written");
		

	}

}
