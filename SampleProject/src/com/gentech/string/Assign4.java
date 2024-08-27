package com.gentech.string;

class Insert
{
	static void method1(String s)
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
					str=str+x+",";
					i=i+2;
				}
				else str=str+s.charAt(i);
			}
			else str+=s.charAt(i);
		}
		System.out.println(str);
	}
}

public class Assign4 {

	public static void main(String[] args) {
		Insert.method1("SundayMondayTuesdayWednesdayThursdayFridaySaturdaySunday");
	}
}
