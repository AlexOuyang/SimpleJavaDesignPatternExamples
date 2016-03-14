import java.lang.Math.*;
import java.util.Random;

abstract class Coordinate {

  protected static String RANDOM_LABEL = "Random";

  protected String label;
  protected double[] tuple;
  protected int dimensions = -1;

  public static class InvalidDimensionException extends Exception {
    public InvalidDimensionException (String message) {
        super(message);
    }
  }

  public Coordinate (int dimensions) {
    this.label = RANDOM_LABEL;
    this.dimensions = dimensions;
    this.populateRandom();

  }


  public String toString() {
    if (dimensions < 1) return "()";

    String retString = "(";

    int dimension=0;
    for (dimension=0; dimension< (dimensions-1); dimension++)
      retString = retString + this.tuple[dimension] +", ";

    retString = retString + this.tuple[dimension] +")";
    return retString;

  }


  public double distance(Coordinate c) throws InvalidDimensionException {
    if (this.tuple.length != c.tuple.length)
      throw new InvalidDimensionException ("D=" + this.tuple.length + 
                    " vs D=" + c.tuple.length); 

    double distance = 0.0;

    for (int dimension=0; dimension < dimensions; dimension++)
      distance += Math.pow(this.tuple[dimension] - c.tuple[dimension],2);

    distance = Math.sqrt(distance);
    return distance;
  }


  public void setLabel(String label) {
    this.label = label;
  }

  public String getLabel() { return label; }


  private void populateRandom () {

    this.tuple = new double[this.dimensions];

    Random randomGenerator = new Random();
    for (int dimension=0; dimension < this.dimensions; dimension++)
      this.tuple[dimension] = randomGenerator.nextInt();
  }

}
