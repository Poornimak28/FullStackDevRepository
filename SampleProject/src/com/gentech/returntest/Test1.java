package com.gentech.returntest;

class Boolean
{
	static boolean[] display(boolean a[])
	{
		boolean res[]=new boolean[a.length];
		for(int i=0;i<a.length;i++)
		{
			res[i]=a[i];
		}
		return res;
	}
}

public class Test1 {

	public static void main(String[] args) {
		boolean b[]={true,false,false,true};
        boolean c[]=Boolean.display(b);
        
        for(int i=0;i<c.length;i++)
        {
        	System.out.println(c[i]+" ");
        }
	}
}
