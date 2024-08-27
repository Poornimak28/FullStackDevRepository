package com.gentech.innerouter;

class Outer4
{
	String name;
	Inner4a inner4a=new Inner4a();
	Inner4b inner4b=new Inner4b();
	void showMarks1()
	{
		inner4a.marks1=80;
		System.out.println("Marks1 = "+inner4a.marks1);
	}
	void showMarks2()
	{
		inner4b.marks2=75;
		System.out.println("Marks2 = "+inner4b.marks2);
	}

	static class Inner4a
	{
		int marks1;
	}
	static class Inner4b
	{
		int marks2;
	}
	void showName()
	{
		name="Smith";
		System.out.println("Name:"+name);
	}
}

public class Assign4 {

	public static void main(String[] args) {
		Outer4 o1=new Outer4();
		o1.showName();
		o1.showMarks1();
		o1.showMarks2();
	}
}
