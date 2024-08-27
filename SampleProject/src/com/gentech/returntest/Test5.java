package com.gentech.returntest;

class Factorial
{
	int display(int a)
	{
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}

public class Test5 {

	public static void main(String[] args) {
		Factorial o1=new Factorial();
		int b=o1.display(5);
        System.out.println(b);
	}

}
