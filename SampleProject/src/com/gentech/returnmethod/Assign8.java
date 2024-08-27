package com.gentech.returnmethod;

class Table1
{
	int[] method8(int a[])
	{
		int res[]=new int[10];
		for(int i=a.length-1;i>=0;i--)
		{
			res[i]=7*a[i];
		}
		return res;    
	}
}

public class Assign8 {

	public static void main(String[] args) {
		Table1 o1 = new Table1();
		int b[]={1,2,3,4,5,6,7,8,9,10};
		int c[]=o1.method8(b);
		for(int i=c.length-1;i>=0;i--)
		{
			System.out.println(c[i]);
		}
	}
}
