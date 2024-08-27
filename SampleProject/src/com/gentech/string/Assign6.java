package com.gentech.string;

class Palindrome
{
	static  void method3(String s)
	{
		String str="";
		for(int i=s.length()-1;i>=0;i--)
		{
			str+=s.charAt(i);
		}
		if(str.equals(s)) System.out.println("It is a palindrome");
		else System.out.println("Not a palindrome");
	}
}

public class Assign6 {

	public static void main(String[] args) {
		Palindrome.method3("GADAG");
	}
}
