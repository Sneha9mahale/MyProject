package com.OOPS;
import java.util.Scanner;
public class Cw_student {
	int id,p,c,m,t;
	float percent;
	String name;
	public void accept(String nm,int ide,int m1,int m2,int m3)
	{
		name=nm;
		id=ide;
		p=m1;
		c=m2;
		m=m3;
	}
	public void percentage()
	{
		t=p+c+m;
		percent=t/3;
		
	}
	public void display()
	{
		System.out.println("Name : "+name+ "id :"+id);
		System.out.println("Marks Details");
		System.out.println("Physics Marks : "+p);
		System.out.println("Chemistry Marks :"+c);
		System.out.println("Math Marks :"+m);
		System.out.println("Total :"+t);
		System.out.println("Percentage :"+percent);
		
	}

	public static void main(String[] args) {
		Cw_student stu=new Cw_student();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name :");
		String nm=sc.next();
		System.out.println("Enter id");
		int ide=sc.nextInt();
		System.out.println("Enter Physics Marks");
		int m1=sc.nextInt();
		System.out.println("Enter Chemistry Marks");
		int m2=sc.nextInt();
		System.out.println("Enter Math Marks");
		int m3=sc.nextInt();
		stu.accept(nm,ide,m1,m2,m3);
		stu.percentage();
		stu.display();
		

	}

}
