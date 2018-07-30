package sumana.factories;

import sumana.colors.intf.Color;
import sumana.factories.inhe.AbstractFactory;
import sumana.shapes.Circle;
import sumana.shapes.Rectangle;
import sumana.shapes.Square;
import sumana.shapes.intf.Shape;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		switch (shapeType) {
		case "SQUARE":
			return new Square();

		case "CIRCLE":
			return new Circle();

		case "RECTANGLE":
			return new Rectangle();

		default:
			return null;
		}
	}

	@Override
	public Color getColor(String colorType) {
		return null;
	}

}
