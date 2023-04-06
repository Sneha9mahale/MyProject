package com.OOPS;
class ClassB{
	private int value1;
	private String value2;
	public int getValue1()
	{
		return value1;
	}
	public void setValue1(int value1)
	{
		this.value1=value1;
	}
	public String getValue2()
	{
		return value2;
	}
	public void setValue2(String value2)
	{
		this.value2=value2;
	}
}

public class ClassA {

	public static void main(String[] args) {
		ClassB obj=new ClassB();
		obj.setValue1(10);
		obj.setValue2("mcl");
		System.out.println("Value1 = "+obj.getValue1()+"\n Value2 = "+obj.getValue2());

	}

}
