package com.array2D;

public class RowMax {
	public static void eachRowMax(int a[][])
	{
	for(int x[]: a)
	{
		for(int value:x)
		{
			System.out.println(value+" ");
		}
		System.out.println();
	}
	System.out.println(".......Max....");
	
	for(int i=0;i<a.length;i++)
	{
		int max=a[i][0];
		for(int j=0;j<a[i].length;j++)
		{
			
			if(a[i][j]>max)
			{
				max=a[i][j];
			}
		}
		System.out.print(max+" ");
	}
}

	public static void main(String[] args) {
		int a[][]= {{3,5,7},{7,9,8},{1,2,4}};
		RowMax.eachRowMax(a);
		

	}

}
