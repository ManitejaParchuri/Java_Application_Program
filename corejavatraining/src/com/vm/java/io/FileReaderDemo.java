package com.vm.java.io;

import java.io.*;
public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("maniteja.txt");
		FileReader fr= new FileReader(f);
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());//char will typechast
		
		
		
		int readchar=fr.read();
		while(readchar!=-1)
		{
			try {
				Thread.sleep(5000);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println((char)readchar);
			readchar=fr.read();//to read next char
		}
		
		
		

	}

}
