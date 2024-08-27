package constructoroverloading;

class SoftwareProduct
{
	SoftwareProduct(String name)
	{
		System.out.println("Software Name : "+name);
	}
	SoftwareProduct(float version)
	{
		System.out.println("Software Version : "+version);
	}
	SoftwareProduct(int licenseduration)
	{
		System.out.println("Software LicenseDuration in terms of years : "+licenseduration);
	}
	SoftwareProduct(double price)
	{
		System.out.println("Software Price : "+price);
	}
	SoftwareProduct(boolean issubscription)
	{
		System.out.println("Software IsSubscription : "+issubscription);
	}
}

public class MainDemo3 {

	public static void main(String[] args) {
		SoftwareProduct o1 = new SoftwareProduct("Project Management Tool");
		SoftwareProduct o2 = new SoftwareProduct(3.0f);
		SoftwareProduct o3 = new SoftwareProduct(5);
		SoftwareProduct o4 = new SoftwareProduct(149.99);
		SoftwareProduct o5 = new SoftwareProduct(true);
	}
}
