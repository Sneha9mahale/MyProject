package com.Poly;

public class WebApplication {
	public String userName;
	public String password;
	public static int counter=0;
	WebApplication()
	{
		counter++;
	}
	WebApplication(String un,String pass)
	{
		userName=un;
		password=pass;
		System.out.println("User Name : "+userName);
		System.out.println("Password : "+password);
		counter++;
	}
	public static void display()
	{
		System.out.println("Counter : "+counter);
	}

	public static void main(String[] args) {
		WebApplication we=new WebApplication();
		WebApplication w=new WebApplication("Sneha","smdp");
		w.display();
	}

}
