package hackerrank_Solution;

import java.util.Scanner;

abstract class Shape {

	// abstract method declaration, Abstract method (does nothave a body)

	abstract public void areaCalcultion();

	abstract public void readData();

}

class Rectangle extends Shape {
	private int a, b;

	// method overriding
	public void readData() {
		System.out.print("\n\nEnter two sides of Rectangle : ");
		Scanner sidein = new Scanner(System.in);
		a = sidein.nextInt();
		b = sidein.nextInt();
	}

	public void areaCalcultion() {
		int area;
		area = a * b;
		System.out.println("Area of Rectangle is : " + area);
		System.out.println("\n<--------------------------->");
	}
}

class Circle extends Shape {
	private double radius;

	// method overriding
	public void readData() {
		System.out.print("\nEnter Radius of circle : ");
		Scanner radiusin = new Scanner(System.in);
		radius = radiusin.nextDouble();
	}

	public void areaCalcultion() {
		double area = (22 / 7) * radius * radius;
		System.out.println("Area of circle is : " + area);
	}
}

public class AbstractAreaex9 {
	public static void main(String[] args) {
		// Reference variable of Shape
		Shape s;
		s = new Rectangle(); // Creating object of abstract class
		s.readData();
		s.areaCalcultion();
		s = new Circle(); // Creating object of abstract class
		s.readData();
		s.areaCalcultion();

	}

}
