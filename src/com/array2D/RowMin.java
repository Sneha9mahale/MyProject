package com.array2D;

public class RowMin {
	public static void eachRowMin(int a[][])
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
		int min=a[i][0];
		for(int j=0;j<a[i].length;j++)
		{
			
			if(a[i][j]<min)
			{
				min=a[i][j];
			}
		}
		System.out.print(min+" ");
	}
	}

	public static void main(String[] args) {
		int a[][]= {{3,5,7},{7,9,8},{1,2,4}};
		RowMin.eachRowMin(a);
		

	}

}
