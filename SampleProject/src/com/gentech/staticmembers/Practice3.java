package com.gentech.staticmembers;

class Even1
{
	static
	{
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}

public class Practice3 {

	public static void main(String[] args) {
		Even1 o1=new Even1();

	}

}
