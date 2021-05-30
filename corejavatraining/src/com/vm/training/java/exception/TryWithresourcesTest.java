package com.vm.training.java.exception;
import java.io.*;
public class TryWithresourcesTest {

	public static void main(String[] args) {
		try(FileOutputStream fos =new FileOutputStream(new File("D:/mani.txt"))){
			String s="value momentum";
			byte[] by=s.getBytes();
			fos.write(by);
			System.out.println("succes");
			
			
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}catch(IOException e1)
		{
			e1.printStackTrace();
		}
				
		// TODO Auto-generated method stub

	}

}
