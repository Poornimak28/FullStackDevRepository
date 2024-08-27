package com.gentech.string;

class Delete
{
	static void method2(String s)
	{
		int j=0;
		String x="day";
		String str="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==x.charAt(j))
			{
				String l=s.substring(i,i+x.length());
				if (l.equals(x))
				{
					i=i+2;
					continue;
				}
				else str=str+s.charAt(i);
			}
			else str+=s.charAt(i);
		}
		System.out.println(str);
	}
}

public class Assign5 {

	public static void main(String[] args) {
		Delete.method2("SundayMondayTuesdayWednesdayThursdayFridaySaturdaySunday");
	}
}
