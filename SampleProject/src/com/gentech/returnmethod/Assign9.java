package com.gentech.returnmethod;

class Table2
{
	String[] getTable2(int num)
	{
		String arr[]=new String[10];
		int k=0;
		for(int i=1;i<=10;i++)
		{
			String str = num + "*" + i + "=" +(num*i);
			arr[k]=str;
			k++;
		}
		return arr;
	}
}


public class Assign9 {

	public static void main(String[] args) {
		Table2 o1 = new Table2();
		String b[]=o1.getTable2(6);
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}
}
