package com.gentech.methods;
class DigitsSum
{
	void method8(int a) 
	{
		String str = Integer.toString(a);
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			char b=str.charAt(i);
			String s=Character.toString(b);
			sum=sum+Integer.parseInt(s);
		}
		System.out.println(sum);
	}
}

public class Demo8 {

	public static void main(String[] args) {
		DigitsSum o1 = new DigitsSum();
		o1.method8(3456);
	}
}
