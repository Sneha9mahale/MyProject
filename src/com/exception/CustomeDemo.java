package com.exception;

class ageValidException extends Exception
{
	public ageValidException()
	{
		System.out.println("Invalid Age");
	}
	public ageValidException(String msg)
	{
		super(msg);
	}
	
}
public class CustomeDemo {
	public static void valid(int age) throws ageValidException
	{
		if(age<18)
		{
			throw new ageValidException("Age must be greater than 18");
		}
		else
		{
			System.out.println("Age is valid");
		}
	}
	

	public static void main(String[] args) {
		try
		{
			valid(1);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
