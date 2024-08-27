package com.gentech.methods;

class Prime2
{
	void method12(int j,int k)
	{
		if(j<2)
		{
			j=2;
		}
		int count=0;
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
			if(flag==0) 
			{
				count=count+1;
			}
		}
		System.out.println(count);
	}
}

public class Demo12 {

	public static void main(String[] args) {
		Prime2 o1 = new Prime2();
		o1.method12(50,150);
	}
}
