package com.vm.training.java.oops;

public class Employe {
int empid;
String name;
String dep;

/*Employe(){}
public Employe(int empid, String name, String dep) {
	super();
	this.empid = empid;
	this.name = name;
	this.dep = dep;
}*/

/*//with out show method we can use toString();
 * public String toString() { return empid+" "+name+" "+dep; }
 */


/*
 * void show() { System.out.println(empid); System.out.println(name);
 * System.out.println(dep); } }
 */
 public static void main(String[] args)
 {
	 Employe emp =new Employe();
	
	// Employe emp1=new Employe();
	// System.out.println(emp);
	 //System.out.println(emp1);
	 
	 
 }

public int getEmpid() {
	return empid;
}

public void setEmpid(int empid) {
	this.empid = empid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDep() {
	return dep;
}

public void setDep(String dep) {
	this.dep = dep;
}
}