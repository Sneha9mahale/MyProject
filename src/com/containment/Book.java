package com.containment;

public class Book {
	private int bId;
	private String bName;
	private String authorName;
	private int bPrice;
	
	public Book(int bId,String bName,String authorName,int bPrice)
	{
		this.bId=bId;
		this.authorName=authorName;
		this.bName=bName;
		this.bPrice=bPrice;
	}
	public int getbId()
	{
		return bId;
	}
	public void setbId(int bId)
	{
		this.bId=bId;
	}
	public String getbName()
	{
		return bName;
	}
	public void setbName(String bName)
	{
		this.bName=bName;
	}
	public int getbPrice()
	{
		return bPrice;
	}
	public void setbPrice(int bPrice)
	{
		this.bPrice=bPrice;
	}
	public String getauthorName()
	{
		return authorName;
	}
	public void setauthorName(String auhorName)
	{
		this.authorName=authorName;
	}
	@Override
	public String toString()
	{
		return bId+" +bId+  "+bName+" +bName+ "+authorName+" +authorName + "+bPrice +" +bPrice+ ";
	}

}
