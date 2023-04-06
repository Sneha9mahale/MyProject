package com.OOPS;

public class Bank {
	private int acno;
	private String name;
	private float balance;
	public int getAcno()
	{
		return acno;
	}
	public String getName()
	{
		return name;
	}
	public float getBalance()
	{
		return balance;
	}
	public void setAcno(int no)
	{
		acno=no;
	}
	public void setName(String nam)
	{
		name=nam;
	}
	public void setBalance(float balance)
	{
		this.balance=balance;
	}
	public void acceptDetails(int ano,String nm,float bal)
	{
		acno=ano;
		name=nm;
		balance=bal;
	}

	public static void main(String[] args) {
		
	}

}
