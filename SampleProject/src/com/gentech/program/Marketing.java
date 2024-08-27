package com.gentech.program;

class Product
{
	String productname;
	int pid;
}
class Sales
{
	int salesid;
	String salesperson;
}
class Order
{
	int orderid;
	String place;
}
class Inventery
{
	int rating;
	int percentagesales;
}

public class Marketing {

	public static void main(String[] args) {
		Product p = new Product();
		p.productname="POCO";
		p.pid=14;
		System.out.println("productname: "+ p.productname);
		System.out.println("productid"+ p.pid);
		System.out.println("+++++++++++++++");

		Sales sa = new Sales();
		sa.salesid=14;
		sa.salesperson="Suresh";
		System.out.println("salesid: "+ sa.salesid);
		System.out.println("salesperson"+ sa.salesperson);
		System.out.println("++++++++++++++++");

		Order od = new Order();
		od.orderid=41;
		od.place="Halahalli";
		System.out.println("orderid: "+ od.orderid);
		System.out.println("place"+ od.place);
		System.out.println("+++++++++++++");

		Inventery iv = new Inventery();
		iv.rating =6;
		iv.percentagesales =91;
		System.out.println("rating: "+ iv.rating);
		System.out.println("percentagesales:  "+ iv.percentagesales);
		System.out.println("++++++++++++++"); 
	}
}
