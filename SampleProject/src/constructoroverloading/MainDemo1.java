package constructoroverloading;

class UserProfile
{
	UserProfile(int profileId)
	{
		System.out.println("User Id : "+profileId);
	}
	UserProfile(String name)
	{
		System.out.println("User Name : "+name);
	}
	UserProfile(long password)
	{
		System.out.println("User Password : "+password);
	}
	UserProfile(byte age)
	{
		System.out.println("User Age : "+age);
	}
	UserProfile(boolean isactive)
	{
		System.out.println("User IsActive : "+isactive);
	}
}

public class MainDemo1 {

	public static void main(String[] args) {
		UserProfile o1 = new UserProfile(13);
		UserProfile o2 = new UserProfile("Vivek");
		UserProfile o3 = new UserProfile(1334L);
		UserProfile o4 = new UserProfile(56);
		UserProfile o5 = new UserProfile(false);
	}
}
