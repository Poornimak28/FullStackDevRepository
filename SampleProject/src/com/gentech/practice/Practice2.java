package com.gentech.practice;

class Sum
{
	int method2(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		return sum;
	}
}

public class Practice2 {

	public static void main(String[] args) {
		Sum o1 = new Sum();
        int b[]= {1,2,3,4,5};
        int c=o1.method2(b);
        System.out.println(c);
	}
}
