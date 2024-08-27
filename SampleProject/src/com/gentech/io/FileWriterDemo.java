package com.gentech.io;

import java.io.FileWriter;

public class FileWriterDemo {

	public static void main(String[] args) {
		writecontent();

	}
    private static void writecontent()
    {
    	FileWriter fw=null;
    	try
    	{
    		fw=new FileWriter("C:\\Demo\\Test2.txt");
    		String str="There are Mangoes in the basket, and those";
    		str+="Mangoes are riped.";
    		char ch[]=str.toCharArray();
    		fw.write(ch);
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	finally
    	{
    		try
    		{
    			fw.close();
    		}
    		catch(Exception e)
    		{
    			e.printStackTrace();
    		}
    	}
    }
}
