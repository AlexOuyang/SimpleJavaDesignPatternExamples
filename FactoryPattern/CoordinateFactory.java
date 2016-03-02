/**
 * CoordinateFactory: use getCoordinate method to get Coordinate type object randomly initialized
 * +toString()
 * +getCoordiante()
 *
 * Reference: http://www.tutorialspoint.com/design_pattern/factory_pattern.htm
 */
import java.util.*;

public class CoordinateFactory {

    /**
     * Overload method to create coordinates
     */
	public Coordinate getCoordinate(double x) {
		return new Coordinate1D(x);
	}
	public Coordinate getCoordinate(double x, double y) { return new Coordinate2D(x, y); }
	public Coordinate getCoordinate(double x, double y, double z) { return new Coordinate3D(x, y, z); }


	/*
	 * Returns a N dimentional coordinate with random coordiante within [-100, 100]
	 */
	public Coordinate getCoordinate(String coordianteType) {
		if (coordianteType == null|| coordianteType.equals("")) return null;

		Coordinate c = null;

		// Specify the range to be within [-100, 100] for simplicity
		double min = -100.0;
		double max = 100.0;

		switch (coordianteType) {
		case "1D":
			c = new Coordinate1D();
			System.out.println("1D coordinate created");
			break;
		case "2D":
			c = new Coordinate2D();			
			System.out.println("2D coordinate created");
			break;
		case "3D":
			c = new Coordinate3D();
			System.out.println("3D coordinate created");
			break;
		default:
			break;
		}

		return c;
	}

}
