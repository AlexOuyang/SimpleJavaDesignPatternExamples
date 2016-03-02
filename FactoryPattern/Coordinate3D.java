/**
 * Coordinate3D <implements Coordinate>: 3 dimentional coordinate
 * +toString()
 * +distance()
 * +label()
 * +getLabel()
 */

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Coordinate3D extends CoordinateNdimensional {

	private double x;

	private double y;

	private double z;

	/**
	 * Overload the constructor for specifying the coordinate location
	 * @param x is the x coordinate
	 * @param y is the y coordinate
	 * @param z is the z coordinate
	 */
	public Coordinate3D(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}


	/**
	 * Overload constructor that specifies a random value,
	 * range is between -100.0 to 100.0
	 */
	public Coordinate3D() {
		double min = -100.0;
		double max = 100.0;
		x = getRandom(min, max);
		y = getRandom(min, max);
		z = getRandom(min, max);
	}

	public String toString() { return ("(" + x + ", " + y + ", " + z + ")"); }

	public double distance(Coordinate c) {
		return Math.sqrt(Math.pow(this.x - ((Coordinate3D)c).getX(), 2) + Math.pow(this.y - ((Coordinate3D)c).getY(), 2) + Math.pow(this.z - ((Coordinate3D)c).getZ(), 2));
	}

	/**
	 * Getter for x, y
	 */
	public void setX(double x) { this.x = x; }
	public double getX() { return this.x; }
	public void setY(double y) { this.y = y; }
	public double getY() { return this.y; }
	public void setZ(double z) { this.z = z; }
	public double getZ() { return this.z; }
}
