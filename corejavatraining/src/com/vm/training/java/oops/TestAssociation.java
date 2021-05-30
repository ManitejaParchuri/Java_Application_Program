package com.vm.training.java.oops;

public class TestAssociation {
	  public static void main(String[] args) {
	    showAggregation();
	    showComposition();
	  }
	  
	  static void showAggregation()
	  {
	    Address address=new Address();
	    address.setCity("giddalur");
	    address.setState("AP");
	    address.setCountry("India");
	    
	    Emp emp=new Emp();
	    emp.setId(1001);
	    emp.setFirstname("mani");
	    emp.setLastname("teja");
	    emp.setAddress(address);
	    
	    
	    System.out.println(emp);
	    
	    System.out.println("---------------------------");
	    
	    emp=null;
	    System.out.println(emp);
	    System.out.println(address);
	  }
	  
	  
	 static void showComposition()
	  {
	    Address address=new Address();
	    address.setCity("giddalur");
	    address.setState("AP");
	    address.setCountry("India");
	    
	    Person person=new Person();
	    person.setId(100);
	    person.setName("abc");
	    person.getAddress().setCity("hyd");
	    person.getAddress().setState("telangana");//method chaining
	    person.getAddress().setCountry("India");
	    
	    System.out.println(person);
	    
	    System.out.println("------------------------");
	    
	    person=null;
	    System.out.println(person);
	    if(person!=null)
	      System.out.println(person.getAddress());
	    else
	      System.out.println("No address found");
	    
	  }
	  
	 
}