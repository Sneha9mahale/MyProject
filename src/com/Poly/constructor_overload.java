package com.Poly;

public class constructor_overload {
	int id,he;
	String name;
	constructor_overload(int i,String nm)
	{
		id=i;
		name=nm;
	}
	constructor_overload(int i,String nm,int h)
	{
		id=i;
		name=nm;
		he=h;
	}
	void display()
	{
		System.out.println(id +" "+name+" "+he+" ");
	}
	

	public static void main(String[] args) {
		constructor_overload c=new constructor_overload(11,"sneha");
		constructor_overload c1=new constructor_overload(12,"neha",45);
		c.display();
		c1.display();
		

	}

}
