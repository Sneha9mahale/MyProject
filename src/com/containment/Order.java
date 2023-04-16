package com.containment;
import java.util.Scanner;
public class Order {
	int id;
	int quantity;
	Menu m;
	Order(int id,int quantity,Menu mn)
	{
		System.out.println("Para const Of Order");
		this.id=id;
		this.quantity=quantity;
		this.m=mn;
	}
	public void showOrderdetails()
	{
		System.out.println("Order id : "+id);
		System.out.println("Order Quantity : "+quantity);
		m.showMenu();
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Order id : ");
		int oid=sc.nextInt();
		System.out.println("Enter Order Quantity : ");
		int qua=sc.nextInt();
		System.out.println("Enter Menu id : ");
		int meid=sc.nextInt();
		System.out.println("Enter Itom : ");
		String it=sc.next();
		System.out.println("Enter Price : ");
		float pp=sc.nextInt();
		
		Menu m1=new Menu(meid,it,pp);
		Order o=new Order(oid,qua,m1);
		o.showOrderdetails();
	}

}
