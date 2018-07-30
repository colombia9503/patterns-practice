package sumana.shapes;

import sumana.shapes.intf.Shape;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle drawed!");
	}

}
