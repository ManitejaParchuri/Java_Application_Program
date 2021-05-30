package com.vm.training.java.assignment;

import java.util.Scanner;



public class SumofPositiveNumberOnly {

	public static void main(String[] args) {
		int limit, num, positivesum = 0;  
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		  
	  System.out.println("Enter the limit");
	   limit=sc.nextInt();
	  
	  
	  
	    while(limit>0)  
	    {  
	    	num=sc.nextInt(); 
	  
	        if(num > 0)  
	        {  
	           positivesum=positivesum+num;
	        }  
	        
	  
	        limit--;  
	      
	  
	   
	    
	
	}  
	    System.out.println("Positive Numbers:"+ positivesum);  
		

	}

}
