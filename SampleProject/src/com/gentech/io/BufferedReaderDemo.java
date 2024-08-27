package com.gentech.io;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		readcontent();

	}
    private static void readcontent()
    {
    	FileReader fr=null;
    	BufferedReader br=null;
    	try
    	{
    		fr=new FileReader("C:\\Demo\\Sample.txt");
    		br=new BufferedReader(fr);
    		String sLine=null;
    		while((sLine=br.readLine())!=null)
    		{
    			System.out.println(sLine);
    		}
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	finally
    	{
    		try
    		{
    			br.close();
    		}
    		catch(Exception e)
    		{
    			e.printStackTrace();
    		}
    	}
    }
}
