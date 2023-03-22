package com.array2D;

public class ColunmSum {
	public static void eachColunmSum(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=0;j<a[i].length;j++)
			{
				sum=sum+a[j][i];
			}
			System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		int[][]a= {{2,4,5},{6,7,9},{2,4,7}};
		ColunmSum.eachColunmSum(a);
		

	}

}
