package com.array;

public class MinInt {
	public static void mini(int nu[])
	{
		int mint=nu[0];
		for(int i=0;i>nu.length;i++)
		{
			if(mint>nu[i])
			{
				mint=nu[i];
			}
		}
		System.out.print(mint);
		
	}

	public static void main(String[] args) {
		int num[]= {2,5,66,23,45};
		MinInt.mini(num);
	
		// TODO Auto-generated method stub

	}

}
