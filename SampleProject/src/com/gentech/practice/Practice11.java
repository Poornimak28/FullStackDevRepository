package com.gentech.practice;

class Prime
{
	boolean method11(int num)
	{
		int flag=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=flag+1;
				break;
			}
		}
		if(flag==0)
		{
			return true;
		}
		else
		{
			return false;
		}

	}
}

public class Practice11 {

	public static void main(String[] args) {
		Prime o1 = new Prime();
		boolean c=o1.method11(6);
		System.out.println(c);
	}
}
