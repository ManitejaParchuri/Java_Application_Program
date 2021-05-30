package com.vm.java.io;


import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("maniteja.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br= new BufferedReader(fr);
		
		String read=br.readLine();
		while(read!=null)
		{
			System.out.println(read);
			read=br.readLine()
;		}
		
	}

}
