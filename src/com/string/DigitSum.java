package com.string;
import java.util.Scanner;
public class DigitSum {
	public static void findSum(String s)
	{
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0'&& s.charAt(i)<='9')
			{
				int x=Character.getNumericValue(s.charAt(i));
				
				sum=sum+x;
			}
		}
		System.out.println(sum);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.nextLine();
		DigitSum.findSum(s);
	}

}
