package com.vm.java.multithreading;
class Maniteja extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			
			System.out.println("Maniteja class"+i);
		}
	}
}
class Santosh extends Thread
{
	public void run()
	{
		for(int i=20;i<=30;i++)
		{
			System.out.println("Santosh class"+i);
		}
	}
}
class Shashank extends Thread
{
	public void run()
	{
		for(int i=30;i<=40;i++)
		{
			System.out.println("Shashank class"+i);
		}
	}
}
public class MultitaskingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Maniteja maniteja=new Maniteja();
Santosh santosh=new Santosh();
Shashank shashank =new Shashank();

maniteja.run();
santosh.run();
shashank.run();

}
}
