package com.vm.training.java.oops;

public class Customer {


		// TODO Auto-generated method stub
		protected int id;
		private String firstname;
		private String lastname;
		private String account;//they are called member variable or instance variable
		

	public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getFirstname() {
			return firstname;
		}


		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}


		public String getLastname() {
			return lastname;
		}


		public void setLastname(String lastname) {
			this.lastname = lastname;
		}


		public String getAccount() {
			return account;
		}


		public void setAccount(String account) {
			this.account = account;
		}


	public Customer() {
		super();
		System.out.println("default");
	}



	  
		
		/*Customer(int x,String fname,String lname)
		{
			id=x;
			firstname=fname;
			lastname=lname;
		}
		
*/
	/*void display()
	{
	show();
	}
	 private void show()
	{
		System.out.println(id);
		System.out.println(firstname);           
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(s);
		System.out.println(t);
		System.out.println(l);
		*/
		
	}


