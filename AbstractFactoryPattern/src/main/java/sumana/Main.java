package sumana;

import sumana.factories.inhe.AbstractFactory;
import sumana.factories.producer.FactoryProducer;

public class Main {
	public static void main(String[] args) {
		FactoryProducer producer = new FactoryProducer();
		
		AbstractFactory shapeFactory = producer.getFactory("SHAPE");
		AbstractFactory colorFactory = producer.getFactory("COLOR");
		
		colorFactory.getColor("RED").fill();
		colorFactory.getColor("BLUE").fill();
		colorFactory.getColor("GREEN").fill();
		System.out.println("--------------");
		shapeFactory.getShape("CIRCLE").draw();
		shapeFactory.getShape("SQUARE").draw();
		shapeFactory.getShape("RECTANGLE").draw();
	}
}