package com.gentech.stringpractice;

public class Practice1 {

	public static void main(String[] args) {
		getcharcount();
		validateString();
		basedonPosition();
		uppercaseStr();
		lowercaseStr();
		replace();
		compareString1();
		compareString2();
		existanceString();
		extractString();
		charArray();
		splitString();
		convertToString();
		convertToByteArray();
		append();
		insert();
		delete();
		reverse();
	}
	static void getcharcount()
	{
		String s= new String("welcome");
		int v1=s.length();
		System.out.println("Number of chars: "+v1);
		System.out.println("++++++++++++++++++++++++");
	}
	static void validateString()
	{
		String s=new String("Hello");
		boolean v1=s.isEmpty();
		System.out.println("Is Empty: "+v1);
		System.out.println("++++++++++++++++++++++++");
	}
	static void basedonPosition()
	{
		String s=new String("welcome");
		char ch=s.charAt(1);
		System.out.println("Character at position 1: "+ch);
		System.out.println("++++++++++++++++++++++++");
	}
	static void uppercaseStr()
	{
		String s=new String("programming");
		String s1=s.toUpperCase();
		System.out.println("UpperCase: "+s1);
		System.out.println("++++++++++++++++++++++++");
	}
	static void lowercaseStr()
	{
		String s=new String("PROGRAM");
		String s1=s.toLowerCase();
		System.out.println("LowerCase: "+s1);
		System.out.println("++++++++++++++++++++++++");
	}
	static void replace()
	{
		String s=new String("It is a old palace");
		String s1=s.replace("is","was");
		System.out.println("Replace is: "+s1);
		System.out.println("++++++++++++++++++++++++");
	}
	static void compareString1()
	{
		String s1="welcome";
		String s2="WELCOME";
		boolean v1=s1.equals(s2);
		System.out.println("s1 and s2 are equal: "+v1);
		boolean v2=s1.equalsIgnoreCase(s2);
		System.out.println("s1 and s2 are equal: "+v2);
		System.out.println("++++++++++++++++++++++++");
	}
	static void compareString2()
	{
		String s1="welcome";
		String s2="WELCOME";
		int v1=s1.compareTo(s2);
		System.out.println("s1 and s2 are equal: "+v1);
		int v2=s1.compareToIgnoreCase(s2);
		System.out.println("s1 and s2 are equal: "+v2);
		System.out.println("++++++++++++++++++++++++");
	}
	static void existanceString()
	{
		String s=new String("It was an old Palace in Mysore");
		boolean v1=s.startsWith("It");
		System.out.println("starts with 'It': "+v1);
		boolean v2=s.endsWith("Mysore");
		System.out.println("ends with 'Mysore': "+v2);
		boolean v3=s.contains("old");
		System.out.println("contains with 'old': "+v3);
		System.out.println("++++++++++++++++++++++++");
	}
	static void extractString()
	{
		String s=new String("Programming");
		String s1=s.substring(3);
		System.out.println(s1);
		System.out.println("++++++++++++++++++++++++");
	}
	static void charArray()
	{
		String s=new String("Software App");
		char ch[]=s.toCharArray();
		for(char kk:ch)
		{
			System.out.println(kk);
		}
		System.out.println("++++++++++++++++++++++++");
	}
	static void splitString()
	{
		String s=new String("HTML,CSS,JavaScript");
		String str[]=s.split(",");
		for(String s1:str)
		{
			System.out.println(s1);
		}
		System.out.println("++++++++++++++++++++++++");
	}
	static void convertToString()
	{
		double d=10.55;
		String s1=String.valueOf(d);
		System.out.println(s1);
		int a=66;
		String s2=String.valueOf(a);
		System.out.println(s2);
		System.out.println("++++++++++++++++++++++++");
	}
	static void convertToByteArray()
	{
		String s="Welcome to GenTech Academy";
		byte b[]=s.getBytes();
		for(int v1:b)
		{
			System.out.println(v1+" ");
		}
		System.out.println("++++++++++++++++++++++++");
	}
	static void append()
	{
		StringBuffer s=new StringBuffer("Java");
		s.append("Programming");
		System.out.println(s);
		System.out.println("++++++++++++++++++++++++");
	}
	static void insert()
	{
		StringBuffer s=new StringBuffer("It is a palace");
		s.insert(8,"new");
		System.out.println(s);
		System.out.println("++++++++++++++++++++++++");
	}
	static void delete()
	{
		StringBuffer s=new StringBuffer("It is a new palace");
		s.delete(8,12);
		System.out.println(s);
		System.out.println("++++++++++++++++++++++++");
	}
	static void reverse()
	{
		StringBuffer s=new StringBuffer("Welcome");
		s.reverse();
		System.out.println(s);
		System.out.println("++++++++++++++++++++++++");
	}
}
