/**
 * CoordinateNdimensional <abstract class implements Coordinate>: This is the Coordinate base class
 * +label()
 * +getLabel()
 * +getRandomDouble()
 */
public abstract class CoordinateNdimensional implements Coordinate {

    protected String label = "";

    public void setLabel(String label) { this.label = label; }

    public String getLabel() { return label; }

    /**
     * Used to calculate a random double within a range
     * @param max is the max range
     * @param min the min range
     * @return a double in between
     */
    protected getRandom(double min, double max) {
        return ThreadLocalRandom.current().nextDouble(min, max);
    }

}