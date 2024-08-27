package com.gentech.staticmembers;

class Palindrome
{
	static int num=12321;
			
	static 
	{
		display();
	}
	static boolean display()
	{
		int a=0;
		int res=0;
		int temp=0;
		temp=num;
		while(num>0)
		{
			a=num%10;
			res=(res*10)+a;
			num=num/10;
		}
		if(temp==res)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

public class Practice9 {

	public static void main(String[] args) {
		
        boolean b=Palindrome.display();
        System.out.println(b);
	}
}
