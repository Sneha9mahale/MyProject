package com.Pattern;

public class Task_letter {

	public static void main(String[] args) {
		//task1
		for(char ch='D';ch>=1;ch--)
		{
			for(char c='A';c<=ch;c++)
			{
				System.out.print(c);
			}
			System.out.println();
		}
		//task3
		for(char ch='A';ch<='D';ch++)
		{
		for(char c='D';c>=ch;c--)
		{
			System.out.print(c);
		}
		System.out.println();
		}

	}

}
