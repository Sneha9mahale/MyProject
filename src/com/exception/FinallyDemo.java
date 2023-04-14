package com.exception;

public class FinallyDemo {

	public static void main(String[] args) {
		try
		{
			System.out.println("Hiiiiii");
			int x=10;
			int y=10/0;
			System.out.println(y);
		}
		catch(ArithmeticException e)
		{
			//System.out.println(e);
			e.printStackTrace();
		}
		finally
		{
			System.out.println("world");
		}
		System.out.println("out of block.....");

	}

}
