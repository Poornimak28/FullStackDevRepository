package com.gentech.methods;

class Double
{
	void method5(double a[][])
	{
		double sum=0;
		for(int i=1;i<2;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				sum=sum+a[i][j];
			}
			System.out.print("The Sum is: "+sum);
		}
     }
}

public class Demo5 {

	public static void main(String[] args) {
		double b[][]= {{2,3,4},{3,5,6},{1,2,3}};
        Double o1 = new Double();
        o1.method5(b);
	}
}
