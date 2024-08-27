package com.gentech.oopstest;

//Ques1
class Employee
{
	String EmpName;
	int EmpId;
	Employee(String ename,int id)
	{
		EmpName=ename;
		EmpId=id;
	}
	void display()
	{
		System.out.println("Employee Name is: "+EmpName);
		System.out.println("Employee Id is: "+EmpId);
	}
}
class JobName extends Employee
{
	String Jobname;
	JobName(String ename,int id,String jname)
	{
		super(ename,id);
		Jobname=jname;
	}
	void display()
	{
		super.display();
		System.out.println("Job Name is: "+Jobname);
	}
}
class Salary extends JobName
{
	int salary;
	Salary(String ename,int id,String jname,int sal)
	{
		super(ename,id,jname);
		salary=sal;
	}
	void display()
	{
		super.display();
		System.out.println("Salary is: "+salary);
	}
}
public class Test3 {

	public static void main(String[] args) {
		Salary s1=new Salary("Poornima",3,"Analyst",45000);
		s1.display();

	}
}
