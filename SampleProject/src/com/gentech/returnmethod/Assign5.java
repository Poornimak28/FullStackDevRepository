package com.gentech.returnmethod;

class Factorial
{
	int method5(int a)
	{
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}

public class Assign5 {

	public static void main(String[] args) {
		Factorial o1 = new Factorial();
        int c=o1.method5(4);
        System.out.println(c);
	}

}
