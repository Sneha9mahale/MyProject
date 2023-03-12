package com.Pattern;

public class Task2 {

	public static void main(String[] args) {
			for(int i=1;i<=4;i++)
			{
				for(int j=1;j<=i;j++)
				{
					if(i%2==0)
					{
						char ch='a';
						for(char c='A';c<=i;c++)
						{
							for(char h='A';h<=c;h++)
							{
								System.out.print(c);
							}
						}
					}
					if(i%2==0)
						continue;
					System.out.print(j);
				}
			
				System.out.println();
		}

	}

}
