package com.string;

import java.util.Scanner;

public class WordOccurance {
	public void findOccurance(String s)
	{
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			int count=1;
			boolean isvisited=false;
			for(int k=i-1;k>=0;k--)
			{
				if(str[i].equalsIgnoreCase(str[k]))
				{
				isvisited=true;
				break;
				}
			}
		if(isvisited==false)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].equalsIgnoreCase(str[j]))
				{
				count++;
				}
			}
			System.out.println(str[i]+" "+count);
		}
	}
}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		WordOccurance w=new WordOccurance();
		w.findOccurance(s);

	}

}
