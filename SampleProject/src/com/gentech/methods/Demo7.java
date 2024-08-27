package com.gentech.methods;

class Digits
{
	int method7(int a)
	{
		String str = Integer.toString(a);
		int res=str.length();
		return res;
	}
	
}

public class Demo7 {

	public static void main(String[] args) {
		Digits o1 = new Digits();
		int c=o1.method7(23456);
		System.out.println(c);
	}
}
