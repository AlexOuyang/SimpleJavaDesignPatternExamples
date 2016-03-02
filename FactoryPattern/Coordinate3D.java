import java.util.Random;

public class Coordinate3D implements Coordinate{

	private int x; //this is the x coordinate of the 3D point
	private int y; //this is the y coordinate of the 3D point
	private int z; //this is the y coordinate of the 3D point

	private String label; //label of 1D point
	
	/**
	 * This is the default constructor. It will randomly select a value
	 * for x
	 */
	public Coordinate3D(){
		this.x = randomCoordinate();
		this.y = randomCoordinate();
		this.z = randomCoordinate();
		this.label = "";

	}
	
	/**
	 * This constructor will set x, y, and z to the passed in values
	 * @param x - this is the value the coordinate's x will be set to
	 * @param y - this is the value the coordinate's y will be set to
	 * @param z - this is the value the coordinate's z will be set to
	 */
	public Coordinate3D(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
		this.label = "";
	}
	
	@Override
	public String toString(){
		
		String retString = label + ": (" + getX() + ", " + getY() + ", ";
		retString = retString + getZ() + ")";
		return retString;		
	}
	
	@Override
	public double distance(Coordinate coor) {
		
		int newX = this.x - ((Coordinate3D)coor).getX();
		int newY = this.y - ((Coordinate3D)coor).getY();
		int newZ = this.z - ((Coordinate3D)coor).getZ();
		double bothX = (double)newX * (double)newX;
		double bothY = (double)newY * (double)newY;
	    double bothZ = (double)newZ * (double)newZ;
	    double distance = Math.sqrt(bothX + bothY + bothZ);
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

	public int randomCoordinate(){
		Random random1 = new Random();
		int sign1 = random1.nextInt(2); //returns either 0 or 1
		if(sign1 == 0){ //positive case for x
			Random random2 = new Random();
			int newCoor = random2.nextInt();
			return newCoor;
		} else{ //negative case for x
			Random random2 = new Random();
			int newCoor = random2.nextInt();
			return newCoor * -1;
		}
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return this.x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setZ(int z) {
		this.z = z;
	}
	
	public int getZ() {
		return this.z;
	}
}
