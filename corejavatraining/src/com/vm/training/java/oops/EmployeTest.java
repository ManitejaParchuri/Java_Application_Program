package com.vm.training.java.oops;

public class EmployeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeDetails emp=new EmployeDetails();
		//object for EmployeDetails class
		System.out.println(emp);//returns null because of toString method in EmployeDetails
		emp.setEmpid(10);
		emp.setName("maniteja");
		emp.setDep("it");
		emp.setEmail("asdc@");
		
		System.out.println(emp.getEmpid());
		System.out.println(emp.getName());
		System.out.println(emp.getDep());
		System.out.println(emp.getEmail());
		//all the hetter and setter method is created in EmployeDetails.java class
		EmployeePD empd=new EmployeePD();
		empd.setNationality("indian");
		System.out.println(empd.getNationality());

	}

}
