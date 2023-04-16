package Inheritance;

class Employee1{
	int id;
	String empnm;
	float sal;
	//Employee1(int id,String empnm,float sal)
	public void getDetails(int id,String empnm,float sal)
	{
		System.out.println("Para Cons Of Parent ");
		this.id=id;
		this.empnm=empnm;
		this.sal=sal;
	}
	public void showDetails()
	{
		System.out.println("Employee id : "+id);
		System.out.println("Employee Name : "+empnm);
		System.out.println("Employee Salary : "+sal);
	}
	public String toString()
	{
		String str= "emp id : "+id;
		return str;
	}
}
//Single Inheritance
class Manager extends Employee1
{
	float irate;
//	Manager(float ir)
//	{
//		super(11,"Mr.X",1200f);
//		System.out.println("Para const Of child");
//		irate=ir;
//	}
	
	public float getIrate() {
		return irate;
	}

	public void setIrate(float irate) {
		this.irate = irate;
	}

	public void showManagerDetails()
	{
		showDetails();
		System.out.println("Rate : "+irate);
	}
}
//Multilevel Inheritance
//class SalesManager extends Manager
//{
//	float target;
//
//	public float getTarget() {
//		return target;
//	}
//
//	public void setTarget(float target) {
//		this.target = target;
//	}
//	
//	public void showsalesManagerDetails()
//	{
//		showManagerDetails();
//		System.out.println(" Target Of Employee : "+target);
//	}
//}

//public class Employee{
//	public static void main(String[] args) {
//		SalesManager s=new SalesManager();
//		s.getDetails(1, "Mr.Y", 30000.0f);
//		s.setIrate(5.6f);
//		s.setTarget(23000.0f);
//		s.showsalesManagerDetails();
		/*Manager m=new Manager();
		m.getDetails(1,"Mr.X", 23456.7f);
		m.setIrate(4.5f);
		m.showManagerDetails();*///for single inheritance
		//Constructor;
		//Manager m=new Manager(2.4f);
		//m.showManagerDetails;
//}
//}
//


	
