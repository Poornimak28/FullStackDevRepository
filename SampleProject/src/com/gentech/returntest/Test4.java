package com.gentech.returntest;

class Odd
{
	int[] display(int a,int b)
	{
		int res[]=new int[6];
		for(int i=a;i>=b;i--)
		{
			if(i%2==1)
			{
				res[i]=i;
			}
		}
		return res;

	}
}

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Odd o1=new Odd();
		int c[]=o1.display(21,11);
		for(int i=c.length-1;i>0;i--)
		{
			System.out.println(c[i]);
		}
	}
}
