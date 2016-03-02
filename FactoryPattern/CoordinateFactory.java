public class CoordinateFactory {

	// use getCoordinate method to get Coordinate type object randomly initialized
	public Coordinate getCoordinate(String coorDimension) {
		if (coorDimension == null) { // null check
			return null;
		}

		if (coorDimension.equalsIgnoreCase("1") || coorDimension.equalsIgnoreCase("1D")) {
			return new Coordinate1D();

		} else if (coorDimension.equalsIgnoreCase("2") || coorDimension.equalsIgnoreCase("2D")) {
			return new Coordinate2D();

		} else if (coorDimension.equalsIgnoreCase("3") || coorDimension.equalsIgnoreCase("3D")) {
			return new Coordinate3D();
		}
		return null;
	}
 
	public Coordinate getCoordinate(int x) {
		return new Coordinate1D(x);
	}
	
	public Coordinate getCoordinate(int x, int y) {
		return new Coordinate2D(x, y);
	}
	
	public Coordinate getCoordinate(int x, int y, int z) {
		return new Coordinate3D(x, y, z);
	}
}
