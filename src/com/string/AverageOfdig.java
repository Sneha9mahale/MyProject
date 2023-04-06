package com.string;

import java.util.Scanner;

public class AverageOfdig {
	public static void digitAvg(String s)
	{
		float sum=0;
		int count=0;
		float avg;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0'&& s.charAt(i)<='9')
			{
				int x=Character.getNumericValue(s.charAt(i));
				
				sum=sum+x;
				count++;
			}
		}
		System.out.println(sum);
		System.out.println(count);
		avg=sum/count;
		System.out.println(avg);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.nextLine();
		AverageOfdig.digitAvg(s);
	}

}
