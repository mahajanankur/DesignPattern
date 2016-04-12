/**
 * 
 */
package com.java.designpatterns.decorator;

/**
 * @author amahajan
 * 
 */
public abstract class ShapeDecorator implements Shape {

	protected Shape	decoratedShape;

	public ShapeDecorator(Shape shape) {
		decoratedShape = shape;
	}

	public abstract void draw();

}
