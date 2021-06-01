package com.vm.java.coding.test.jan1;



public class EmployeText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empolye employe=new Empolye();
		employe.setFirstname("mani");
		employe.setLastname(" ");
		
		int a=employe.getFirstname().length();
		
		try {
		if(employe.getFirstname().length()<=3)
		{
			throw new Employelessthan3("the fist name shoud be more 3 lettters");
		}

	}catch(Employelessthan3 e) {
		e.printStackTrace();
	}
		try {
			if(employe.getFirstname().length()==0)
			{
				throw new EmployeNPE("the fist name shoud be not be null");
			}

		}catch(EmployeNPE e) {
			e.printStackTrace();
		}
		
		try {
			if(employe.getLastname().length()<=3)
			{
				throw new Employelessthan3("the last name shoud be more 3 lettters");
			}

		}catch(Employelessthan3 e) {
			e.printStackTrace();
		}
			try {
				if(employe.getLastname().length()==0)
				{
					throw new EmployeNPE("the last name shoud be not be null");
				}

			}catch(EmployeNPE e) {
				e.printStackTrace();
			}
		
		
		

}
	
}
