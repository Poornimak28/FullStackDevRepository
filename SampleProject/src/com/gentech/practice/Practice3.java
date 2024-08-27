package com.gentech.practice;

class Integer
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

public class Practice3 {

	public static void main(String[] args) {
		Integer o1 = new Integer();
        short b[]={10,20,30,40,50,60};
        short c[]=o1.method3(b);
        for(int i=c.length/2;i<c.length;i++)
        {
        	System.out.print(c[i]+" ");
        }
	}

}
