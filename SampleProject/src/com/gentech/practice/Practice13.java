package com.gentech.practice;

class Prime2
{
	int method12(int a,int b)
	{
		int sum=0;
		for(int i=2;i<b;i++)
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
				sum=sum+i;
			}
		}
		return sum;
	}
}

public class Practice13 {

	public static void main(String[] args) {
		Prime2 o1 = new Prime2();
		int c=o1.method12(1,20);
		System.out.println(c);
	}
}




