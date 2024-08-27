package com.gentech.practice;

class Animal
{
	String name;
	String type;
	Animal(String n,String t)
	{
		name=n;
		type=t; 
	}
	void display()
	{
		System.out.println(name);
		System.out.println(type);
	}
}
class Dog extends Animal
{
	String makesound;
	String food;
	Dog(String n,String t,String s,String f)
	{
		super(n,t);
		makesound=s;
		food=f;
	}
	void display()
	{
		super.display();
		System.out.println(makesound);
		System.out.println(food);
	}
}
class Bulldog extends Dog
{
	String petname;
	Bulldog(String n,String t,String s,String f,String p)
	{
		super(n,t,s,f);
		petname=p;
		super.display();
		
	}
	void display()
	{
		
		System.out.println(petname);
	}
}

public class MultilevelInnheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Bulldog o1=new Bulldog("Dog","Domestic","Bow-Bow","Pedigree","Buddy");
        
	}

}
