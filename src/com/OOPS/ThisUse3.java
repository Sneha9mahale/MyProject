package com.OOPS;
public class ThisUse3 {

	 ThisUse3()
	{
		this(56);
		System.out.println("Hello.....");	
	}
	ThisUse3(int x)
	{
		//this();
		System.out.println("x = "+x);
	}

	
	public static void main(String[] args) {
		ThisUse3 t=new ThisUse3();
	}

}
