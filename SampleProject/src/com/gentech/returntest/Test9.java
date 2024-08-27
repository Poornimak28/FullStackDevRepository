package com.gentech.returntest;

class Table
{
	 static int display(int num)
	{
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			sum=sum+num*i;
		}
		return sum;
	}
}

public class Test9 {

	public static void main(String[] args) {
		int a=Table.display(2);
		System.out.println(a);
	}
}
