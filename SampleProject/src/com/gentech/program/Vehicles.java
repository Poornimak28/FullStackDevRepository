package com.gentech.program;

class Twowheeler
{
	String TName;
	int Tid;
}
class Fourwheeler
{
	String FName;
	int Fid;
}
class Heavyvehicle
{
	String HName;
	int Hid;
}


public class Vehicles {

	public static void main(String[] args) {
		Twowheeler tw = new Twowheeler();
		tw.TName="Jupiter";
		tw.Tid=1;
		System.out.println("TName: "+ tw.TName);
		System.out.println("Tid: "+ tw.Tid);
		System.out.println("+++++++++");

		Fourwheeler fw = new Fourwheeler();
		fw.FName="KIA";
		fw.Fid=3;
		System.out.println("Fname: "+ fw.FName);
		System.out.println("Fid: "+ fw.Fid);
		System.out.println("+++++++++");

		Heavyvehicle hv = new Heavyvehicle();
		hv.HName="Truck";
		hv.Hid=5;
		System.out.println("Hname: "+hv.HName);
		System.out.println("Hid: "+ hv.Hid);
	}
}
