package com.gentech.practice;

class Table2
{
	String[] method9(int num)
	{
		String res[]=new String[10];
		int k=0;
		for(int i=1;i<=10;i++)
		{
			String str=num + "*" + i + "=" +(num*i);
			res[k]=str;
			k++;
		}
		return res;
	}
}

public class practice9 {

	public static void main(String[] args) {
		Table2 o1 = new Table2();
        String b[]=o1.method9(3);
        for(String kk:b)
        {
        	System.out.println(kk);
        }
	}

}
