package com.gentech.methods;

class Table
{
	void method6()
	{
		for(int i=2;i<=20;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.println(i + "*" + j + "=" + i*j);
			}
			System.out.println("++++++++++++++++++++");
		}
	}
}

public class Demo6 {

	public static void main(String[] args) {
		Table o1 = new Table();
		o1.method6();
	}
}
