package com.gentech.practice;

class Prime1
{
	int [] method12(int a,int b)
	{
		int k=0;
		int res[]=new int[15];
		for(int i=2;i<=b;i++)
		{
			int flag=0;
			for(int j=2;j<i;j++)
			{ 
				if(i%j==0)
				{
					flag=flag+1;
					break;
				}
			}
			if(flag==0)
			{
				res[k]=i;
				k++;
			}
		} 
		
		return res;
	}
}

public class Practice12 {

	public static void main(String[] args) {
		Prime1 o1 = new Prime1();
		int c[]=o1.method12(1,50);
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
	}
}
