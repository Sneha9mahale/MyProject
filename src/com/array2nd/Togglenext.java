package com.array2nd;

import java.util.Arrays;

public class Togglenext {

	public static void main(String[] args) {
		char []ch={'e','a','t','S','R'};
		System.out.println(Arrays.toString(ch));
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a'&&ch[i]<='z')
			{
				ch[i]=(char)(ch[i]+2);
			}
			else if(ch[i]>='A'&&ch[i]<='Z')
			{
				ch[i]=(char)(ch[i]+2);
			}
		}
		System.out.println(Arrays.toString(ch));


	}

}
