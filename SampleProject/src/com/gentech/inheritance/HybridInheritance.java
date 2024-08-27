package com.gentech.inheritance;

class Customer
{
	void name()
	{
		System.out.println("Customer Name is Poornima");
	}
}
class Order extends Customer
{
	void product()
	{
		System.out.println("The ordered product is Samsung mobile");
	}
}
class Price extends Order
{
	void price()
	{
		System.out.println("The ordered price is 50000");
	}
}
class Reviews extends Price
{
	void rating()
	{
		System.out.println("The rating is four star");
	}
}
public class HybridInheritance {

	public static void main(String[] args) {
		Reviews r=new Reviews();
        r.name();
        r.product();
        r.price();
        r.rating();
	}
}
