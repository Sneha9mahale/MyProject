package Inheritance;
import java.util.Scanner;
class University
{
	String course;
	String uname;
	public void UniDetails(String course,String uname)
	{
		this.course=course;
		this.uname=uname;
	}
	public void showUniDetails()
	{
		System.out.println("University Details");
		System.out.println("University Course Name : "+course);
		System.out.println("University Name : "+uname);
	}
}
//Single Inheritance
class College extends University
{
	int regNo;
	String clgName;
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public String getClgName() {
		return clgName;
	}
	public void setClgName(String clgName) {
		this.clgName = clgName;
	}
	public void showClgDetails()
	{
		showUniDetails();
		System.out.println("College Regis No : "+regNo);
		System.out.println("College Name : "+clgName);
	}
}
//Multilevel
class Student extends College
{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void showStuDetails()
	{
		showClgDetails();
		System.out.println("Student Name : "+name);
	}
}
public class UniClass {

	public static void main(String[] args) {
		//College c=new College();
//		c.UniDetails("B.tech", "NMU");
//		c.setClgName("GCOEJ");
//		c.setRegNo(11);
//		c.showClgDetails();
		//or
		Student s=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("University Details");
		System.out.println("Enter University Course Name : ");
		String crs=sc.next();
		System.out.println("University Name : ");
		String unm=sc.next();
		System.out.println("College Regis No : ");
		int no=sc.nextInt();
		System.out.println("College Name : ");
		String cnm=sc.next();
		System.out.println("Student Name : ");
		String nm=sc.next();
		s.UniDetails(crs, unm);
		s.setClgName(cnm);
		s.setRegNo(no);
		s.setName(nm);
		//s.showClgDetails();
		s.showStuDetails();
	}

}
