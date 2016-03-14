import java.util.Random;

class Coordinate2D extends Coordinate {
  public Coordinate2D() {
    super(2);
  }

  public Coordinate2D(String label, double x, double y) {
    super(1);
    this.tuple = new double[] { x, y };
  }

  public static Coordinate newCoordinate() {
    return new Coordinate2D();
  } 

  public static Coordinate createCoordinate() {
    return new Coordinate2D();
  }




} 
