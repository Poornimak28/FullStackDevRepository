package com.gentech.methods;



class Integer
{
	int[] method1(int a[])
	{
		int res[]=new int[a.length];
		for(int i=0;i<a.length/2;i++)
		{
			res[i]=a[i];
		}
		return res; 
	}
}


public class Demo14 {

	public static void main(String[] args) {
		Integer o1 = new Integer();
		int b[]= {10,20,30,40,50,60};
		int c[]= o1.method1(b);
		for(int i=0;i<c.length/2;i++)
		{
			System.out.print(c[i]+" ");
		}

	}

}
