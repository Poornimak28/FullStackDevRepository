package com.gentech.oopstest;

//Ques3
abstract class Demo1
{
	void display()
	{
		int a=10;
		int b=20;
		System.out.println("Addition Result: "+(a+b));
	}
	static
	{
		System.out.println("It is Static block");
	}
}
class Demo2 extends Demo1
{
	
}
public class Test2 {

	public static void main(String[] args) {
		Demo2 o1=new Demo2();
        o1.display();
	}
}
