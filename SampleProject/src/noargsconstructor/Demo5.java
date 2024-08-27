package noargsconstructor;

class Student
{
	String Stuname;
	int rollno;
	Student()
	{
		Stuname="Divya";
		rollno=17;
		System.out.println("Stuname:"+Stuname);
		System.out.println("rollno:"+rollno);
		System.out.println("++++++++++++++");
	}
}

class Library
{
	String bookname;
	int Bookid;
	Library()
	{
		bookname="HTML";
		Bookid=23;
		System.out.println("Bookname: "+bookname);
		System.out.println("Bookid: "+Bookid);
		System.out.println("+++++++++++++++");
	}
}

class Sports
{
	String sportname;
	int studentid;
	Sports()
	{
		sportname="Football";
		studentid=24;
		System.out.println("sportname: "+sportname);
		System.out.println("studentid: "+studentid);
		System.out.println("++++++++++++++");
	}
}


public class Demo5 {
	
	public static void main(String[] args) {
		Student stu=new Student();
		Library lib=new Library();
		Sports spo=new Sports();
	}
}
