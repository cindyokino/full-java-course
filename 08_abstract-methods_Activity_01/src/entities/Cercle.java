package entities;

import entities.enums.Color;

public class Cercle extends Shape {
	
	private double radius;
	
	public Cercle()	{
	}
		
	public Cercle(Color color, double radius) {
		super(color);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
}
