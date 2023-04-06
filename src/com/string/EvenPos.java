package com.string;

public class EvenPos {

	public static void main(String[] args) {
		String str="Welcome";
		for(int i=0;i<str.length();i++)
		{
			//String s[]=str.split(" ");
			if(i%2==0)
			{
					System.out.println(str.charAt(i));
			}
			else
			{
				continue;
			}
		}

	}

}