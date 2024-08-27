package com.gentech.returnmethod;

class Square
{
	int[] method6(int a,int b)
	{
		int res[]=new int[10];
		int k=0;
		for(int i=1;i<=10;i++)
		{
			res[k]=i*i;
			k++;
		}
		return res;
	}
}

public class Assign6 {

	public static void main(String[] args) {
		Square o1 = new Square();
		int c[]=o1.method6(1,10);
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
	}
}
