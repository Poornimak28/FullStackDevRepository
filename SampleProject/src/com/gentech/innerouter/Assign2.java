package com.gentech.innerouter;

class Outer2
{
	int age;
	Inner2 inner2=new Inner2();
	void showName()
	{
		inner2.name="Anusha";
		System.out.println("Name:"+inner2.name);
	}
}
class Inner2
{
	String name;
	void showAge()
	{
		int age=18;
		System.out.println("Age: "+age);
	}
}

public class Assign2 {

	public static void main(String[] args) {
		
		
	}
}
