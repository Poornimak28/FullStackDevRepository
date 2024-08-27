package parametrizedconstructor;


class Twowheeler1 {
	String TName;
	int Tid;
	Twowheeler1(String tn,int a)
	{
		TName=tn;
		Tid=a;
		System.out.println("TName: "+TName);
		System.out.println("Tid: "+ Tid);
		System.out.println("+++++++++");
	} 	  
}

class Fourwheeler1
{
	String FName;
	int Fid;
	Fourwheeler1(String fn,int b)
	{
		FName=fn;
		Fid=b;
		System.out.println("Fname: "+FName);
		System.out.println("Fid: "+Fid);
		System.out.println("+++++++++");
	}
}

class Heavyvehicle1
{
	String HName;
	int Hid;
	Heavyvehicle1(String hn,int c)
	{
		HName=hn;
		Hid=c;
		System.out.println("Hname: "+ HName);
		System.out.println("Hid: "+ Hid);
	}
}

public class Demo7 {
	
	public static void main(String[] args) {
		Twowheeler1 o1=new Twowheeler1("Duke",21);
		Fourwheeler1 o2=new Fourwheeler1("Thar",27);
		Heavyvehicle1 o3=new Heavyvehicle1("Truck",28);
	}
}
