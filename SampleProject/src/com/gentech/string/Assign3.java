package com.gentech.string;

class Replace
{
	static void method(String s,String x,String y)
	{
		int j=0;
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==x.charAt(j))
			{
				String l=s.substring(i,i+x.length());
				if (l.equals(x))
				{
					s1=s1+y;
					i=i+l.length()-1;
				}
				else s1+=s.charAt(i);
			}
			else s1+=s.charAt(i);
		}
		System.out.println(s1);
	}
}

public class Assign3 {

	public static void main(String[] args) {
		Replace.method("Hi!How are your weekend?","are","was");
	}
}
