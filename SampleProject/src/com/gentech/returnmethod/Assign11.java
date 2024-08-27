package com.gentech.returnmethod;

class String1
{
	String method11(String a[])
	{
		String s=" ";
		for (int i=0;i<a.length;i++)
		{
			s=s+a[i]+" ";
		}
		return s;
	}
}


public class Assign11 {

	public static void main(String[] args) {
		String1 o1 = new String1();
		String s[]= {"Hi","Good","Morning","Bye"};
		String a=o1.method11(s);
		System.out.print(a);
	}
}
