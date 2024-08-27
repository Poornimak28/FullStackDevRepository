package com.gentech.returnmethod;

class Gentech
{
	void method(int a)
	{
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
			System.out.println(fact);
		}
		
	}
}

public class Practice {

	public static void main(String[] args) { 
		Gentech o1 = new Gentech();
		o1.method(7);
	}
}
