package com.array2D;

public class ColumnMax {
	public static void eachColumnMax(int a[][])
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
			int max=a[0][i];
			for(int j=0;j<a[i].length;j++)
			{
				if(a[j][i]>max)
				{
					max=a[j][i];
				}
			}
			System.out.print(max+" ");
		}
	}
	

	public static void main(String[] args) {
		int a[][]= {{3,5,7},{7,9,8},{1,2,4}};
		ColumnMax.eachColumnMax(a);
		

	}

}
