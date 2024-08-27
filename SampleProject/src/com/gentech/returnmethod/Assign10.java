package com.gentech.returnmethod;

class Diagonal
{
	short[] method10(short a[][])
	{
		short b[]=new short[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i][i];
		}
		return b;
	}
}

public class Assign10 {

	public static void main(String[] args) {
		Diagonal o1 = new Diagonal();
		short c[][]= {{1,2,3},{4,5,6},{7,8,9}};
		short d[]=o1.method10(c);
		for(int i=0;i<c.length;i++)
		{
			System.out.print(d[i]+" ");
		}
	}
}
