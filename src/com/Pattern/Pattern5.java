package com.Pattern;

public class Pattern5 {

	public static void main(String[] args) {
		
		/*for(char i='A';i<='D';i++)
		{
			for(char j='A';j<='D';j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}*/
		for(char i='A';i<='D';i++)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		for(char i='A';i<='D';i++)
		{
			for(char j='A';j<='D';j++)
			{
				if(i=='A'||j=='D'||j=='A'||i=='D')
				{
					System.out.print(j);
				}
				else
				{
					System.out.print(" ");
				}
			
			}
			System.out.println();
		}
	}

}
