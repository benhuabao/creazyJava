package chapter8;

import java.util.List;

public class Canvas {
	//? extends Shapes
	public void drawAll(List<? extends Shape> shapes){
		for (Shape shape : shapes) {
			shape.draw(this);
		}
	}
}
