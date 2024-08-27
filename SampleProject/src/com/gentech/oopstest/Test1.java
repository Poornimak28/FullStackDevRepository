package com.gentech.oopstest;

//Ques 9
abstract class Animal
{
	abstract void makesound();
}
class Dog extends Animal
{
	void makesound()
	{
		System.out.println("Dog barks");
	}
}
class Cat extends Animal
{
	void makesound()
	{
		System.out.println("Cat meows");
	}
}
class Cow extends Animal
{
	void makesound()
	{
		System.out.println("Cow moos");
	}
}

public class Test1 {

	public static void main(String[] args) {
		Animal animal=null;
		Dog dog=new Dog();
		Cat cat=new Cat();
		Cow cow=new Cow();

		animal=dog;
		animal.makesound();
		animal=cat;
		animal.makesound();
		animal=cow;
		animal.makesound();
	}
}
