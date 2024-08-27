package com.gentech.program;

class Student
{
	String Stuname;
	int rollno;
}
class Library
{
	String bookname;
	int Bookid;
}
class Sports
{
	String sportname;
	int studentid;
}


public class College {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.Stuname="Divya";
		stu.rollno=17;
		System.out.println("Stuname: "+ stu.Stuname);
		System.out.println("rollno: "+ stu.rollno);
		System.out.println("++++++++++++++");

		Library lib = new Library();
		lib.bookname="HTML";
		lib.Bookid=23;
		System.out.println("Bookname: "+ lib.bookname);
		System.out.println("Bookid: "+ lib.Bookid);
		System.out.println("+++++++++++++++");

		Sports sp = new Sports();
		sp.sportname="Football";
		sp.studentid=24;
		System.out.println("sportname: "+ sp.sportname);
		System.out.println("studentid: "+ sp.studentid);
		System.out.println("++++++++++++++");
	}

}
