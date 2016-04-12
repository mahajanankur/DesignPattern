/**
 * 
 */
package com.java.designpatterns.decorator;

/**
 * @author amahajan
 * 
 */
public class DecoratorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Shape circle = new Circle();

		Shape redCircle = new RedShapeDecorator(new Circle());

		Shape redRectangle = new RedShapeDecorator(new Rectangle());

		System.out.println("Normal Border");
		circle.draw();

		System.out.println("\nCircle of red Border");
		redCircle.draw();

		System.out.println("\nRectangle of red Border");
		redRectangle.draw();

	}

}
