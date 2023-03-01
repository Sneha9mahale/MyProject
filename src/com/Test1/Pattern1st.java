package com.Test1;

public class Pattern1st {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=4;i++)
		{
			for(j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			for(j=2;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
