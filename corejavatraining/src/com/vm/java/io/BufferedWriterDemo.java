package com.vm.java.io;

import java.util.*;
import java.io.*;
public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		File f=new File("maniteja.txt");
FileWriter fw= new FileWriter(f,true);
BufferedWriter bw=new BufferedWriter(fw);
if(f.exists())
{
	
}
else
{
	bw.write("ID\t\tName\t\tAge");
}

System.out.print("Number of persons: ");
int n =sc.nextInt();
while(n-->0)
{
	System.out.print("Enter ID:");
	String id = sc.next();
	System.out.print("Enter Name:");
	String name =sc.next();
	System.out.print("Enter Age:");
	String age=sc.next();
	bw.newLine();
	bw.write(id+"\t\t"+name+"\t\t"+age);
}







bw.flush();
bw.close();
	}

}
