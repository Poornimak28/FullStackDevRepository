package com.gentech.inheritance;

abstract class Animal
{
	abstract void hello();
	
	void eat()
	{
		System.out.println("Animal is eating food!!");
	}
}
class Dog extends Animal
{
	void hello()
	{
		System.out.println("its great");
	}
	void bark()
	{
		super.eat();
		System.out.println("Dog is Barking!!");
	}
}
class BabyDog extends Dog
{
	void weep()
	{
		System.out.println("BabyDog is Weeping!!");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		BabyDog b=new BabyDog();
	
		b.bark();
		b.weep();
	}
}
