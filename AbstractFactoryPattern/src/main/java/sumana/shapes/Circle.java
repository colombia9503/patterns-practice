package sumana.shapes;

import sumana.shapes.intf.Shape;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle drawed!");
	}

}
