package sumana.factories;

import sumana.colors.Blue;
import sumana.colors.Green;
import sumana.colors.Red;
import sumana.colors.intf.Color;
import sumana.factories.inhe.AbstractFactory;
import sumana.shapes.intf.Shape;

public class ColorFactory extends AbstractFactory {
	
	@Override
	public Color getColor(String color) {
		switch (color) {
		case "RED":
			return new Red();

		case "BLUE":
			return new Blue();

		case "GREEN":
			return new Green();

		default:
			return null;
		}
	}

	@Override
	public Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
