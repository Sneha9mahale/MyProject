package com.array2D;

public class Transpose {
	static void matrix(int a[][])
	{
		int b[][]=new int[3][3];

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				b[j][j]=a[i][j];
			System.out.println();
			}
		}
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				
			System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		int a[][]= {{1,3,5},{2,4,6},{7,8,9}};
		Transpose.matrix(a);

	}

}
