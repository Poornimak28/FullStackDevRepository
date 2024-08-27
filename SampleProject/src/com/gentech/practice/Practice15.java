package com.gentech.practice;

class Diagonal
{
	int[] method15(int a[][])
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

public class Practice15 {

	public static void main(String[] args) {
		Diagonal o1 = new Diagonal();
        int b[][]= {{1,2,3},{4,5,6},{7,8,9}};
        int c[]=o1.method15(b);
        for(int val:c)
        {
        	System.out.println(val+" "); 
        }
	}

}
