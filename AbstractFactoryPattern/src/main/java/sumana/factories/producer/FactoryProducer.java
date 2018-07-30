package sumana.factories.producer;

import sumana.factories.ColorFactory;
import sumana.factories.ShapeFactory;
import sumana.factories.inhe.AbstractFactory;

public class FactoryProducer {
	public AbstractFactory getFactory(String factoryType) {
		switch (factoryType) {
		case "SHAPE":
			return new ShapeFactory();

		case "COLOR":
			return new ColorFactory();
			
		default:
			return null;
		}
	}
}
