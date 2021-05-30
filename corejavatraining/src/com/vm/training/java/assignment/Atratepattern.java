package com.vm.training.java.assignment;

public class Atratepattern {

	
		public static void main(String[] args) {
			int number=Integer.parseInt(args[0]);
			int firstNumber=1,nextNumber,lasttNumber;
			for(lasttNumber=firstNumber;lasttNumber<=number;lasttNumber++)
			{
				for(nextNumber=1;nextNumber<=lasttNumber;nextNumber++)
					System.out.print("@");
				System.out.println("");
			}
		}
	


	}


