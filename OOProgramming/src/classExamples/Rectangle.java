package classExamples;
/*Activity 7. 
 * Write a program that asks for the sides of a rectangle and offers the 
 * possibility to choose between calculating the area or the perimeter of the rectangle, 
 * returning on the screen the value of these.
 */

/*
 * shortSide
 * longSide
 * -------------
 * area()
 * perimeter()
 * 
 * choose()
 */
public class Rectangle {
	private int shortSize, longSize;

	public Rectangle(int side1, int side2) {
		setShortSize(side1);
		setLongSize(side2);
	}
	
	public int getShortSize() {
		return shortSize;
	}

	public void setShortSize(int shortSize) {
		this.shortSize = shortSize;			//al generar automáticamente, eclipse utiliza la palabra reservada this para nombrar al atributo
	}

	public int getLongSize() {
		return longSize;
	}

	public void setLongSize(int longSize) {
		this.longSize = longSize;
	}
	
}
