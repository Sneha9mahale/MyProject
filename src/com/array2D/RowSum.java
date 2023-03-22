package com.array2D;

public class RowSum {
	public static void eachRowSum(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=0;j<a[i].length;j++)
			{
				sum=sum+a[i][j];
				System.out.print(a[i][j]+" ");
			}
			System.out.print("sum "+sum);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][]a= {{2,4,5},{6,7,9},{2,4,7}};
		RowSum.eachRowSum(a);
		

	}

}
