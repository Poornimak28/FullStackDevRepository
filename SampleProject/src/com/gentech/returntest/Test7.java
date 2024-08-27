package com.gentech.returntest;

class Rectangle
{
	 static double display(double l,double b)
	{
		double res=0;
		return res=l*b; 
	}
}

public class Test7 {

	public static void main(String[] args) {
		double d=Rectangle.display(4,3);
        System.out.println(d);
	}
}
