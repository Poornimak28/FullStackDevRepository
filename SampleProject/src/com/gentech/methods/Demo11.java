package com.gentech.methods;

class Prime1
{
	void method11(int j,int k)
	{
		if(j<2)
		{
			j=2;
		}
		for(int i=j;i<=k;i++)
		{
			int flag=0;
			for(int m=2;m<i;m++)
			{
				if(i%m==0)
				{
					flag++;
					break;
				}
			}
			if(flag==0) System.out.println(i);
		}
	}
}
public class Demo11 {

	public static void main(String[] args) {
		Prime1 o1 = new Prime1();
		o1.method11(1,50);
	}
}
