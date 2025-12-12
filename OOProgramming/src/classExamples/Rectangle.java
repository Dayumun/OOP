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
	private float shortSize, longSize;

	public Rectangle(float int side1, float side2) {
		setShortSize(side1);
		setLongSize(side2);
	}
	
	public float getShortSize() {
		return shortSize;
	}

	public void setShortSize(float shortSize) {
		this.shortSize = shortSize;			//al generar automáticamente, eclipse utiliza la palabra reservada this para nombrar al atributo
	}

	public float getLongSize() {
		return longSize;
	}

	public void setLongSize(float longSize) {
		this.longSize = longSize;
	}
	
}
