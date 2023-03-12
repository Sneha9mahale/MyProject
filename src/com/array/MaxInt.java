package com.array;

public class MaxInt {
	public static void maxi(int nu[])
	{
		int mint=nu[0];
		for(int i=0;i<nu.length;i++)
		{
			if(mint<nu[i])
			{
				mint=nu[i];
			}
		}
		System.out.print(mint);
		
	}

	public static void main(String[] args) {
		int num[]= {2,5,66,23,45};
		MaxInt.maxi(num);
	}

}
