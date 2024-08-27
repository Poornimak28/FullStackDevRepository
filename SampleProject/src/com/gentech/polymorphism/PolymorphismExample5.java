package com.gentech.polymorphism;

abstract class File
{
	abstract void extension();
}
class Txt extends File
{
	void extension()
	{
		System.out.println("txt is extension of plain text file");
	}
}
class Mp3 extends File
{
	void extension()
	{
		System.out.println("mp3 is extension of audio file");
	}
}
class Docx extends File
{
	void extension()
	{
		System.out.println("docx is extension of Microsoft Word Documents");
	}
}
class Jpg extends File
{
	void extension()
	{
		System.out.println("jpg is extension of image file");
	}
}

public class PolymorphismExample5 {

	public static void main(String[] args) {
		File file=null;
		Txt txt=new Txt();
		Mp3 mp3=new Mp3();
		Docx docx=new Docx();
		Jpg jpg=new Jpg();
		
		file=txt;
		file.extension();
		file=mp3;
		file.extension();
		file=docx;
		file.extension();
		file=jpg;
		file.extension();
	}
}
