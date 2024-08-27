package com.gentech.returnmethod;

class factorial1
{
	int[] method15(int a,int b)
	{
		int res[]=new int[10];
		int fact=1;
		int k=0;
		for(int i=1;i<=10;i++)
		{
			fact=fact*i;
			res[k]=fact;
			k++;
		}
		return res;
	}
}

public class Practice1 {

	public static void main(String[] args) {
		factorial1 o1 = new factorial1();
        int b[] = o1.method15(1,10);
        for(int i=0;i<=b.length;i++)
        {
        	System.out.println(b[i]);
        }
	}

}
