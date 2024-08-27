package com.gentech.innerouter;

class Outer5
{
	String firstName;
	Inner inner=new Inner();
	void showAge()
	{
		inner.age=22;
		System.out.println("Age:"+inner.age);
	}
	class Inner
	{
		int age;
		void showFN()
		{
			firstName="Santosh";
			System.out.println("FirstName:"+firstName);
		}
	}
}

public class Demo1 {

	public static void main(String[] args) {
		Outer5 o=new Outer5();
        o.showAge();
        o.inner.showFN();
	}
}
