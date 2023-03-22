package com.string;

public class Creation {

	public static void main(String[] args) {
		String s1="hello";
		String s2="hello";
		String s3=new String("hello");
		String s4=new String("hello");
		System.out.println(s1+" "+s2);
		System.out.println(s1.hashCode()+" "+s2.hashCode());
		System.out.println(s3.hashCode()+" "+s4.hashCode());
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		
		String st="Aa";
		String st1="BB";
		System.out.println(st==st1);
		System.out.println(st.hashCode()+" "+st1.hashCode());
		s1=s1+" world ";
		System.out.println(s1+" "+s2);
		System.out.println(s1.hashCode()+" "+s2.hashCode());
		System.out.println(s1==s2);
		

	}

}
