package com.gentech.polymorphism;

abstract class Birds
{
	abstract void swimable();
}
class Duck extends Birds
{
	void swimable()
	{
		System.out.println("Duck swims");
	}
}
class Swans extends Birds
{
	void swimable()
	{
		System.out.println("Swans swims");
	}
}
class Penguins extends Birds
{
	void swimable()
	{
		System.out.println("Penguins swims");
	}
}

public class PolymorphismExample4 {

	public static void main(String[] args) {
		Birds birds=null;
		Duck duck=new Duck();
		Swans swans=new Swans();
		Penguins penguins=new Penguins();
		
		birds=duck;
		birds.swimable();
		birds=swans;
		birds.swimable();
		birds=penguins;
		birds.swimable();
	}
}
