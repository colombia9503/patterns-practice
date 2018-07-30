package sumana.factory;

import sumana.intf.Shape;
import sumana.shapes.Circle;
import sumana.shapes.Rectangle;
import sumana.shapes.Square;

public class ShapeFactory {
	public Shape getShape(String shape) {
		switch (shape) {
		case "SQUARE":
			return new Square();

		case "CIRCLE":
			return new Circle();

		case "RECTANGLE":
			return new Rectangle();

		default:
			return null;
		}
	};
}
