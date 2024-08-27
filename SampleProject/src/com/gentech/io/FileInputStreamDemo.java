package com.gentech.io;

import java.io.FileInputStream;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		readcontent();

	}
    private static void readcontent()
    {
    	FileInputStream fin=null;
    	int n=0;
    	try
    	{
    		fin= new FileInputStream("C:\\Demo\\Sample.txt");
    		while(true)
    		{
    			n=fin.read();
    			if(n==-1)
    			{
    				break;
    			}
    			char ch=(char)n;
    			System.out.print(ch);
    		}
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	finally
    	{
    		try
    		{
    			fin.close();
    		}catch(Exception e)
    		{
    			e.printStackTrace();
    		}
    	}
    }
}
