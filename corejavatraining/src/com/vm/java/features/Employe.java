package com.vm.java.features;

public class Employe {
	
	
	private int id;
	private String name;
	private String dep;
	private int age;
	private int salary;
	public Employe(int id, String name, String dep, int age, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.dep = dep;
		this.age = age;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", dep=" + dep + ", age=" + age + ", salary=" + salary + "]";
	}
	

}
