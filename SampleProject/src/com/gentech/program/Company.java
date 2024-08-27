package com.gentech.program;

class Employee
{
	String Empname;
	int Age;
}
class Department
{
	String Depname;
	int Depid;
}
class Insurance
{
	String InsName;
	int Insid;
}


public class Company {

	public static void main(String[] args) {
		Employee emp = new Employee(); 
		emp.Empname = "Thanisha";
		emp.Age=21;
		System.out.println("Ename:  "+emp.Empname);
		System.out.println("Age:  "+ emp.Age);
		System.out.println("+++++++++");

		Department dept = new Department();
		dept.Depname="Manager";
		dept.Depid=2;
		System.out.println("Depname: "+dept.Depname);
		System.out.println("Depid:  "+ dept.Depid);
		System.out.println("+++++++++");

		Insurance ins = new Insurance();
		ins.InsName= "yearly"; 
		ins.Insid= 10;
		System.out.println("InsName: "+ins.InsName);
		System.out.println("Insid:  "+ins.Insid);
	}
}
