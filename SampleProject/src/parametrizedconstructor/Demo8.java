package parametrizedconstructor;

class Country1
{
	String countryname;
	int countryid;
	Country1(String cn,int ci)
	{
		countryname=cn;
		countryid=ci;
		System.out.println("countryname: "+countryname);
		System.out.println("countryid: "+countryid);
		System.out.println("+++++++++");
	}
}
class State1
{
	String statename;
	String langauage;
	State1(String st,String ln)
	{
		statename=st;
		langauage=ln;
		System.out.println("statename: "+ statename);
		System.out.println("langauage: "+ langauage);
		System.out.println("+++++++++");
	}
}
class District1
{
	String districtname;
	int pincode;
	District1(String dn,int p)
	{
		districtname=dn;
		pincode=p;
		System.out.println("districtname: "+  districtname);
		System.out.println("pincode: "+  pincode);
	}
}
class Village1
{
	String vname;
	String vdistrict;
	Village1(String vn,String ds)
	{
		vname=vn;
		vdistrict=ds;
		System.out.println("vname:"+ vname);
		System.out.println("vdistrict"+vdistrict);
	}
}

public class Demo8 {
	
	public static void main(String[] args) {
		Country1 o1=new Country1("India",11);
		State1 o2=new State1("Karnataka","Kannada");
		District1 o3=new District1("Mandya",571401); 
		Village1 o4=new Village1("Kergodu","Mandya");
	}
}
