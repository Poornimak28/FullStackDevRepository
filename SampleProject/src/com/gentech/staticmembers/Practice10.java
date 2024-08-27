package com.gentech.staticmembers;

class Leap
{
	static int year;
	Leap(int k)
	{
	k=year;
	}
	
	static 
	{
		if(((year%4==0) && (year%100!=0)) || (year%400==0))
		{
			System.out.println("leap");
		}
		else
		{
			System.out.println("not a leap");;
		}
	}
}

public class Practice10 {

	public static void main(String[] args) {
		Leap l=new Leap(2002);
	}

}
