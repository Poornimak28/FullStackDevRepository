package com.gentech.oopstest;

//Ques5
class Outer
{
	String firstName;
	Inner inner=new Inner();
	void showAge()
	{
		inner.age=22;
		System.out.println("Age:"+inner.age);
	}
}
class Inner
{
	int age;
	void showFN()
	{
		String firstName="Poornima";
		System.out.println("FirstName:"+firstName);
	}
} 

public class Test4 {

	public static void main(String[] args) {
		Outer outer=new Outer();
		outer.showAge();
		outer.inner.showFN();
	}
}
