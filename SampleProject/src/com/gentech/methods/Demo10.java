package com.gentech.methods;

class Cube
{
	void method10(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Cube is: "+(a[i]*a[i]*a[i]));
		}
		
	}
}
public class Demo10 {

	public static void main(String[] args) {
		int b[]= {1,2,3,4};
		Cube o1 = new Cube();
		o1.method10(b);
	}
}
