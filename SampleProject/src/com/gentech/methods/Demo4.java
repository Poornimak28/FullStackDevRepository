package com.gentech.methods;

class Transpose
{
	void method4(int a[][])
	{
		for(int i=0;i<a[0].length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
	}
}

public class Demo4 {

	public static void main(String[] args) {
		int b[][]= {{1,3,4},{4,6,7},{7,9,6},{4,5,6}};
		Transpose o1 = new Transpose();
		o1.method4(b);
	}
}
