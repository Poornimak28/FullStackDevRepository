package com.gentech.returntest;

class Voting
{
	static boolean display(int num)
	{
		if(num>=18)
		{
			return true; 
		}
		else
		{
			return false;
		}
	}
}

public class Test8 {

	public static void main(String[] args) {
		boolean b=Voting.display(4);
        System.out.println(b);
	}
}
