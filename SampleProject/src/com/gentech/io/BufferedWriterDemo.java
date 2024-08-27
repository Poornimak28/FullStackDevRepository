package com.gentech.io;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterDemo {

	public static void main(String[] args) {
		writecontent();

	}
    private static void writecontent()
    {
    	FileWriter fw=null;
    	BufferedWriter bw=null;
    	try
    	{
    		fw=new FileWriter("C:\\Demo\\Test3.txt",true);
    		bw=new BufferedWriter(fw);
    		bw.write("The Childrens are playing in the play ground.");
    		bw.newLine();
    		bw.write("The Mango is the King of all fruits");
    		bw.newLine();
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	finally
    	{
    		try
    		{
    			bw.flush();
    			bw.close();
    		}
    		catch(Exception e)
    		{
    			e.printStackTrace();
    		}
    	}
    }
}
