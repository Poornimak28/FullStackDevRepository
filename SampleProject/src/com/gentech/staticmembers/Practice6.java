package com.gentech.staticmembers;

class Prime
{
	static int a=1;
	static int b=20;
			
	static 
	{
		display();
	}
	static int [] display()
	{
		int k=0;
		int res[]=new int[8];
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

public class Practice6 {

	public static void main(String[] args) { 
		Prime o1=new Prime();
		int c[]=o1.display();
		for(int i=0;i<c.length;i++)
        {
        System.out.println(c[i]+" ");
        }
	}
}
