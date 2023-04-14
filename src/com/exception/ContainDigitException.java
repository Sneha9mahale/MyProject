package com.exception;

class stringContainDigit extends Exception
{
	public stringContainDigit(String msg)
	{
		super(msg);
	}
}
public class ContainDigitException {

	public static void main(String[] args) {
		String str="java34";
		try {
			boolean containDigit=false;
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c>='0'&&c<=9)
			{
				containDigit=true;
				throw new stringContainDigit("String contaion digit");
			}
		}
		if(!containDigit)
		{
				System.out.print("not");
		}
		}
		
		catch(stringContainDigit e)
		{
			System.out.println(e);
		}

}
}
