package com.gentech.polymorphism;

abstract class Shapes
{
	abstract void sides();
}
class Square extends Shapes
{
	void sides()
	{
		System.out.println("Square has four sides");
	}
}
class Triangle extends Shapes
{
	void sides()
	{
		System.out.println("Triangle has three sides");
	}
}
class Pentagon extends Shapes
{
	void sides()
	{
		System.out.println("Pentagon has five sides");
	}
}

public class PolymorphismExample3 {

	public static void main(String[] args) {
		Shapes shapes=null;
		Square square=new Square();
		Triangle triangle=new Triangle();
		Pentagon penta=new Pentagon();
		
		shapes=square;
		shapes.sides();
		shapes=triangle;
		shapes.sides();
		shapes=penta;
		shapes.sides();
	}
}
