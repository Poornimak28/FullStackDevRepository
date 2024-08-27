package com.gentech.returntest;

class Circle
{
	 static double display(double radius)
	{
		double r1=0;
		return r1=3.14*radius*radius;
	}
}

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d=Circle.display(4);
		System.out.println(d);
	}
}
