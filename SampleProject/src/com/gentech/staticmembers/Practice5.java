package com.gentech.staticmembers;

class Transpose
{
	static int a[][]={{1,2,3},{4,5,6},{7,8,9}};

	static  
	{
		display();
	}
	static int[][] display()
	{
		int k=0;
		int res[][]=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				res[i][j]=a[j][i];
				k++;
			}

		}
		return res;
	}
}

public class Practice5 {

	public static void main(String[] args) {
		Transpose o1=new Transpose();
		int c[][]=o1.display();
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
