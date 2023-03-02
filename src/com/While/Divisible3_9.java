package com.While;

public class Divisible3_9 {

	public static void main(String[] args) {
		int i=1;
		while(i<20)
		{
			if(i%3==0&&i%9==0)
			{
				break;
			}
			//i++;
			System.out.println(i);
			i++;
		}

	}

}
