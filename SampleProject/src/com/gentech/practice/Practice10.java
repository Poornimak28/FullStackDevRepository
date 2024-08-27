package com.gentech.practice;

class Table3
{
	String [] method10(int a,int b)
	{
		String res[]=new String[(b-1)*10];
		int k=0;
		for(int i=a;i<=b;i++)
		{
			for(int j=1;j<=10;j++)
			{
				String str=i + "*" + j + "=" +(i*j);
				res[k]=str;
				k++;
			}
		}
		return res;
	}
}

public class Practice10 {

	public static void main(String[] args) {
		Table3 o1 = new Table3();
		String c[]=o1.method10(2,20);
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]+" ");
		}
		System.out.println("------------------");
	}
}
