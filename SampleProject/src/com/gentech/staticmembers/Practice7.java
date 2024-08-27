package com.gentech.staticmembers;

class Table
{
	static int num=5;
	
	static 
	{
		display();
	}
	static String [] display()
	{
		String res[]=new String[10];
		int k=0;
		for(int i=1;i<=10;i++)
		{
			String str=num + "*" + i + "=" + (num*i);
			res[k]=str;
			k++;
		}
		return res;
	}
}

public class Practice7 {

	public static void main(String[] args) {
		Table o1=new Table();
		String a[]=o1.display();
        for(int i=0;i<a.length;i++)
        {
        	System.out.println(a[i]+" ");
        }
	}

}
