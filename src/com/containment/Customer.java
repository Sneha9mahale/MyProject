package com.containment;
import java.util.Scanner;
 class Paytm {
	private int id;
	private String name;
	private float balance;
	public Paytm(int id,String Name,float balance)
	{
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	public int getid()
	{
		return id;
	}
	public void setid(int id)
	{
		this.id=id;
	}
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public float getbalance()
	{
		return balance;
	}
	public void setbalance(float balance)
	{
		this.balance=balance;
	}
}
 public class Customer{
	 public static void main(String[] args)
	 {
		 //Paytm p=new Paytm();
		 //p.setid(11);
		 //p.setname("sneha");
		 //float currentBal=p.getbalance();
		 Scanner sc=new Scanner(System.in);
		 int expense=sc.nextInt();
		 //float newbal=currentBal-expense;
		 //p.setbalance(newbal);
	 }
 }

	
