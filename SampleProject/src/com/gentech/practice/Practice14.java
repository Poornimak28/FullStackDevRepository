package com.gentech.practice;

class Name
{
	String getname(String str)
	{
		return str;
	}
}

public class Practice14 {

	public static void main(String[] args) {
		Name o1 = new Name();
		String s=o1.getname("Poornima");
        System.out.println(s);
	}
}
