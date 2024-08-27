package parametrizedconstructor;

class Student1
{
	String Stuname;
	int rollno;
	Student1(String sn,int rn)
	{
		Stuname=sn;
		rollno=rn;
		System.out.println("Stuname: "+Stuname);
		System.out.println("rollno: "+rollno);
		System.out.println("++++++++++++++");
	}
}

class Library1
{
	String bookname;
	int Bookid;
	Library1(String bn,int bi)
	{
		bookname=bn;
		Bookid=bi;
		System.out.println("Bookname: "+bookname);
		System.out.println("Bookid: "+Bookid);
		System.out.println("+++++++++++++++");
	}
}

class Sports1
{
	String sportname;
	int studentid;
	Sports1(String s,int si)
	{
		sportname=s;
		studentid=si;
		System.out.println("sportname: "+sportname);
		System.out.println("studentid: "+studentid);
		System.out.println("++++++++++++++");
	}
}

public class Demo10 {

	public static void main(String[] args) {
		Student1 o1=new Student1("Minchu",7);
		Library1 o2=new Library1("Core Java",9);
		Sports1 o3=new Sports1("Throwball",4);
	}
}
