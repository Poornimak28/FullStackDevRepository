package com.gentech.returnmethod;

class TwoDimensional
{
	char[][] method7(char a[][])
	{
		char res[][]=new char[1][a[0].length];
		for(int i=0;i<1;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				res[i][j]=a[i][j];
			}
		}
		return res;
	}
}

public class Assign7 {

	public static void main(String[] args) {
		TwoDimensional o1 = new TwoDimensional();
		char b[][]={{'a','b','c','d'},{'e','f','g','h'}};
		char c[][]=o1.method7(b);
		for(int i=0;i<1;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
		}
	}
}
