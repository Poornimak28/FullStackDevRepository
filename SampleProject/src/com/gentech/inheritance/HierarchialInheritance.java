package com.gentech.inheritance;

class Employee
{
	void ename()
	{
		System.out.println("The EmpName is Racheth");
	}
}
class Job extends Employee
{
	void jobname()
	{
		System.out.println("JobName is Manager");
	}
}
class Salary extends Employee
{
	void salary()
	{
		System.out.println("The salary of Employee is 45000");
	}
}

public class HierarchialInheritance {

	public static void main(String[] args) {
		Job j=new Job();
        j.ename();
        j.jobname();
        System.out.println("-----------------------");
        Salary s=new Salary();
        s.ename();
        s.salary();
	}
}
