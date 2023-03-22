package com.array2nd;
import java.util.Scanner;
import java.util.Arrays;
class Student
{
	int id;
	String name;
	String city;
	Student(int id,String name,String city)
	{
		this.id=id;
		this.name=name;
		this.city=city;
	}
	public String toString()
	{
		return id+" "+name+" "+city;
	}
}

public class Course {
	int cid;
	int fee;
	String cname;
	Student s;
	
	Course(int cid,String cname,int fee,Student s)
	{
		this.cid=cid;
		this.fee=fee;
		this.cname=cname;
		this.s=s;
	}
	public String toString()
	{
		return cid+" "+fee+" "+cname+" "+s;
	}

	public static void main(String[] args) {
		Course st[]=new Course[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<st.length;i++)
		{
			System.out.println("Enter course id :");
			int cid=sc.nextInt();
			System.out.println("Enter course fee :");
			int fee=sc.nextInt();
			System.out.println("Enter course name :");
			String cname=sc.next();
			System.out.println("Enter Data For Student : ");
			System.out.println("Enter student id :");
			int id=sc.nextInt();
			System.out.println("Enter student name :");
			String name=sc.next();
			System.out.println("Enter student city name :");
			String city=sc.next();
			
			st[i]=new Course(cid,cname,fee,new Student(id,name,city));
		}
		for(int i=0;i<st.length;i++)
		{
			System.out.println(st[i]);
		}

	}

}
