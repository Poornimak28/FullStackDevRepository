package com.gentech.practice;

class Table
{
	int[] method8(int a,int b)
	{
		int res[]=new int[b];
		int k=0;
		for(int i=a;i<=b;i++) 
		{
			res[k]=5*i;
			k++;
		}
		return res;
	}
}

public class Practice8 {

	public static void main(String[] args) {
		 Table o1 = new  Table();
		 int c[]=o1.method8(1,10);
		 for(int i=0;i<c.length;i++)
		 {
			 System.out.println(c[i]);
		 }
	}

}
