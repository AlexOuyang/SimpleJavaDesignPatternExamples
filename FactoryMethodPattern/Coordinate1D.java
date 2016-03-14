/**
 * Coordinate1D <implements Coordinate>: 1 dimentional coordinate
 * +toString()
 * +distance()
 * +label()
 * +getLabel()
 */

public class Coordinate1D extends CoordinateNdimensional {

	private double x;


	/**
	 * Overload the constructor for specifying the coordinate location
	 * @param x is the x coordinate
	 */
	public Coordinate1D(double x) { this.x = x; }


	/**
	 * Overload constructor that specifies a random value,
	 * range is between -100.0 to 100.0
	 */
	public Coordinate1D() {
		double min = -100.0;
		double max = 100.0;
		x = getRandom(min, max);
	}

	public String toString() { return ("(" + x + ")"); }

	public double distance(Coordinate c) {
		if (!(c instanceof Coordinate1D)) System.err.println("Param should be of type Coordinate1D");
		return Math.abs(this.x - ((Coordinate1D) c).getX());
	}

	/**
	 * Getter for x
	 */
	public double getX() { return this.x;}
	public void setX(double x) { this.x = x; }
}
