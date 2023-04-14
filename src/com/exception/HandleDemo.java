package com.exception;

public class HandleDemo {

	public static void main(String[] args) {
		System.out.println("Hellooooooo");
		try
		{
			int x=10;
			int ans=x/0;
			System.out.println(ans);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		System.out.println("welcome");
	}

}
