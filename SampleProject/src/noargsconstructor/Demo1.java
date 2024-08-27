package noargsconstructor;

class Employee
{
	String Empname;
	int Age;
	Employee()
	{
		Empname = "Rohini";
		Age=22;
		System.out.println("Ename:  "+Empname);
		System.out.println("Age:  "+ Age);
		System.out.println("+++++++++");
	}
}
class Department
{
	String Depname;
	int Depid;
	Department()
	{
		Depname="Manager";
		Depid=1;
		System.out.println("Depname: "+Depname);
		System.out.println("Depid:  "+ Depid);
		System.out.println("+++++++++");
	}
}

class Insurance
{
	String InsName;
	int Insid;
	Insurance()
	{
		InsName= "yearly";
		Insid= 10;
		System.out.println("InsName: "+InsName);
		System.out.println("Insid:  "+Insid);
	}
}

public class Demo1 {

	public static void main(String[] args) {
		Employee rohini = new Employee();
		Department manager = new Department();
		Insurance yearly = new Insurance();
	}
}
