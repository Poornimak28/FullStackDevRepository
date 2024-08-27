package noargsconstructor;

class Product
{
	String productname;
	int pid;
	Product()
	{
		productname="POCO";
		pid=14;
		System.out.println("productname: "+productname);
		System.out.println("productid"+ pid);
		System.out.println("+++++++++++++++");

	}
}
class Sales
{
	int salesid;
	String salesperson;
	Sales()
	{
		salesid=14;
		salesperson="Suresh";
		System.out.println("salesid: "+salesid);
		System.out.println("salesperson"+salesperson);
		System.out.println("++++++++++++++++");
	}

}

class Order
{
	int orderid;
	String place;
	Order()
	{
		orderid=41;
		place="Halahalli";
		System.out.println("orderid: "+orderid);
		System.out.println("place"+place);
		System.out.println("+++++++++++++");
	}
}

class Inventery
{
	int rating;
	int percentagesales;
	Inventery()
	{
		rating =6;
		percentagesales =91;
		System.out.println("rating: "+ rating);
		System.out.println("percentagesales:  "+ percentagesales);
		System.out.println("++++++++++++++"); 
	}
}


public class Demo4 {
	
	public static void main(String[] args) {
		Product pod=new Product();
		Sales sal=new  Sales();
		Order ord= new Order();
		Inventery inv=new Inventery();
	}
}
