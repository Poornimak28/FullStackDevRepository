package noargsconstructor;

class Twowheeler 
{
	String TName;
	int Tid;
	Twowheeler()
	{
		TName="Jupiter";
		Tid=1;
		System.out.println("TName: "+TName);
		System.out.println("Tid: "+ Tid);
		System.out.println("+++++++++");
	} 	  
}

class Fourwheeler
{
	String FName;
	int Fid;
	Fourwheeler()
	{
		FName="KIA";
		Fid=3;
		System.out.println("Fname: "+FName);
		System.out.println("Fid: "+Fid);
		System.out.println("+++++++++");
	}
}

class Heavyvehicle
{
	String HName;
	int Hid;
	Heavyvehicle()
	{
		HName="Truck";
		Hid=5;
		System.out.println("Hname: "+ HName);
		System.out.println("Hid: "+ Hid);
	}
}


public class Demo2{
	
	public static void main(String args[]){
		Twowheeler jup=new Twowheeler();
		Fourwheeler kia=new Fourwheeler();
		Heavyvehicle tru=new Heavyvehicle();
	}
}
