package com.Loops;

class Continue_demo {

	public static void main(String[] args) {
		int i=0;
		while(i<=10)
		{
			i++;
			if(i==6)
			{
				continue;
			}
			System.out.println(i);
			//i++;
		}

	}

}
