import java.util.*;

public class Coordinate2D implements Coordinate{

	private int x; //this is the x coordinate of the 2D point
	private int y; //this is the y coordinate of the 2D point
	private String label; //label of 1D point
	
	/**
	 * This is the default constructor. It will randomly select a value
	 * for x
	 */
	public Coordinate2D(){
		this.x = randomCoordinate();
		this.y = randomCoordinate();
		this.label = "";		
	}
	
	/**
	 * This constructor will set x and y to the passed in values
	 * @param x - this is the value the coordinate's x will be set to
	 * @param y - this is the value the coordinate's y will be set to
	 */
	public Coordinate2D(int x, int y){
		this.x = x;
		this.y = y;
		this.label = "";
	}
	
	@Override
	public String toString(){
		
		String retString = label + ": (" + getX() + ", " + getY() + ")";
		return retString;		
	}
	
	@Override
	public double distance(Coordinate coor) {
		
		int newX = this.x - ((Coordinate2D)coor).getX();
		int newY = this.y - ((Coordinate2D)coor).getY();
		double bothX = (double)newX * (double)newX;
		double bothY = (double)newY * (double)newY;
	    double distance = Math.sqrt(bothX + bothY);
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
}
