package com.gentech.program;

class Country
{
	String countryname; 
	int countryid;
}
class State
{
	String statename;
	String language;
}
class District
{
	String districtname;
	int pincode;
}
class Village
{
	String vname;
	String vdistrict;
}

public class Address {

	public static void main(String[] args) {
		Country co = new Country();
		co.countryname="India";
		co.countryid=20;
		System.out.println("countryname: "+ co.countryname);
		System.out.println("countryid: "+ co.countryid);
		System.out.println("+++++++++");

		State st = new State();
		st.statename="Karnataka";
		st.language="kannada";
		System.out.println("statename: "+ st.statename);
		System.out.println("langauage: "+ st.language);
		System.out.println("+++++++++");

		District di = new District();
		di.districtname="Mandya";
		di.pincode=571401;
		System.out.println("districtname: "+ di.districtname);
		System.out.println("pincode: "+ di.pincode);

		Village vi = new Village();
		vi.vname="Kebbhalli";
		vi.vdistrict="Mandya";
		System.out.println("vname:"+ vi.vname);
		System.out.println("vdistrict"+ vi.vdistrict);
	}
}
