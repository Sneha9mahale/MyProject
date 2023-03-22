package com.string;

public class ConcatMethod {

	public static void main(String[] args) {
		String str=new String("Hello");
		System.out.println("before concatination : "+str);
		String str1=str.concat(" World");
		System.out.println("after concatination : "+str1);
		System.out.println("String Str1 = "+str1);
		
		String s1="Think";
		String s2="  Quotient";
		String s3=s1+s2;
		System.out.println("String S1 = "+s1);
		System.out.println("String S2 = "+s2);
		System.out.println("String S3 = "+s3);
		

	}

}
