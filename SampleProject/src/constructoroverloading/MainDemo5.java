package constructoroverloading;

class Contract
{
	Contract(int id)
	{
		System.out.println("Contract ID : " +id);
	}

	Contract(String name)
	{
		System.out.println("Client name : " +name);
	}

	Contract(byte duration)
	{
		System.out.println("Contract Duration in terms of years : " + duration);
	}

	Contract(long dealcost)
	{
		System.out.println("Contract Deal : " + dealcost);
	}
}

public class MainDemo5 {

	public static void main(String[] args) {
		Contract o1 = new Contract(51);
		Contract o2 = new Contract("Darshan");
		Contract o3 = new Contract(3);
		Contract o4 = new Contract(400000);
	}
}
