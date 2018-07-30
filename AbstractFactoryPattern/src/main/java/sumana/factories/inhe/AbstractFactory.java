package sumana.factories.inhe;

import sumana.colors.intf.Color;
import sumana.shapes.intf.Shape;

public abstract class AbstractFactory {
	public abstract Shape getShape(String shapeType);
	public abstract Color getColor(String colorType);
}
