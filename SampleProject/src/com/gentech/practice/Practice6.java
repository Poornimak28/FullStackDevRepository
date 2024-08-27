package com.gentech.practice;

class Square
{
	int[] method6(int a,int b)
	{
		int res[]=new int[b];
		int k=0;
		for(int i=a;i<=b;i++)
		{
			res[k]=i*i;
			k++;
		}
		return res;
	}
}

public class Practice6 {

	public static void main(String[] args) {
		Square o1 = new Square();
        int c[]=o1.method6(1,10);
        for(int i=0;i<c.length;i++)
        {
        	System.out.println(c[i]);
        }
	}

}
