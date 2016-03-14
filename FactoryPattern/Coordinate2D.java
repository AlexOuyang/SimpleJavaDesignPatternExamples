/**
 * Coordinate2D <implements Coordinate>: 2 dimentional coordinate
 * +toString()
 * +distance()
 * +label()
 * +getLabel()
 */


import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


public class Coordinate2D extends CoordinateNdimensional {

	private double x;

	private double y;

	/**
	 * Overload the constructor for specifying the coordinate location
	 * @param x is the x coordinate
	 * @param y is the y coordinate
	 */
	public Coordinate2D(double x, double y) {
		this.x = x;
		this.y = y;
	}


	/**
	 * Overload constructor that specifies a random value,
	 * range is between -100.0 to 100.0
	 */
	public Coordinate2D() {
		double min = -100.0;
		double max = 100.0;
		x = getRandom(min, max);
		y = getRandom(min, max);
	}

	public String toString() { return ("(" + x + ", " + y + ")"); }

	public double distance(Coordinate c) {
		if (!(c instanceof Coordinate2D)) System.err.println("Param should be of type Coordinate2D");
		return Math.sqrt(Math.pow(this.x - ((Coordinate2D)c).getX(), 2) + Math.pow(this.y - ((Coordinate2D)c).getY(), 2));
	}

	/**
	 * Getter for x, y
	 */
	public void setX(double x) { this.x = x; }
	public double getX() { return this.x; }
	public void setY(double y) { this.y = y; }
	public double getY() { return this.y; }

}
