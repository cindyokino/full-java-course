package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import model.enums.Color;

public class Program {

	public static void main(String[] args) {

		Shape s1 = (Shape) new Circle(Color.BLACK, 2.0);
		Shape s2 = (Shape) new Rectangle(Color.WHITE, 3.0, 4.0);

		System.out.println("Shapes:");
		System.out.println("Circle color: " + s1.getColor().toString().toLowerCase() + ", area: " + String.format("%.2f", s1.area()));
		System.out.println("Rectangle color: " + s2.getColor().toString().toLowerCase() + ", area: " + String.format("%.2f", s2.area()));
	}
}
