package com.array;
import java.util.Scanner;
import java.util.Arrays;
public class Student {
	int id;
	String name;
	double per;
	Student(int id,String name,double per)
	{
		this.id=id;
		this.name=name;
		this.per=per;
	}
	
	@Override
	public String toString()
	{
		return id+" "+name+" "+per;
	}
	public static void main(String[] args) {
		Student s[]=new Student[3];
		/*s[0]=new Student(1,"SNEHA",68);
		s[1]=new Student(2,"SNEHAL",87);
		s[2]=new Student(3,"NEHA",99);*/
		
		//3rd method using Scanner
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<s.length;i++)
		{
			System.out.println("Enter id:");
			int sid=sc.nextInt();
			System.out.println("Enter name :");
			String sname=sc.next();
			System.out.println("Enter percentage :");
			double sper=sc.nextDouble();
			s[i]=new Student( sid, sname, sper);
		}
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		System.out.println(Arrays.toString(s));		
		//1st method
		System.out.println(s[0].id+" "+s[0].name+" "+s[0].per);
		//2nd method
		for(Student stu : s)
		{
			System.out.println(stu.id+" "+stu.name+" "+stu.per);
		}
		

	}

}
