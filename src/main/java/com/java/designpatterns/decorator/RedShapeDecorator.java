/**
 * 
 */
package com.java.designpatterns.decorator;

/**
 * @author amahajan
 * 
 */
public class RedShapeDecorator extends ShapeDecorator {

	protected Shape	shape;

	public RedShapeDecorator(Shape shape) {
		super(shape);
		this.shape = shape;
	}

	@Override
	public void draw() {
		shape.draw();
		setBorderColor();
	}

	private void setBorderColor() {
		System.out.println("Border : Red");
	}

}
