package noargsconstructor;

class Country
{
	String countryname;
	int countryid;
	Country()
	{
		countryname="India";
		countryid=20;
		System.out.println("countryname: "+countryname);
		System.out.println("countryid: "+countryid);
		System.out.println("+++++++++");

	}
}
class State
{
	String statename;
	String language;
	State()
	{
		statename="Karnataka";
		language= "kannada";
		System.out.println("statename: "+ statename);
		System.out.println("language: "+ language);
		System.out.println("+++++++++");
	}

}
class District
{
	String districtname;
	int pincode;
	District()
	{
		districtname="Mandya";
		pincode=571401;
		System.out.println("districtname: "+  districtname);
		System.out.println("pincode: "+  pincode);
	}
}
class Village
{
	String vname;
	String vdistrict;
	Village()
	{
		vname="Kebbhalli";
		vdistrict="Mandya";
		System.out.println("vname:"+ vname);
		System.out.println("vdistrict"+vdistrict);
	}

}

public class Demo3 {
	
	public static void main(String[] args) {
		Country cou =new Country();
		State sta=new State();
		District dis =new District(); 
		Village vil = new Village();
	}
}
