package com.OOPS;
//Inisiation through method
class Method{
	int id;
	String name;
	void input(int i,String nm)
	{
		id=i;
		name=nm;
	}
	void display()
	{
		System.out.println("id="+id+" name = "+name);
	}
}
public class Initialization {

	public static void main(String[] args) {
		Method m=new Method();
		m.input(11,"sneha");
		m.display();
		m.input(12,"neha");
		m.display();
		
		

	}

}
