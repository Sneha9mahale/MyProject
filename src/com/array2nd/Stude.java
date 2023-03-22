package com.array2nd;
import java.util.Scanner;
import java .util.Arrays;
public class Stude {
	int id;
	String name;
	int marks[];
	
	//int sum=0;
	Stude(int id,String name,int marks[])
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	public String toString()
	{
		return id+" "+name+" "+Arrays.toString(marks);
	}

	public static void main(String[] args) {
		
		Stude s[]=new Stude[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<s.length;i++)
		{
	
			System.out.println("Enter id:");
			int id=sc.nextInt();
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("Enter the marks :");
			int m[]=new int[3];
			for(int j=0;j<s.length;j++)
			{
				m[j]=sc.nextInt();
			}
			 
			s[i]=new Stude(id,name,m);
				
		
		}
		
		
		for(Stude stu: s)
		{
			int mk[]=stu.marks;
			int sum=0;
			for(int i=0;i<mk.length;i++)
			{
				sum=sum+mk[i];
			}
			int per=sum/mk.length;
			System.out.println(per);
			if(per>60)
			{
				System.out.println(stu+" per = "+per);
			}
		}
	}
}
			
		
		
	


