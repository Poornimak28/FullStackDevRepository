package com.gentech.staticmembers;

class Fib
{
	static int a=0;
	static int b=8;
	
	static 
	{
		display();
	}
	static int display()
	{
		int fn=0,sn=1;
		for(int i=a;i<=b;i++)
		{
			int tn=fn+sn;
			fn=sn;
			sn=tn;
		}
		return sn;
	}
} 

public class Practice8 {

	public static void main(String[] args) {
		 Fib o1=new Fib();
         int c=o1.display();
         System.out.println(c);
	}
}
