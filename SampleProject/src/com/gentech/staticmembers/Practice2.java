package com.gentech.staticmembers;

class Odd
{
	static int a=1;
	static int b=20;
	
	static
	{
		showodd();
	}
	static void showodd()
	{
		for(int i=a;i<=b;i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
		}
	}
}

public class Practice2 {

	public static void main(String[] args) {
		Odd o1=new Odd();
	}
}
