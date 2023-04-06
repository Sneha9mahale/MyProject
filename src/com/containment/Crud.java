package com.containment;
import java.util.Scanner;
public class Crud {
	public static void main(String[] args) {
		Book b[]=new Book[10];
		Scanner sc=new Scanner(System.in);
		int count=0;
		int flag=0;
	
		while(true)
		{
			System.out.println("1.ADD BOOK");
			System.out.println("2.Update Book");
			System.out.println("3.Delete Book");
			System.out.println("4.Search Book");
			System.out.println("5.View Book");
			System.out.println("6.Exit");
			
			System.out.println("Enter Choice ");
			int choice=sc.nextInt();
			int bookid,price;
			String authorname,bname;
			int b_id;
			switch(choice)
			{
			case 1:
				System.out.println("Add Book");
				System.out.println("Enter No of Books : ");
				int a=sc.nextInt();
				for(int i=0;i<a;i++)
				{
					System.out.println("Enter Book Id");
					bookid=sc.nextInt();
					System.out.println("Enter Name Of Book : ");
					bname=sc.next();
					System.out.println("Enter Author Name Of Book : ");
					authorname=sc.next();
					System.out.println("Enter Price Of Book : ");
					price =sc.nextInt();
					b[count]=new Book(bookid,bname,authorname,price);
					count++;	
				}
				System.out.println("Add Book Succesfully ");
				break;
			case 2:
				System.out.println("Update Book");
				System.out.println("Enter Book Id you Want To update");
				b_id=sc.nextInt();
				for(int i=0;i<count;i++)
				{
					if(b[i].getbId()==b_id)
					{
						flag=1;
						System.out.println("Enter Price you want to update");
						price=sc.nextInt();
						b[i].setbPrice(price);
					}
				}
					if(flag==0)
					{
						System.out.println("book is not present");
					}
				
					break;
				
			case 3:
				System.out.println("Delete Book ");
				System.out.println("Enter Book id you want to Delete Book");
				b_id=sc.nextInt();
				for(int i=0;i<count;i++)
				{
					if(b[i].getbId()==b_id)
					{
						flag=1;
						b[i]=null;
						System.out.println("book delete sucessfully");
					}
				}
				if(flag==0)
				{
					System.out.println("book is not present");
				}
				break;
				
			case 4:
				System.out.println("Search Book ");
				System.out.println("Enter Book Id for Search Book");
				b_id=sc.nextInt();
				for(int i=0;i<count;i++)
				{
					if(b[i].getbId()==b_id)
					{
						flag=1;
						//b[i].getbPrice();
						System.out.println("Name Of Book :"+b[i].getbName());
						System.out.println("Author Nmae   : "+b[i].getauthorName());
						System.out.println("Book Id : "+b[i].getbId());
						System.out.println("Price  : "+b[i].getbPrice());
						
					}
				}
				if(flag==0)
				{
					System.out.println("book is not present");
				}
				break;
			case 5:
				System.out.println("show books");
				System.out.println(count);
				for(int i=0;i<count;i++)
				{
					if(b[i]!=null)
					{
					System.out.println(b[i]);
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
