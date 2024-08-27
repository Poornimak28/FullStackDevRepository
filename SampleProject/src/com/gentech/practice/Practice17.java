package com.gentech.practice;

class Addition
{
	int[][] method17(int a[][],int b[][])
	{
		int res[][]=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				res[i][j]=a[i][j]+b[i][j];
			}
		}
		return res;
	}
}

public class Practice17 {

	public static void main(String[] args) {
		Addition o1 = new Addition();
		int a[][]={{10,20,30},{40,50,60}};
		int b[][]={{30,40,50},{60,70,80}};
		int c[][]=o1.method17(a,b);
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
