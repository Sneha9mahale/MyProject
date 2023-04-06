package com.containment;

import java.util.Scanner;

public class Ccrud {

	public static void main(String[] args) {
		Course c[]=new Course[10];
		Scanner sc=new Scanner(System.in);
		int count=0;
		int flag=0;
	
		while(true)
		{
			System.out.println("1.ADD Courses");
			System.out.println("2.Update Course");
			System.out.println("3.Delete Course");
			System.out.println("4.Search Course");
			System.out.println("5.View Course");
			System.out.println("6.Exit");
			
			System.out.println("Enter Choice ");
			int choice=sc.nextInt();
			int courseid,fees;
			String teachername,cname;
			int c_id;
			switch(choice)
			{
			case 1:
				System.out.println("Add Courses");
				System.out.println("Enter No of Courses: ");
				int a=sc.nextInt();
				for(int i=0;i<a;i++)
				{
					System.out.println("Enter Course Id");
					courseid=sc.nextInt();
					System.out.println("Enter Name Of Course : ");
					cname=sc.next();
					System.out.println("Enter Teacher Name Of Course : ");
					teachername=sc.next();
					System.out.println("Enter Fees Of Course : ");
					fees =sc.nextInt();
					c[count]=new Course(courseid,cname,teachername,fees);
					count++;	
				}
				System.out.println("Add Course Succesfully ");
				break;
			case 2:
				System.out.println("Update Course");
				System.out.println("Enter Course Id you Want To update");
				c_id=sc.nextInt();
				for(int i=0;i<count;i++)
				{
					if(c[i].getcId()==c_id)
					{
						flag=1;
						System.out.println("Enter Fees you want to update");
						fees=sc.nextInt();
						c[i].setcFees(fees);
					}
				}
					if(flag==0)
					{
						System.out.println("Course is not present");
					}
				
				break;
			case 3:
				System.out.println("Delete Course ");
				System.out.println("Enter Course id you want to Delete Course");
				c_id=sc.nextInt();
				for(int i=0;i<count;i++)
				{
					if(c[i].getcId()==c_id)
					{
						flag=1;
						c[i]=null;
						System.out.println("course delete sucessfully");
					}
				}
				if(flag==0)
				{
					System.out.println("Course is not present");
				}
				break;
				
			case 4:
				System.out.println("Search Course ");
				System.out.println("Enter Course Id for Search Course");
				c_id=sc.nextInt();
				for(int i=0;i<count;i++)
				{
					if(c[i].getcId()==c_id)
					{
						flag=1;
						//b[i].getbPrice();
						System.out.println("Name Of Course :"+c[i].getcName());
						System.out.println("Teacher Nmae   : "+c[i].getteacherName());
						System.out.println("Course Id : "+c[i].getcId());
						System.out.println("Feees  : "+c[i].getcFees());
						
					}
				}
				if(flag==0)
				{
					System.out.println("Course is not present");
				}
				break;
			case 5:
				System.out.println("show Course");
				System.out.println(count);
				for(int i=0;i<count;i++)
				{
					if(c[i]!=null)
					{
					System.out.println(c[i]);
					}
				}
				break;
			case 6:
				System.exit(0);
				break;
			}
		}

	}

}
