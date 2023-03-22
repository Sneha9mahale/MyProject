package com.array2nd;

public class VariableArg {
	
	public static void show(int ...a)
	{
		System.out.println("///////////////////");
		for(int my:a)
		{
			System.out.println(my);
		}
	}

	public static void main(String[] args) {
		
		show(12);
		show(45,67,87);
		show(56,78);
		

	}

}
