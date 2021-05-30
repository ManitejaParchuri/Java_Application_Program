package com.vm.java.io;

import java.io.*;
public class BufferReaderDemo2 {
	public static void main(String[] args) throws IOException {
		File f1= new File("maniteja.txt");
		File f2= new File("maniteja2.txt");
		
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		String str = br.readLine();
		String str2 = "";
		while(str!=null)
		{
			str2=str2+str;
			str=br.readLine();
		}
		FileWriter fw= new FileWriter(f2,true);
	
		
		BufferedWriter bw = new BufferedWriter(fw);

		
		bw.write(str2);
		StringBuffer sb= new StringBuffer(str2);		sb.reverse().toString();
		bw.write(sb.reverse().toString());
	
		
		
//		for(int i=str2.length()-1;i>=0;i--)
//			bw.write(str2.charAt(i));
		bw.flush();
		bw.close();
	}
}