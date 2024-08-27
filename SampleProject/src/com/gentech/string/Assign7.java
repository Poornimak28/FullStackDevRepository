package com.gentech.string;

class Pattern
{
	static void method4(String s)
	{
		for (int i=0;i<s.length();i++)
		{
			for (int j=0;j<=i;j++)
			{
				System.out.print(s.charAt(j) + " ");
			}
			System.out.println();
		}
	}
}

public class Assign7 {

	public static void main(String[] args) {
		Pattern.method4("PROGRAM");
	}
}
