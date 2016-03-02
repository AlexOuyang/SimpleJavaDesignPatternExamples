/**
 * Coordinate1D <implements Coordinate>: 1 dimentional coordinate
 * +toString()
 * +distance()
 * +label()
 * +getLabel()
 */

import java.util.*;

public class Coordinate1D extends CoordinateNdimensional {

	private double x;

	/**
	 * Overload constructor that specifies a random value
	 * @param min range
	 * @param max range
	 */
	public Coordinate1D(double min, double max) { x = getRandom(min, max); }

	/**
	 * Overload the constructor for specifying the coordinate location
	 * @param x is the x coordinate
	 */
	public Coordinate1D(int x) { this.x = x; }

	@Override
	public String toString() { return ("(" + getX() + ")"); }

	@Override
	public double distance(Coordinate1D c) {
		double distance = (double)this.x - (double)((Coordinate1D)coor).getX();
		distance = Math.abs(this.x - coor);
		return distance;
	}

	@Override
	public void label(String label) {
		this.label = label;
	}

	@Override
	public String getLabel() {
		return label;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getX() {
		return this.x;
	}
}
