package com.gentech.string;

class Pattern1
{
	static void method5(String s) 
	{
		for (int i=0;i<s.length();i++) 
		{
			for (int j=0;j<=i;j++) 
			{
				System.out.print(s.charAt(j)+ " ");
			}
			System.out.println();
		}
		for (int i=s.length()-1;i>=0;i--) 
		{
			for (int j=0;j<i;j++) 
			{
				System.out.print(s.charAt(j) +" ");
			}
			System.out.println();
		}
	}
}

public class Assign8 {

	public static void main(String[] args) {
		Pattern1.method5("PROGRAM");
	}
}
