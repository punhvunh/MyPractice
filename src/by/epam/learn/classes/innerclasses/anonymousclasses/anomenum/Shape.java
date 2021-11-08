package by.epam.learn.classes.innerclasses.anonymousclasses.anomenum;

import java.util.StringJoiner;

public enum Shape {
	RECTANGLE(2,3){
		@Override
		public double computerSquare() {
			return this.getA() * this.getB();
		}
	}, TRIANGLE(4,5){
		@Override
		public double computerSquare() {
			return this.getA() * this.getB() / 2;
		}
	};
	private double a;
	private double b;

	Shape(final double a, final double b) {
		this.a = a;
		this.b = b;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}
	public abstract double computerSquare();

	@Override
	public String toString() {
		return new StringJoiner(",", Shape.class.getSimpleName() +"[","]")
				.add("a= " + a)
				.add("b= " + b)
				.toString();
	}
}
