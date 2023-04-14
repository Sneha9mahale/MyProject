package com.Poly;

public class Bus {
	public int member;
	public String name;
	public void booking(int member,String name)
	{
		 this.member=member;
		 this.name=name;
		System.out.println("Bus booking name : "+name);
		System.out.println("Bus booking member no : "+member);
	}
}
class Train{
	public int member;
	public String name;
	public void booking(int member,String name)
	{
		this.member=member;
		 this.name=name;
		System.out.println("Train booking name : "+name);
		System.out.println("Train booking member no : "+member);
	}
}
class Aeroplane
{
	public int member;
	public String name;
	public void booking(int member,String name)
	{
		this.member=member;
		 this.name=name;
		System.out.println("Aeroplane booking name : "+name);
		System.out.println("Aeroplane booking member no : "+member);
	}
	
}	

	




