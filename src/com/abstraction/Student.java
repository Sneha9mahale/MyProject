package com.abstraction;


public  class Student {
	int roll;
	String name;
	Student()
	{}
	Student(int rl,String nm)
	{
		roll=rl;
		name=nm;
	}
	public final void show()
	{
		final int a=45;
		//a=67;
		System.out.println("I am in show method");
	}
	public String toString()
	{
		String str="roll no : "+roll+" Name : "+name;
		return str;
		
	}
}
class College extends Student
{
//	public final void show()
//	{
//		System.out.println("I am in show method");
//	}

//class College extends Student
//{
//	
//}

	public static void main(String[] args) {
		Student stu=new Student(1,"Mr.V");
		System.out.println("Hashcode No  : "+stu.hashCode());
		System.out.println("Hashcode No in hexa : "+stu);

	}
}

	

