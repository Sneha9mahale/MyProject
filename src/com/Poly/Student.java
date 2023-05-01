package com.Poly;

public class Student {
	int roll;
	String name;
	Student()
	{}
	Student(int rl,String nm)
	{
		roll=rl;
		name=nm;
	}
	public String toString()
	{
		String str="roll no : "+roll+" Name : "+name;
		return str;
		
	}

	public static void main(String[] args) {
		Student stu=new Student(1,"Mr.V");
		System.out.println("Hashcode No  : "+stu.hashCode());
		System.out.println("Hashcode No in hexa : "+stu);

	}

}
