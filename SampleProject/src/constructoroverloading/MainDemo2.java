package constructoroverloading;

class Invoice
{
	Invoice(int invoicenumber)
	{
		System.out.println("Customer InvoiceNumber : "+invoicenumber);
	}
	Invoice(String customername)
	{
		System.out.println("Customer Name : "+customername);
	}
	Invoice(long phoneno)
	{
		System.out.println("Customer PhoneNo : "+phoneno);
	}
	Invoice(double amount)
	{
		System.out.println("Order Amount : "+amount);
	}
	Invoice(boolean ispaid)
	{
		System.out.println("Customer IsPaid : "+ispaid);
	}
}

public class MainDemo2 {

	public static void main(String[] args) {
		Invoice o1 = new Invoice(1001);
		Invoice o2 = new Invoice("Smith");
		Invoice o3 = new Invoice(6360666845L);
		Invoice o4 = new Invoice(256.78);
		Invoice o5 = new Invoice(true);
	}
}
