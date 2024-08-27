package com.gentech.string;

class Reverse
{
	static void charAt(String s)
	{
		String str="";
		for(int i=s.length()-1;i>=0;i--)
		{
			str+=s.charAt(i);
		}
		System.out.println(str);
	}
	static  void tocharArray(String s)
	{
		char ch[]=s.toCharArray();
		String str="";
		for(int i=ch.length-1;i>=0;i--)
		{
			str+=ch[i];
		}
		System.out.println(str);
	}
	static  void substring(String s)
	{
		char ch[]=s.toCharArray();
		String str="";
		for(int i=ch.length-1;i>=0;i--)
		{
			str+=s.subSequence(i,i+1);
		}
		System.out.println(str);
	}
}
public class Assign2 {

	public static void main(String[] args) {
		Reverse.charAt("Java");
		Reverse.tocharArray("Programming");
		Reverse.substring("Language");
	}
}
