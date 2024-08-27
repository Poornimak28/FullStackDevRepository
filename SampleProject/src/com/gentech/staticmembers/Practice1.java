package com.gentech.staticmembers;

class Even
{
	{
		showeven();
	}
	void showeven()
	{
		int num=11;
		if(num%2==0)
		{
			System.out.println(num + "is a even");
		}
		else
		{
			System.out.println(num + "is not a even");
		}
	}
}

public class Practice1 {

	public static void main(String[] args) {
		Even e=new Even();
	}
}
