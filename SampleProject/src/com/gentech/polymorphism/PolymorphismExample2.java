package com.gentech.polymorphism;

abstract class Calculator
{
	abstract void mathoperation();
}
class Addition extends Calculator
{
	void mathoperation()
	{
		int a=10;
		int b=20;
		System.out.println("Addition Result is: "+(a+b));
	}
}
class Subtraction extends Calculator
{
	void mathoperation()
	{
		int a=30;
		int b=10;
		System.out.println("Subtraction Result is: "+(a-b));
	}
}
class Multiplication extends Calculator
{
	void mathoperation()
	{
		int a=15;
		int b=3;
		System.out.println("Multiplication Result is: "+(a*b));
	}
}
class Division extends Calculator
{
	void mathoperation()
	{
		int a=20;
		int b=5;
		System.out.println("Division Result is: "+(a/b));
	}
}

public class PolymorphismExample2 {

	public static void main(String[] args) {
		Calculator calculator=null;
		Addition add=new Addition();
		Subtraction sub=new Subtraction();
		Multiplication mul=new Multiplication();
		Division div=new Division();
		
		calculator=add;
		calculator.mathoperation();
		calculator=sub;
		calculator.mathoperation();
		calculator=mul;
		calculator.mathoperation();
		calculator=div;
		calculator.mathoperation();
	}
}
