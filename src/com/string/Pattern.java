package com.string;

import java.util.Scanner;

public class Pattern {
		public static void addword(String s)
		{
			String str[]=s.split(" ");
			String increment="";
			for(int i=0;i<str.length;i++)
			{
				increment=increment+str[i]+" ";
				System.out.println(increment);
			}
			
		}
		
		

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter String");
			String s=sc.nextLine();
			Pattern.addword(s);
		}

	}


