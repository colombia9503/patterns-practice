package sumana.shapes;

import sumana.shapes.intf.Shape;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Square drawed!");
	}

}
