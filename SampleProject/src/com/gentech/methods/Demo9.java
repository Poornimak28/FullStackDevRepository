package com.gentech.methods;

class Table1
{
	void method9(int a)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(a + "*" + i + "=" + a*i);
		}
	}
}

public class Demo9 {

	public static void main(String[] args) {
		Table1 o1 = new Table1();
		o1.method9(5);
	}
}
