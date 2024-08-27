package com.gentech.methods;

class Sum
{
	void method1(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("The Sum of all Elements is: "+sum);
	}
}

public class Demo1 {
	public static void main(String[] args) {
		int b[]= {5,7,8,9,3};
		Sum o1 = new Sum();
		o1.method1(b);
	}
}
