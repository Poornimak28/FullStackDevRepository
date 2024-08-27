package parametrizedconstructor;

class Employee1
{
	String Empname;
	int age;
	Employee1(String en,int Age)
	{
		Empname =en;
		age=Age;
		System.out.println("Ename:  "+Empname);
		System.out.println("Age:  "+ age);
		System.out.println("+++++++++");

	}
}
class Department1
{
	String Depname;
	int Depid;
	Department1(String dn,int Dept)
	{
		Depname=dn;
		Depid=Dept;
		System.out.println("Depname: "+Depname);
		System.out.println("Depid:  "+ Depid);
		System.out.println("+++++++++");
	}
}

class Insurance1
{
	String InsName;
	int Insid;
	Insurance1(String ins,int Ins)
	{
		InsName= ins;
		Insid= Ins;
		System.out.println("InsName: "+InsName);
		System.out.println("Insid:  "+Insid);
	}
}

public class Demo6 {
	
	public static void main(String[] args) {
		Employee1 o1 = new Employee1("Ramesh",35);
		Department1 o2 = new Department1("Accountants",2);
		Insurance1 o3=new Insurance1("Yearly",6);
	}
}
