package com.exception;

public class ThrowDemo {
	public static void check(int n)
	{
		try
		{
			if(n<18)
			{
				throw new ArithmeticException("Invalid Number");
			}
			else
			{
				System.out.println("Your age is right");
			}
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ThrowDemo.check(20);

	}

}
