package com.array2D;

public class ColumnMin {
	public static void eachColumnMin(int a[][])
	{
		for(int x[]: a)
		{
			for(int value:x)
			{
				System.out.println(value+" ");
			}
			System.out.println();
		}
		System.out.println(".......Min....");
		
		for(int i=0;i<a.length;i++)
		{
			int min=a[0][i];
			for(int j=0;j<a[i].length;j++)
			{
				if(a[j][i]<min)
				{
					min=a[j][i];
				}
			}
			System.out.print(min+" ");
		}
	}

	public static void main(String[] args) {
		int a[][]= {{3,5,7},{7,9,8},{1,11,4}};
		ColumnMin.eachColumnMin(a);

	}

}
