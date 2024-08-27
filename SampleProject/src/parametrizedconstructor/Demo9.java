package parametrizedconstructor;

class Product1
{
	String productname;
	int pid;
	Product1(String pn,int pi)
	{
		productname=pn;
		pid=pi;
		System.out.println("productname: "+productname);
		System.out.println("productid"+ pid);
		System.out.println("+++++++++++++++");

	}
}
class Sales1
{
	int salesid;
	String salesperson;
	Sales1(int si,String sp)
	{
		salesid=si;
		salesperson=sp;
		System.out.println("salesid: "+salesid);
		System.out.println("salesperson"+salesperson);
		System.out.println("++++++++++++++++");
	}

}

class Order1
{
	int orderid;
	String place;
	Order1(int o,String p)
	{
		orderid=o;
		place=p;
		System.out.println("orderid: "+orderid);
		System.out.println("place"+place);
		System.out.println("+++++++++++++");
	}
}

class Inventery1
{
	int rating;
	int percentagesales;
	Inventery1(int r,int per)
	{
		rating =r;
		percentagesales =per;
		System.out.println("rating: "+ rating);
		System.out.println("percentagesales: "+ percentagesales);
		System.out.println("++++++++++++++"); 
	}
}

public class Demo9 {

	public static void main(String[] args) {
		Product1 o1=new Product1("Samsung",2);
		Sales1 o2=new  Sales1(6,"Deepak");
		Order1 o3=new Order1(7,"Kalahalli");
		Inventery1 o4=new Inventery1(4,89);
	}
}
