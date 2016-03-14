class Tester {
  
  public static void createAndPrintCoordinate (CoordinateFactory cf) {
    Coordinate coord = cf.createCoordinate();
    System.out.println (coord);
  }

  public static void main(String[] args) {
    CoordinateFactory cf1 = new CoordinateFactory1D();
    CoordinateFactory cf2 = new CoordinateFactory2D();
    CoordinateFactory cf3 = new CoordinateFactory3D();

    createAndPrintCoordinate(cf1);
    createAndPrintCoordinate(cf2);
    createAndPrintCoordinate(cf3);
  }
}
