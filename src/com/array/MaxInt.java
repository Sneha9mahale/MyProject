package com.array;

public class MaxInt {
	public static void maxi(int nu[])
	{
		int maxt=nu[0];
		for(int i=0;i<nu.length;i++)
		{
			if(maxt<nu[i])
			{
				maxt=nu[i];
			}
		}
		System.out.print(maxt);
		
	}

	public static void main(String[] args) {
		int num[]= {2,5,66,23,45};
		MaxInt.maxi(num);
	}

}
