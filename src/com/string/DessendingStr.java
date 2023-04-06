package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class DessendingStr {
	public static void decLength(String s)
	{
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].length()<str[j].length())
				{
					String temp=str[i];
					str[i]=str[j];
					str[j]=temp;		
				}
				else if(str[i].length()==str[j].length())
				{
					if(str[i].compareTo(str[j])<0)
					{
						String tep=str[i];
						str[i]=str[j];
						str[j]=tep;
					}
				}
			}
		}
		System.out.println(Arrays.toString(str));
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		DessendingStr.decLength(s);

	}

}
