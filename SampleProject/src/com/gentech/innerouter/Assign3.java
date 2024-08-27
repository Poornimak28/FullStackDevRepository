package com.gentech.innerouter;

class Outer3
{
	int age;
	Inner3a inner3a=new Inner3a();
	Inner3b inner3b=new Inner3b();
	void showfirstName()
	{
		inner3a.firstname="Anushka";
		System.out.println("FirstName:"+inner3a.firstname);
	}
	void showlastName()
	{
		inner3b.lastName="Sharma";
		System.out.println("LastName:"+inner3b.lastName);
	}
	private class Inner3a
	{
		String firstname;
	}
	private class Inner3b
	{
		String lastName;
	}
	void showAge()
	{
		age=35;
		System.out.println("Age:"+age);
	}
}


public class Assign3 {

	public static void main(String[] args) {
		Outer3 o1=new Outer3();
		o1.showAge();
		o1.showfirstName();
		o1.showlastName();
	}
}
