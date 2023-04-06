package com.containment;
import java.util.Arrays;
public class Course {
	private int cId;
	private String cName;
	private String teacherName;
	private int cFees;
	public Course(int cId,String cName,String teacherName,int cFees)
	{
		this.cId=cId;
		this.teacherName=teacherName;
		this.cName=cName;
		this.cFees=cFees;
	}
	public int getcId()
	{
		return cId;
	}
	public void setcId(int cId)
	{
		this.cId=cId;
	}
	public String getcName()
	{
		return cName;
	}
	public void setcName(String cName)
	{
		this.cName=cName;
	}
	public int getcFees()
	{
		return cFees;
	}
	public void setcFees(int cFees)
	{
		this.cFees=cFees;
	}
	public String getteacherName()
	{
		return teacherName;
	}
	public void setteacherName(String teacherName)
	{
		this.teacherName=teacherName;
	}
	@Override
	public String toString()
	{
		return cId+"  cId : "+ cName +" cName : "+ teacherName +" teacherName : "+ cFees +" cFees : ";
	}

}

	


