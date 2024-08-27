package com.gentech.methods;

class Boolean
{
	void method2(boolean a[])
	{
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
}

public class Demo2 {

	public static void main(String[] args) {
		boolean b[]= {true,false,false,true};
		Boolean o1 = new Boolean();
		o1.method2(b);
	}
}
