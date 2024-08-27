package com.gentech.practice;

class Transpose
{
	int[][] method16(int a[][])
	{
		int res[][]=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				res[i][j]=a[j][i];
			}
		}
		return res;
	}
}

public class Practice16 {
	public static void main(String[] args) {
		Transpose o1 = new Transpose();
		int b[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int c[][]=o1.method16(b);
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
