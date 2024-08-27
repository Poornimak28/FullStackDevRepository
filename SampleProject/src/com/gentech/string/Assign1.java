package com.gentech.string;

class Length
{
	 static void strlength(String str)
	{
		int count=0;
		for (char ch:str.toCharArray()) 
		{
			count++;
		}
		System.out.println(count);
	}
}

public class Assign1 {

	public static void main(String[] args) {
		Length.strlength("Seetha,Rama");
	}
}

