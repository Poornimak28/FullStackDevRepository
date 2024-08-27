package com.gentech.returntest;

class Byte
{
	static byte[] display(byte a[])
	{
		byte res[]=new byte[a.length];
		for(int i=0;i<a.length;i++)
		{
			res[i]=a[i];
		}
		return res;
	}
}

public class Test3 {

	public static void main(String[] args) {
		byte c[]= {10,20,30,40};
        
        byte b[]=Byte.display(c);
        for(int i=0;i<c.length;i++)
        {
        	System.out.println(c[i]+" ");
        }
	}

}
