package com.Loops;

public class NUmber_Of_Oddnum {

	public static void main(String[] args) {
		int i;
		int count=0;
		for(i=1;i<=10;i++)
		{
			if(i%2!=0)
			{
				count=count+1;
			}
		}
		System.out.println(count);
	}

}
