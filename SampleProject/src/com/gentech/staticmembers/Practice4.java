package com.gentech.staticmembers;

class Diagonal
{
	static int a[][]={{1,2,3},{3,4,5},{4,5,6}};
	
	static
	{
		display();
	}
	static int[] display()
	{
		int k=0;
		int res[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			res[k]=a[i][i];
			k++;
		}
		return res;
	}
}

public class Practice4 {

	public static void main(String[] args) {
		Diagonal o1=new Diagonal();
        int c[]=o1.display();
		for(int i=0;i<c.length;i++)
        {
        	System.out.println(c[i]+ " ");
        }
	}
}
