package oops;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Polymorphism {
	public static void main(String[] args) {
		Parent ref = new Child();
		try {
			ref.print();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
} 

class Parent 
{
	public void print() throws IOException
	{
		System.out.println("Parent");
	}
}

class Child extends Parent 
{
	@Override
	public void print() throws FileNotFoundException
	{
		System.out.println("C");
	}
}