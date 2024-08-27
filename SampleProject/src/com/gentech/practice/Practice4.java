package com.gentech.practice;

class Double
{
	double[] method4(double a[])
	{
		double res[]=new double[a.length];
		for(int i=a.length-1;i>=0;i--)
		{
			res[i]=a[i];
		}
		return res;
	}
}

public class Practice4 {

	public static void main(String[] args) {
		Double o1 = new Double();
        double b[]= {1,2,3,4,5,6};
        double c[]=o1.method4(b);
        for(int i=c.length-1;i>=0;i--)
        {
        	System.out.print(c[i]+" ");
        }
	}

}
