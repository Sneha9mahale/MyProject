package com.exception;

public class UnCheckPropagate {
	static void m1()
	{
		//try
		//{
			throw new NullPointerException("mynull value is =.....");
		//}
//		catch(NullPointerException e)
//		{
//			System.out.println(e);
//		}
	}
	static void n1()
	{
		m1();
	}
	static void p1()
	{
		try
		{
		n1();
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		p1();
		System.out.println("Hello world");
	}

}
