import java.util.Random;

class Coordinate3D extends Coordinate {
  public Coordinate3D() {
    super(3);
  }

  public Coordinate3D(String label, double x, double y, double z) {
    super(3);
    this.tuple = new double[] { x };
  }

  public static Coordinate newCoordinate() {
    return new Coordinate3D();
  } 

  public static Coordinate createCoordinate() {
    return new Coordinate3D();
  } 



} 
