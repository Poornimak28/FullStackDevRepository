package com.gentech.abstractclass;

abstract class Hotel
{
    String type;
    String address;
   abstract void details();
   Hotel(String address)
   {
       this.address = address;
       System.out.println("Hotel Amaravathi near to "+ address);
   }
   Hotel(String address,String type)
   {
       this.address = address;
       this.type=type;
       System.out.println("Type: "+ type+" Hotel Amaravathi near to "+ address );
   }

}
class Food extends Hotel
{
    void details()
    {
        System.out.println("Hotel name: Amaravathi");
        System.out.println("Type veg and non-veg");
    }
    Food(String address)
    {
        super(address);
    }
    Food(String address,String type)
    {
        super(address,type);
    }

}
class Items extends Food
{
    Items(String address,String type)
    {
        super(address,type);
        super.details();
    }
    Items(String address)
    {
        super(address);
        super.details();
    }

}

public class Assign6 {

	public static void main(String[] args) {
		 Items i = new Items("Mandya","non-veg");
	}
}
