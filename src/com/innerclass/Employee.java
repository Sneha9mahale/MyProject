package com.innerclass;
public class Employee {
	  int id=1;
	 String nm="sneha";
	 void show()
	 {
		 System.out.println("Employee id"+id+"Employee name"+nm);
	 }
	 
	 class Department{
		 int did=11;
		 String dname="Electrical";
		 void depart()
		 {
			 System.out.println("Deparment id "+did+" DEpartment name"+dname);
		 }
		 class Department1{
			
		}
	}
	

	public static void main(String[] args) {
			Employee e=new Employee();
			Employee.Department d=e.new Department();
			d.depart();
			e.show();
	}

}

