package com.vm.java.coding.test.jan1;



	public class  EmployeNPE extends Exception {
		  
		String message;
		EmployeNPE(String message)
		{
			this.message=message;
		}
		
		public String toString() {
			return message;
		}
	}


