package com.gentech.returntest;

class Brand
{
	static String getbrandName(String str)
	{
		return str;
	}
}

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
          String s=Brand.getbrandName("DELL");
          System.out.println(s);
	}

}
