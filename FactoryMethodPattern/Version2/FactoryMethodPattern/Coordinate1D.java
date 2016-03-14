import java.util.Random;

class Coordinate1D extends Coordinate {
  public Coordinate1D() {
    super(1);
  }

  public Coordinate1D(String label, double x) {
    super(1);
    this.tuple = new double[] { x };
  }

  public static Coordinate newCoordinate() {
    return new Coordinate1D();
  } 

  public static Coordinate createCoordinate() {
    return new Coordinate1D();
  }

} 
