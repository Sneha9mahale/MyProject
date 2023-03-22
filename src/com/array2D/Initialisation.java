package com.array2D;
import java.util.Scanner;
public class Initialisation {

	public static void main(String[] args) {
		//int a[][]= {{3,4,6},{6,8,9},{2,5,8}};
		
		int a[][]=new int[3][3];
		/*a[0][0]=1; a[0][1]=5; a[0][2]=9;
		a[1][0]=2; a[1][1]=3; a[1][2]=4;
		a[2][0]=8; a[2][1]=4; a[2][2]=7;*/
		
		System.out.println("Enter array element : ");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
