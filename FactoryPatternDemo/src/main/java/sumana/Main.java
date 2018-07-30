package sumana;

import sumana.factory.ShapeFactory;

public class Main {
	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		factory.getShape("SQUARE").draw();
		factory.getShape("CIRCLE").draw();
		factory.getShape("RECTANGLE").draw();
	}
}
