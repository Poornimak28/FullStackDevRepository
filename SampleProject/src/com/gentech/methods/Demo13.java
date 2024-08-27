 package com.gentech.methods;

class Prime3
{
	void method13(int j,int k)
	{
		if(j<2)
		{
			j=2;
		}
		int sum=0;
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
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
}

public class Demo13 {

	public static void main(String[] args) {
		Prime3 o1 = new Prime3();
		o1.method13(1,100); 
	}
}
