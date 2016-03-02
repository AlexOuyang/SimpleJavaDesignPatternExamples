/**
 * Coordinate <Interface>: This is the Coordinate interface
 * +toString()
 * +distance()
 * +setLabel()
 * +getLabel()
 */
public interface Coordinate {

    /**
     * Print out information about the label
     * @return the information
     */
    public String toString();

    /**
     * returns the linear distance between two coordinates of the same type,
     * e.g. 1D, 2D, or 3D. It takes another coordinate as an argument and
     * should throw an exception if it is the wrong type of coordinate
     * @param coordinate
     * @return the information
     */
    public double distance(Coordinate coor);

    /**
     * Labels the provided point with the provided string
     * @param the label
     */
    public void setLabel(String label);

    /**
     * Get the label associated with the point
     * @Return the coordinate label
     */
    public String getLabel();

}
