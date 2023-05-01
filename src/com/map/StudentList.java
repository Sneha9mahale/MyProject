package com.map;
import java.util.Scanner;
import java.util.*;
class Student
{
	int id;
	String name;
	public Student(int id,String name)
	{
		super();
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "id="+id+" name = "+name;
	}
	
}

public class StudentList {

	public static void main(String[] args) {
		HashMap<Integer,ArrayList<Student>>hm=new HashMap();
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=3;i++)
		{
			System.out.println("Enter the Marks as key");
			int mark=sc.nextInt();
			ArrayList<Student>al=new ArrayList();
			System.out.println("Enter the No OF Student");
			int n=sc.nextInt();
			for(int j=1;j<=n;j++)
			{
				System.out.println("Enter id : ");
				int id=sc.nextInt();
				System.out.println("Enter name : ");
				String name=sc.next();
				al.add(new Student(id,name));
				
			}
			hm.put(mark, al);
			
		}
		for(Map.Entry<Integer,ArrayList<Student>>s:hm.entrySet())
		{
			System.out.println(s.getKey()+" "+s.getValue());
			
		}
			System.out.println("Greater than 60 Marks");
		for(Map.Entry<Integer,ArrayList<Student>>s:hm.entrySet())
		{
			
			if(s.getKey()>60)
			{
				System.out.println(s.getKey()+" "+s.getValue());
			}
		}
		

	}

}
