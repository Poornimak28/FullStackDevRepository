package com.gentech.returnmethod;

class Short
{
	short[] method3(short a[])
	{
		short res[]=new short[a.length];
		for(int i=a.length/2;i<a.length;i++)
		{
			res[i]=a[i];
		}
		return res;
	}
}

public class Assign3 {

	public static void main(String[] args) {
		Short o1 = new Short();
		short b[]= {1,2,3,4,5,6};
		short c[]= o1.method3(b);
		for(int i=c.length/2;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
	}
}
