package com.exception;

public class HandleMultiCatch {

	public static void main(String[] args) {
		try
		{
			int x[]= {2,4,6};
			int y=x[6]/0;
			System.out.println(y);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
			System.out.println("helloo");
		}
//		
		
//		catch(IndexOutOfBoundsException e)
//		{
//			e.printStackTrace();
//			System.out.println("helloo");
//		}
//		System.out.println("helloo");
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("helloo");
		}
//		catch(ArithmeticException e)
//		{
//			e.printStackTrace();
//		}
//		catch(NullPointerException e)
//		{
//			e.printStackTrace();
//			System.out.println("helloo");
//		}
		
		
	}

}
