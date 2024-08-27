package com.gentech.practice;

class Factorial
{
	int[] method5(int a,int b)
	{
		int res[]=new int[b];
		int fact=1;
		int k=0;
		for(int i=a;i<=b;i++)
		{
			fact=fact*i;
			res[k]=fact;
			k++;
		}
		return res;
	}
}

public class Practice5 {

	public static void main(String[] args) {
		Factorial o1 = new Factorial();
        int c[]=o1.method5(1,10);
        for(int i=0;i<c.length;i++)
        {
        System.out.println(c[i]);
        }
	}
}
