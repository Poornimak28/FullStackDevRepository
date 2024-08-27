package com.gentech.methods;

class String1
{
	void method3(String a[])
	{
		for(int i=a.length/2;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}

public class Demo3 {

	public static void main(String[] args) {
		String n[]= {"Seetha","Rama","Lakshman","Krishna"};
		String1 o1 = new String1();
		o1.method3(n);
	}
}
