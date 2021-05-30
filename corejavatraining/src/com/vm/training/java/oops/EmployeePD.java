package com.vm.training.java.oops;

public class EmployeePD extends EmployeDetails {
	String nationality;

	/*
	 * public EmployeePD(int empid, String name, String dep, String email, String
	 * address, String nationality) { super(empid, name, dep, email, address);
	 * this.nationality = nationality;
	 */
	

	/*
	 * public String toString() { return empid+name+dep+email+address+nationality; }
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeePD emp3=new EmployeePD();
		System.out.println(emp3);
		
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@Override
	public String toString() {
		return "EmployeePD [nationality=" + nationality + ", email=" + email + ", address=" + address + ", empid="
				+ empid + ", name=" + name + ", dep=" + dep + "]";
	}

	
}
