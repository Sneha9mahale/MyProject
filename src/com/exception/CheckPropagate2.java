package com.exception;

import java.io.*;

public class CheckPropagate2 {
	static void m1() throws IOException,Exception
	{
		throw new Exception("Device error");
		
	}
	static void n1() throws IOException,Exception
	{
		m1();
	}
	static void p1() throws IOException,Exception
	{
		n1();
	}
	public static void main(String[] args) {
		try
		{
			p1();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
